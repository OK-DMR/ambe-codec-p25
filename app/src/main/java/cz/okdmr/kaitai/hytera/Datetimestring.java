// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.hytera;

import java.io.IOException;
import java.nio.charset.Charset;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import io.kaitai.struct.KaitaiStruct;


/**
 * time in format yyyyMMddhhmmss, timezone GMT
 */
public class Datetimestring extends KaitaiStruct {
    private String datetime;
    private Datetimestring _root;
    private KaitaiStruct _parent;

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

    public static Datetimestring fromFile(String fileName) throws IOException {
        return new Datetimestring(new ByteBufferKaitaiStream(fileName));
    }

    private void _read() {
        this.datetime = new String(this._io.readBytes(14), Charset.forName("UTF-8"));
    }

    public String datetime() {
        return datetime;
    }

    public Datetimestring _root() {
        return _root;
    }

    public KaitaiStruct _parent() {
        return _parent;
    }
}
