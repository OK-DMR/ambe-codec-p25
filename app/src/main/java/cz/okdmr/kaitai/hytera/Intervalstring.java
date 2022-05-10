// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.hytera;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.nio.charset.Charset;


/**
 * interval in format ddhhmmss, eg. “00010000” means every 1 hour
 */
public class Intervalstring extends KaitaiStruct {
    public static Intervalstring fromFile(String fileName) throws IOException {
        return new Intervalstring(new ByteBufferKaitaiStream(fileName));
    }

    public Intervalstring(KaitaiStream _io) {
        this(_io, null, null);
    }

    public Intervalstring(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public Intervalstring(KaitaiStream _io, KaitaiStruct _parent, Intervalstring _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.interval = new String(this._io.readBytes(8), Charset.forName("UTF-8"));
    }
    private String interval;
    private Intervalstring _root;
    private KaitaiStruct _parent;
    public String interval() { return interval; }
    public Intervalstring _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
