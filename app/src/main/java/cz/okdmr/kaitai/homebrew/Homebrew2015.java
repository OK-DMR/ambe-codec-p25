// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.homebrew;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import io.kaitai.struct.KaitaiStruct;


/**
 * Homebrew DMR protocol, based on PDF (DL5DI, G4KLX, DG1HT 2015) specification
 */
public class Homebrew2015 extends KaitaiStruct {
    private String fifthLetter;
    private String commandPrefix;
    private KaitaiStruct commandData;
    private Homebrew2015 _root;
    private KaitaiStruct _parent;

    public Homebrew2015(KaitaiStream _io) {
        this(_io, null, null);
    }

    public Homebrew2015(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public Homebrew2015(KaitaiStream _io, KaitaiStruct _parent, Homebrew2015 _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }

    public static Homebrew2015 fromFile(String fileName) throws IOException {
        return new Homebrew2015(new ByteBufferKaitaiStream(fileName));
    }

    private void _read() {
        this.commandPrefix = new String(this._io.readBytes(4), Charset.forName("UTF-8"));
        switch (commandPrefix()) {
            case "RPTL": {
                this.commandData = new TypeRepeaterLoginRequest(this._io, this, _root);
                break;
            }
            case "MSTA": {
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
                this.commandData = new TypeRepeaterPong(this._io, this, _root);
                break;
            }
            case "MSTP": {
                this.commandData = new TypeMasterPing(this._io, this, _root);
                break;
            }
            case "MSTN": {
                this.commandData = new TypeMasterNotAccept(this._io, this, _root);
                break;
            }
        }
    }

    public String fifthLetter() {
        if (this.fifthLetter != null)
            return this.fifthLetter;
        long _pos = this._io.pos();
        this._io.seek(4);
        this.fifthLetter = new String(this._io.readBytes(1), Charset.forName("ASCII"));
        this._io.seek(_pos);
        return this.fifthLetter;
    }

    public String commandPrefix() {
        return commandPrefix;
    }

    public KaitaiStruct commandData() {
        return commandData;
    }

    public Homebrew2015 _root() {
        return _root;
    }

    public KaitaiStruct _parent() {
        return _parent;
    }

    public enum Timeslots {
        TIMESLOT_1(0),
        TIMESLOT_2(1);

        private static final Map<Long, Timeslots> byId = new HashMap<Long, Timeslots>(2);

        static {
            for (Timeslots e : Timeslots.values())
                byId.put(e.id(), e);
        }

        private final long id;

        Timeslots(long id) {
            this.id = id;
        }

        public static Timeslots byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    public enum CallTypes {
        GROUP_CALL(0),
        PRIVATE_CALL(1);

        private static final Map<Long, CallTypes> byId = new HashMap<Long, CallTypes>(2);

        static {
            for (CallTypes e : CallTypes.values())
                byId.put(e.id(), e);
        }

        private final long id;

        CallTypes(long id) {
            this.id = id;
        }

        public static CallTypes byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    public enum FrameTypes {
        VOICE_DATA(0),
        VOICE_SYNC(1),
        DATA_OR_DATA_SYNC(2),
        UNUSED(3);

        private static final Map<Long, FrameTypes> byId = new HashMap<Long, FrameTypes>(4);

        static {
            for (FrameTypes e : FrameTypes.values())
                byId.put(e.id(), e);
        }

        private final long id;

        FrameTypes(long id) {
            this.id = id;
        }

        public static FrameTypes byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    public static class TypeMasterPing extends KaitaiStruct {
        private byte[] magic;
        private long repeaterId;
        private Homebrew2015 _root;
        private Homebrew2015 _parent;

        public TypeMasterPing(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeMasterPing(KaitaiStream _io, Homebrew2015 _parent) {
            this(_io, _parent, null);
        }
        public TypeMasterPing(KaitaiStream _io, Homebrew2015 _parent, Homebrew2015 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static TypeMasterPing fromFile(String fileName) throws IOException {
            return new TypeMasterPing(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.magic = this._io.readBytes(3);
            if (!(Arrays.equals(magic(), new byte[]{73, 78, 71}))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[]{73, 78, 71}, magic(), _io(), "/types/type_master_ping/seq/0");
            }
            this.repeaterId = this._io.readU4be();
        }

        public byte[] magic() {
            return magic;
        }

        public long repeaterId() {
            return repeaterId;
        }

        public Homebrew2015 _root() {
            return _root;
        }

        public Homebrew2015 _parent() {
            return _parent;
        }
    }

    public static class TypeRepeaterPong extends KaitaiStruct {
        private byte[] magic;
        private long repeaterId;
        private Homebrew2015 _root;
        private Homebrew2015 _parent;

        public TypeRepeaterPong(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeRepeaterPong(KaitaiStream _io, Homebrew2015 _parent) {
            this(_io, _parent, null);
        }
        public TypeRepeaterPong(KaitaiStream _io, Homebrew2015 _parent, Homebrew2015 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static TypeRepeaterPong fromFile(String fileName) throws IOException {
            return new TypeRepeaterPong(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.magic = this._io.readBytes(3);
            if (!(Arrays.equals(magic(), new byte[]{79, 78, 71}))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[]{79, 78, 71}, magic(), _io(), "/types/type_repeater_pong/seq/0");
            }
            this.repeaterId = this._io.readU4be();
        }

        public byte[] magic() {
            return magic;
        }

        public long repeaterId() {
            return repeaterId;
        }

        public Homebrew2015 _root() {
            return _root;
        }

        public Homebrew2015 _parent() {
            return _parent;
        }
    }

    public static class TypeRepeaterConfigurationOrClosing extends KaitaiStruct {
        private KaitaiStruct data;
        private Homebrew2015 _root;
        private Homebrew2015 _parent;

        public TypeRepeaterConfigurationOrClosing(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeRepeaterConfigurationOrClosing(KaitaiStream _io, Homebrew2015 _parent) {
            this(_io, _parent, null);
        }

        public TypeRepeaterConfigurationOrClosing(KaitaiStream _io, Homebrew2015 _parent, Homebrew2015 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static TypeRepeaterConfigurationOrClosing fromFile(String fileName) throws IOException {
            return new TypeRepeaterConfigurationOrClosing(new ByteBufferKaitaiStream(fileName));
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

        public KaitaiStruct data() {
            return data;
        }

        public Homebrew2015 _root() {
            return _root;
        }

        public Homebrew2015 _parent() {
            return _parent;
        }
    }

    public static class TypeRepeaterLoginResponse extends KaitaiStruct {
        private long repeaterId;
        private byte[] sha256;
        private Homebrew2015 _root;
        private Homebrew2015 _parent;

        public TypeRepeaterLoginResponse(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeRepeaterLoginResponse(KaitaiStream _io, Homebrew2015 _parent) {
            this(_io, _parent, null);
        }
        public TypeRepeaterLoginResponse(KaitaiStream _io, Homebrew2015 _parent, Homebrew2015 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static TypeRepeaterLoginResponse fromFile(String fileName) throws IOException {
            return new TypeRepeaterLoginResponse(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.repeaterId = this._io.readU4be();
            this.sha256 = this._io.readBytes(32);
        }

        public long repeaterId() {
            return repeaterId;
        }

        public byte[] sha256() {
            return sha256;
        }

        public Homebrew2015 _root() {
            return _root;
        }

        public Homebrew2015 _parent() {
            return _parent;
        }
    }

    public static class TypeRepeaterLoginRequest extends KaitaiStruct {
        private long repeaterId;
        private Homebrew2015 _root;
        private Homebrew2015 _parent;

        public TypeRepeaterLoginRequest(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeRepeaterLoginRequest(KaitaiStream _io, Homebrew2015 _parent) {
            this(_io, _parent, null);
        }

        public TypeRepeaterLoginRequest(KaitaiStream _io, Homebrew2015 _parent, Homebrew2015 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static TypeRepeaterLoginRequest fromFile(String fileName) throws IOException {
            return new TypeRepeaterLoginRequest(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.repeaterId = this._io.readU4be();
        }

        public long repeaterId() {
            return repeaterId;
        }

        public Homebrew2015 _root() {
            return _root;
        }

        public Homebrew2015 _parent() {
            return _parent;
        }
    }

    public static class TypeMasterNotAccept extends KaitaiStruct {
        private byte[] magic;
        private long repeaterId;
        private Homebrew2015 _root;
        private Homebrew2015 _parent;

        public TypeMasterNotAccept(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeMasterNotAccept(KaitaiStream _io, Homebrew2015 _parent) {
            this(_io, _parent, null);
        }
        public TypeMasterNotAccept(KaitaiStream _io, Homebrew2015 _parent, Homebrew2015 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static TypeMasterNotAccept fromFile(String fileName) throws IOException {
            return new TypeMasterNotAccept(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.magic = this._io.readBytes(2);
            if (!(Arrays.equals(magic(), new byte[]{65, 75}))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[]{65, 75}, magic(), _io(), "/types/type_master_not_accept/seq/0");
            }
            this.repeaterId = this._io.readU4be();
        }

        public byte[] magic() {
            return magic;
        }

        public long repeaterId() {
            return repeaterId;
        }

        public Homebrew2015 _root() {
            return _root;
        }

        public Homebrew2015 _parent() {
            return _parent;
        }
    }

    public static class TypeMasterRepeaterAck extends KaitaiStruct {
        private byte[] magictypeMasterRepeaterAck;
        private long repeaterId;
        private Long randomNumber;
        private Homebrew2015 _root;
        private Homebrew2015 _parent;

        public TypeMasterRepeaterAck(KaitaiStream _io) {
            this(_io, null, null);
        }
        public TypeMasterRepeaterAck(KaitaiStream _io, Homebrew2015 _parent) {
            this(_io, _parent, null);
        }
        public TypeMasterRepeaterAck(KaitaiStream _io, Homebrew2015 _parent, Homebrew2015 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static TypeMasterRepeaterAck fromFile(String fileName) throws IOException {
            return new TypeMasterRepeaterAck(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.magictypeMasterRepeaterAck = this._io.readBytes(2);
            if (!(Arrays.equals(magictypeMasterRepeaterAck(), new byte[]{67, 75}))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[]{67, 75}, magictypeMasterRepeaterAck(), _io(), "/types/type_master_repeater_ack/seq/0");
            }
            this.repeaterId = this._io.readU4be();
            if (!(_io().isEof())) {
                this.randomNumber = this._io.readU4be();
            }
        }

        public byte[] magictypeMasterRepeaterAck() {
            return magictypeMasterRepeaterAck;
        }

        public long repeaterId() {
            return repeaterId;
        }

        public Long randomNumber() {
            return randomNumber;
        }

        public Homebrew2015 _root() {
            return _root;
        }

        public Homebrew2015 _parent() {
            return _parent;
        }
    }

    public static class TypeMasterClosing extends KaitaiStruct {
        private byte[] magic;
        private long repeaterId;
        private Homebrew2015 _root;
        private Homebrew2015 _parent;

        public TypeMasterClosing(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeMasterClosing(KaitaiStream _io, Homebrew2015 _parent) {
            this(_io, _parent, null);
        }
        public TypeMasterClosing(KaitaiStream _io, Homebrew2015 _parent, Homebrew2015 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static TypeMasterClosing fromFile(String fileName) throws IOException {
            return new TypeMasterClosing(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.magic = this._io.readBytes(1);
            if (!(Arrays.equals(magic(), new byte[]{76}))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[]{76}, magic(), _io(), "/types/type_master_closing/seq/0");
            }
            this.repeaterId = this._io.readU4be();
        }

        public byte[] magic() {
            return magic;
        }

        public long repeaterId() {
            return repeaterId;
        }

        public Homebrew2015 _root() {
            return _root;
        }

        public Homebrew2015 _parent() {
            return _parent;
        }
    }

    public static class TypeDmrData extends KaitaiStruct {
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
        private Homebrew2015 _root;
        private Homebrew2015 _parent;
        public TypeDmrData(KaitaiStream _io) {
            this(_io, null, null);
        }
        public TypeDmrData(KaitaiStream _io, Homebrew2015 _parent) {
            this(_io, _parent, null);
        }
        public TypeDmrData(KaitaiStream _io, Homebrew2015 _parent, Homebrew2015 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static TypeDmrData fromFile(String fileName) throws IOException {
            return new TypeDmrData(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.sequenceNo = this._io.readU1();
            this.sourceId = this._io.readBitsIntBe(24);
            this.targetId = this._io.readBitsIntBe(24);
            this._io.alignToByte();
            this.repeaterId = this._io.readU4be();
            this.slotNo = Homebrew2015.Timeslots.byId(this._io.readBitsIntBe(1));
            this.callType = Homebrew2015.CallTypes.byId(this._io.readBitsIntBe(1));
            this.frameType = Homebrew2015.FrameTypes.byId(this._io.readBitsIntBe(2));
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

        public int sequenceNo() {
            return sequenceNo;
        }

        public long sourceId() {
            return sourceId;
        }

        public long targetId() {
            return targetId;
        }

        public long repeaterId() {
            return repeaterId;
        }

        public Timeslots slotNo() {
            return slotNo;
        }

        public CallTypes callType() {
            return callType;
        }

        public FrameTypes frameType() {
            return frameType;
        }

        public long dataType() {
            return dataType;
        }

        public long streamId() {
            return streamId;
        }

        public byte[] dmrData() {
            return dmrData;
        }

        public Integer bitErrorRate() {
            return bitErrorRate;
        }

        public Integer rssi() {
            return rssi;
        }

        public Homebrew2015 _root() {
            return _root;
        }

        public Homebrew2015 _parent() {
            return _parent;
        }
    }

    public static class TypeRepeaterOptions extends KaitaiStruct {
        private long repeaterId;
        private String options;
        private Homebrew2015 _root;
        private KaitaiStruct _parent;

        public TypeRepeaterOptions(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeRepeaterOptions(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }
        public TypeRepeaterOptions(KaitaiStream _io, KaitaiStruct _parent, Homebrew2015 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static TypeRepeaterOptions fromFile(String fileName) throws IOException {
            return new TypeRepeaterOptions(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.repeaterId = this._io.readU4be();
            this.options = new String(this._io.readBytesFull(), Charset.forName("ASCII"));
        }

        public long repeaterId() {
            return repeaterId;
        }

        /**
         * structure probably key=value;key=value;...
         */
        public String options() {
            return options;
        }

        public Homebrew2015 _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    public static class TypeRepeaterClosing extends KaitaiStruct {
        private byte[] magic;
        private long repeaterId;
        private Homebrew2015 _root;
        private Homebrew2015.TypeRepeaterConfigurationOrClosing _parent;

        public TypeRepeaterClosing(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TypeRepeaterClosing(KaitaiStream _io, Homebrew2015.TypeRepeaterConfigurationOrClosing _parent) {
            this(_io, _parent, null);
        }
        public TypeRepeaterClosing(KaitaiStream _io, Homebrew2015.TypeRepeaterConfigurationOrClosing _parent, Homebrew2015 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static TypeRepeaterClosing fromFile(String fileName) throws IOException {
            return new TypeRepeaterClosing(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.magic = this._io.readBytes(1);
            if (!(Arrays.equals(magic(), new byte[]{76}))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[]{76}, magic(), _io(), "/types/type_repeater_closing/seq/0");
            }
            this.repeaterId = this._io.readU4be();
        }

        public byte[] magic() {
            return magic;
        }

        public long repeaterId() {
            return repeaterId;
        }

        public Homebrew2015 _root() {
            return _root;
        }

        public Homebrew2015.TypeRepeaterConfigurationOrClosing _parent() {
            return _parent;
        }
    }

    public static class TypeRepeaterConfiguration extends KaitaiStruct {
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
        private String url;
        private String softwareId;
        private String packageId;
        private String unparsedData;
        private Homebrew2015 _root;
        private Homebrew2015.TypeRepeaterConfigurationOrClosing _parent;
        public TypeRepeaterConfiguration(KaitaiStream _io) {
            this(_io, null, null);
        }
        public TypeRepeaterConfiguration(KaitaiStream _io, Homebrew2015.TypeRepeaterConfigurationOrClosing _parent) {
            this(_io, _parent, null);
        }
        public TypeRepeaterConfiguration(KaitaiStream _io, Homebrew2015.TypeRepeaterConfigurationOrClosing _parent, Homebrew2015 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static TypeRepeaterConfiguration fromFile(String fileName) throws IOException {
            return new TypeRepeaterConfiguration(new ByteBufferKaitaiStream(fileName));
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
            this.description = new String(this._io.readBytes(20), Charset.forName("ASCII"));
            this.url = new String(this._io.readBytes(124), Charset.forName("ASCII"));
            this.softwareId = new String(this._io.readBytes(40), Charset.forName("ASCII"));
            this.packageId = new String(this._io.readBytes(40), Charset.forName("ASCII"));
            this.unparsedData = new String(this._io.readBytesFull(), Charset.forName("ASCII"));
        }

        public long repeaterId() {
            return repeaterId;
        }

        public String callSign() {
            return callSign;
        }

        public String rxFreq() {
            return rxFreq;
        }

        public String txFreq() {
            return txFreq;
        }

        public String txPower() {
            return txPower;
        }

        public String colorCode() {
            return colorCode;
        }

        public String latitude() {
            return latitude;
        }

        public String longitude() {
            return longitude;
        }

        public String antennaHeightAboveGround() {
            return antennaHeightAboveGround;
        }

        public String location() {
            return location;
        }

        public String description() {
            return description;
        }

        public String url() {
            return url;
        }

        public String softwareId() {
            return softwareId;
        }

        public String packageId() {
            return packageId;
        }

        public String unparsedData() {
            return unparsedData;
        }

        public Homebrew2015 _root() {
            return _root;
        }

        public Homebrew2015.TypeRepeaterConfigurationOrClosing _parent() {
            return _parent;
        }
    }
}
