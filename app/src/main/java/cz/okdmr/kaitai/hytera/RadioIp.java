// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.hytera;

import java.io.IOException;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import io.kaitai.struct.KaitaiStruct;


/**
 * represented as 4 bytes, each byte interpreted as number (0-255)
 * 10.0.0.80 means the subnet is set to 10.x.x.x (C) and radio ID is 80
 * 10.22.0.0 means the subnet is set to 10.x.x.x (C) and radio ID is 2200
 */
public class RadioIp extends KaitaiStruct {
    private String radioId;
    private int subnet;
    private int radioId1;
    private int radioId2;
    private int radioId3;
    private RadioIp _root;
    private KaitaiStruct _parent;

    public RadioIp(KaitaiStream _io) {
        this(_io, null, null);
    }
    public RadioIp(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }
    public RadioIp(KaitaiStream _io, KaitaiStruct _parent, RadioIp _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }

    public static RadioIp fromFile(String fileName) throws IOException {
        return new RadioIp(new ByteBufferKaitaiStream(fileName));
    }

    private void _read() {
        this.subnet = this._io.readU1();
        this.radioId1 = this._io.readU1();
        this.radioId2 = this._io.readU1();
        this.radioId3 = this._io.readU1();
    }

    public String radioId() {
        if (this.radioId != null)
            return this.radioId;
        this.radioId = Long.toString(radioId1(), 10) + Long.toString(radioId2(), 10) + Long.toString(radioId3(), 10);
        return this.radioId;
    }

    public int subnet() {
        return subnet;
    }

    public int radioId1() {
        return radioId1;
    }

    public int radioId2() {
        return radioId2;
    }

    public int radioId3() {
        return radioId3;
    }

    public RadioIp _root() {
        return _root;
    }

    public KaitaiStruct _parent() {
        return _parent;
    }
}
