// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.homebrew;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.nio.charset.Charset;
import java.util.Arrays;


/**
 * MMDVM protocol structure (MMDVMHost/HBlink3/DMRGateway) based on reversing effort
 */
public class Mmdvm2020 extends KaitaiStruct {
    public static Mmdvm2020 fromFile(String fileName) throws IOException {
        return new Mmdvm2020(new ByteBufferKaitaiStream(fileName));
    }

    public enum TalkerAliasTypes {
        TALKER_ALIAS_HEADER(0),
        TALKER_ALIAS_BLOCK_1(1),
        TALKER_ALIAS_BLOCK_2(2),
        TALKER_ALIAS_BLOCK_3(3);

        private final long id;
        TalkerAliasTypes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, TalkerAliasTypes> byId = new HashMap<Long, TalkerAliasTypes>(4);
        static {
            for (TalkerAliasTypes e : TalkerAliasTypes.values())
                byId.put(e.id(), e);
        }
        public static TalkerAliasTypes byId(long id) { return byId.get(id); }
    }

    public enum FrameTypes {
        VOICE_DATA(0),
        VOICE_SYNC(1),
        DATA_OR_DATA_SYNC(2),
        UNUSED(3);

        private final long id;
        FrameTypes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, FrameTypes> byId = new HashMap<Long, FrameTypes>(4);
        static {
            for (FrameTypes e : FrameTypes.values())
                byId.put(e.id(), e);
        }
        public static FrameTypes byId(long id) { return byId.get(id); }
    }

    public enum CallTypes {
        GROUP_CALL(0),
        PRIVATE_CALL(1);

        private final long id;
        CallTypes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, CallTypes> byId = new HashMap<Long, CallTypes>(2);
        static {
            for (CallTypes e : CallTypes.values())
                byId.put(e.id(), e);
        }
        public static CallTypes byId(long id) { return byId.get(id); }
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

    public enum Timeslots {
        TIMESLOT_1(0),
        TIMESLOT_2(1);

        private final long id;
        Timeslots(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, Timeslots> byId = new HashMap<Long, Timeslots>(2);
        static {
            for (Timeslots e : Timeslots.values())
                byId.put(e.id(), e);
        }
        public static Timeslots byId(long id) { return byId.get(id); }
    }

    public Mmdvm2020(KaitaiStream _io) {
        this(_io, null, null);
    }

