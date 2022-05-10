// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.hytera;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import io.kaitai.struct.KaitaiStruct;

public class HyteraRadioNetworkProtocol extends KaitaiStruct {
    private byte[] headerIdentifier;
    private int version;
    private int block;
    private Opcodes opcode;
    private int sourceId;
    private int destinationId;
    private int packetNumber;
    private int hrnpPacketLength;
    private int checksum;
    private HyteraDmrApplicationProtocol data;
    private HyteraRadioNetworkProtocol _root;
    private KaitaiStruct _parent;
    public HyteraRadioNetworkProtocol(KaitaiStream _io) {
        this(_io, null, null);
    }
    public HyteraRadioNetworkProtocol(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }
    public HyteraRadioNetworkProtocol(KaitaiStream _io, KaitaiStruct _parent, HyteraRadioNetworkProtocol _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }

    public static HyteraRadioNetworkProtocol fromFile(String fileName) throws IOException {
        return new HyteraRadioNetworkProtocol(new ByteBufferKaitaiStream(fileName));
    }

    private void _read() {
        this.headerIdentifier = this._io.readBytes(1);
        if (!(Arrays.equals(headerIdentifier(), new byte[]{126}))) {
            throw new KaitaiStream.ValidationNotEqualError(new byte[]{126}, headerIdentifier(), _io(), "/seq/0");
        }
        this.version = this._io.readU1();
        this.block = this._io.readU1();
        this.opcode = Opcodes.byId(this._io.readU1());
        this.sourceId = this._io.readU1();
        this.destinationId = this._io.readU1();
        this.packetNumber = this._io.readU2be();
        this.hrnpPacketLength = this._io.readU2be();
        this.checksum = this._io.readU2be();
        if (opcode() == Opcodes.DATA) {
            this.data = new HyteraDmrApplicationProtocol(this._io);
        }
    }

    public byte[] headerIdentifier() {
        return headerIdentifier;
    }

    public int version() {
        return version;
    }

    public int block() {
        return block;
    }

    public Opcodes opcode() {
        return opcode;
    }

    public int sourceId() {
        return sourceId;
    }

    public int destinationId() {
        return destinationId;
    }

    public int packetNumber() {
        return packetNumber;
    }

    public int hrnpPacketLength() {
        return hrnpPacketLength;
    }

    public int checksum() {
        return checksum;
    }

    public HyteraDmrApplicationProtocol data() {
        return data;
    }

    public HyteraRadioNetworkProtocol _root() {
        return _root;
    }

    public KaitaiStruct _parent() {
        return _parent;
    }

    public enum Opcodes {
        DATA(0),
        DATA_ACK(16),
        CLOSE_ACK(250),
        CLOSE(251),
        REJECT(252),
        ACCEPT(253),
        CONNECT(254);

        private static final Map<Long, Opcodes> byId = new HashMap<Long, Opcodes>(7);

        static {
            for (Opcodes e : Opcodes.values())
                byId.put(e.id(), e);
        }

        private final long id;

        Opcodes(long id) {
            this.id = id;
        }

        public static Opcodes byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }
}
