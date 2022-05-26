package cz.okdmr.mmdvm.homebrew;

import android.util.Log;

import androidx.annotation.Nullable;

import com.google.common.io.BaseEncoding;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

import cz.okdmr.kaitai.homebrew.Mmdvm2020;
import io.kaitai.struct.ByteBufferKaitaiStream;

public class MMDVMClient extends Thread {

    public static final String LOG_TAG = "MMDVM CLIENT";

    boolean running = false;
    DatagramSocket dgram_socket;

    String address = "dmrs1.ok-dmr.cz";
    InetAddress targetAddress;
    int targetPort = 62031;

    int repeaterId = 2308080;
    String repeaterPassword = "passw0rd";

    private long lastLoginRequestSent = 0;
    private long lastPingRequestSent = 0;
    private long PING_TIMEOUT_MS = 10000;
    private long LOGIN_TIMEOUT_MS = 5000;

    public native void addSamples(byte[] samples);

    @Nullable
    private InetAddress getTargetAddress() {
        if (targetAddress == null) {
            try {
                targetAddress = InetAddress.getByName(address);
            } catch (UnknownHostException e) {
                Log.e(LOG_TAG, "getTargetAddress", e);
            }
        }
        return targetAddress;
    }

    private boolean checkSocket() {
        if (dgram_socket != null) {
            if (dgram_socket.isConnected()) {
                return true;
            }
            dgram_socket.disconnect();
        }
        try {
            dgram_socket = new DatagramSocket();
            dgram_socket.connect(getTargetAddress(), targetPort);
            dgram_socket.setSoTimeout(1000);
            return true;
        } catch (Throwable e) {
            Log.e(LOG_TAG, "checkSocket", e);
        }
        return false;
    }

    public void connect(boolean shouldConnect) {
        running = shouldConnect;
    }

    enum ConnectionStatus {
        NOT_CONNECTED,
        LOGIN_REQUEST_SENT,
        LOGIN_RESPONSE_SENT,
        CONFIGURATION_SENT,
    }

    private ConnectionStatus current_status = ConnectionStatus.NOT_CONNECTED;

    private void datagramReceived(byte[] message) throws IOException {
        Mmdvm2020 parsed;
        try {
            parsed = new Mmdvm2020(new ByteBufferKaitaiStream(message));
        } catch (Throwable e) {
            Log.e(LOG_TAG, "datagramReceived", e);
            return;
        }
        Log.d(LOG_TAG, "incoming " + parsed.commandPrefix() + " data: " + (parsed.commandData() == null ? "NONE" : parsed.commandData().getClass().getName()));

        if (parsed.commandData() == null) {
            Log.e(LOG_TAG, "datagramReceived null commandData");
            return;
        }

        if (parsed.commandData() instanceof Mmdvm2020.TypeMasterRepeaterAck) {
            if (((Mmdvm2020.TypeMasterRepeaterAck) parsed.commandData()).repeaterIdOrChallenge() != repeaterId) {
                byte[] loginResponse = MMDVM.getLoginChallengeResponse(
                        repeaterId,
                        repeaterPassword,
                        ByteBuffer.allocate(4).putInt((int) ((Mmdvm2020.TypeMasterRepeaterAck) parsed.commandData()).repeaterIdOrChallenge()).array()
                );
                dgram_socket.send(new DatagramPacket(loginResponse, loginResponse.length, getTargetAddress(), targetPort));
                current_status = ConnectionStatus.LOGIN_RESPONSE_SENT;
                Log.d(LOG_TAG, "Login Response sent");
            } else if (current_status == ConnectionStatus.LOGIN_RESPONSE_SENT) {
                byte[] configuration = MMDVM.getClientConfiguration(
                        "OK4PF",
                        repeaterId,
                        "438150000",
                        "438150000",
                        "01",
                        "01",
                        "50.04000",
                        "14.440000",
                        "000",
                        "Praha",
                        "Czech Republic",
                        "4",
                        "https://www.qrz.com/db/ok4pf-m",
                        "20210617_PS4",
                        "MMDVM_Nano_hotSPOT"
                );
                dgram_socket.send(new DatagramPacket(configuration, configuration.length, getTargetAddress(), targetPort));
                current_status = ConnectionStatus.CONFIGURATION_SENT;
                Log.d(LOG_TAG, "Configuration sent");
            }
        } else if (parsed.commandData() instanceof Mmdvm2020.TypeMasterNotAccept) {

            if (current_status == ConnectionStatus.CONFIGURATION_SENT) {
                Log.e(LOG_TAG, "Configuration was not accepted by master");
                current_status = ConnectionStatus.NOT_CONNECTED;
            } else if (current_status == ConnectionStatus.LOGIN_REQUEST_SENT) {
                Log.e(LOG_TAG, "Login request was not accepted by master");
                current_status = ConnectionStatus.NOT_CONNECTED;
            } else if (current_status == ConnectionStatus.LOGIN_RESPONSE_SENT) {
                Log.e(LOG_TAG, "Password is probably invalid, login response was not accepted");
                current_status = ConnectionStatus.NOT_CONNECTED;
            }

        } else if (parsed.commandData() instanceof Mmdvm2020.TypeDmrData) {
            Mmdvm2020.TypeDmrData dmrd = (Mmdvm2020.TypeDmrData) parsed.commandData();
            Log.d(LOG_TAG, String.format(
                    "DMRD received [frame: %d data: %d] [FROM %d TO %d] [SEQ %d] [TS%d] [CALL %s]",
                    dmrd.frameType().id(),
                    dmrd.dataType(),
                    dmrd.sourceId(),
                    dmrd.targetId(),
                    dmrd.sequenceNo(),
                    dmrd.slotNo().id() + 1,
                    dmrd.callType() == Mmdvm2020.CallTypes.GROUP_CALL ? "GROUP" : "PRIVATE"
                    ));
            if (dmrd.frameType() == Mmdvm2020.FrameTypes.VOICE_SYNC) {
                Log.d(LOG_TAG, "Voice sync: " + BaseEncoding.base16().lowerCase().encode(dmrd.dmrData()));
            } else if (dmrd.frameType() == Mmdvm2020.FrameTypes.VOICE_DATA) {
                Log.d(LOG_TAG, "Voice data: " + BaseEncoding.base16().lowerCase().encode(dmrd.dmrData()));
            }
        }
    }


