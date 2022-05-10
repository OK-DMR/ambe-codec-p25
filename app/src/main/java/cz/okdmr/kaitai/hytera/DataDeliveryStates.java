// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.hytera;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import io.kaitai.struct.KaitaiStruct;

public class DataDeliveryStates extends KaitaiStruct {
    private byte[] reserved;
    private StateTypes stateType;
    private int messageLength;
    private RadioIp radioIp;
    private int protocolOpcode;
    private Results result;
    private DataDeliveryStates _root;
    private KaitaiStruct _parent;
    public DataDeliveryStates(KaitaiStream _io) {
        this(_io, null, null);
    }
    public DataDeliveryStates(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }
    public DataDeliveryStates(KaitaiStream _io, KaitaiStruct _parent, DataDeliveryStates _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }

    public static DataDeliveryStates fromFile(String fileName) throws IOException {
        return new DataDeliveryStates(new ByteBufferKaitaiStream(fileName));
    }

    private void _read() {
        this.reserved = this._io.readBytes(1);
        this.stateType = StateTypes.byId(this._io.readU1());
        this.messageLength = this._io.readU2be();
        this.radioIp = new RadioIp(this._io);
        this.protocolOpcode = this._io.readU2be();
        this.result = Results.byId(this._io.readU1());
    }

    /**
     * should be 0x00
     */
    public byte[] reserved() {
        return reserved;
    }

    public StateTypes stateType() {
        return stateType;
    }

    /**
     * length of the message from next field to the end of DDS message
     */
    public int messageLength() {
        return messageLength;
    }

    public RadioIp radioIp() {
        return radioIp;
    }

    /**
     * state_type+protocol_opcode should correspond to sent message, that this status is about
     */
    public int protocolOpcode() {
        return protocolOpcode;
    }

    public Results result() {
        return result;
    }

    public DataDeliveryStates _root() {
        return _root;
    }

    public KaitaiStruct _parent() {
        return _parent;
    }

    public enum StateTypes {
        LOCATION_PROTOCOL_STATE(8),
        RADIO_REGISTRATION_SERVICE_STATE(17),
        TELEMETRY_PROTOCOL_STATE(18),
        DATA_TRANSMIT_PROTOCOL_STATE(19);

        private static final Map<Long, StateTypes> byId = new HashMap<Long, StateTypes>(4);

        static {
            for (StateTypes e : StateTypes.values())
                byId.put(e.id(), e);
        }

        private final long id;

        StateTypes(long id) {
            this.id = id;
        }

        public static StateTypes byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    public enum Results {
        OK(0),
        FAIL(1),
        LIMITED_TIMEOUT(4),
        NO_ACK(5),
        ERROR_ACK(6),
        REPEATER_WAKEUP_FAIL(7),
        TX_INTERRUPTED(8),
        TX_DENY(9),
        INVALID_PARAMS(10);

        private static final Map<Long, Results> byId = new HashMap<Long, Results>(9);

        static {
            for (Results e : Results.values())
                byId.put(e.id(), e);
        }

        private final long id;

        Results(long id) {
            this.id = id;
        }

        public static Results byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }
}
