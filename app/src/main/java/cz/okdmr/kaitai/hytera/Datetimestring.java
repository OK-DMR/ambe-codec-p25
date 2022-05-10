// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.hytera;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.nio.charset.Charset;


/**
 * time in format yyyyMMddhhmmss, timezone GMT
 */
public class Datetimestring extends KaitaiStruct {
    public static Datetimestring fromFile(String fileName) throws IOException {
        return new Datetimestring(new ByteBufferKaitaiStream(fileName));
    }

    public Datetimestring(KaitaiStream _io) {
        this(_io, null, null);
    }

    public Datetimestring(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public Datetimestring(KaitaiStream _io, KaitaiStruct _parent, Datetimestring _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.datetime = new String(this._io.readBytes(14), Charset.forName("UTF-8"));
    }
    private String datetime;
    private Datetimestring _root;
    private KaitaiStruct _parent;
    public String datetime() { return datetime; }
    public Datetimestring _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
