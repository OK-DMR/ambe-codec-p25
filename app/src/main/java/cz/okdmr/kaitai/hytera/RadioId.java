// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.hytera;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;


/**
 * represented as 3 bytes, each byte interpreted as number (0-255)
 */
public class RadioId extends KaitaiStruct {
    public static RadioId fromFile(String fileName) throws IOException {
        return new RadioId(new ByteBufferKaitaiStream(fileName));
    }

    public RadioId(KaitaiStream _io) {
        this(_io, null, null);
    }

    public RadioId(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public RadioId(KaitaiStream _io, KaitaiStruct _parent, RadioId _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.radioIdRaw = this._io.readU4le();
    }
    private Integer radioId;
    public Integer radioId() {
        if (this.radioId != null)
            return this.radioId;
        int _tmp = (int) ((radioIdRaw() >> 8));
        this.radioId = _tmp;
        return this.radioId;
    }
    private long radioIdRaw;
    private RadioId _root;
    private KaitaiStruct _parent;
    public long radioIdRaw() { return radioIdRaw; }
    public RadioId _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
