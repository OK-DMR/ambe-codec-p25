// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.etsi;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import io.kaitai.struct.KaitaiStruct;


/**
 * TS 102 361-2 V2.4.1 - section 7.1.2 Control Signalling BlocK (CSBK) PDUs
 */
public class DmrCsbk extends KaitaiStruct {
    private boolean lastBlock;
    private boolean protectFlag;
    private CsbkoTypes csbkOpcode;
    private long featureSetId;
    private KaitaiStruct csbkData;
    private DmrCsbk _root;
    private KaitaiStruct _parent;

    public DmrCsbk(KaitaiStream _io) {
        this(_io, null, null);
    }

    public DmrCsbk(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public DmrCsbk(KaitaiStream _io, KaitaiStruct _parent, DmrCsbk _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }

    public static DmrCsbk fromFile(String fileName) throws IOException {
        return new DmrCsbk(new ByteBufferKaitaiStream(fileName));
    }

    private void _read() {
        this.lastBlock = this._io.readBitsIntBe(1) != 0;
        this.protectFlag = this._io.readBitsIntBe(1) != 0;
        this.csbkOpcode = CsbkoTypes.byId(this._io.readBitsIntBe(6));
        this.featureSetId = this._io.readBitsIntBe(8);
        this._io.alignToByte();
        {
            CsbkoTypes on = csbkOpcode();
            if (on != null) {
                switch (csbkOpcode()) {
                    case UNIT_TO_UNIT_VOICE_SERVICE_ANSWER_RESPONSE: {
                        this.csbkData = new UnitToUnitVoiceAnswerData(this._io, this, _root);
                        break;
                    }
                    case PREAMBLE: {
                        this.csbkData = new PreambleData(this._io, this, _root);
                        break;
                    }
                    case CHANNEL_TIMING: {
                        this.csbkData = new ChannelTimingData(this._io, this, _root);
                        break;
                    }
                    case UNIT_TO_UNIT_VOICE_SERVICE_REQUEST: {
                        this.csbkData = new UnitToUnitVoiceRequestData(this._io, this, _root);
                        break;
                    }
                    case BS_OUTBOUND_ACTIVATION_CSBK_PDU: {
                        this.csbkData = new BsOutboundActivationData(this._io, this, _root);
                        break;
                    }
                    case NEGATIVE_ACKNOWLEDGE_RESPONSE: {
                        this.csbkData = new NegativeAckResponseData(this._io, this, _root);
                        break;
                    }
                }
            }
        }
    }

    /**
     * LB
     */
    public boolean lastBlock() {
        return lastBlock;
    }

    /**
     * PF
     */
    public boolean protectFlag() {
        return protectFlag;
    }

    /**
     * CSBKO
     */
    public CsbkoTypes csbkOpcode() {
        return csbkOpcode;
    }

    /**
     * FID
     */
    public long featureSetId() {
        return featureSetId;
    }

    public KaitaiStruct csbkData() {
        return csbkData;
    }

    public DmrCsbk _root() {
        return _root;
    }

    public KaitaiStruct _parent() {
        return _parent;
    }
    public enum CsbkoTypes {
        UNIT_TO_UNIT_VOICE_SERVICE_REQUEST(4),
        UNIT_TO_UNIT_VOICE_SERVICE_ANSWER_RESPONSE(5),
        CHANNEL_TIMING(7),
        NEGATIVE_ACKNOWLEDGE_RESPONSE(38),
        BS_OUTBOUND_ACTIVATION_CSBK_PDU(56),
        PREAMBLE(61);

        private static final Map<Long, CsbkoTypes> byId = new HashMap<Long, CsbkoTypes>(6);

        static {
            for (CsbkoTypes e : CsbkoTypes.values())
                byId.put(e.id(), e);
        }

        private final long id;

        CsbkoTypes(long id) {
            this.id = id;
        }

        public static CsbkoTypes byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }
    public enum CsbkDataOrCsbk {
        CSBK_CONTENT_FOLLOWS_PREAMBLES(0),
        DATA_CONTENT_FOLLOWS_PREAMBLES(1);

        private static final Map<Long, CsbkDataOrCsbk> byId = new HashMap<Long, CsbkDataOrCsbk>(2);

        static {
            for (CsbkDataOrCsbk e : CsbkDataOrCsbk.values())
                byId.put(e.id(), e);
        }

        private final long id;

        CsbkDataOrCsbk(long id) {
            this.id = id;
        }

        public static CsbkDataOrCsbk byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }
    public enum CsbkGroupOrIndividual {
        TARGET_ADDRESS_IS_AN_INDIVIDUAL(0),
        TARGET_ADDRESS_IS_A_GROUP(1);

        private static final Map<Long, CsbkGroupOrIndividual> byId = new HashMap<Long, CsbkGroupOrIndividual>(2);

        static {
            for (CsbkGroupOrIndividual e : CsbkGroupOrIndividual.values())
                byId.put(e.id(), e);
        }

        private final long id;

        CsbkGroupOrIndividual(long id) {
            this.id = id;
        }

        public static CsbkGroupOrIndividual byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }
    public enum AnswerResponse {
        PROCEED(32),
        DENY(33);

        private static final Map<Long, AnswerResponse> byId = new HashMap<Long, AnswerResponse>(2);

        static {
            for (AnswerResponse e : AnswerResponse.values())
                byId.put(e.id(), e);
        }

        private final long id;

        AnswerResponse(long id) {
            this.id = id;
        }

        public static AnswerResponse byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    public static class NegativeAckResponseData extends KaitaiStruct {
        private boolean additionalInformationField;
        private boolean sourceType;
        private long serviceType;
        private long reasonCode;
        private long sourceAddress;
        private long targetAddress;
        private DmrCsbk _root;
        private DmrCsbk _parent;
        public NegativeAckResponseData(KaitaiStream _io) {
            this(_io, null, null);
        }
        public NegativeAckResponseData(KaitaiStream _io, DmrCsbk _parent) {
            this(_io, _parent, null);
        }
        public NegativeAckResponseData(KaitaiStream _io, DmrCsbk _parent, DmrCsbk _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static NegativeAckResponseData fromFile(String fileName) throws IOException {
            return new NegativeAckResponseData(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.additionalInformationField = this._io.readBitsIntBe(1) != 0;
            this.sourceType = this._io.readBitsIntBe(1) != 0;
            this.serviceType = this._io.readBitsIntBe(6);
            this.reasonCode = this._io.readBitsIntBe(8);
            this.sourceAddress = this._io.readBitsIntBe(24);
            this.targetAddress = this._io.readBitsIntBe(24);
        }

        /**
         * should read 0b1
         */
        public boolean additionalInformationField() {
            return additionalInformationField;
        }

        public boolean sourceType() {
            return sourceType;
        }

        public long serviceType() {
            return serviceType;
        }

        public long reasonCode() {
            return reasonCode;
        }

        public long sourceAddress() {
            return sourceAddress;
        }

        public long targetAddress() {
            return targetAddress;
        }

        public DmrCsbk _root() {
            return _root;
        }

        public DmrCsbk _parent() {
            return _parent;
        }
    }

    public static class UnitToUnitVoiceRequestData extends KaitaiStruct {
        private ServiceOptions serviceOptions;
        private long reserved;
        private long targetAddress;
        private long sourceAddress;
        private DmrCsbk _root;
        private DmrCsbk _parent;
        public UnitToUnitVoiceRequestData(KaitaiStream _io) {
            this(_io, null, null);
        }
        public UnitToUnitVoiceRequestData(KaitaiStream _io, DmrCsbk _parent) {
            this(_io, _parent, null);
        }
        public UnitToUnitVoiceRequestData(KaitaiStream _io, DmrCsbk _parent, DmrCsbk _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static UnitToUnitVoiceRequestData fromFile(String fileName) throws IOException {
            return new UnitToUnitVoiceRequestData(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.serviceOptions = new ServiceOptions(this._io, this, _root);
            this.reserved = this._io.readBitsIntBe(8);
            this.targetAddress = this._io.readBitsIntBe(24);
            this.sourceAddress = this._io.readBitsIntBe(24);
        }

        public ServiceOptions serviceOptions() {
            return serviceOptions;
        }

        public long reserved() {
            return reserved;
        }

        public long targetAddress() {
            return targetAddress;
        }

        public long sourceAddress() {
            return sourceAddress;
        }

        public DmrCsbk _root() {
            return _root;
        }

        public DmrCsbk _parent() {
            return _parent;
        }
    }

    public static class ServiceOptions extends KaitaiStruct {
        private boolean isEmergencyService;
        private boolean privacy;
        private long reserved;
        private boolean isBroadcastService;
        private boolean isOpenVoiceCallMode;
        private long priorityLevel;
        private DmrCsbk _root;
        private KaitaiStruct _parent;
        public ServiceOptions(KaitaiStream _io) {
            this(_io, null, null);
        }
        public ServiceOptions(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }
        public ServiceOptions(KaitaiStream _io, KaitaiStruct _parent, DmrCsbk _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static ServiceOptions fromFile(String fileName) throws IOException {
            return new ServiceOptions(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.isEmergencyService = this._io.readBitsIntBe(1) != 0;
            this.privacy = this._io.readBitsIntBe(1) != 0;
            this.reserved = this._io.readBitsIntBe(2);
            this.isBroadcastService = this._io.readBitsIntBe(1) != 0;
            this.isOpenVoiceCallMode = this._io.readBitsIntBe(1) != 0;
            this.priorityLevel = this._io.readBitsIntBe(2);
        }

        public boolean isEmergencyService() {
            return isEmergencyService;
        }

        public boolean privacy() {
            return privacy;
        }

        public long reserved() {
            return reserved;
        }

        public boolean isBroadcastService() {
            return isBroadcastService;
        }

        public boolean isOpenVoiceCallMode() {
            return isOpenVoiceCallMode;
        }

        /**
         * 00 => no priority, 11 => priority 3
         */
        public long priorityLevel() {
            return priorityLevel;
        }

        public DmrCsbk _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    public static class PreambleData extends KaitaiStruct {
        private CsbkDataOrCsbk preambleDataOrCsbk;
        private CsbkGroupOrIndividual groupOrIndividual;
        private long preambleReserved;
        private long preambleCsbkBlocksToFollow;
        private long targetAddress;
        private long sourceAddress;
        private DmrCsbk _root;
        private DmrCsbk _parent;
        public PreambleData(KaitaiStream _io) {
            this(_io, null, null);
        }
        public PreambleData(KaitaiStream _io, DmrCsbk _parent) {
            this(_io, _parent, null);
        }
        public PreambleData(KaitaiStream _io, DmrCsbk _parent, DmrCsbk _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static PreambleData fromFile(String fileName) throws IOException {
            return new PreambleData(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.preambleDataOrCsbk = DmrCsbk.CsbkDataOrCsbk.byId(this._io.readBitsIntBe(1));
            this.groupOrIndividual = DmrCsbk.CsbkGroupOrIndividual.byId(this._io.readBitsIntBe(1));
            this.preambleReserved = this._io.readBitsIntBe(6);
            this.preambleCsbkBlocksToFollow = this._io.readBitsIntBe(8);
            this.targetAddress = this._io.readBitsIntBe(24);
            this.sourceAddress = this._io.readBitsIntBe(24);
        }

        public CsbkDataOrCsbk preambleDataOrCsbk() {
            return preambleDataOrCsbk;
        }

        public CsbkGroupOrIndividual groupOrIndividual() {
            return groupOrIndividual;
        }

        /**
         * should read 0b000000
         */
        public long preambleReserved() {
            return preambleReserved;
        }

        public long preambleCsbkBlocksToFollow() {
            return preambleCsbkBlocksToFollow;
        }

        public long targetAddress() {
            return targetAddress;
        }

        public long sourceAddress() {
            return sourceAddress;
        }

        public DmrCsbk _root() {
            return _root;
        }

        public DmrCsbk _parent() {
            return _parent;
        }
    }

    public static class ChannelTimingData extends KaitaiStruct {
        private long syncAge;
        private long generation;
        private long leaderIdentifier;
        private boolean newLeader;
        private long leaderDynamicIdentifier;
        private boolean channelTimingOp1;
        private long sourceIdentifier;
        private boolean reserved;
        private long sourceDynamicIdentifier;
        private boolean channelTimingOp0;
        private DmrCsbk _root;
        private DmrCsbk _parent;
        public ChannelTimingData(KaitaiStream _io) {
            this(_io, null, null);
        }
        public ChannelTimingData(KaitaiStream _io, DmrCsbk _parent) {
            this(_io, _parent, null);
        }
        public ChannelTimingData(KaitaiStream _io, DmrCsbk _parent, DmrCsbk _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static ChannelTimingData fromFile(String fileName) throws IOException {
            return new ChannelTimingData(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.syncAge = this._io.readBitsIntBe(11);
            this.generation = this._io.readBitsIntBe(5);
            this.leaderIdentifier = this._io.readBitsIntBe(20);
            this.newLeader = this._io.readBitsIntBe(1) != 0;
            this.leaderDynamicIdentifier = this._io.readBitsIntBe(2);
            this.channelTimingOp1 = this._io.readBitsIntBe(1) != 0;
            this.sourceIdentifier = this._io.readBitsIntBe(20);
            this.reserved = this._io.readBitsIntBe(1) != 0;
            this.sourceDynamicIdentifier = this._io.readBitsIntBe(2);
            this.channelTimingOp0 = this._io.readBitsIntBe(1) != 0;
        }

        public long syncAge() {
            return syncAge;
        }

        public long generation() {
            return generation;
        }

        public long leaderIdentifier() {
            return leaderIdentifier;
        }

        public boolean newLeader() {
            return newLeader;
        }

        public long leaderDynamicIdentifier() {
            return leaderDynamicIdentifier;
        }

        public boolean channelTimingOp1() {
            return channelTimingOp1;
        }

        public long sourceIdentifier() {
            return sourceIdentifier;
        }

        public boolean reserved() {
            return reserved;
        }

        public long sourceDynamicIdentifier() {
            return sourceDynamicIdentifier;
        }

        public boolean channelTimingOp0() {
            return channelTimingOp0;
        }

        public DmrCsbk _root() {
            return _root;
        }

        public DmrCsbk _parent() {
            return _parent;
        }
    }

    public static class BsOutboundActivationData extends KaitaiStruct {
        private long reserved;
        private long bsAddress;
        private long sourceAddress;
        private DmrCsbk _root;
        private DmrCsbk _parent;

        public BsOutboundActivationData(KaitaiStream _io) {
            this(_io, null, null);
        }
        public BsOutboundActivationData(KaitaiStream _io, DmrCsbk _parent) {
            this(_io, _parent, null);
        }
        public BsOutboundActivationData(KaitaiStream _io, DmrCsbk _parent, DmrCsbk _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static BsOutboundActivationData fromFile(String fileName) throws IOException {
            return new BsOutboundActivationData(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.reserved = this._io.readBitsIntBe(16);
            this.bsAddress = this._io.readBitsIntBe(24);
            this.sourceAddress = this._io.readBitsIntBe(24);
        }

        public long reserved() {
            return reserved;
        }

        public long bsAddress() {
            return bsAddress;
        }

        public long sourceAddress() {
            return sourceAddress;
        }

        public DmrCsbk _root() {
            return _root;
        }

        public DmrCsbk _parent() {
            return _parent;
        }
    }

    public static class UnitToUnitVoiceAnswerData extends KaitaiStruct {
        private ServiceOptions serviceOptions;
        private AnswerResponse answerResponse;
        private long targetAddress;
        private long sourceAddress;
        private DmrCsbk _root;
        private DmrCsbk _parent;
        public UnitToUnitVoiceAnswerData(KaitaiStream _io) {
            this(_io, null, null);
        }
        public UnitToUnitVoiceAnswerData(KaitaiStream _io, DmrCsbk _parent) {
            this(_io, _parent, null);
        }
        public UnitToUnitVoiceAnswerData(KaitaiStream _io, DmrCsbk _parent, DmrCsbk _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static UnitToUnitVoiceAnswerData fromFile(String fileName) throws IOException {
            return new UnitToUnitVoiceAnswerData(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.serviceOptions = new ServiceOptions(this._io, this, _root);
            this.answerResponse = DmrCsbk.AnswerResponse.byId(this._io.readBitsIntBe(8));
            this.targetAddress = this._io.readBitsIntBe(24);
            this.sourceAddress = this._io.readBitsIntBe(24);
        }

        public ServiceOptions serviceOptions() {
            return serviceOptions;
        }

        public AnswerResponse answerResponse() {
            return answerResponse;
        }

        public long targetAddress() {
            return targetAddress;
        }

        public long sourceAddress() {
            return sourceAddress;
        }

        public DmrCsbk _root() {
            return _root;
        }

        public DmrCsbk _parent() {
            return _parent;
        }
    }
}
