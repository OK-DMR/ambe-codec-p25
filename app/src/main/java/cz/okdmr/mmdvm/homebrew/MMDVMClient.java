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

    static {
        System.loadLibrary("mmdvm");
    }

    public static native void addSamples(char[] samples);
    public static native void playAudio();

    public void playTestAmbe() {
        for (char[] single : voicedata) {
            // {136, 248, 194, 22,  75,  170, 212, 198, 103},
            addSamples(single);
            //break;
        }
        playAudio();
    }

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
        if (!(parsed.commandData() instanceof Mmdvm2020.TypeMasterPong)) {
            Log.d(LOG_TAG, "incoming " + parsed.commandPrefix() + " data: " + (parsed.commandData() == null ? "NONE" : parsed.commandData().getClass().getName()));
        }

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
                //Log.d(LOG_TAG, "sendPingRequest proceed");
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


    char[][] voicedata = {
            {185, 232, 129, 82, 97, 115, 0, 42, 107},
            {185, 232, 129, 82, 97, 115, 0, 42, 107},
            {185, 232, 129, 82, 97, 115, 0, 42, 107},
            {185, 232, 129, 82, 97, 115, 0, 42, 107},
            {185, 232, 129, 82, 97, 115, 0, 42, 107},
            {185, 232, 129, 82, 97, 115, 0, 42, 107},
            {185, 232, 129, 82, 97, 115, 0, 42, 107},
            {185, 232, 129, 82, 97, 115, 0, 42, 107},
            {149, 75, 230, 80, 3, 16, 176, 7, 119},
            {134, 244, 203, 19, 83, 115, 154, 72, 121},
            {247, 124, 167, 225, 80, 72, 40, 230, 67},
            {110, 39, 173, 211, 86, 116, 140, 192, 144},
            {94, 242, 249, 141, 20, 51, 114, 246, 245},
            {131, 135, 197, 37, 23, 84, 70, 0, 185},
            {128, 148, 231, 67, 20, 86, 70, 119, 157},
            {183, 174, 135, 192, 37, 13, 176, 105, 104},
            {229, 80, 59, 191, 20, 247, 171, 44, 44},
            {129, 20, 127, 23, 86, 73, 163, 44, 36},
            {198, 56, 126, 4, 103, 31, 187, 224, 227},
            {85, 49, 171, 192, 34, 179, 35, 45, 176},
            {52, 7, 210, 44, 96, 59, 198, 116, 14},
            {190, 167, 230, 35, 86, 125, 202, 210, 48},
            {53, 21, 240, 42, 100, 61, 213, 20, 31},
            {119, 49, 152, 224, 64, 247, 2, 108, 176},
            {59, 58, 91, 219, 1, 147, 103, 16, 228},
            {57, 24, 101, 120, 118, 43, 178, 214, 96},
            {57, 24, 103, 122, 84, 15, 162, 180, 96},
            {59, 26, 92, 18, 54, 222, 233, 30, 200},
            {111, 77, 192, 84, 117, 90, 145, 129, 196},
            {98, 238, 132, 17, 67, 25, 1, 152, 205},
            {50, 100, 219, 198, 5, 1, 245, 1, 195},
            {119, 200, 129, 17, 6, 182, 65, 130, 82},
            {214, 58, 128, 84, 86, 93, 118, 22, 248},
            {164, 121, 231, 117, 103, 84, 164, 5, 115},
            {245, 59, 162, 114, 81, 13, 97, 116, 202},
            {165, 74, 199, 114, 7, 96, 182, 80, 97},
            {148, 121, 199, 114, 32, 36, 211, 38, 114},
            {215, 27, 130, 66, 39, 76, 38, 68, 203},
            {228, 171, 199, 49, 7, 118, 26, 159, 88},
            {212, 138, 199, 85, 70, 55, 15, 232, 77},
            {229, 154, 229, 115, 98, 37, 76, 158, 121},
            {142, 53, 161, 117, 70, 115, 198, 41, 212},
            {178, 182, 229, 38, 101, 81, 2, 81, 168},
            {14, 189, 194, 80, 32, 123, 121, 121, 171},
            {127, 206, 135, 20, 97, 117, 253, 74, 117},
            {95, 205, 135, 20, 100, 81, 170, 29, 17},
            {224, 84, 229, 35, 39, 37, 156, 156, 215},
            {110, 204, 135, 49, 6, 20, 253, 27, 35},
            {201, 26, 129, 35, 97, 83, 222, 229, 35},
            {218, 9, 163, 33, 70, 119, 158, 213, 64},
            {217, 58, 163, 35, 102, 103, 222, 244, 54},
            {233, 8, 161, 5, 33, 5, 232, 182, 49},
            {227, 100, 199, 37, 102, 85, 222, 184, 231},
            {210, 84, 197, 35, 39, 19, 138, 168, 211},
            {224, 85, 199, 4, 36, 21, 223, 143, 229},
            {211, 68, 229, 100, 38, 3, 202, 235, 164},
            {78, 204, 165, 17, 55, 39, 223, 9, 21},
            {95, 221, 167, 81, 22, 67, 207, 30, 50},
            {76, 252, 167, 85, 22, 18, 159, 110, 39},
            {193, 87, 231, 100, 103, 113, 220, 221, 167},
            {134, 90, 199, 18, 80, 23, 231, 112, 80},
            {226, 85, 231, 39, 84, 32, 202, 205, 210},
            {243, 100, 199, 5, 51, 83, 142, 191, 165},
            {224, 102, 231, 71, 82, 82, 175, 219, 209},
            {127, 205, 135, 87, 87, 84, 157, 8, 16},
            {76, 223, 165, 55, 119, 68, 222, 126, 33},
            {247, 168, 199, 97, 119, 96, 62, 157, 126},
            {228, 187, 197, 67, 23, 96, 91, 218, 88},
            {181, 104, 229, 83, 23, 96, 212, 32, 118},
            {226, 87, 197, 39, 83, 97, 142, 206, 208},
            {232, 58, 161, 33, 115, 112, 254, 193, 33},
            {218, 27, 163, 5, 49, 7, 158, 167, 38},
            {233, 56, 163, 39, 19, 23, 202, 147, 39},
            {92, 78, 226, 34, 64, 121, 179, 145, 196},
            {10, 27, 141, 131, 68, 83, 130, 57, 32},
            {201, 42, 131, 32, 23, 84, 190, 198, 71},
            {248, 11, 163, 64, 50, 7, 139, 213, 49},
            {192, 73, 129, 149, 50, 178, 59, 173, 155},
            {142, 54, 161, 50, 118, 68, 134, 26, 245},
            {192, 103, 199, 87, 119, 65, 202, 205, 226},
            {226, 119, 199, 21, 112, 112, 141, 203, 215},
            {163, 37, 130, 23, 119, 107, 47, 184, 111},
            {146, 167, 229, 87, 96, 81, 83, 18, 140},
            {163, 150, 231, 117, 5, 69, 54, 6, 190},
            {134, 106, 197, 69, 71, 33, 165, 0, 1},
            {10, 209, 135, 49, 3, 21, 226, 146, 133},
            {27, 240, 167, 115, 32, 20, 132, 133, 193},
            {152, 179, 225, 66, 80, 247, 232, 137, 175},
            {121, 47, 233, 154, 87, 53, 128, 192, 30},
            {255, 198, 163, 96, 19, 16, 62, 225, 188},
            {27, 97, 222, 162, 39, 151, 43, 233, 214},
            {199, 226, 167, 97, 36, 150, 167, 107, 138},
            {145, 221, 164, 4, 119, 215, 189, 183, 57},
            {225, 172, 226, 98, 80, 251, 30, 128, 129},
            {197, 97, 194, 34, 87, 185, 154, 211, 62},
            {193, 141, 193, 118, 113, 156, 10, 129, 213},
            {176, 233, 199, 20, 246, 227, 35, 173, 228},
            {242, 158, 57, 137, 80, 134, 90, 15, 224},
            {129, 175, 82, 99, 171, 177, 162, 193, 140},
            {135, 171, 100, 70, 137, 121, 134, 172, 68},
            {163, 231, 67, 115, 215, 255, 154, 205, 97},
            {147, 229, 64, 86, 209, 252, 186, 207, 101},
            {149, 194, 101, 97, 147, 55, 154, 192, 205},
            {167, 226, 103, 65, 167, 96, 190, 160, 191},
            {162, 194, 66, 7, 76, 84, 164, 90, 160},
            {182, 213, 13, 47, 87, 240, 109, 52, 223},
            {214, 225, 167, 65, 85, 241, 164, 123, 171},
            {229, 210, 167, 96, 115, 162, 183, 79, 252},
            {215, 211, 164, 98, 52, 192, 181, 24, 222},
            {242, 13, 165, 55, 53, 179, 68, 25, 114},
            {175, 78, 194, 5, 48, 149, 24, 153, 65},
            {238, 44, 134, 35, 53, 223, 188, 185, 235},
            {253, 13, 164, 35, 23, 222, 223, 168, 217},
            {195, 158, 192, 84, 48, 140, 62, 129, 165},
            {132, 175, 59, 130, 125, 145, 174, 101, 8},
            {129, 239, 34, 8, 9, 253, 206, 36, 242},
            {195, 199, 46, 53, 41, 213, 216, 44, 101},
            {134, 177, 79, 23, 73, 87, 90, 48, 16},
            {199, 135, 40, 121, 91, 81, 47, 137, 47},
            {132, 213, 74, 245, 95, 81, 118, 228, 140},
            {163, 221, 110, 174, 21, 187, 139, 45, 108},
            {129, 207, 133, 68, 33, 213, 140, 244, 62},
            {196, 243, 133, 113, 37, 245, 214, 72, 236},
            {132, 160, 25, 201, 71, 241, 86, 225, 87},
            {194, 147, 105, 131, 87, 127, 82, 33, 247},
            {192, 161, 73, 242, 67, 45, 97, 69, 208},
            {181, 75, 15, 143, 87, 95, 241, 201, 114},
            {128, 22, 128, 52, 100, 121, 24, 250, 25},
            {161, 4, 161, 48, 3, 56, 88, 221, 47},
            {180, 251, 130, 16, 86, 63, 186, 205, 165},
            {192, 159, 27, 137, 22, 241, 95, 45, 162},
            {231, 237, 53, 169, 87, 149, 194, 32, 96},
            {129, 237, 135, 116, 35, 245, 153, 197, 44},
            {163, 207, 93, 220, 69, 191, 174, 77, 8},
            {195, 173, 43, 186, 23, 135, 72, 8, 176},
            {194, 191, 41, 217, 85, 179, 24, 40, 224},
            {146, 233, 111, 187, 157, 50, 241, 184, 159},
            {139, 49, 93, 138, 39, 181, 230, 253, 40},
            {204, 119, 59, 38, 99, 62, 200, 172, 32},
            {147, 239, 123, 48, 117, 199, 68, 97, 4},
            {197, 159, 112, 9, 130, 164, 102, 185, 37},
            {231, 232, 35, 66, 222, 81, 7, 158, 221},
            {134, 169, 38, 102, 210, 151, 2, 119, 44},
            {229, 201, 96, 96, 178, 216, 196, 117, 227},
            {147, 174, 2, 64, 134, 88, 84, 42, 179},
            {133, 169, 4, 98, 162, 178, 2, 116, 12},
            {215, 160, 0, 119, 148, 31, 95, 130, 35},
            {133, 226, 102, 81, 180, 119, 207, 198, 189},
            {133, 192, 102, 83, 182, 52, 216, 240, 221},
            {165, 212, 102, 21, 27, 207, 135, 17, 123},
            {145, 133, 100, 177, 108, 6, 218, 223, 25},
            {231, 135, 78, 177, 54, 215, 16, 44, 92},
            {209, 191, 11, 141, 67, 163, 9, 9, 160},
            {148, 219, 130, 86, 55, 15, 222, 200, 149},
            {151, 251, 162, 84, 86, 29, 234, 222, 164},
            {181, 233, 162, 33, 85, 94, 136, 217, 144},
            {192, 233, 25, 197, 84, 201, 250, 231, 96},
            {164, 233, 36, 105, 78, 21, 171, 120, 8},
            {230, 253, 19, 5, 0, 155, 14, 125, 44},
            {197, 207, 1, 36, 112, 155, 15, 125, 46},
            {193, 173, 46, 98, 113, 237, 144, 49, 200},
            {226, 175, 15, 102, 34, 155, 146, 53, 200},
            {225, 173, 44, 68, 65, 187, 131, 1, 234},
            {195, 173, 13, 96, 98, 185, 147, 20, 200},
            {193, 202, 15, 106, 100, 150, 86, 236, 121},
            {135, 173, 80, 172, 0, 223, 71, 118, 200},
            {145, 192, 21, 187, 17, 132, 200, 153, 183},
            {149, 197, 30, 127, 101, 131, 29, 103, 232},
            {198, 194, 104, 51, 4, 177, 91, 219, 245},
            {211, 230, 79, 51, 23, 62, 28, 225, 109},
            {181, 218, 109, 96, 66, 107, 86, 124, 157},
            {134, 202, 130, 70, 5, 95, 138, 207, 161},
            {244, 137, 197, 1, 5, 85, 28, 174, 106},
            {227, 143, 57, 139, 68, 197, 14, 60, 180},
            {226, 249, 35, 175, 38, 125, 196, 62, 232},
            {228, 239, 43, 107, 36, 95, 17, 165, 132},
            {196, 223, 11, 110, 84, 29, 18, 151, 164},
            {241, 251, 14, 110, 118, 211, 86, 248, 92},
            {240, 251, 47, 104, 102, 183, 84, 248, 91},
            {28, 54, 189, 87, 193, 123, 250, 40, 30},
            {202, 195, 164, 69, 53, 219, 74, 172, 115},
            {154, 144, 161, 39, 45, 58, 44, 50, 129},
            {213, 227, 135, 99, 96, 130, 132, 88, 222},
            {132, 147, 162, 69, 107, 113, 224, 199, 9},
            {198, 224, 13, 235, 107, 4, 32, 110, 247},
            {131, 76, 226, 50, 49, 184, 160, 93, 207},
            {148, 131, 90, 221, 57, 56, 162, 44, 89},
            {131, 172, 96, 36, 157, 128, 183, 231, 251},
            {224, 220, 69, 82, 129, 112, 244, 127, 123},
            {136, 101, 1, 64, 45, 187, 119, 27, 98},
            {168, 69, 39, 222, 11, 244, 187, 18, 63},
            {174, 96, 1, 255, 30, 13, 255, 76, 149},
            {170, 46, 67, 101, 11, 14, 186, 202, 182},
            {140, 10, 39, 39, 17, 77, 41, 109, 70},
            {171, 121, 198, 5, 22, 107, 94, 209, 156},
            {188, 164, 228, 1, 38, 111, 157, 133, 7},
            {136, 161, 224, 33, 68, 147, 154, 159, 168},
            {168, 162, 192, 96, 36, 177, 154, 186, 187},
            {153, 105, 199, 55, 83, 79, 12, 150, 184},
            {172, 77, 224, 55, 83, 181, 10, 141, 64},
            {219, 64, 224, 113, 35, 144, 2, 98, 211},
            {166, 232, 163, 84, 35, 29, 203, 221, 241},
            {162, 207, 92, 173, 103, 158, 239, 106, 10},
            {134, 248, 31, 67, 59, 212, 226, 229, 243},
            {197, 139, 70, 144, 91, 113, 247, 49, 143},
            {236, 101, 32, 110, 38, 217, 226, 51, 234},
            {200, 4, 9, 242, 34, 147, 151, 0, 51},
            {185, 232, 129, 82, 97, 115, 0, 42, 107},
            {185, 232, 129, 82, 97, 115, 0, 42, 107},
            {185, 232, 129, 82, 97, 115, 0, 42, 107},
            {185, 232, 129, 82, 97, 115, 0, 42, 107},
            {185, 232, 129, 82, 97, 115, 0, 42, 107},
            {185, 232, 129, 82, 97, 115, 0, 42, 107},
            {185, 232, 129, 82, 97, 115, 0, 42, 107},
            {185, 232, 129, 82, 97, 115, 0, 42, 107},
            {185, 232, 129, 82, 97, 115, 0, 42, 107},
    };

}
