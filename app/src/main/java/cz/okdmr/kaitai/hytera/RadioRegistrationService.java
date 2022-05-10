// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.hytera;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import io.kaitai.struct.KaitaiStruct;

public class RadioRegistrationService extends KaitaiStruct {
    private byte[] opcode;
    private RrsTypes rrsType;
    private int messageLength;
    private RadioIp radioIp;
    private Integer result;
    private Long validTime;
    private RadioRegistrationService _root;
    private KaitaiStruct _parent;
    public RadioRegistrationService(KaitaiStream _io) {
        this(_io, null, null);
    }
    public RadioRegistrationService(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }
    public RadioRegistrationService(KaitaiStream _io, KaitaiStruct _parent, RadioRegistrationService _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }

    public static RadioRegistrationService fromFile(String fileName) throws IOException {
        return new RadioRegistrationService(new ByteBufferKaitaiStream(fileName));
    }

    private void _read() {
        this.opcode = this._io.readBytes(1);
        if (!(Arrays.equals(opcode(), new byte[]{0}))) {
            throw new KaitaiStream.ValidationNotEqualError(new byte[]{0}, opcode(), _io(), "/seq/0");
        }
        this.rrsType = RrsTypes.byId(this._io.readU1());
        this.messageLength = this._io.readU2be();
        this.radioIp = new RadioIp(this._io);
        if (((rrsType() == RrsTypes.REGISTRATION_ACK) || (rrsType() == RrsTypes.ONLINE_CHECK_ACK))) {
            this.result = this._io.readU1();
        }
        if (rrsType() == RrsTypes.REGISTRATION_ACK) {
            this.validTime = this._io.readU4be();
        }
    }

    public byte[] opcode() {
        return opcode;
    }

    public RrsTypes rrsType() {
        return rrsType;
    }

    /**
     * length of the message from next field to the end of RRS message
     */
    public int messageLength() {
        return messageLength;
    }

    public RadioIp radioIp() {
        return radioIp;
    }

    public Integer result() {
        return result;
    }

    /**
     * number of seconds the online registration message shall be resended from terminal
     */
    public Long validTime() {
        return validTime;
    }

    public RadioRegistrationService _root() {
        return _root;
    }

    public KaitaiStruct _parent() {
        return _parent;
    }

    public enum RrsTypes {
        DE_REGISTRATION(1),
        ONLINE_CHECK(2),
        REGISTRATION(3),
        REGISTRATION_ACK(128),
        ONLINE_CHECK_ACK(130);

        private static final Map<Long, RrsTypes> byId = new HashMap<Long, RrsTypes>(5);

        static {
            for (RrsTypes e : RrsTypes.values())
                byId.put(e.id(), e);
        }

        private final long id;

        RrsTypes(long id) {
            this.id = id;
        }

        public static RrsTypes byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }
}
