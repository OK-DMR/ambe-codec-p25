// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.hytera;

import java.io.IOException;
import java.util.Arrays;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import io.kaitai.struct.KaitaiStruct;


/**
 * Hytera IP Multi-Site Connect Protocol heartbeat packet, either simple KEEPALIVE/UP or PING/PONG
 */
public class IpSiteConnectHeartbeat extends KaitaiStruct {
    private KaitaiStruct data;
    private IpSiteConnectHeartbeat _root;
    private KaitaiStruct _parent;

    public IpSiteConnectHeartbeat(KaitaiStream _io) {
        this(_io, null, null);
    }

    public IpSiteConnectHeartbeat(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public IpSiteConnectHeartbeat(KaitaiStream _io, KaitaiStruct _parent, IpSiteConnectHeartbeat _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }

    public static IpSiteConnectHeartbeat fromFile(String fileName) throws IOException {
        return new IpSiteConnectHeartbeat(new ByteBufferKaitaiStream(fileName));
    }

    private void _read() {
        switch ((int) _io().size()) {
            case 1: {
                this.data = new Keepalive(this._io, this, _root);
                break;
            }
            case 20: {
                this.data = new PingPong(this._io, this, _root);
                break;
            }
            default: {
                this.data = new Unknown(this._io, this, _root);
                break;
            }
        }
    }

    public KaitaiStruct data() {
        return data;
    }

    public IpSiteConnectHeartbeat _root() {
        return _root;
    }

    public KaitaiStruct _parent() {
        return _parent;
    }

    public static class Keepalive extends KaitaiStruct {
        private byte[] nullbyte;
        private IpSiteConnectHeartbeat _root;
        private IpSiteConnectHeartbeat _parent;

        public Keepalive(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Keepalive(KaitaiStream _io, IpSiteConnectHeartbeat _parent) {
            this(_io, _parent, null);
        }

        public Keepalive(KaitaiStream _io, IpSiteConnectHeartbeat _parent, IpSiteConnectHeartbeat _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static Keepalive fromFile(String fileName) throws IOException {
            return new Keepalive(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.nullbyte = this._io.readBytes(1);
            if (!(Arrays.equals(nullbyte(), new byte[]{0}))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[]{0}, nullbyte(), _io(), "/types/keepalive/seq/0");
            }
        }

        public byte[] nullbyte() {
            return nullbyte;
        }

        public IpSiteConnectHeartbeat _root() {
            return _root;
        }

        public IpSiteConnectHeartbeat _parent() {
            return _parent;
        }
    }

    public static class PingPong extends KaitaiStruct {
        private byte[] header;
        private byte[] heartbeatIdentitier;
        private byte[] nullbytes;
        private int heartbeatSeq;
        private byte[] tail;
        private IpSiteConnectHeartbeat _root;
        private IpSiteConnectHeartbeat _parent;
        public PingPong(KaitaiStream _io) {
            this(_io, null, null);
        }
        public PingPong(KaitaiStream _io, IpSiteConnectHeartbeat _parent) {
            this(_io, _parent, null);
        }
        public PingPong(KaitaiStream _io, IpSiteConnectHeartbeat _parent, IpSiteConnectHeartbeat _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static PingPong fromFile(String fileName) throws IOException {
            return new PingPong(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.header = this._io.readBytes(4);
            if (!(Arrays.equals(header(), new byte[]{90, 90, 90, 90}))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[]{90, 90, 90, 90}, header(), _io(), "/types/ping_pong/seq/0");
            }
            this.heartbeatIdentitier = this._io.readBytes(5);
            if (!(Arrays.equals(heartbeatIdentitier(), new byte[]{10, 0, 0, 0, 20}))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[]{10, 0, 0, 0, 20}, heartbeatIdentitier(), _io(), "/types/ping_pong/seq/1");
            }
            this.nullbytes = this._io.readBytes(3);
            if (!(Arrays.equals(nullbytes(), new byte[]{0, 0, 0}))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[]{0, 0, 0}, nullbytes(), _io(), "/types/ping_pong/seq/2");
            }
            this.heartbeatSeq = this._io.readU1();
            this.tail = this._io.readBytes(7);
            if (!(Arrays.equals(tail(), new byte[]{90, 89, 90, 0, 0, 0, 0}))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[]{90, 89, 90, 0, 0, 0, 0}, tail(), _io(), "/types/ping_pong/seq/4");
            }
        }

        public byte[] header() {
            return header;
        }

        public byte[] heartbeatIdentitier() {
            return heartbeatIdentitier;
        }

        public byte[] nullbytes() {
            return nullbytes;
        }

        /**
         * raise this byte by one on response
         */
        public int heartbeatSeq() {
            return heartbeatSeq;
        }

        public byte[] tail() {
            return tail;
        }

        public IpSiteConnectHeartbeat _root() {
            return _root;
        }

        public IpSiteConnectHeartbeat _parent() {
            return _parent;
        }
    }

    public static class Unknown extends KaitaiStruct {
        private byte[] data;
        private IpSiteConnectHeartbeat _root;
        private IpSiteConnectHeartbeat _parent;

        public Unknown(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Unknown(KaitaiStream _io, IpSiteConnectHeartbeat _parent) {
            this(_io, _parent, null);
        }

        public Unknown(KaitaiStream _io, IpSiteConnectHeartbeat _parent, IpSiteConnectHeartbeat _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static Unknown fromFile(String fileName) throws IOException {
            return new Unknown(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.data = this._io.readBytesFull();
        }

        public byte[] data() {
            return data;
        }

        public IpSiteConnectHeartbeat _root() {
            return _root;
        }

        public IpSiteConnectHeartbeat _parent() {
            return _parent;
        }
    }
}
