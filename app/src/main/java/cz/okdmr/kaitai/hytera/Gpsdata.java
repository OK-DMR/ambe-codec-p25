// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.hytera;

import java.io.IOException;
import java.nio.charset.Charset;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import io.kaitai.struct.KaitaiStruct;

public class Gpsdata extends KaitaiStruct {
    private Boolean gpsAvailable;
    private byte[] gpsStatus;
    private byte[] gpsTime;
    private byte[] gpsDate;
    private byte[] northSouth;
    private byte[] latitude;
    private byte[] eastWest;
    private byte[] longitude;
    private byte[] speed;
    private byte[] direction;
    private Gpsdata _root;
    private KaitaiStruct _parent;
    public Gpsdata(KaitaiStream _io) {
        this(_io, null, null);
    }
    public Gpsdata(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }
    public Gpsdata(KaitaiStream _io, KaitaiStruct _parent, Gpsdata _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }

    public static Gpsdata fromFile(String fileName) throws IOException {
        return new Gpsdata(new ByteBufferKaitaiStream(fileName));
    }

    private void _read() {
        this.gpsStatus = this._io.readBytes(1);
        this.gpsTime = this._io.readBytes(6);
        this.gpsDate = this._io.readBytes(6);
        this.northSouth = this._io.readBytes(1);
        this.latitude = this._io.readBytes(9);
        this.eastWest = this._io.readBytes(1);
        this.longitude = this._io.readBytes(10);
        this.speed = this._io.readBytes(3);
        this.direction = this._io.readBytes(3);
    }

    public Boolean gpsAvailable() {
        if (this.gpsAvailable != null)
            return this.gpsAvailable;
        boolean _tmp = (boolean) (new String(gpsStatus(), Charset.forName("ASCII")).equals("A"));
        this.gpsAvailable = _tmp;
        return this.gpsAvailable;
    }

    /**
     * A=gps available/locked, V=gps unavailable/no data
     */
    public byte[] gpsStatus() {
        return gpsStatus;
    }

    /**
     * GMT format HHMMSS
     */
    public byte[] gpsTime() {
        return gpsTime;
    }

    /**
     * format DDMMYY
     */
    public byte[] gpsDate() {
        return gpsDate;
    }

    /**
     * letter N or S
     */
    public byte[] northSouth() {
        return northSouth;
    }

    /**
     * DDMM.MMMM D=degree(0-90) M=minute(0-59.9999)
     */
    public byte[] latitude() {
        return latitude;
    }

    /**
     * letters E or W
     */
    public byte[] eastWest() {
        return eastWest;
    }

    /**
     * DDDMM.MMMM D=degree(0-180) M=minute(0-59.9999)
     */
    public byte[] longitude() {
        return longitude;
    }

    /**
     * speed in knots, eg. 0.2
     */
    public byte[] speed() {
        return speed;
    }

    /**
     * azimuth(0-359), 0=north, increase is clockwise
     */
    public byte[] direction() {
        return direction;
    }

    public Gpsdata _root() {
        return _root;
    }

    public KaitaiStruct _parent() {
        return _parent;
    }
}