    private void sendLoginRequest() {
        if (current_status != ConnectionStatus.NOT_CONNECTED && current_status != ConnectionStatus.LOGIN_REQUEST_SENT) {
            // no need to send
            return;
        }
        try {
            // check timeout
            if ((System.currentTimeMillis() - lastLoginRequestSent) > LOGIN_TIMEOUT_MS) {
                Log.d(LOG_TAG, "sendLoginRequest proceed");
                lastLoginRequestSent = System.currentTimeMillis();
                byte[] message_out = MMDVM.getRepeaterLoginRequest(repeaterId);
                DatagramPacket packet = new DatagramPacket(message_out, message_out.length, getTargetAddress(), targetPort);
                dgram_socket.send(packet);
                current_status = ConnectionStatus.LOGIN_REQUEST_SENT;
            }
        } catch (Throwable e) {
            Log.e(LOG_TAG, "send dgram", e);
        }
    }

    private void sendPingRequest() {
        if (current_status != ConnectionStatus.CONFIGURATION_SENT) {
            // no ping til we are connected
            return;
        }
        try {
            // check timeout
            if ((System.currentTimeMillis() - lastPingRequestSent) > PING_TIMEOUT_MS) {
                Log.d(LOG_TAG, "sendPingRequest proceed");
                lastPingRequestSent = System.currentTimeMillis();
                byte[] message_out = MMDVM.getRepeaterPong(repeaterId);
                DatagramPacket packet = new DatagramPacket(message_out, message_out.length, getTargetAddress(), targetPort);
                dgram_socket.send(packet);
            }
        } catch (Throwable e) {
            Log.e(LOG_TAG, "send dgram", e);
        }
    }

    @Override
    public void run() {
        Log.e(LOG_TAG, "client run()");

        while (running) {
            if (!checkSocket()) {
                Log.e(LOG_TAG, "MMDVM Client checkSocket failed");
                break;
            }

            sendLoginRequest();
            sendPingRequest();

            byte[] message_in = new byte[4096];
            DatagramPacket packet = new DatagramPacket(message_in, message_in.length);
            try {
                dgram_socket.receive(packet);
                datagramReceived(message_in);
            } catch (SocketTimeoutException e) {
                // ignore timeout on receiving
            } catch (Throwable e) {
                Log.e(LOG_TAG, "receive dgram", e);
            }
        }
    }
}
