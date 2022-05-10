// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.etsi;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;


/**
 * ETSI TS 102 361-2 V2.4.1 (2017-10), Section 7.1.1
 */
public class FullLinkControl extends KaitaiStruct {
    public static FullLinkControl fromFile(String fileName) throws IOException {
        return new FullLinkControl(new ByteBufferKaitaiStream(fileName));
    }

    public enum Flcos {
        GROUP_VOICE(0),
        UNIT_TO_UNIT_VOICE(3),
        TALKER_ALIAS_HEADER(4),
        TALKER_ALIAS_BLOCK1(5),
        TALKER_ALIAS_BLOCK2(6),
        TALKER_ALIAS_BLOCK3(7),
        GPS_INFO(8);

        private final long id;
        Flcos(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, Flcos> byId = new HashMap<Long, Flcos>(7);
        static {
            for (Flcos e : Flcos.values())
                byId.put(e.id(), e);
        }
        public static Flcos byId(long id) { return byId.get(id); }
    }

    public enum PositionErrors {
        LESS_THAN_2M(0),
        LESS_THAN_20M(1),
        LESS_THAN_200M(2),
        LESS_THAN_2KM(3),
        LESS_THAN_20KM(4),
        LESS_THAN_OR_EQUAL_200KM(5),
        MORE_THAN_200KM(6),
        POSITION_ERROR_UNKNOWN_OR_INVALID(7);

        private final long id;
        PositionErrors(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, PositionErrors> byId = new HashMap<Long, PositionErrors>(8);
        static {
            for (PositionErrors e : PositionErrors.values())
                byId.put(e.id(), e);
        }
        public static PositionErrors byId(long id) { return byId.get(id); }
    }

    public enum TalkerDataFormats {
        CODING_7BIT(0),
        CODING_8BIT(1),
        UNICODE_UTF8(2),
        UNICODE_UTF16(3);

        private final long id;
        TalkerDataFormats(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, TalkerDataFormats> byId = new HashMap<Long, TalkerDataFormats>(4);
        static {
            for (TalkerDataFormats e : TalkerDataFormats.values())
                byId.put(e.id(), e);
        }
        public static TalkerDataFormats byId(long id) { return byId.get(id); }
    }

    public enum FeatureSetIds {
        STANDARDIZED_TS_102_361_2(0),
        RESERVED1(1),
        RESERVED2(2),
        RESERVED3(3),
        MFID_START(4),
        MFID_END(127),
        MFID_RESERVED_START(128),
        MFID_RESERVED_END(255);

        private final long id;
        FeatureSetIds(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, FeatureSetIds> byId = new HashMap<Long, FeatureSetIds>(8);
        static {
            for (FeatureSetIds e : FeatureSetIds.values())
                byId.put(e.id(), e);
        }
        public static FeatureSetIds byId(long id) { return byId.get(id); }
    }

    public FullLinkControl(KaitaiStream _io) {
        this(_io, null, null);
    }

