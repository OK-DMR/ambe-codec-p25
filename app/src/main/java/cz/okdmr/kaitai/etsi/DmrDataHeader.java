// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.etsi;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import io.kaitai.struct.KaitaiStruct;


/**
 * TS 102 361-1 V2.5.1 Data Header
 */
public class DmrDataHeader extends KaitaiStruct {
    private KaitaiStruct data;
    private long skip4;
    private DataPacketFormats dataPacketFormat;
    private DmrDataHeader _root;
    private KaitaiStruct _parent;
    private byte[] _raw_data;

    public DmrDataHeader(KaitaiStream _io) {
        this(_io, null, null);
    }

    public DmrDataHeader(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public DmrDataHeader(KaitaiStream _io, KaitaiStruct _parent, DmrDataHeader _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }

    public static DmrDataHeader fromFile(String fileName) throws IOException {
        return new DmrDataHeader(new ByteBufferKaitaiStream(fileName));
    }

    private void _read() {
        this.skip4 = this._io.readBitsIntBe(4);
        this.dataPacketFormat = DataPacketFormats.byId(this._io.readBitsIntBe(4));
    }

    public KaitaiStruct data() {
        if (this.data != null)
            return this.data;
        KaitaiStream io = _root._io();
        long _pos = io.pos();
        io.seek(0);
        {
            DataPacketFormats on = dataPacketFormat();
            if (on != null) {
                switch (dataPacketFormat()) {
                    case PROPRIETARY: {
                        this._raw_data = io.readBytes(12);
                        KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                        this.data = new DataHeaderProprietary(_io__raw_data, this, _root);
                        break;
                    }
                    case SHORT_DATA_DEFINED: {
                        this._raw_data = io.readBytes(12);
                        KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                        this.data = new DataHeaderShortDefined(_io__raw_data, this, _root);
                        break;
                    }
                    case DATA_PACKET_UNCONFIRMED: {
                        this._raw_data = io.readBytes(12);
                        KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                        this.data = new DataHeaderUnconfirmed(_io__raw_data, this, _root);
                        break;
                    }
                    case DATA_PACKET_CONFIRMED: {
                        this._raw_data = io.readBytes(12);
                        KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                        this.data = new DataHeaderConfirmed(_io__raw_data, this, _root);
                        break;
                    }
                    case UNIFIED_DATA_TRANSPORT: {
                        this._raw_data = io.readBytes(12);
                        KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                        this.data = new DataHeaderUdt(_io__raw_data, this, _root);
                        break;
                    }
                    case SHORT_DATA_RAW_OR_STATUS_OR_PRECODED: {
                        this._raw_data = io.readBytes(12);
                        KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                        this.data = new DataHeaderShortStatusPrecoded(_io__raw_data, this, _root);
                        break;
                    }
                    case RESPONSE_PACKET: {
                        this._raw_data = io.readBytes(12);
                        KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                        this.data = new DataHeaderResponse(_io__raw_data, this, _root);
                        break;
                    }
                    default: {
                        this._raw_data = io.readBytes(12);
                        KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                        this.data = new DataHeaderUndefined(_io__raw_data, this, _root);
                        break;
                    }
                }
            } else {
                this._raw_data = io.readBytes(12);
                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                this.data = new DataHeaderUndefined(_io__raw_data, this, _root);
            }
        }
        io.seek(_pos);
        return this.data;
    }

    public long skip4() {
        return skip4;
    }

    /**
     * Data packet format / identification, section 9.3.17
     */
    public DataPacketFormats dataPacketFormat() {
        return dataPacketFormat;
    }

    public DmrDataHeader _root() {
        return _root;
    }

    public KaitaiStruct _parent() {
        return _parent;
    }

    public byte[] _raw_data() {
        return _raw_data;
    }

    public enum UdtFormats {
        BINARY(0),
        MS_OR_TG_ADDRESS(1),
        BCD_4BIT(2),
        ISO_7BIT_CODED_CHARACTERS(3),
        ISO_8BIT_CODED_CHARACTERS(4),
        NMEA_LOCATION_CODED(5),
        IP_ADDRESS(6),
        UNICODE_16BIT_CHARACTERS(7),
        MANUFACTURER_SPECIFIC(8),
        MANUFACTURER_SPECIFIC_2(9),
        MIXED_ADDRESS_AND_16BIT_UTF16BE_CHARACTERS(10);

        private static final Map<Long, UdtFormats> byId = new HashMap<Long, UdtFormats>(11);

        static {
            for (UdtFormats e : UdtFormats.values())
                byId.put(e.id(), e);
        }

        private final long id;

        UdtFormats(long id) {
            this.id = id;
        }

        public static UdtFormats byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    public enum CsbkMbcUdtOpcodes {
        C_ALOHA(25),
        C_UDTHD(26),
        C_UDTHU(27),
        C_OR_P_AHOY(28),
        C_ACKVIT(30),
        C_RAND(31),
        C_ACKD(32),
        C_ACKU(33),
        P_ACKD(34),
        P_ACKU(35),
        C_DGNAHD(36),
        C_DGNAHU(37),
        C_BCAST(40),
        P_MAINT(42),
        P_CLEAR(46),
        P_PROTECT(47),
        PV_GRANT(48),
        TV_GRANT(49),
        BTV_GRANT(50),
        PD_GRANT(51),
        TD_GRANT(52),
        PV_GRANT_DX(53),
        PD_GRANT_DX(54),
        PD_GRANT_MI(55),
        TD_GRANT_MI(56),
        C_MOVE(57);

        private static final Map<Long, CsbkMbcUdtOpcodes> byId = new HashMap<Long, CsbkMbcUdtOpcodes>(26);

        static {
            for (CsbkMbcUdtOpcodes e : CsbkMbcUdtOpcodes.values())
                byId.put(e.id(), e);
        }

        private final long id;

        CsbkMbcUdtOpcodes(long id) {
            this.id = id;
        }

        public static CsbkMbcUdtOpcodes byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    public enum DataPacketFormats {
        UNIFIED_DATA_TRANSPORT(0),
        RESPONSE_PACKET(1),
        DATA_PACKET_UNCONFIRMED(2),
        DATA_PACKET_CONFIRMED(3),
        SHORT_DATA_DEFINED(13),
        SHORT_DATA_RAW_OR_STATUS_OR_PRECODED(14),
        PROPRIETARY(15);

        private static final Map<Long, DataPacketFormats> byId = new HashMap<Long, DataPacketFormats>(7);

        static {
            for (DataPacketFormats e : DataPacketFormats.values())
                byId.put(e.id(), e);
        }

        private final long id;

        DataPacketFormats(long id) {
            this.id = id;
        }

        public static DataPacketFormats byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    public enum SapIdentifiers {
        UNIFIED_DATA_TRANSPORT(0),
        TCP_IP_HEADER_COMPRESSION(2),
        UDP_IP_HEADER_COMPRESSION(3),
        IP_BASED_PACKET_DATA(4),
        ARP_ADDRESS_RESOLUTION_PROTOCOL(5),
        PROPRIETARY_PACKET_DATA(9),
        SHORT_DATA(10);

        private static final Map<Long, SapIdentifiers> byId = new HashMap<Long, SapIdentifiers>(7);

        static {
            for (SapIdentifiers e : SapIdentifiers.values())
                byId.put(e.id(), e);
        }

        private final long id;

        SapIdentifiers(long id) {
            this.id = id;
        }

        public static SapIdentifiers byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    public enum DefinedDataFormats {
        BINARY(0),
        BCD(1),
        CODING_7BIT(2),
        CODING_8BIT_8859_1(3),
        CODING_8BIT_8859_2(4),
        CODING_8BIT_8859_3(5),
        CODING_8BIT_8859_4(6),
        CODING_8BIT_8859_5(7),
        CODING_8BIT_8859_6(8),
        CODING_8BIT_8859_7(9),
        CODING_8BIT_8859_8(10),
        CODING_8BIT_8859_9(11),
        CODING_8BIT_8859_10(12),
        CODING_8BIT_8859_11(13),
        CODING_8BIT_8859_13(14),
        CODING_8BIT_8859_14(15),
        CODING_8BIT_8859_15(16),
        CODING_8BIT_8859_16(17),
        UNICODE_UTF8(18),
        UNICODE_UTF16(19),
        UNICODE_UTF16BE(20),
        UNICODE_UTF16LE(21),
        UNICODE_UTF32(22),
        UNICODE_UTF32BE(23),
        UNICODE_UTF32LE(24);

        private static final Map<Long, DefinedDataFormats> byId = new HashMap<Long, DefinedDataFormats>(25);

        static {
            for (DefinedDataFormats e : DefinedDataFormats.values())
                byId.put(e.id(), e);
        }

        private final long id;

        DefinedDataFormats(long id) {
            this.id = id;
        }

        public static DefinedDataFormats byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    public enum ResponsePacketClasses {
        ACK(0),
        NACK(1),
        SACK(2);

        private static final Map<Long, ResponsePacketClasses> byId = new HashMap<Long, ResponsePacketClasses>(3);

        static {
            for (ResponsePacketClasses e : ResponsePacketClasses.values())
                byId.put(e.id(), e);
        }

        private final long id;

        ResponsePacketClasses(long id) {
            this.id = id;
        }

        public static ResponsePacketClasses byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    /**
     * 9.2.11 Raw short data packet Header (R_HEAD)
     */
    public static class DataHeaderShortRaw extends KaitaiStruct {
        private Integer appendedBlocks;
        private boolean llidDestinationIsGroup;
        private boolean responseRequested;
        private long appendedBlocksMsb;
        private DataPacketFormats format;
        private SapIdentifiers sapIdentifier;
        private long appendedBlocksLsb;
        private long llidDestination;
        private long llidSource;
        private long sourcePort;
        private long destinationPort;
        private boolean selectiveAutomaticRepeatRequest;
        private boolean fullMessageFlag;
        private long bitPadding;
        private byte[] crc;
        private DmrDataHeader _root;
        private KaitaiStruct _parent;
        public DataHeaderShortRaw(KaitaiStream _io) {
            this(_io, null, null);
        }
        public DataHeaderShortRaw(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }
        public DataHeaderShortRaw(KaitaiStream _io, KaitaiStruct _parent, DmrDataHeader _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static DataHeaderShortRaw fromFile(String fileName) throws IOException {
            return new DataHeaderShortRaw(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.llidDestinationIsGroup = this._io.readBitsIntBe(1) != 0;
            this.responseRequested = this._io.readBitsIntBe(1) != 0;
            this.appendedBlocksMsb = this._io.readBitsIntBe(2);
            this.format = DmrDataHeader.DataPacketFormats.byId(this._io.readBitsIntBe(4));
            this.sapIdentifier = DmrDataHeader.SapIdentifiers.byId(this._io.readBitsIntBe(4));
            this.appendedBlocksLsb = this._io.readBitsIntBe(4);
            this.llidDestination = this._io.readBitsIntBe(24);
            this.llidSource = this._io.readBitsIntBe(24);
            this.sourcePort = this._io.readBitsIntBe(3);
            this.destinationPort = this._io.readBitsIntBe(3);
            this.selectiveAutomaticRepeatRequest = this._io.readBitsIntBe(1) != 0;
            this.fullMessageFlag = this._io.readBitsIntBe(1) != 0;
            this.bitPadding = this._io.readBitsIntBe(8);
            this._io.alignToByte();
            this.crc = this._io.readBytes(2);
        }

        public Integer appendedBlocks() {
            if (this.appendedBlocks != null)
                return this.appendedBlocks;
            int _tmp = (int) (((appendedBlocksMsb() << 4) + appendedBlocksLsb()));
            this.appendedBlocks = _tmp;
            return this.appendedBlocks;
        }

        public boolean llidDestinationIsGroup() {
            return llidDestinationIsGroup;
        }

        /**
         * response demanded if destination is individual MS
         */
        public boolean responseRequested() {
            return responseRequested;
        }

        /**
         * 0b00 expected
         */
        public long appendedBlocksMsb() {
            return appendedBlocksMsb;
        }

        public DataPacketFormats format() {
            return format;
        }

        public SapIdentifiers sapIdentifier() {
            return sapIdentifier;
        }

        /**
         * 0b0000 expected
         */
        public long appendedBlocksLsb() {
            return appendedBlocksLsb;
        }

        public long llidDestination() {
            return llidDestination;
        }

        public long llidSource() {
            return llidSource;
        }

        public long sourcePort() {
            return sourcePort;
        }

        public long destinationPort() {
            return destinationPort;
        }

        /**
         * flag whether source requires SARQ
         */
        public boolean selectiveAutomaticRepeatRequest() {
            return selectiveAutomaticRepeatRequest;
        }

        public boolean fullMessageFlag() {
            return fullMessageFlag;
        }

        /**
         * 0b00000000 expected
         */
        public long bitPadding() {
            return bitPadding;
        }

        public byte[] crc() {
            return crc;
        }

        public DmrDataHeader _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    /**
     * 9.2.9 Proprietary Header (P_HEAD) PDU
     */
    public static class DataHeaderProprietary extends KaitaiStruct {
        private SapIdentifiers sapIdentifier;
        private DataPacketFormats format;
        private long mfid;
        private byte[] proprietaryData;
        private byte[] crc;
        private DmrDataHeader _root;
        private DmrDataHeader _parent;
        public DataHeaderProprietary(KaitaiStream _io) {
            this(_io, null, null);
        }
        public DataHeaderProprietary(KaitaiStream _io, DmrDataHeader _parent) {
            this(_io, _parent, null);
        }
        public DataHeaderProprietary(KaitaiStream _io, DmrDataHeader _parent, DmrDataHeader _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static DataHeaderProprietary fromFile(String fileName) throws IOException {
            return new DataHeaderProprietary(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.sapIdentifier = DmrDataHeader.SapIdentifiers.byId(this._io.readBitsIntBe(4));
            this.format = DmrDataHeader.DataPacketFormats.byId(this._io.readBitsIntBe(4));
            this.mfid = this._io.readBitsIntBe(8);
            this._io.alignToByte();
            this.proprietaryData = this._io.readBytes(8);
            this.crc = this._io.readBytes(2);
        }

        public SapIdentifiers sapIdentifier() {
            return sapIdentifier;
        }

        public DataPacketFormats format() {
            return format;
        }

        /**
         * manufacturer's id
         */
        public long mfid() {
            return mfid;
        }

        /**
         * 64bits / 8bytes of proprietary data
         */
        public byte[] proprietaryData() {
            return proprietaryData;
        }

        public byte[] crc() {
            return crc;
        }

        public DmrDataHeader _root() {
            return _root;
        }

        public DmrDataHeader _parent() {
            return _parent;
        }
    }

    public static class DataHeaderUndefined extends KaitaiStruct {
        private byte[] bytedata;
        private DmrDataHeader _root;
        private DmrDataHeader _parent;

        public DataHeaderUndefined(KaitaiStream _io) {
            this(_io, null, null);
        }

        public DataHeaderUndefined(KaitaiStream _io, DmrDataHeader _parent) {
            this(_io, _parent, null);
        }

        public DataHeaderUndefined(KaitaiStream _io, DmrDataHeader _parent, DmrDataHeader _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static DataHeaderUndefined fromFile(String fileName) throws IOException {
            return new DataHeaderUndefined(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.bytedata = this._io.readBytesFull();
        }

        public byte[] bytedata() {
            return bytedata;
        }

        public DmrDataHeader _root() {
            return _root;
        }

        public DmrDataHeader _parent() {
            return _parent;
        }
    }

    /**
     * 9.2.10 Status/Precoded short data packet Header (SP_HEAD) PDU
     */
    public static class DataHeaderShortStatusPrecoded extends KaitaiStruct {
        private Integer appendedBlocks;
        private boolean llidDestinationIsGroup;
        private boolean responseRequested;
        private long appendedBlocksMsb;
        private DataPacketFormats format;
        private SapIdentifiers sapIdentifier;
        private long appendedBlocksLsb;
        private long llidDestination;
        private long llidSource;
        private long sourcePort;
        private long destinationPort;
        private long statusPrecoded;
        private byte[] crc;
        private DmrDataHeader _root;
        private DmrDataHeader _parent;
        public DataHeaderShortStatusPrecoded(KaitaiStream _io) {
            this(_io, null, null);
        }
        public DataHeaderShortStatusPrecoded(KaitaiStream _io, DmrDataHeader _parent) {
            this(_io, _parent, null);
        }
        public DataHeaderShortStatusPrecoded(KaitaiStream _io, DmrDataHeader _parent, DmrDataHeader _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static DataHeaderShortStatusPrecoded fromFile(String fileName) throws IOException {
            return new DataHeaderShortStatusPrecoded(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.llidDestinationIsGroup = this._io.readBitsIntBe(1) != 0;
            this.responseRequested = this._io.readBitsIntBe(1) != 0;
            this.appendedBlocksMsb = this._io.readBitsIntBe(2);
            this.format = DmrDataHeader.DataPacketFormats.byId(this._io.readBitsIntBe(4));
            this.sapIdentifier = DmrDataHeader.SapIdentifiers.byId(this._io.readBitsIntBe(4));
            this.appendedBlocksLsb = this._io.readBitsIntBe(4);
            this.llidDestination = this._io.readBitsIntBe(24);
            this.llidSource = this._io.readBitsIntBe(24);
            this.sourcePort = this._io.readBitsIntBe(3);
            this.destinationPort = this._io.readBitsIntBe(3);
            this.statusPrecoded = this._io.readBitsIntBe(10);
            this._io.alignToByte();
            this.crc = this._io.readBytes(2);
        }

        public Integer appendedBlocks() {
            if (this.appendedBlocks != null)
                return this.appendedBlocks;
            int _tmp = (int) (((appendedBlocksMsb() << 4) + appendedBlocksLsb()));
            this.appendedBlocks = _tmp;
            return this.appendedBlocks;
        }

        public boolean llidDestinationIsGroup() {
            return llidDestinationIsGroup;
        }

        /**
         * response demanded if destination is individual MS
         */
        public boolean responseRequested() {
            return responseRequested;
        }

        /**
         * 0b00 expected
         */
        public long appendedBlocksMsb() {
            return appendedBlocksMsb;
        }

        public DataPacketFormats format() {
            return format;
        }

        public SapIdentifiers sapIdentifier() {
            return sapIdentifier;
        }

        /**
         * 0b0000 expected
         */
        public long appendedBlocksLsb() {
            return appendedBlocksLsb;
        }

        public long llidDestination() {
            return llidDestination;
        }

        public long llidSource() {
            return llidSource;
        }

        public long sourcePort() {
            return sourcePort;
        }

        public long destinationPort() {
            return destinationPort;
        }

        public long statusPrecoded() {
            return statusPrecoded;
        }

        public byte[] crc() {
            return crc;
        }

        public DmrDataHeader _root() {
            return _root;
        }

        public DmrDataHeader _parent() {
            return _parent;
        }
    }

    /**
     * 9.2.4 Confirmed Response packet Header (C_RHEAD) PDU
     */
    public static class DataHeaderResponse extends KaitaiStruct {
        private boolean reserved1;
        private boolean responseRequested;
        private long reserved2;
        private DataPacketFormats format;
        private SapIdentifiers sapIdentifier;
        private long reserved3;
        private long llidDestination;
        private long llidSource;
        private boolean fullMessageFlag;
        private long blocksToFollow;
        private ResponsePacketClasses responseClass;
        private long responseType;
        private long responseStatus;
        private byte[] crc;
        private DmrDataHeader _root;
        private DmrDataHeader _parent;
        public DataHeaderResponse(KaitaiStream _io) {
            this(_io, null, null);
        }
        public DataHeaderResponse(KaitaiStream _io, DmrDataHeader _parent) {
            this(_io, _parent, null);
        }
        public DataHeaderResponse(KaitaiStream _io, DmrDataHeader _parent, DmrDataHeader _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static DataHeaderResponse fromFile(String fileName) throws IOException {
            return new DataHeaderResponse(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.reserved1 = this._io.readBitsIntBe(1) != 0;
            this.responseRequested = this._io.readBitsIntBe(1) != 0;
            this.reserved2 = this._io.readBitsIntBe(2);
            this.format = DmrDataHeader.DataPacketFormats.byId(this._io.readBitsIntBe(4));
            this.sapIdentifier = DmrDataHeader.SapIdentifiers.byId(this._io.readBitsIntBe(4));
            this.reserved3 = this._io.readBitsIntBe(4);
            this.llidDestination = this._io.readBitsIntBe(24);
            this.llidSource = this._io.readBitsIntBe(24);
            this.fullMessageFlag = this._io.readBitsIntBe(1) != 0;
            this.blocksToFollow = this._io.readBitsIntBe(7);
            this.responseClass = DmrDataHeader.ResponsePacketClasses.byId(this._io.readBitsIntBe(2));
            this.responseType = this._io.readBitsIntBe(3);
            this.responseStatus = this._io.readBitsIntBe(3);
            this._io.alignToByte();
            this.crc = this._io.readBytes(2);
        }

        /**
         * 0b0 expected
         */
        public boolean reserved1() {
            return reserved1;
        }

        /**
         * 0b0 expected
         */
        public boolean responseRequested() {
            return responseRequested;
        }

        /**
         * 0b00 expected
         */
        public long reserved2() {
            return reserved2;
        }

        public DataPacketFormats format() {
            return format;
        }

        public SapIdentifiers sapIdentifier() {
            return sapIdentifier;
        }

        /**
         * 0b0000 expected
         */
        public long reserved3() {
            return reserved3;
        }

        public long llidDestination() {
            return llidDestination;
        }

        public long llidSource() {
            return llidSource;
        }

        /**
         * 0b0 expected
         */
        public boolean fullMessageFlag() {
            return fullMessageFlag;
        }

        public long blocksToFollow() {
            return blocksToFollow;
        }

        public ResponsePacketClasses responseClass() {
            return responseClass;
        }

        public long responseType() {
            return responseType;
        }

        /**
         * NI/VI/FSN per ETSI TS 102 361-1 V2.5.1, Table 8.3 (page 87), Response Packet Class, Type, and Status definitions
         */
        public long responseStatus() {
            return responseStatus;
        }

        public byte[] crc() {
            return crc;
        }

        public DmrDataHeader _root() {
            return _root;
        }

        public DmrDataHeader _parent() {
            return _parent;
        }
    }

    /**
     * 9.2.1 Confirmed packet Header (C_HEAD) PDU
     */
    public static class DataHeaderConfirmed extends KaitaiStruct {
        private boolean llidDestinationIsGroup;
        private boolean responseRequested;
        private boolean reserved1;
        private boolean padOctetCountMsb;
        private DataPacketFormats format;
        private SapIdentifiers sapIdentifier;
        private long padOctetCount;
        private long llidDestination;
        private long llidSource;
        private boolean fullMessageFlag;
        private long blocksToFollow;
        private boolean resynchronizeFlag;
        private long sendSequenceNumber;
        private long fragmentSequenceNumber;
        private byte[] crc;
        private DmrDataHeader _root;
        private DmrDataHeader _parent;
        public DataHeaderConfirmed(KaitaiStream _io) {
            this(_io, null, null);
        }
        public DataHeaderConfirmed(KaitaiStream _io, DmrDataHeader _parent) {
            this(_io, _parent, null);
        }
        public DataHeaderConfirmed(KaitaiStream _io, DmrDataHeader _parent, DmrDataHeader _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static DataHeaderConfirmed fromFile(String fileName) throws IOException {
            return new DataHeaderConfirmed(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.llidDestinationIsGroup = this._io.readBitsIntBe(1) != 0;
            this.responseRequested = this._io.readBitsIntBe(1) != 0;
            this.reserved1 = this._io.readBitsIntBe(1) != 0;
            this.padOctetCountMsb = this._io.readBitsIntBe(1) != 0;
            this.format = DmrDataHeader.DataPacketFormats.byId(this._io.readBitsIntBe(4));
            this.sapIdentifier = DmrDataHeader.SapIdentifiers.byId(this._io.readBitsIntBe(4));
            this.padOctetCount = this._io.readBitsIntBe(4);
            this.llidDestination = this._io.readBitsIntBe(24);
            this.llidSource = this._io.readBitsIntBe(24);
            this.fullMessageFlag = this._io.readBitsIntBe(1) != 0;
            this.blocksToFollow = this._io.readBitsIntBe(7);
            this.resynchronizeFlag = this._io.readBitsIntBe(1) != 0;
            this.sendSequenceNumber = this._io.readBitsIntBe(3);
            this.fragmentSequenceNumber = this._io.readBitsIntBe(4);
            this._io.alignToByte();
            this.crc = this._io.readBytes(2);
        }

        public boolean llidDestinationIsGroup() {
            return llidDestinationIsGroup;
        }

        /**
         * response demanded if destination is individual MS
         */
        public boolean responseRequested() {
            return responseRequested;
        }

        /**
         * 0b0 expected
         */
        public boolean reserved1() {
            return reserved1;
        }

        public boolean padOctetCountMsb() {
            return padOctetCountMsb;
        }

        public DataPacketFormats format() {
            return format;
        }

        public SapIdentifiers sapIdentifier() {
            return sapIdentifier;
        }

        public long padOctetCount() {
            return padOctetCount;
        }

        public long llidDestination() {
            return llidDestination;
        }

        public long llidSource() {
            return llidSource;
        }

        public boolean fullMessageFlag() {
            return fullMessageFlag;
        }

        public long blocksToFollow() {
            return blocksToFollow;
        }

        public boolean resynchronizeFlag() {
            return resynchronizeFlag;
        }

        public long sendSequenceNumber() {
            return sendSequenceNumber;
        }

        public long fragmentSequenceNumber() {
            return fragmentSequenceNumber;
        }

        public byte[] crc() {
            return crc;
        }

        public DmrDataHeader _root() {
            return _root;
        }

        public DmrDataHeader _parent() {
            return _parent;
        }
    }

    /**
     * 9.2.6 Unconfirmed data packet Header (U_HEAD) PDU
     */
    public static class DataHeaderUnconfirmed extends KaitaiStruct {
        private boolean llidDestinationIsGroup;
        private boolean responseRequested;
        private boolean reserved1;
        private boolean padOctetCountMsb;
        private DataPacketFormats format;
        private SapIdentifiers sapIdentifier;
        private long padOctetCount;
        private long llidDestination;
        private long llidSource;
        private boolean fullMessageFlag;
        private long blocksToFollow;
        private long reserved2;
        private long fragmentSequenceNumber;
        private byte[] crc;
        private DmrDataHeader _root;
        private DmrDataHeader _parent;
        public DataHeaderUnconfirmed(KaitaiStream _io) {
            this(_io, null, null);
        }
        public DataHeaderUnconfirmed(KaitaiStream _io, DmrDataHeader _parent) {
            this(_io, _parent, null);
        }
        public DataHeaderUnconfirmed(KaitaiStream _io, DmrDataHeader _parent, DmrDataHeader _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static DataHeaderUnconfirmed fromFile(String fileName) throws IOException {
            return new DataHeaderUnconfirmed(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.llidDestinationIsGroup = this._io.readBitsIntBe(1) != 0;
            this.responseRequested = this._io.readBitsIntBe(1) != 0;
            this.reserved1 = this._io.readBitsIntBe(1) != 0;
            this.padOctetCountMsb = this._io.readBitsIntBe(1) != 0;
            this.format = DmrDataHeader.DataPacketFormats.byId(this._io.readBitsIntBe(4));
            this.sapIdentifier = DmrDataHeader.SapIdentifiers.byId(this._io.readBitsIntBe(4));
            this.padOctetCount = this._io.readBitsIntBe(4);
            this.llidDestination = this._io.readBitsIntBe(24);
            this.llidSource = this._io.readBitsIntBe(24);
            this.fullMessageFlag = this._io.readBitsIntBe(1) != 0;
            this.blocksToFollow = this._io.readBitsIntBe(7);
            this.reserved2 = this._io.readBitsIntBe(4);
            this.fragmentSequenceNumber = this._io.readBitsIntBe(4);
            this._io.alignToByte();
            this.crc = this._io.readBytes(2);
        }

        public boolean llidDestinationIsGroup() {
            return llidDestinationIsGroup;
        }

        /**
         * 0b0 expected
         */
        public boolean responseRequested() {
            return responseRequested;
        }

        /**
         * 0b0 expected
         */
        public boolean reserved1() {
            return reserved1;
        }

        public boolean padOctetCountMsb() {
            return padOctetCountMsb;
        }

        public DataPacketFormats format() {
            return format;
        }

        public SapIdentifiers sapIdentifier() {
            return sapIdentifier;
        }

        public long padOctetCount() {
            return padOctetCount;
        }

        public long llidDestination() {
            return llidDestination;
        }

        public long llidSource() {
            return llidSource;
        }

        public boolean fullMessageFlag() {
            return fullMessageFlag;
        }

        public long blocksToFollow() {
            return blocksToFollow;
        }

        /**
         * 0b0000 expected
         */
        public long reserved2() {
            return reserved2;
        }

        public long fragmentSequenceNumber() {
            return fragmentSequenceNumber;
        }

        public byte[] crc() {
            return crc;
        }

        public DmrDataHeader _root() {
            return _root;
        }

        public DmrDataHeader _parent() {
            return _parent;
        }
    }

    /**
     * 9.2.12 Defined Data short data packet Header (DD_HEAD) PDU
     */
    public static class DataHeaderShortDefined extends KaitaiStruct {
        private Integer appendedBlocks;
        private boolean llidDestinationIsGroup;
        private boolean responseRequested;
        private long appendedBlocksMsb;
        private DataPacketFormats format;
        private SapIdentifiers sapIdentifier;
        private long appendedBlocksLsb;
        private long llidDestination;
        private long llidSource;
        private DefinedDataFormats definedData;
        private boolean selectiveAutomaticRepeatRequest;
        private boolean fullMessageFlag;
        private long bitPadding;
        private byte[] crc;
        private DmrDataHeader _root;
        private DmrDataHeader _parent;
        public DataHeaderShortDefined(KaitaiStream _io) {
            this(_io, null, null);
        }
        public DataHeaderShortDefined(KaitaiStream _io, DmrDataHeader _parent) {
            this(_io, _parent, null);
        }
        public DataHeaderShortDefined(KaitaiStream _io, DmrDataHeader _parent, DmrDataHeader _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static DataHeaderShortDefined fromFile(String fileName) throws IOException {
            return new DataHeaderShortDefined(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.llidDestinationIsGroup = this._io.readBitsIntBe(1) != 0;
            this.responseRequested = this._io.readBitsIntBe(1) != 0;
            this.appendedBlocksMsb = this._io.readBitsIntBe(2);
            this.format = DmrDataHeader.DataPacketFormats.byId(this._io.readBitsIntBe(4));
            this.sapIdentifier = DmrDataHeader.SapIdentifiers.byId(this._io.readBitsIntBe(4));
            this.appendedBlocksLsb = this._io.readBitsIntBe(4);
            this.llidDestination = this._io.readBitsIntBe(24);
            this.llidSource = this._io.readBitsIntBe(24);
            this.definedData = DmrDataHeader.DefinedDataFormats.byId(this._io.readBitsIntBe(6));
            this.selectiveAutomaticRepeatRequest = this._io.readBitsIntBe(1) != 0;
            this.fullMessageFlag = this._io.readBitsIntBe(1) != 0;
            this.bitPadding = this._io.readBitsIntBe(8);
            this._io.alignToByte();
            this.crc = this._io.readBytes(2);
        }

        public Integer appendedBlocks() {
            if (this.appendedBlocks != null)
                return this.appendedBlocks;
            int _tmp = (int) (((appendedBlocksMsb() << 4) + appendedBlocksLsb()));
            this.appendedBlocks = _tmp;
            return this.appendedBlocks;
        }

        public boolean llidDestinationIsGroup() {
            return llidDestinationIsGroup;
        }

        /**
         * response demanded if destination is individual MS
         */
        public boolean responseRequested() {
            return responseRequested;
        }

        /**
         * 0b00 expected
         */
        public long appendedBlocksMsb() {
            return appendedBlocksMsb;
        }

        public DataPacketFormats format() {
            return format;
        }

        public SapIdentifiers sapIdentifier() {
            return sapIdentifier;
        }

        /**
         * 0b0000 expected
         */
        public long appendedBlocksLsb() {
            return appendedBlocksLsb;
        }

        public long llidDestination() {
            return llidDestination;
        }

        public long llidSource() {
            return llidSource;
        }

        /**
         * ETSI TS 102 361-1 V2.5.1, Table 9.50, DD information element content
         */
        public DefinedDataFormats definedData() {
            return definedData;
        }

        /**
         * SARQ
         */
        public boolean selectiveAutomaticRepeatRequest() {
            return selectiveAutomaticRepeatRequest;
        }

        public boolean fullMessageFlag() {
            return fullMessageFlag;
        }

        public long bitPadding() {
            return bitPadding;
        }

        public byte[] crc() {
            return crc;
        }

        public DmrDataHeader _root() {
            return _root;
        }

        public DmrDataHeader _parent() {
            return _parent;
        }
    }

    /**
     * 9.2.13 Unified Data Transport Header (UDT_HEAD) PDU
     */
    public static class DataHeaderUdt extends KaitaiStruct {
        private boolean llidDestinationIsGroup;
        private boolean responseRequested;
        private long reserved1;
        private DataPacketFormats format;
        private SapIdentifiers sapIdentifier;
        private UdtFormats udtFormat;
        private long llidDestination;
        private long llidSource;
        private long padNibble;
        private boolean reserved2;
        private long appendedBlocks;
        private boolean supplementaryFlag;
        private boolean protectFlag;
        private CsbkMbcUdtOpcodes udtOpcode;
        private byte[] crc;
        private DmrDataHeader _root;
        private DmrDataHeader _parent;
        public DataHeaderUdt(KaitaiStream _io) {
            this(_io, null, null);
        }
        public DataHeaderUdt(KaitaiStream _io, DmrDataHeader _parent) {
            this(_io, _parent, null);
        }
        public DataHeaderUdt(KaitaiStream _io, DmrDataHeader _parent, DmrDataHeader _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static DataHeaderUdt fromFile(String fileName) throws IOException {
            return new DataHeaderUdt(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.llidDestinationIsGroup = this._io.readBitsIntBe(1) != 0;
            this.responseRequested = this._io.readBitsIntBe(1) != 0;
            this.reserved1 = this._io.readBitsIntBe(2);
            this.format = DmrDataHeader.DataPacketFormats.byId(this._io.readBitsIntBe(4));
            this.sapIdentifier = DmrDataHeader.SapIdentifiers.byId(this._io.readBitsIntBe(4));
            this.udtFormat = DmrDataHeader.UdtFormats.byId(this._io.readBitsIntBe(4));
            this.llidDestination = this._io.readBitsIntBe(24);
            this.llidSource = this._io.readBitsIntBe(24);
            this.padNibble = this._io.readBitsIntBe(5);
            this.reserved2 = this._io.readBitsIntBe(1) != 0;
            this.appendedBlocks = this._io.readBitsIntBe(2);
            this.supplementaryFlag = this._io.readBitsIntBe(1) != 0;
            this.protectFlag = this._io.readBitsIntBe(1) != 0;
            this.udtOpcode = DmrDataHeader.CsbkMbcUdtOpcodes.byId(this._io.readBitsIntBe(6));
            this._io.alignToByte();
            this.crc = this._io.readBytes(2);
        }

        public boolean llidDestinationIsGroup() {
            return llidDestinationIsGroup;
        }

        /**
         * 0b0 expected
         */
        public boolean responseRequested() {
            return responseRequested;
        }

        /**
         * See ETSI TS 102 361-4 [11] clause 7.1.1.1.8 and 7.1.1.2.4 for information elements and values
         */
        public long reserved1() {
            return reserved1;
        }

        public DataPacketFormats format() {
            return format;
        }

        public SapIdentifiers sapIdentifier() {
            return sapIdentifier;
        }

        /**
         * ETSI TS 102 361-4 V1.9.1, 7.2.27 UDT Format
         */
        public UdtFormats udtFormat() {
            return udtFormat;
        }

        public long llidDestination() {
            return llidDestination;
        }

        public long llidSource() {
            return llidSource;
        }

        public long padNibble() {
            return padNibble;
        }

        public boolean reserved2() {
            return reserved2;
        }

        /**
         * Number of Blocks appended to this UDT Header
         */
        public long appendedBlocks() {
            return appendedBlocks;
        }

        /**
         * 0=>short data, 1=>supplementary data, ETSI TS 102 361-1 V2.5.1, 9.3.41 Supplementary Flag (SF)
         */
        public boolean supplementaryFlag() {
            return supplementaryFlag;
        }

        public boolean protectFlag() {
            return protectFlag;
        }

        /**
         * ETSI TS 102 361-4 V1.10.1, Annex B, B.1 CSBK/MBC/UDT Opcode List
         */
        public CsbkMbcUdtOpcodes udtOpcode() {
            return udtOpcode;
        }

        public byte[] crc() {
            return crc;
        }

        public DmrDataHeader _root() {
            return _root;
        }

        public DmrDataHeader _parent() {
            return _parent;
        }
    }
}
