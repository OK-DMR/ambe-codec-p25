package cz.okdmr.mmdvm.homebrew;

import android.util.Log;

import com.google.common.base.Strings;
import com.google.common.primitives.Bytes;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.BitSet;

import cz.okdmr.kaitai.homebrew.Mmdvm2020;

public class MMDVM {

    public static byte[] getRepeaterLoginRequest(int repeater_id) {
        return ByteBuffer.allocate(8).put("RPTL".getBytes()).putInt(repeater_id).array();
    }

    public static byte[] getMasterNegativeResult(int repeater_id) {
        return ByteBuffer.allocate(10).put("MSTNAK".getBytes()).putInt(repeater_id).array();
    }

    public static byte[] getMasterAcknowledge(int repeater_id, byte[] challenge) {
        if (challenge == null) {
            challenge = new byte[0];
        }
        return ByteBuffer.allocate(10 + challenge.length).put("MSTACK".getBytes()).putInt(repeater_id).put(challenge).array();
    }

    public static byte[] getMasterPing(int repeater_id) {
        return ByteBuffer.allocate(11).put("MSTPONG".getBytes()).putInt(repeater_id).array();
    }

    public static byte[] getRepeaterPong(int repeater_id) {
        return ByteBuffer.allocate(11).put("RPTPING".getBytes()).putInt(repeater_id).array();
    }

    public static byte[] getMasterClosing(int repeater_id) {
        return ByteBuffer.allocate(9).put("RPTCL".getBytes()).putInt(repeater_id).array();
    }

    public static byte[] getLoginChallengeResponse(int repeater_id, String password, byte[] challenge) {
        byte[] sha256_bytes = new byte[0];
        try {
            sha256_bytes = MessageDigest.getInstance("SHA-256").digest(Bytes.concat(challenge, password.getBytes()));
        } catch (Throwable e) {
            Log.e("getLoginChallengeResponse", "error while digest", e);
        }
        return ByteBuffer.allocate(40).put("RPTK".getBytes()).putInt(repeater_id).put(sha256_bytes).array();
    }

    public static byte[] getClientConfiguration(
            String callsign_8,
            int repeater_id,
            String rx_frequence_9,
            String tx_frequence_9,
            String tx_power_2,
            String color_code_2,
            String latitude_8,
            String longitude_9,
            String height_3,
            String location_20,
            String description_19,
            String slots_1,
            String url_124,
            String software_id_40,
            String package_id_40
    ) {
        return ByteBuffer.allocate(302)
                .put("RPTC".getBytes())
                .putInt(repeater_id)
                .put(Strings.padEnd(callsign_8, 8, ' ').substring(0, 8).getBytes())
                .put(Strings.padEnd(rx_frequence_9, 9, ' ').substring(0, 9).getBytes())
                .put(Strings.padEnd(tx_frequence_9, 9, ' ').substring(0, 9).getBytes())
                .put(Strings.padEnd(tx_power_2, 2, ' ').substring(0, 2).getBytes())
                .put(Strings.padEnd(color_code_2, 2, ' ').substring(0, 2).getBytes())
                .put(Strings.padEnd(latitude_8, 8, ' ').substring(0, 8).getBytes())
                .put(Strings.padEnd(longitude_9, 9, ' ').substring(0, 9).getBytes())
                .put(Strings.padEnd(height_3, 3, ' ').substring(0, 3).getBytes())
                .put(Strings.padEnd(location_20, 20, ' ').substring(0, 20).getBytes())
                .put(Strings.padEnd(description_19, 19, ' ').substring(0, 19).getBytes())
                .put(Strings.padEnd(slots_1, 1, '1').substring(0, 1).getBytes())
                .put(Strings.padEnd(url_124, 124, ' ').substring(0, 124).getBytes())
                .put(Strings.padEnd(software_id_40, 40, ' ').substring(0, 40).getBytes())
                .put(Strings.padEnd(package_id_40, 40, ' ').substring(0, 40).getBytes())
                .array();
    }

    public static byte[] getDMRData(
            int repeater_id,
            byte sequence_number,
            int source_radio_id,
            int target_radio_id,
            boolean is_timeslot_2,
            boolean is_private_call,
            Mmdvm2020.FrameTypes frame_type,
            int data_type,
            int stream_id,
            byte[] dmr_data,
            byte[] rssi_data
    ) {
        BitSet bitflags = new BitSet(8);
        bitflags.clear();
        if (is_timeslot_2) {
            bitflags.set(0);
        }
        if (is_private_call) {
            bitflags.set(1);
        }
        // frame type 2 bits, only set necessary 1-bits
        switch (frame_type) {
            case VOICE_DATA:
                break;
            case VOICE_SYNC:
                bitflags.set(3);
                break;
            case DATA_OR_DATA_SYNC:
                bitflags.set(2);
                break;
        }
        // data type 4 bits
        BitSet dt_bits = BitSet.valueOf(new byte[]{ (byte)data_type });
        bitflags.set(4, dt_bits.get(0));
        bitflags.set(5, dt_bits.get(1));
        bitflags.set(6, dt_bits.get(2));
        bitflags.set(7, dt_bits.get(3));

        return ByteBuffer.allocate(20 + dmr_data.length + rssi_data.length)
                .put("DMRD".getBytes())
                .put(sequence_number)
                .put(new byte[]{
                        (byte) (source_radio_id & 0xFF),
                        (byte) ((source_radio_id >> 8) & 0xFF),
                        (byte) ((source_radio_id >> 16) & 0xFF)
                })
                .put(new byte[]{
                        (byte) (target_radio_id & 0xFF),
                        (byte) ((target_radio_id >> 8) & 0xFF),
                        (byte) ((target_radio_id >> 16) & 0xFF)
                })
                .putInt(repeater_id)
                .put(bitflags.toByteArray())
                .putInt(stream_id)
                .put(dmr_data)
                .array();
    }

}
