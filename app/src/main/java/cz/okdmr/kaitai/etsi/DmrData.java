// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.etsi;

import java.io.IOException;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import io.kaitai.struct.KaitaiStruct;


/**
 * ETSI TS 102 361-1 V2.5.1, section 9.2, Data PDUs
 */
public class DmrData extends KaitaiStruct {
    private DmrData _root;
    private KaitaiStruct _parent;

    public DmrData(KaitaiStream _io) {
        this(_io, null, null);
    }

    public DmrData(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public DmrData(KaitaiStream _io, KaitaiStruct _parent, DmrData _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }

    public static DmrData fromFile(String fileName) throws IOException {
        return new DmrData(new ByteBufferKaitaiStream(fileName));
    }

    private void _read() {
    }

    public DmrData _root() {
        return _root;
    }

    public KaitaiStruct _parent() {
        return _parent;
    }

    /**
     * 9.2.16 Rate 1 coded Last Data block (R_1_LDATA) PDU, Table 9.18C: R_1_LDATA PDU content for unconfirmed data
     */
    public static class Rate1LastBlockUnconfirmed extends KaitaiStruct {
        private byte[] userData;
        private byte[] messageCrc32;
        private DmrData _root;
        private KaitaiStruct _parent;

        public Rate1LastBlockUnconfirmed(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Rate1LastBlockUnconfirmed(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }
        public Rate1LastBlockUnconfirmed(KaitaiStream _io, KaitaiStruct _parent, DmrData _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static Rate1LastBlockUnconfirmed fromFile(String fileName) throws IOException {
            return new Rate1LastBlockUnconfirmed(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.userData = this._io.readBytes(20);
            this.messageCrc32 = this._io.readBytes(4);
        }

        public byte[] userData() {
            return userData;
        }

        public byte[] messageCrc32() {
            return messageCrc32;
        }

        public DmrData _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    /**
     * 9.2.8 Rate ½ coded Last Data block (R_1_2_LDATA) PDU, Table 9.15B: R_1_2_LDATA PDU content for confirmed data
     */
    public static class Rate12LastBlockConfirmed extends KaitaiStruct {
        private long dataBlockSerialNumber;
        private long crc9;
        private byte[] userData;
        private byte[] messageCrc32;
        private DmrData _root;
        private KaitaiStruct _parent;
        public Rate12LastBlockConfirmed(KaitaiStream _io) {
            this(_io, null, null);
        }
        public Rate12LastBlockConfirmed(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }
        public Rate12LastBlockConfirmed(KaitaiStream _io, KaitaiStruct _parent, DmrData _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static Rate12LastBlockConfirmed fromFile(String fileName) throws IOException {
            return new Rate12LastBlockConfirmed(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.dataBlockSerialNumber = this._io.readBitsIntBe(7);
            this.crc9 = this._io.readBitsIntBe(9);
            this._io.alignToByte();
            this.userData = this._io.readBytes(6);
            this.messageCrc32 = this._io.readBytes(4);
        }

        public long dataBlockSerialNumber() {
            return dataBlockSerialNumber;
        }

        public long crc9() {
            return crc9;
        }

        public byte[] userData() {
            return userData;
        }

        public byte[] messageCrc32() {
            return messageCrc32;
        }

        public DmrData _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    /**
     * 9.2.7 Rate ½ coded packet Data (R_1_2_DATA) PDU, Table 9.15A: R_1_2_DATA PDU content for confirmed data
     */
    public static class Rate12Confirmed extends KaitaiStruct {
        private long dataBlockSerialNumber;
        private long crc9;
        private byte[] userData;
        private DmrData _root;
        private KaitaiStruct _parent;

        public Rate12Confirmed(KaitaiStream _io) {
            this(_io, null, null);
        }
        public Rate12Confirmed(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }
        public Rate12Confirmed(KaitaiStream _io, KaitaiStruct _parent, DmrData _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static Rate12Confirmed fromFile(String fileName) throws IOException {
            return new Rate12Confirmed(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.dataBlockSerialNumber = this._io.readBitsIntBe(7);
            this.crc9 = this._io.readBitsIntBe(9);
            this._io.alignToByte();
            this.userData = this._io.readBytes(10);
        }

        public long dataBlockSerialNumber() {
            return dataBlockSerialNumber;
        }

        public long crc9() {
            return crc9;
        }

        public byte[] userData() {
            return userData;
        }

        public DmrData _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    /**
     * 9.2.3 Rate ¾ coded Last Data block (R_3_4_LDATA) PDU, Table 9.12A: R_3_4_LDATA PDU content for unconfirmed data
     */
    public static class Rate34LastBlockUnconfirmed extends KaitaiStruct {
        private byte[] userData;
        private byte[] messageCrc32;
        private DmrData _root;
        private KaitaiStruct _parent;

        public Rate34LastBlockUnconfirmed(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Rate34LastBlockUnconfirmed(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }
        public Rate34LastBlockUnconfirmed(KaitaiStream _io, KaitaiStruct _parent, DmrData _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static Rate34LastBlockUnconfirmed fromFile(String fileName) throws IOException {
            return new Rate34LastBlockUnconfirmed(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.userData = this._io.readBytes(14);
            this.messageCrc32 = this._io.readBytes(4);
        }

        public byte[] userData() {
            return userData;
        }

        public byte[] messageCrc32() {
            return messageCrc32;
        }

        public DmrData _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    /**
     * 9.2.16 Rate 1 coded Last Data block (R_1_LDATA) PDU, Table 9.18B: R_1_LDATA PDU content for confirmed data
     */
    public static class Rate1LastBlockConfirmed extends KaitaiStruct {
        private long dataBlockSerialNumber;
        private long crc9;
        private byte[] userData;
        private byte[] messageCrc32;
        private DmrData _root;
        private KaitaiStruct _parent;
        public Rate1LastBlockConfirmed(KaitaiStream _io) {
            this(_io, null, null);
        }
        public Rate1LastBlockConfirmed(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }
        public Rate1LastBlockConfirmed(KaitaiStream _io, KaitaiStruct _parent, DmrData _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static Rate1LastBlockConfirmed fromFile(String fileName) throws IOException {
            return new Rate1LastBlockConfirmed(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.dataBlockSerialNumber = this._io.readBitsIntBe(7);
            this.crc9 = this._io.readBitsIntBe(9);
            this._io.alignToByte();
            this.userData = this._io.readBytes(18);
            this.messageCrc32 = this._io.readBytes(4);
        }

        public long dataBlockSerialNumber() {
            return dataBlockSerialNumber;
        }

        public long crc9() {
            return crc9;
        }

        public byte[] userData() {
            return userData;
        }

        public byte[] messageCrc32() {
            return messageCrc32;
        }

        public DmrData _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    /**
     * 9.2.15 Rate 1 coded packet Data (R_1_DATA) PDU, Table 9.18A: R_1_DATA PDU content for unconfirmed data
     */
    public static class Rate1Unconfirmed extends KaitaiStruct {
        private byte[] userData;
        private DmrData _root;
        private KaitaiStruct _parent;

        public Rate1Unconfirmed(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Rate1Unconfirmed(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Rate1Unconfirmed(KaitaiStream _io, KaitaiStruct _parent, DmrData _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static Rate1Unconfirmed fromFile(String fileName) throws IOException {
            return new Rate1Unconfirmed(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.userData = this._io.readBytes(24);
        }

        public byte[] userData() {
            return userData;
        }

        public DmrData _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    /**
     * 9.2.14 Unified Data Transport Last Data block (UDT_LDATA) PDU, Table 9.17E: UDT_LDATA PDU content
     */
    public static class UdtLastBlock extends KaitaiStruct {
        private byte[] userData;
        private byte[] messageCrc16;
        private DmrData _root;
        private KaitaiStruct _parent;

        public UdtLastBlock(KaitaiStream _io) {
            this(_io, null, null);
        }

        public UdtLastBlock(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }
        public UdtLastBlock(KaitaiStream _io, KaitaiStruct _parent, DmrData _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static UdtLastBlock fromFile(String fileName) throws IOException {
            return new UdtLastBlock(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.userData = this._io.readBytes(10);
            this.messageCrc16 = this._io.readBytes(2);
        }

        public byte[] userData() {
            return userData;
        }

        public byte[] messageCrc16() {
            return messageCrc16;
        }

        public DmrData _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    /**
     * 9.2.2 Rate ¾ coded packet Data (R_3_4_DATA) PDU, Table 9.11: R_3_4_DATA PDU content for confirmed data
     */
    public static class Rate34Confirmed extends KaitaiStruct {
        private long dataBlockSerialNumber;
        private long crc9;
        private byte[] userData;
        private DmrData _root;
        private KaitaiStruct _parent;

        public Rate34Confirmed(KaitaiStream _io) {
            this(_io, null, null);
        }
        public Rate34Confirmed(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }
        public Rate34Confirmed(KaitaiStream _io, KaitaiStruct _parent, DmrData _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static Rate34Confirmed fromFile(String fileName) throws IOException {
            return new Rate34Confirmed(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.dataBlockSerialNumber = this._io.readBitsIntBe(7);
            this.crc9 = this._io.readBitsIntBe(9);
            this._io.alignToByte();
            this.userData = this._io.readBytes(16);
        }

        public long dataBlockSerialNumber() {
            return dataBlockSerialNumber;
        }

        public long crc9() {
            return crc9;
        }

        public byte[] userData() {
            return userData;
        }

        public DmrData _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    /**
     * 9.2.3 Rate ¾ coded Last Data block (R_3_4_LDATA) PDU, Table 9.12: R_3_4_LDATA PDU content for confirmed data
     */
    public static class Rate34LastBlockConfirmed extends KaitaiStruct {
        private long dataBlockSerialNumber;
        private long crc9;
        private byte[] userData;
        private byte[] messageCrc32;
        private DmrData _root;
        private KaitaiStruct _parent;
        public Rate34LastBlockConfirmed(KaitaiStream _io) {
            this(_io, null, null);
        }
        public Rate34LastBlockConfirmed(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }
        public Rate34LastBlockConfirmed(KaitaiStream _io, KaitaiStruct _parent, DmrData _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static Rate34LastBlockConfirmed fromFile(String fileName) throws IOException {
            return new Rate34LastBlockConfirmed(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.dataBlockSerialNumber = this._io.readBitsIntBe(7);
            this.crc9 = this._io.readBitsIntBe(9);
            this._io.alignToByte();
            this.userData = this._io.readBytes(12);
            this.messageCrc32 = this._io.readBytes(4);
        }

        public long dataBlockSerialNumber() {
            return dataBlockSerialNumber;
        }

        public long crc9() {
            return crc9;
        }

        public byte[] userData() {
            return userData;
        }

        public byte[] messageCrc32() {
            return messageCrc32;
        }

        public DmrData _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    /**
     * 9.2.2 Rate ¾ coded packet Data (R_3_4_DATA) PDU, Table 9.11A: R_3_4_DATA PDU content for unconfirmed data
     */
    public static class Rate34Unconfirmed extends KaitaiStruct {
        private byte[] userData;
        private DmrData _root;
        private KaitaiStruct _parent;

        public Rate34Unconfirmed(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Rate34Unconfirmed(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Rate34Unconfirmed(KaitaiStream _io, KaitaiStruct _parent, DmrData _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static Rate34Unconfirmed fromFile(String fileName) throws IOException {
            return new Rate34Unconfirmed(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.userData = this._io.readBytes(18);
        }

        public byte[] userData() {
            return userData;
        }

        public DmrData _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    /**
     * 9.2.8 Rate ½ coded Last Data block (R_1_2_LDATA) PDU, Table 9.15B: R_1_2_LDATA PDU content for confirmed data
     */
    public static class Rate12LastBlockUnconfirmed extends KaitaiStruct {
        private byte[] userData;
        private byte[] messageCrc32;
        private DmrData _root;
        private KaitaiStruct _parent;

        public Rate12LastBlockUnconfirmed(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Rate12LastBlockUnconfirmed(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }
        public Rate12LastBlockUnconfirmed(KaitaiStream _io, KaitaiStruct _parent, DmrData _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static Rate12LastBlockUnconfirmed fromFile(String fileName) throws IOException {
            return new Rate12LastBlockUnconfirmed(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.userData = this._io.readBytes(8);
            this.messageCrc32 = this._io.readBytes(4);
        }

        public byte[] userData() {
            return userData;
        }

        public byte[] messageCrc32() {
            return messageCrc32;
        }

        public DmrData _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    /**
     * 9.2.15 Rate 1 coded packet Data (R_1_DATA) PDU, Table 9.18: R_1_DATA PDU content for confirmed data
     */
    public static class Rate1Confirmed extends KaitaiStruct {
        private long dataBlockSerialNumber;
        private long crc9;
        private byte[] userData;
        private DmrData _root;
        private KaitaiStruct _parent;

        public Rate1Confirmed(KaitaiStream _io) {
            this(_io, null, null);
        }
        public Rate1Confirmed(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }
        public Rate1Confirmed(KaitaiStream _io, KaitaiStruct _parent, DmrData _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static Rate1Confirmed fromFile(String fileName) throws IOException {
            return new Rate1Confirmed(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.dataBlockSerialNumber = this._io.readBitsIntBe(7);
            this.crc9 = this._io.readBitsIntBe(9);
            this._io.alignToByte();
            this.userData = this._io.readBytes(22);
        }

        public long dataBlockSerialNumber() {
            return dataBlockSerialNumber;
        }

        public long crc9() {
            return crc9;
        }

        public byte[] userData() {
            return userData;
        }

        public DmrData _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    /**
     * 9.2.7 Rate ½ coded packet Data (R_1_2_DATA) PDU, Table 9.15AA: R_1_2_DATA PDU content for unconfirmed data
     */
    public static class Rate12Unconfirmed extends KaitaiStruct {
        private byte[] userData;
        private DmrData _root;
        private KaitaiStruct _parent;

        public Rate12Unconfirmed(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Rate12Unconfirmed(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Rate12Unconfirmed(KaitaiStream _io, KaitaiStruct _parent, DmrData _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static Rate12Unconfirmed fromFile(String fileName) throws IOException {
            return new Rate12Unconfirmed(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.userData = this._io.readBytes(12);
        }

        public byte[] userData() {
            return userData;
        }

        public DmrData _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }
}