    public Mmdvm2020(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public Mmdvm2020(KaitaiStream _io, KaitaiStruct _parent, Mmdvm2020 _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.commandPrefix = new String(this._io.readBytes(4), Charset.forName("ASCII"));
        switch (commandPrefix()) {
        case "RPTL": {
            this.commandData = new TypeRepeaterLoginRequest(this._io, this, _root);
            break;
        }
        case "DMRG": {
            this.commandData = new TypeRadioPosition(this._io, this, _root);
            break;
        }
        case "RPTA": {
            this.commandData = new TypeMasterRepeaterAck(this._io, this, _root);
            break;
        }
        case "RPTK": {
            this.commandData = new TypeRepeaterLoginResponse(this._io, this, _root);
            break;
        }
        case "RPTC": {
            this.commandData = new TypeRepeaterConfigurationOrClosing(this._io, this, _root);
            break;
        }
        case "DMRD": {
            this.commandData = new TypeDmrData(this._io, this, _root);
            break;
        }
        case "MSTC": {
            this.commandData = new TypeMasterClosing(this._io, this, _root);
            break;
        }
        case "RPTP": {
            this.commandData = new TypeRepeaterPing(this._io, this, _root);
            break;
        }
        case "RPTO": {
            this.commandData = new TypeRepeaterOptions(this._io, this, _root);
            break;
        }
        case "MSTP": {
            this.commandData = new TypeMasterPong(this._io, this, _root);
            break;
        }
        case "RPTS": {
            this.commandData = new TypeRepeaterBeacon(this._io, this, _root);
            break;
        }
        case "MSTN": {
            this.commandData = new TypeMasterNotAccept(this._io, this, _root);
            break;
        }
        case "DMRA": {
            this.commandData = new TypeTalkerAlias(this._io, this, _root);
            break;
        }
        }
    }
    public static class TypeMasterPong extends KaitaiStruct {
        public static TypeMasterPong fromFile(String fileName) throws IOException {
            return new TypeMasterPong(new ByteBufferKaitaiStream(fileName));
        }

        public TypeMasterPong(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeMasterPong(KaitaiStream _io, Mmdvm2020 _parent) {
            this(_io, _parent, null);
        }

        public TypeMasterPong(KaitaiStream _io, Mmdvm2020 _parent, Mmdvm2020 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.magic = this._io.readBytes(3);
            if (!(Arrays.equals(magic(), new byte[] { 79, 78, 71 }))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[] { 79, 78, 71 }, magic(), _io(), "/types/type_master_pong/seq/0");
            }
            this.repeaterId = this._io.readU4be();
        }
        private byte[] magic;
        private long repeaterId;
        private Mmdvm2020 _root;
        private Mmdvm2020 _parent;
        public byte[] magic() { return magic; }
        public long repeaterId() { return repeaterId; }
        public Mmdvm2020 _root() { return _root; }
        public Mmdvm2020 _parent() { return _parent; }
    }

    /**
     * etsi dmr, link control, type flcos::gps_info, specifically gps_info_lc_pdu
     */
    public static class TypeRadioPosition extends KaitaiStruct {
        public static TypeRadioPosition fromFile(String fileName) throws IOException {
            return new TypeRadioPosition(new ByteBufferKaitaiStream(fileName));
        }

        public TypeRadioPosition(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeRadioPosition(KaitaiStream _io, Mmdvm2020 _parent) {
            this(_io, _parent, null);
        }

        public TypeRadioPosition(KaitaiStream _io, Mmdvm2020 _parent, Mmdvm2020 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.radioId = this._io.readBitsIntBe(24);
            this.reserved = this._io.readBitsIntBe(4);
            this.positionError = Mmdvm2020.PositionErrors.byId(this._io.readBitsIntBe(3));
            this.longitude = this._io.readBitsIntBe(25);
            this.latitude = this._io.readBitsIntBe(24);
        }
        private long radioId;
        private long reserved;
        private PositionErrors positionError;
        private long longitude;
        private long latitude;
        private Mmdvm2020 _root;
        private Mmdvm2020 _parent;
        public long radioId() { return radioId; }
        public long reserved() { return reserved; }
        public PositionErrors positionError() { return positionError; }
        public long longitude() { return longitude; }
        public long latitude() { return latitude; }
        public Mmdvm2020 _root() { return _root; }
        public Mmdvm2020 _parent() { return _parent; }
    }
    public static class TypeTalkerAlias extends KaitaiStruct {
        public static TypeTalkerAlias fromFile(String fileName) throws IOException {
            return new TypeTalkerAlias(new ByteBufferKaitaiStream(fileName));
        }

        public TypeTalkerAlias(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeTalkerAlias(KaitaiStream _io, Mmdvm2020 _parent) {
            this(_io, _parent, null);
        }

        public TypeTalkerAlias(KaitaiStream _io, Mmdvm2020 _parent, Mmdvm2020 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.radioId = this._io.readBitsIntBe(24);
            this._io.alignToByte();
            this.talkerAliasType = Mmdvm2020.TalkerAliasTypes.byId(this._io.readU1());
            this.talkerAlias = new String(this._io.readBytes(8), Charset.forName("ASCII"));
        }
        private long radioId;
        private TalkerAliasTypes talkerAliasType;
        private String talkerAlias;
        private Mmdvm2020 _root;
        private Mmdvm2020 _parent;
        public long radioId() { return radioId; }
        public TalkerAliasTypes talkerAliasType() { return talkerAliasType; }
        public String talkerAlias() { return talkerAlias; }
        public Mmdvm2020 _root() { return _root; }
        public Mmdvm2020 _parent() { return _parent; }
    }
    public static class TypeRepeaterConfigurationOrClosing extends KaitaiStruct {
        public static TypeRepeaterConfigurationOrClosing fromFile(String fileName) throws IOException {
            return new TypeRepeaterConfigurationOrClosing(new ByteBufferKaitaiStream(fileName));
        }

        public TypeRepeaterConfigurationOrClosing(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeRepeaterConfigurationOrClosing(KaitaiStream _io, Mmdvm2020 _parent) {
            this(_io, _parent, null);
        }

        public TypeRepeaterConfigurationOrClosing(KaitaiStream _io, Mmdvm2020 _parent, Mmdvm2020 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            switch (_root.fifthLetter()) {
            case "L": {
                this.data = new TypeRepeaterClosing(this._io, this, _root);
                break;
            }
            default: {
                this.data = new TypeRepeaterConfiguration(this._io, this, _root);
                break;
            }
            }
        }
        private KaitaiStruct data;
        private Mmdvm2020 _root;
        private Mmdvm2020 _parent;
        public KaitaiStruct data() { return data; }
        public Mmdvm2020 _root() { return _root; }
        public Mmdvm2020 _parent() { return _parent; }
    }
    public static class TypeRepeaterLoginResponse extends KaitaiStruct {
        public static TypeRepeaterLoginResponse fromFile(String fileName) throws IOException {
            return new TypeRepeaterLoginResponse(new ByteBufferKaitaiStream(fileName));
        }

        public TypeRepeaterLoginResponse(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeRepeaterLoginResponse(KaitaiStream _io, Mmdvm2020 _parent) {
            this(_io, _parent, null);
        }

        public TypeRepeaterLoginResponse(KaitaiStream _io, Mmdvm2020 _parent, Mmdvm2020 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.repeaterId = this._io.readU4be();
            this.sha256 = this._io.readBytes(32);
        }
        private long repeaterId;
        private byte[] sha256;
        private Mmdvm2020 _root;
        private Mmdvm2020 _parent;
        public long repeaterId() { return repeaterId; }
        public byte[] sha256() { return sha256; }
        public Mmdvm2020 _root() { return _root; }
        public Mmdvm2020 _parent() { return _parent; }
    }
    public static class TypeRepeaterLoginRequest extends KaitaiStruct {
        public static TypeRepeaterLoginRequest fromFile(String fileName) throws IOException {
            return new TypeRepeaterLoginRequest(new ByteBufferKaitaiStream(fileName));
        }

        public TypeRepeaterLoginRequest(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeRepeaterLoginRequest(KaitaiStream _io, Mmdvm2020 _parent) {
            this(_io, _parent, null);
        }

        public TypeRepeaterLoginRequest(KaitaiStream _io, Mmdvm2020 _parent, Mmdvm2020 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.repeaterId = this._io.readU4be();
        }
        private long repeaterId;
        private Mmdvm2020 _root;
        private Mmdvm2020 _parent;
        public long repeaterId() { return repeaterId; }
        public Mmdvm2020 _root() { return _root; }
        public Mmdvm2020 _parent() { return _parent; }
    }
    public static class TypeMasterNotAccept extends KaitaiStruct {
        public static TypeMasterNotAccept fromFile(String fileName) throws IOException {
            return new TypeMasterNotAccept(new ByteBufferKaitaiStream(fileName));
        }

        public TypeMasterNotAccept(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeMasterNotAccept(KaitaiStream _io, Mmdvm2020 _parent) {
            this(_io, _parent, null);
        }

        public TypeMasterNotAccept(KaitaiStream _io, Mmdvm2020 _parent, Mmdvm2020 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.magic = this._io.readBytes(2);
            if (!(Arrays.equals(magic(), new byte[] { 65, 75 }))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[] { 65, 75 }, magic(), _io(), "/types/type_master_not_accept/seq/0");
            }
            this.repeaterId = this._io.readU4be();
        }
        private byte[] magic;
        private long repeaterId;
        private Mmdvm2020 _root;
        private Mmdvm2020 _parent;
        public byte[] magic() { return magic; }
        public long repeaterId() { return repeaterId; }
        public Mmdvm2020 _root() { return _root; }
        public Mmdvm2020 _parent() { return _parent; }
    }
    public static class TypeUnknown extends KaitaiStruct {
        public static TypeUnknown fromFile(String fileName) throws IOException {
            return new TypeUnknown(new ByteBufferKaitaiStream(fileName));
        }

        public TypeUnknown(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeUnknown(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public TypeUnknown(KaitaiStream _io, KaitaiStruct _parent, Mmdvm2020 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.unknownData = this._io.readBytesFull();
        }
        private byte[] unknownData;
        private Mmdvm2020 _root;
        private KaitaiStruct _parent;
        public byte[] unknownData() { return unknownData; }
        public Mmdvm2020 _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class TypeMasterRepeaterAck extends KaitaiStruct {
        public static TypeMasterRepeaterAck fromFile(String fileName) throws IOException {
            return new TypeMasterRepeaterAck(new ByteBufferKaitaiStream(fileName));
        }

        public TypeMasterRepeaterAck(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeMasterRepeaterAck(KaitaiStream _io, Mmdvm2020 _parent) {
            this(_io, _parent, null);
        }

        public TypeMasterRepeaterAck(KaitaiStream _io, Mmdvm2020 _parent, Mmdvm2020 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.magic = this._io.readBytes(2);
            if (!(Arrays.equals(magic(), new byte[] { 67, 75 }))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[] { 67, 75 }, magic(), _io(), "/types/type_master_repeater_ack/seq/0");
            }
            this.repeaterIdOrChallenge = this._io.readU4be();
        }
        private byte[] magic;
        private long repeaterIdOrChallenge;
        private Mmdvm2020 _root;
        private Mmdvm2020 _parent;
        public byte[] magic() { return magic; }
        public long repeaterIdOrChallenge() { return repeaterIdOrChallenge; }
        public Mmdvm2020 _root() { return _root; }
        public Mmdvm2020 _parent() { return _parent; }
    }
    public static class TypeMasterClosing extends KaitaiStruct {
        public static TypeMasterClosing fromFile(String fileName) throws IOException {
            return new TypeMasterClosing(new ByteBufferKaitaiStream(fileName));
        }

        public TypeMasterClosing(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeMasterClosing(KaitaiStream _io, Mmdvm2020 _parent) {
            this(_io, _parent, null);
        }

        public TypeMasterClosing(KaitaiStream _io, Mmdvm2020 _parent, Mmdvm2020 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.magic = this._io.readBytes(1);
            if (!(Arrays.equals(magic(), new byte[] { 76 }))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[] { 76 }, magic(), _io(), "/types/type_master_closing/seq/0");
            }
            this.repeaterId = this._io.readU4be();
        }
        private byte[] magic;
        private long repeaterId;
        private Mmdvm2020 _root;
        private Mmdvm2020 _parent;
        public byte[] magic() { return magic; }
        public long repeaterId() { return repeaterId; }
        public Mmdvm2020 _root() { return _root; }
        public Mmdvm2020 _parent() { return _parent; }
    }
    public static class TypeDmrData extends KaitaiStruct {
        public static TypeDmrData fromFile(String fileName) throws IOException {
            return new TypeDmrData(new ByteBufferKaitaiStream(fileName));
        }

        public TypeDmrData(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeDmrData(KaitaiStream _io, Mmdvm2020 _parent) {
            this(_io, _parent, null);
        }

        public TypeDmrData(KaitaiStream _io, Mmdvm2020 _parent, Mmdvm2020 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sequenceNo = this._io.readU1();
            this.sourceId = this._io.readBitsIntBe(24);
            this.targetId = this._io.readBitsIntBe(24);
            this._io.alignToByte();
            this.repeaterId = this._io.readU4be();
            this.slotNo = Mmdvm2020.Timeslots.byId(this._io.readBitsIntBe(1));
            this.callType = Mmdvm2020.CallTypes.byId(this._io.readBitsIntBe(1));
            this.frameType = Mmdvm2020.FrameTypes.byId(this._io.readBitsIntBe(2));
            this.dataType = this._io.readBitsIntBe(4);
            this._io.alignToByte();
            this.streamId = this._io.readU4be();
            this.dmrData = this._io.readBytes(33);
            if (!(_io().isEof())) {
                this.bitErrorRate = this._io.readU1();
            }
            if (!(_io().isEof())) {
                this.rssi = this._io.readU1();
            }
        }
        private int sequenceNo;
        private long sourceId;
        private long targetId;
        private long repeaterId;
        private Timeslots slotNo;
        private CallTypes callType;
        private FrameTypes frameType;
        private long dataType;
        private long streamId;
        private byte[] dmrData;
        private Integer bitErrorRate;
        private Integer rssi;
        private Mmdvm2020 _root;
        private Mmdvm2020 _parent;
        public int sequenceNo() { return sequenceNo; }
        public long sourceId() { return sourceId; }
        public long targetId() { return targetId; }
        public long repeaterId() { return repeaterId; }
        public Timeslots slotNo() { return slotNo; }
        public CallTypes callType() { return callType; }
        public FrameTypes frameType() { return frameType; }
        public long dataType() { return dataType; }
        public long streamId() { return streamId; }
        public byte[] dmrData() { return dmrData; }
        public Integer bitErrorRate() { return bitErrorRate; }
        public Integer rssi() { return rssi; }
        public Mmdvm2020 _root() { return _root; }
        public Mmdvm2020 _parent() { return _parent; }
    }

    /**
     * undefined currently
     */
    public static class TypeRepeaterBeacon extends KaitaiStruct {
        public static TypeRepeaterBeacon fromFile(String fileName) throws IOException {
            return new TypeRepeaterBeacon(new ByteBufferKaitaiStream(fileName));
        }

        public TypeRepeaterBeacon(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeRepeaterBeacon(KaitaiStream _io, Mmdvm2020 _parent) {
            this(_io, _parent, null);
        }

        public TypeRepeaterBeacon(KaitaiStream _io, Mmdvm2020 _parent, Mmdvm2020 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
        }
        private Mmdvm2020 _root;
        private Mmdvm2020 _parent;
        public Mmdvm2020 _root() { return _root; }
        public Mmdvm2020 _parent() { return _parent; }
    }
    public static class TypeRepeaterOptions extends KaitaiStruct {
        public static TypeRepeaterOptions fromFile(String fileName) throws IOException {
            return new TypeRepeaterOptions(new ByteBufferKaitaiStream(fileName));
        }

        public TypeRepeaterOptions(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeRepeaterOptions(KaitaiStream _io, Mmdvm2020 _parent) {
            this(_io, _parent, null);
        }

        public TypeRepeaterOptions(KaitaiStream _io, Mmdvm2020 _parent, Mmdvm2020 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.repeaterId = this._io.readU4be();
            this.options = new String(this._io.readBytesFull(), Charset.forName("ASCII"));
        }
        private long repeaterId;
        private String options;
        private Mmdvm2020 _root;
        private Mmdvm2020 _parent;
        public long repeaterId() { return repeaterId; }

        /**
         * structure probably key=value;key=value;...
         */
        public String options() { return options; }
        public Mmdvm2020 _root() { return _root; }
        public Mmdvm2020 _parent() { return _parent; }
    }
    public static class TypeRepeaterClosing extends KaitaiStruct {
        public static TypeRepeaterClosing fromFile(String fileName) throws IOException {
            return new TypeRepeaterClosing(new ByteBufferKaitaiStream(fileName));
        }

        public TypeRepeaterClosing(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeRepeaterClosing(KaitaiStream _io, Mmdvm2020.TypeRepeaterConfigurationOrClosing _parent) {
            this(_io, _parent, null);
        }

        public TypeRepeaterClosing(KaitaiStream _io, Mmdvm2020.TypeRepeaterConfigurationOrClosing _parent, Mmdvm2020 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.magic = this._io.readBytes(1);
            if (!(Arrays.equals(magic(), new byte[] { 76 }))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[] { 76 }, magic(), _io(), "/types/type_repeater_closing/seq/0");
            }
            this.repeaterId = this._io.readU4be();
        }
        private byte[] magic;
        private long repeaterId;
        private Mmdvm2020 _root;
        private Mmdvm2020.TypeRepeaterConfigurationOrClosing _parent;
        public byte[] magic() { return magic; }
        public long repeaterId() { return repeaterId; }
        public Mmdvm2020 _root() { return _root; }
        public Mmdvm2020.TypeRepeaterConfigurationOrClosing _parent() { return _parent; }
    }
    public static class TypeRepeaterConfiguration extends KaitaiStruct {
        public static TypeRepeaterConfiguration fromFile(String fileName) throws IOException {
            return new TypeRepeaterConfiguration(new ByteBufferKaitaiStream(fileName));
        }

        public TypeRepeaterConfiguration(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeRepeaterConfiguration(KaitaiStream _io, Mmdvm2020.TypeRepeaterConfigurationOrClosing _parent) {
            this(_io, _parent, null);
        }

        public TypeRepeaterConfiguration(KaitaiStream _io, Mmdvm2020.TypeRepeaterConfigurationOrClosing _parent, Mmdvm2020 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.repeaterId = this._io.readU4be();
            this.callSign = new String(this._io.readBytes(8), Charset.forName("ASCII"));
            this.rxFreq = new String(this._io.readBytes(9), Charset.forName("ASCII"));
            this.txFreq = new String(this._io.readBytes(9), Charset.forName("ASCII"));
            this.txPower = new String(this._io.readBytes(2), Charset.forName("ASCII"));
            this.colorCode = new String(this._io.readBytes(2), Charset.forName("ASCII"));
            this.latitude = new String(this._io.readBytes(8), Charset.forName("ASCII"));
            this.longitude = new String(this._io.readBytes(9), Charset.forName("ASCII"));
            this.antennaHeightAboveGround = new String(this._io.readBytes(3), Charset.forName("ASCII"));
            this.location = new String(this._io.readBytes(20), Charset.forName("ASCII"));
            this.description = new String(this._io.readBytes(19), Charset.forName("ASCII"));
            this.slots = new String(this._io.readBytes(1), Charset.forName("ASCII"));
            this.url = new String(this._io.readBytes(124), Charset.forName("ASCII"));
            this.softwareId = new String(this._io.readBytes(40), Charset.forName("ASCII"));
            this.packageId = new String(this._io.readBytes(40), Charset.forName("ASCII"));
            this.unparsedData = new String(this._io.readBytesFull(), Charset.forName("ASCII"));
        }
        private long repeaterId;
        private String callSign;
        private String rxFreq;
        private String txFreq;
        private String txPower;
        private String colorCode;
        private String latitude;
        private String longitude;
        private String antennaHeightAboveGround;
        private String location;
        private String description;
        private String slots;
        private String url;
        private String softwareId;
        private String packageId;
        private String unparsedData;
        private Mmdvm2020 _root;
        private Mmdvm2020.TypeRepeaterConfigurationOrClosing _parent;
        public long repeaterId() { return repeaterId; }
        public String callSign() { return callSign; }
        public String rxFreq() { return rxFreq; }
        public String txFreq() { return txFreq; }
        public String txPower() { return txPower; }
        public String colorCode() { return colorCode; }
        public String latitude() { return latitude; }
        public String longitude() { return longitude; }
        public String antennaHeightAboveGround() { return antennaHeightAboveGround; }
        public String location() { return location; }
        public String description() { return description; }

        /**
         * 1 = only slot 1, 2 = only slot 2, 3 = both slots
         */
        public String slots() { return slots; }
        public String url() { return url; }
        public String softwareId() { return softwareId; }
        public String packageId() { return packageId; }
        public String unparsedData() { return unparsedData; }
        public Mmdvm2020 _root() { return _root; }
        public Mmdvm2020.TypeRepeaterConfigurationOrClosing _parent() { return _parent; }
    }
    public static class TypeRepeaterPing extends KaitaiStruct {
        public static TypeRepeaterPing fromFile(String fileName) throws IOException {
            return new TypeRepeaterPing(new ByteBufferKaitaiStream(fileName));
        }

        public TypeRepeaterPing(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeRepeaterPing(KaitaiStream _io, Mmdvm2020 _parent) {
            this(_io, _parent, null);
        }

        public TypeRepeaterPing(KaitaiStream _io, Mmdvm2020 _parent, Mmdvm2020 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.magic = this._io.readBytes(3);
            if (!(Arrays.equals(magic(), new byte[] { 73, 78, 71 }))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[] { 73, 78, 71 }, magic(), _io(), "/types/type_repeater_ping/seq/0");
            }
            this.repeaterId = this._io.readU4be();
        }
        private byte[] magic;
        private long repeaterId;
        private Mmdvm2020 _root;
        private Mmdvm2020 _parent;
        public byte[] magic() { return magic; }
        public long repeaterId() { return repeaterId; }
        public Mmdvm2020 _root() { return _root; }
        public Mmdvm2020 _parent() { return _parent; }
    }
    private String fifthLetter;
    public String fifthLetter() {
        if (this.fifthLetter != null)
            return this.fifthLetter;
        long _pos = this._io.pos();
        this._io.seek(4);
        this.fifthLetter = new String(this._io.readBytes(1), Charset.forName("ASCII"));
        this._io.seek(_pos);
        return this.fifthLetter;
    }
    private String commandPrefix;
    private KaitaiStruct commandData;
    private Mmdvm2020 _root;
    private KaitaiStruct _parent;
    public String commandPrefix() { return commandPrefix; }
    public KaitaiStruct commandData() { return commandData; }
    public Mmdvm2020 _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
