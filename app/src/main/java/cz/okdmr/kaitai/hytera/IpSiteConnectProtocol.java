// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.hytera;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import io.kaitai.struct.KaitaiStruct;


/**
 * Hytera IP Multi-Site Protocol re-implementation from dmrshark original
 */
public class IpSiteConnectProtocol extends KaitaiStruct {
    private Integer sourceRadioId;
    private Integer destinationRadioId;
    private Integer colorCode;
    private byte[] sourcePort;
    private byte[] fixedHeader;
    private int sequenceNumber;
    private byte[] reserved3;
    private PacketTypes packetType;
    private byte[] reserved7a;
    private Timeslots timeslotRaw;
    private SlotTypes slotType;
    private int colorCodeRaw;
    private FrameTypes frameType;
    private byte[] reserved2a;
    private byte[] ipscPayload;
    private byte[] reserved2b;
    private CallTypes callType;
    private long destinationRadioIdRaw;
    private long sourceRadioIdRaw;
    private int reserved1b;
    private byte[] extraData;
    private IpSiteConnectProtocol _root;
    private KaitaiStruct _parent;
    public IpSiteConnectProtocol(KaitaiStream _io) {
        this(_io, null, null);
    }
    public IpSiteConnectProtocol(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }
    public IpSiteConnectProtocol(KaitaiStream _io, KaitaiStruct _parent, IpSiteConnectProtocol _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }

    public static IpSiteConnectProtocol fromFile(String fileName) throws IOException {
        return new IpSiteConnectProtocol(new ByteBufferKaitaiStream(fileName));
    }

    private void _read() {
        this.sourcePort = this._io.readBytes(2);
        this.fixedHeader = this._io.readBytes(2);
        this.sequenceNumber = this._io.readU1();
        this.reserved3 = this._io.readBytes(3);
        this.packetType = PacketTypes.byId(this._io.readU1());
        this.reserved7a = this._io.readBytes(7);
        this.timeslotRaw = Timeslots.byId(this._io.readU2be());
        this.slotType = SlotTypes.byId(this._io.readU2be());
        this.colorCodeRaw = this._io.readU2le();
        this.frameType = FrameTypes.byId(this._io.readU2be());
        this.reserved2a = this._io.readBytes(2);
        this.ipscPayload = this._io.readBytes(34);
        this.reserved2b = this._io.readBytes(2);
        this.callType = CallTypes.byId(this._io.readU1());
        this.destinationRadioIdRaw = this._io.readU4le();
        this.sourceRadioIdRaw = this._io.readU4le();
        this.reserved1b = this._io.readU1();
        if (!(_io().isEof())) {
            this.extraData = this._io.readBytesFull();
        }
    }

    public Integer sourceRadioId() {
        if (this.sourceRadioId != null)
            return this.sourceRadioId;
        int _tmp = (int) ((sourceRadioIdRaw() >> 8));
        this.sourceRadioId = _tmp;
        return this.sourceRadioId;
    }

    public Integer destinationRadioId() {
        if (this.destinationRadioId != null)
            return this.destinationRadioId;
        int _tmp = (int) ((destinationRadioIdRaw() >> 8));
        this.destinationRadioId = _tmp;
        return this.destinationRadioId;
    }

    public Integer colorCode() {
        if (this.colorCode != null)
            return this.colorCode;
        int _tmp = (int) ((colorCodeRaw() & 15));
        this.colorCode = _tmp;
        return this.colorCode;
    }

    /**
     * UDP source port of IPSC packet
     */
    public byte[] sourcePort() {
        return sourcePort;
    }

    public byte[] fixedHeader() {
        return fixedHeader;
    }

    public int sequenceNumber() {
        return sequenceNumber;
    }

    public byte[] reserved3() {
        return reserved3;
    }

    public PacketTypes packetType() {
        return packetType;
    }

    public byte[] reserved7a() {
        return reserved7a;
    }

    public Timeslots timeslotRaw() {
        return timeslotRaw;
    }

    public SlotTypes slotType() {
        return slotType;
    }

    /**
     * will be color code repeated, ie. cc=5 means two incoming bytes [0x55, 0x55]
     */
    public int colorCodeRaw() {
        return colorCodeRaw;
    }

    public FrameTypes frameType() {
        return frameType;
    }

    public byte[] reserved2a() {
        return reserved2a;
    }

    public byte[] ipscPayload() {
        return ipscPayload;
    }

    public byte[] reserved2b() {
        return reserved2b;
    }

    public CallTypes callType() {
        return callType;
    }

    public long destinationRadioIdRaw() {
        return destinationRadioIdRaw;
    }

    public long sourceRadioIdRaw() {
        return sourceRadioIdRaw;
    }

    public int reserved1b() {
        return reserved1b;
    }

    public byte[] extraData() {
        return extraData;
    }

    public IpSiteConnectProtocol _root() {
        return _root;
    }

    public KaitaiStruct _parent() {
        return _parent;
    }

    public enum PacketTypes {
        A(65),
        B(66);

        private static final Map<Long, PacketTypes> byId = new HashMap<Long, PacketTypes>(2);

        static {
            for (PacketTypes e : PacketTypes.values())
                byId.put(e.id(), e);
        }

        private final long id;

        PacketTypes(long id) {
            this.id = id;
        }

        public static PacketTypes byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    public enum FrameTypes {
        FRAME_TYPE_DATA(0),
        FRAME_TYPE_VOICE_SYNC(4369),
        FRAME_TYPE_DATA_SYNC_OR_CSBK(13107),
        FRAME_TYPE_DATA_HEADER(26214),
        FRAME_TYPE_VOICE(48059),
        FRAME_TYPE_SYNC(61166);

        private static final Map<Long, FrameTypes> byId = new HashMap<Long, FrameTypes>(6);

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

    public enum CallTypes {
        PRIVATE_CALL(0),
        GROUP_CALL(1),
        WAKEUP_CALL(12);

        private static final Map<Long, CallTypes> byId = new HashMap<Long, CallTypes>(3);

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

    public enum SlotTypes {
        SLOT_TYPE_PRIVACY_INDICATOR(0),
        SLOT_TYPE_VOICE_LC_HEADER(4369),
        SLOT_TYPE_TERMINATOR_WITH_LC(8738),
        SLOT_TYPE_CSBK(13107),
        SLOT_TYPE_DATA_HEADER(17476),
        SLOT_TYPE_RATE_12_DATA(21845),
        SLOT_TYPE_RATE_34_DATA(26214),
        SLOT_TYPE_DATA_A(30583),
        SLOT_TYPE_DATA_B(34952),
        SLOT_TYPE_DATA_C(39321),
        SLOT_TYPE_DATA_D(43690),
        SLOT_TYPE_DATA_E(48059),
        SLOT_TYPE_DATA_F(52428),
        SLOT_TYPE_WAKEUP_REQUEST(56797),
        SLOT_TYPE_SYNC(61166);

        private static final Map<Long, SlotTypes> byId = new HashMap<Long, SlotTypes>(15);

        static {
            for (SlotTypes e : SlotTypes.values())
                byId.put(e.id(), e);
        }

        private final long id;

        SlotTypes(long id) {
            this.id = id;
        }

        public static SlotTypes byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    public enum Timeslots {
        TIMESLOT_1(4369),
        TIMESLOT_2(8738);

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
}
