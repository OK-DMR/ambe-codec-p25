package cz.okdmr.mmdvm.homebrew;

import android.util.Log;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;

import cz.okdmr.kaitai.homebrew.Homebrew2015;
import cz.okdmr.kaitai.homebrew.Mmdvm2020;
import io.kaitai.struct.ByteBufferKaitaiStream;

public class MMDVMClient extends Thread {

    public static final String LOG_TAG = "MMDVM CLIENT";
    int port = 62031;
    String address = "dmrs3.ok-dmr.cz";
    DatagramSocket dgram_socket;
    boolean running = false;

    enum ConnectionStatus {
        UNREGISTERED,
        LOGIN_REQUEST_SENT,
        LOGIN_RESPONSE_SENT,
        MASTER_ACCEPTED,
        MASTER_DID_NOT_ACCEPT,
        CONNECTION_TIMEOUT
    }

    ConnectionStatus con_status = ConnectionStatus.UNREGISTERED;
    byte[] login_challenge;

    public MMDVMClient() {
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
            dgram_socket.connect(InetAddress.getByName(address), port);
            return true;
        } catch (Throwable e) {
            Log.e(LOG_TAG, "checkSocket", e);
        }
        return false;
    }

    public void connect(boolean shouldConnect) {
        running = shouldConnect;
    }

    @Override
    public void run() {
        Log.e(LOG_TAG, "client run()");

        while (running) {
            if (!checkSocket()) {
                Log.e(LOG_TAG, "MMDVM Client checkSocket failed");
                break;
            }

            try {
                Log.d(LOG_TAG, "before send");
                byte[] message = new byte[0];
                if (con_status == ConnectionStatus.UNREGISTERED) {
                    message = MMDVM.getRepeaterLoginRequest(2308080);
                    con_status = ConnectionStatus.LOGIN_REQUEST_SENT;
                } else if (con_status == ConnectionStatus.LOGIN_REQUEST_SENT && login_challenge != null) {
                    message = MMDVM.getLoginChallengeResponse(2308080, "passw0rd", login_challenge);
                    con_status = ConnectionStatus.LOGIN_RESPONSE_SENT;
                } else {
                    Log.d(LOG_TAG, "idle on " + con_status);
                }
                if (message.length > 0) {
                    DatagramPacket packet = new DatagramPacket(message, message.length, InetAddress.getByName(address), port);
                    dgram_socket.send(packet);
                }
            } catch (Throwable e) {
                Log.e(LOG_TAG, "send dgram", e);
            }

            byte[] message = new byte[4096];
            DatagramPacket packet = new DatagramPacket(message, message.length);
            try {
                Log.d(LOG_TAG, "before receive");
                dgram_socket.receive(packet);
                Mmdvm2020 incoming = new Mmdvm2020(new ByteBufferKaitaiStream(message));
                if (incoming.commandData() instanceof Mmdvm2020.TypeMasterRepeaterAck) {
                    login_challenge = ByteBuffer.allocate(4).putInt((int) (((Mmdvm2020.TypeMasterRepeaterAck) incoming.commandData()).repeaterIdOrChallenge() & 0xFFFF)).array();
                    con_status = ConnectionStatus.MASTER_ACCEPTED;
                } else {
                    Log.d(LOG_TAG, "received prefix: " + incoming.commandPrefix() + "data: " + incoming.commandData());
                }
            } catch (Throwable e) {
                Log.e(LOG_TAG, "receive dgram", e);
            }
        }
    }
}