    public FullLinkControl(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public FullLinkControl(KaitaiStream _io, KaitaiStruct _parent, FullLinkControl _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.protectFlag = this._io.readBitsIntBe(1) != 0;
        this.reserved = this._io.readBitsIntBe(1) != 0;
        this.fullLinkControlOpcode = Flcos.byId(this._io.readBitsIntBe(6));
        this.featureSetId = FeatureSetIds.byId(this._io.readBitsIntBe(8));
        this._io.alignToByte();
        {
            Flcos on = fullLinkControlOpcode();
            if (on != null) {
                switch (fullLinkControlOpcode()) {
                case TALKER_ALIAS_HEADER: {
                    this.specificData = new TalkerAliasHeader(this._io, this, _root);
                    break;
                }
                case UNIT_TO_UNIT_VOICE: {
                    this.specificData = new UnitToUnitVoiceChannelUser(this._io, this, _root);
                    break;
                }
                case GROUP_VOICE: {
                    this.specificData = new GroupVoiceChannelUser(this._io, this, _root);
                    break;
                }
                case TALKER_ALIAS_BLOCK3: {
                    this.specificData = new TalkerAliasContinuation(this._io, this, _root);
                    break;
                }
                case TALKER_ALIAS_BLOCK1: {
                    this.specificData = new TalkerAliasContinuation(this._io, this, _root);
                    break;
                }
                case TALKER_ALIAS_BLOCK2: {
                    this.specificData = new TalkerAliasContinuation(this._io, this, _root);
                    break;
                }
                case GPS_INFO: {
                    this.specificData = new GpsInfoLcPdu(this._io, this, _root);
                    break;
                }
                }
            }
        }
        if ((_io().size() - _io().pos()) >= 3) {
            this.crcChecksum = this._io.readBytes(3);
        }
        if (_io().size() <= 10) {
            this.cs5Checksum = this._io.readBitsIntBe(5);
        }
    }
    public static class GpsInfoLcPdu extends KaitaiStruct {
        public static GpsInfoLcPdu fromFile(String fileName) throws IOException {
            return new GpsInfoLcPdu(new ByteBufferKaitaiStream(fileName));
        }

        public GpsInfoLcPdu(KaitaiStream _io) {
            this(_io, null, null);
        }

        public GpsInfoLcPdu(KaitaiStream _io, FullLinkControl _parent) {
            this(_io, _parent, null);
        }

        public GpsInfoLcPdu(KaitaiStream _io, FullLinkControl _parent, FullLinkControl _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.reserved = this._io.readBitsIntBe(4);
            this.positionError = FullLinkControl.PositionErrors.byId(this._io.readBitsIntBe(3));
            this.longitude = this._io.readBitsIntBe(25);
            this.latitude = this._io.readBitsIntBe(24);
        }
        private long reserved;
        private PositionErrors positionError;
        private long longitude;
        private long latitude;
        private FullLinkControl _root;
        private FullLinkControl _parent;
        public long reserved() { return reserved; }
        public PositionErrors positionError() { return positionError; }
        public long longitude() { return longitude; }
        public long latitude() { return latitude; }
        public FullLinkControl _root() { return _root; }
        public FullLinkControl _parent() { return _parent; }
    }
    public static class GroupVoiceChannelUser extends KaitaiStruct {
        public static GroupVoiceChannelUser fromFile(String fileName) throws IOException {
            return new GroupVoiceChannelUser(new ByteBufferKaitaiStream(fileName));
        }

        public GroupVoiceChannelUser(KaitaiStream _io) {
            this(_io, null, null);
        }

        public GroupVoiceChannelUser(KaitaiStream _io, FullLinkControl _parent) {
            this(_io, _parent, null);
        }

        public GroupVoiceChannelUser(KaitaiStream _io, FullLinkControl _parent, FullLinkControl _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.serviceOptions = this._io.readBitsIntBe(8);
            this.groupAddress = this._io.readBitsIntBe(24);
            this.sourceAddress = this._io.readBitsIntBe(24);
        }
        private long serviceOptions;
        private long groupAddress;
        private long sourceAddress;
        private FullLinkControl _root;
        private FullLinkControl _parent;
        public long serviceOptions() { return serviceOptions; }
        public long groupAddress() { return groupAddress; }
        public long sourceAddress() { return sourceAddress; }
        public FullLinkControl _root() { return _root; }
        public FullLinkControl _parent() { return _parent; }
    }
    public static class UnitToUnitVoiceChannelUser extends KaitaiStruct {
        public static UnitToUnitVoiceChannelUser fromFile(String fileName) throws IOException {
            return new UnitToUnitVoiceChannelUser(new ByteBufferKaitaiStream(fileName));
        }

        public UnitToUnitVoiceChannelUser(KaitaiStream _io) {
            this(_io, null, null);
        }

        public UnitToUnitVoiceChannelUser(KaitaiStream _io, FullLinkControl _parent) {
            this(_io, _parent, null);
        }

        public UnitToUnitVoiceChannelUser(KaitaiStream _io, FullLinkControl _parent, FullLinkControl _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.serviceOptions = this._io.readBitsIntBe(8);
            this.targetAddress = this._io.readBitsIntBe(24);
            this.sourceAddress = this._io.readBitsIntBe(24);
        }
        private long serviceOptions;
        private long targetAddress;
        private long sourceAddress;
        private FullLinkControl _root;
        private FullLinkControl _parent;
        public long serviceOptions() { return serviceOptions; }
        public long targetAddress() { return targetAddress; }
        public long sourceAddress() { return sourceAddress; }
        public FullLinkControl _root() { return _root; }
        public FullLinkControl _parent() { return _parent; }
    }
    public static class TalkerAliasHeader extends KaitaiStruct {
        public static TalkerAliasHeader fromFile(String fileName) throws IOException {
            return new TalkerAliasHeader(new ByteBufferKaitaiStream(fileName));
        }

        public TalkerAliasHeader(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TalkerAliasHeader(KaitaiStream _io, FullLinkControl _parent) {
            this(_io, _parent, null);
        }

        public TalkerAliasHeader(KaitaiStream _io, FullLinkControl _parent, FullLinkControl _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.talkerAliasDataFormat = FullLinkControl.TalkerDataFormats.byId(this._io.readBitsIntBe(2));
            this.talkerAliasDataLength = this._io.readBitsIntBe(5);
            this.talkerAliasData = this._io.readBitsIntBe(49);
        }
        private TalkerDataFormats talkerAliasDataFormat;
        private long talkerAliasDataLength;
        private long talkerAliasData;
        private FullLinkControl _root;
        private FullLinkControl _parent;
        public TalkerDataFormats talkerAliasDataFormat() { return talkerAliasDataFormat; }
        public long talkerAliasDataLength() { return talkerAliasDataLength; }

        /**
         * 8-bit/16-bit coded => 1st bit reserved (6 or 3 characters), 7-bit coded => all used (7 characters)
         */
        public long talkerAliasData() { return talkerAliasData; }
        public FullLinkControl _root() { return _root; }
        public FullLinkControl _parent() { return _parent; }
    }
    public static class TalkerAliasContinuation extends KaitaiStruct {
        public static TalkerAliasContinuation fromFile(String fileName) throws IOException {
            return new TalkerAliasContinuation(new ByteBufferKaitaiStream(fileName));
        }

        public TalkerAliasContinuation(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TalkerAliasContinuation(KaitaiStream _io, FullLinkControl _parent) {
            this(_io, _parent, null);
        }

        public TalkerAliasContinuation(KaitaiStream _io, FullLinkControl _parent, FullLinkControl _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.talkerAliasData = this._io.readBitsIntBe(56);
        }
        private long talkerAliasData;
        private FullLinkControl _root;
        private FullLinkControl _parent;

        /**
         * 7-bit => 8 characters, 8-bit => 7 characters, 16-bit => 3 characters
         */
        public long talkerAliasData() { return talkerAliasData; }
        public FullLinkControl _root() { return _root; }
        public FullLinkControl _parent() { return _parent; }
    }
    private boolean protectFlag;
    private boolean reserved;
    private Flcos fullLinkControlOpcode;
    private FeatureSetIds featureSetId;
    private KaitaiStruct specificData;
    private byte[] crcChecksum;
    private Long cs5Checksum;
    private FullLinkControl _root;
    private KaitaiStruct _parent;
    public boolean protectFlag() { return protectFlag; }
    public boolean reserved() { return reserved; }
    public Flcos fullLinkControlOpcode() { return fullLinkControlOpcode; }

    /**
     * fid
     */
    public FeatureSetIds featureSetId() { return featureSetId; }
    public KaitaiStruct specificData() { return specificData; }

    /**
     * 3 bytes of Reed-Solomon CRC with applied CRC mask per B.3.12 Data Type CRC Mask
     */
    public byte[] crcChecksum() { return crcChecksum; }

    /**
     * 5-bit checksum for FullLC carried in embedded signalling
     */
    public Long cs5Checksum() { return cs5Checksum; }
    public FullLinkControl _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
