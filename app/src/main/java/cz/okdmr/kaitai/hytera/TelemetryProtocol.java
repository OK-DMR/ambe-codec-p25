// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.hytera;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.nio.charset.Charset;

public class TelemetryProtocol extends KaitaiStruct {
    public static TelemetryProtocol fromFile(String fileName) throws IOException {
        return new TelemetryProtocol(new ByteBufferKaitaiStream(fileName));
    }

    public enum ServiceTypes {
        STATUS_REPORT_SERVICE(160),
        REMOTE_CONTROL_SERVICE(176);

        private final long id;
        ServiceTypes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ServiceTypes> byId = new HashMap<Long, ServiceTypes>(2);
        static {
            for (ServiceTypes e : ServiceTypes.values())
                byId.put(e.id(), e);
        }
        public static ServiceTypes byId(long id) { return byId.get(id); }
    }

    public enum ResultTypes {
        EFFECTIVE(0),
        INEFFECTIVE(1);

        private final long id;
        ResultTypes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ResultTypes> byId = new HashMap<Long, ResultTypes>(2);
        static {
            for (ResultTypes e : ResultTypes.values())
                byId.put(e.id(), e);
        }
        public static ResultTypes byId(long id) { return byId.get(id); }
    }

    public enum CallTypes {
        PRIVATE_CALL(0),
        GROUP_CALL(1),
        ALL_CALL(2);

        private final long id;
        CallTypes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, CallTypes> byId = new HashMap<Long, CallTypes>(3);
        static {
            for (CallTypes e : CallTypes.values())
                byId.put(e.id(), e);
        }
        public static CallTypes byId(long id) { return byId.get(id); }
    }

    public enum OperationTypes {
        SET_INEFFECTIVE_LEVEL(0),
        SET_EFFECTIVE_LEVEL(1),
        REVERSE_LEVEL(2),
        OUTPUT_ONE_PULSE(3);

        private final long id;
        OperationTypes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, OperationTypes> byId = new HashMap<Long, OperationTypes>(4);
        static {
            for (OperationTypes e : OperationTypes.values())
                byId.put(e.id(), e);
        }
        public static OperationTypes byId(long id) { return byId.get(id); }
    }

    public enum PcFlagTypes {
        CONTROLLER_IS_RADIO(0),
        CONTROLLER_IS_TELEMETRY_APPLICATION(1);

        private final long id;
        PcFlagTypes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, PcFlagTypes> byId = new HashMap<Long, PcFlagTypes>(2);
        static {
            for (PcFlagTypes e : PcFlagTypes.values())
                byId.put(e.id(), e);
        }
        public static PcFlagTypes byId(long id) { return byId.get(id); }
    }

    public enum ServiceSpecificTypes {
        STANDARD_STATUS_REQUEST(40961),
        STANDARD_STATUS_REPORT(41089),
        EXTENDED_STATUS_REPORT(41090),
        REMOTE_CONTROL_REQUEST(45057),
        REMOTE_CONTROL_ANSWER(45185);

        private final long id;
        ServiceSpecificTypes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ServiceSpecificTypes> byId = new HashMap<Long, ServiceSpecificTypes>(5);
        static {
            for (ServiceSpecificTypes e : ServiceSpecificTypes.values())
                byId.put(e.id(), e);
        }
        public static ServiceSpecificTypes byId(long id) { return byId.get(id); }
    }

    public enum ControlResultTypes {
        SUCCESS(0),
        FAILURE(1);

        private final long id;
        ControlResultTypes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ControlResultTypes> byId = new HashMap<Long, ControlResultTypes>(2);
        static {
            for (ControlResultTypes e : ControlResultTypes.values())
                byId.put(e.id(), e);
        }
        public static ControlResultTypes byId(long id) { return byId.get(id); }
    }

    public TelemetryProtocol(KaitaiStream _io) {
        this(_io, null, null);
    }

    public TelemetryProtocol(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public TelemetryProtocol(KaitaiStream _io, KaitaiStruct _parent, TelemetryProtocol _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.serviceTypeOpcode = ServiceTypes.byId(this._io.readU1());
        this.specificServiceOpcode = this._io.readU1();
        this.messageLength = this._io.readU2be();
        {
            ServiceSpecificTypes on = specificService();
            if (on != null) {
                switch (specificService()) {
                case STANDARD_STATUS_REQUEST: {
                    this.data = new StandardStatusRequest(this._io, this, _root);
                    break;
                }
                case REMOTE_CONTROL_ANSWER: {
                    this.data = new RemoteControlAnswer(this._io, this, _root);
                    break;
                }
                case EXTENDED_STATUS_REPORT: {
                    this.data = new ExtendedStatusReport(this._io, this, _root);
                    break;
                }
                case REMOTE_CONTROL_REQUEST: {
                    this.data = new RemoteControlRequest(this._io, this, _root);
                    break;
                }
                case STANDARD_STATUS_REPORT: {
                    this.data = new StandardStatusReport(this._io, this, _root);
                    break;
                }
                }
            }
        }
    }
    public static class StandardStatusReport extends KaitaiStruct {
        public static StandardStatusReport fromFile(String fileName) throws IOException {
            return new StandardStatusReport(new ByteBufferKaitaiStream(fileName));
        }

        public StandardStatusReport(KaitaiStream _io) {
            this(_io, null, null);
        }

        public StandardStatusReport(KaitaiStream _io, TelemetryProtocol _parent) {
            this(_io, _parent, null);
        }

        public StandardStatusReport(KaitaiStream _io, TelemetryProtocol _parent, TelemetryProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sourceIp = new RadioIp(this._io);
            this.targetIp = new RadioIp(this._io);
            this.pcFlag = TelemetryProtocol.PcFlagTypes.byId(this._io.readU1());
            this.callType = TelemetryProtocol.CallTypes.byId(this._io.readU1());
            this.vioSelect = this._io.readBytes(1);
            this.result = TelemetryProtocol.ResultTypes.byId(this._io.readU1());
        }
        private RadioIp sourceIp;
        private RadioIp targetIp;
        private PcFlagTypes pcFlag;
        private CallTypes callType;
        private byte[] vioSelect;
        private ResultTypes result;
        private TelemetryProtocol _root;
        private TelemetryProtocol _parent;
        public RadioIp sourceIp() { return sourceIp; }
        public RadioIp targetIp() { return targetIp; }
        public PcFlagTypes pcFlag() { return pcFlag; }

        /**
         * answer should be always of type private call for now
         */
        public CallTypes callType() { return callType; }

        /**
         * reserved
         */
        public byte[] vioSelect() { return vioSelect; }
        public ResultTypes result() { return result; }
        public TelemetryProtocol _root() { return _root; }
        public TelemetryProtocol _parent() { return _parent; }
    }
    public static class VioExtendedStatus extends KaitaiStruct {
        public static VioExtendedStatus fromFile(String fileName) throws IOException {
            return new VioExtendedStatus(new ByteBufferKaitaiStream(fileName));
        }

        public VioExtendedStatus(KaitaiStream _io) {
            this(_io, null, null);
        }

        public VioExtendedStatus(KaitaiStream _io, TelemetryProtocol.ExtendedStatusReport _parent) {
            this(_io, _parent, null);
        }

        public VioExtendedStatus(KaitaiStream _io, TelemetryProtocol.ExtendedStatusReport _parent, TelemetryProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.result = TelemetryProtocol.ResultTypes.byId(this._io.readU1());
            this.messageLength = this._io.readU2be();
            this.message = new String(this._io.readBytes(messageLength()), Charset.forName("UTF-16LE"));
        }
        private ResultTypes result;
        private int messageLength;
        private String message;
        private TelemetryProtocol _root;
        private TelemetryProtocol.ExtendedStatusReport _parent;
        public ResultTypes result() { return result; }
        public int messageLength() { return messageLength; }
        public String message() { return message; }
        public TelemetryProtocol _root() { return _root; }
        public TelemetryProtocol.ExtendedStatusReport _parent() { return _parent; }
    }
    public static class RemoteControlAnswer extends KaitaiStruct {
        public static RemoteControlAnswer fromFile(String fileName) throws IOException {
            return new RemoteControlAnswer(new ByteBufferKaitaiStream(fileName));
        }

        public RemoteControlAnswer(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RemoteControlAnswer(KaitaiStream _io, TelemetryProtocol _parent) {
            this(_io, _parent, null);
        }

        public RemoteControlAnswer(KaitaiStream _io, TelemetryProtocol _parent, TelemetryProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sourceIp = new RadioIp(this._io);
            this.targetIp = new RadioIp(this._io);
            this.pcFlag = TelemetryProtocol.PcFlagTypes.byId(this._io.readU1());
            this.callType = TelemetryProtocol.CallTypes.byId(this._io.readU1());
            this.vioSelect = this._io.readBytes(1);
            this.result = TelemetryProtocol.ControlResultTypes.byId(this._io.readU1());
        }
        private RadioIp sourceIp;
        private RadioIp targetIp;
        private PcFlagTypes pcFlag;
        private CallTypes callType;
        private byte[] vioSelect;
        private ControlResultTypes result;
        private TelemetryProtocol _root;
        private TelemetryProtocol _parent;
        public RadioIp sourceIp() { return sourceIp; }
        public RadioIp targetIp() { return targetIp; }
        public PcFlagTypes pcFlag() { return pcFlag; }

        /**
         * answer should be always of type private call for now
         */
        public CallTypes callType() { return callType; }

        /**
         * Bit 0-5 correspond to VIO1-VIO6, 1=selected, 0=not selected, corresponds to request
         */
        public byte[] vioSelect() { return vioSelect; }
        public ControlResultTypes result() { return result; }
        public TelemetryProtocol _root() { return _root; }
        public TelemetryProtocol _parent() { return _parent; }
    }
    public static class RemoteControlRequest extends KaitaiStruct {
        public static RemoteControlRequest fromFile(String fileName) throws IOException {
            return new RemoteControlRequest(new ByteBufferKaitaiStream(fileName));
        }

        public RemoteControlRequest(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RemoteControlRequest(KaitaiStream _io, TelemetryProtocol _parent) {
            this(_io, _parent, null);
        }

        public RemoteControlRequest(KaitaiStream _io, TelemetryProtocol _parent, TelemetryProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sourceIp = new RadioIp(this._io);
            this.targetIp = new RadioIp(this._io);
            this.pcFlag = TelemetryProtocol.PcFlagTypes.byId(this._io.readU1());
            this.callType = TelemetryProtocol.CallTypes.byId(this._io.readU1());
            this.vioSelect = this._io.readBytes(1);
            this.operation = TelemetryProtocol.OperationTypes.byId(this._io.readU1());
        }
        private RadioIp sourceIp;
        private RadioIp targetIp;
        private PcFlagTypes pcFlag;
        private CallTypes callType;
        private byte[] vioSelect;
        private OperationTypes operation;
        private TelemetryProtocol _root;
        private TelemetryProtocol _parent;
        public RadioIp sourceIp() { return sourceIp; }
        public RadioIp targetIp() { return targetIp; }
        public PcFlagTypes pcFlag() { return pcFlag; }

        /**
         * answer should be always of type private call for now
         */
        public CallTypes callType() { return callType; }

        /**
         * Bit 0-5 correspond to VIO1-VIO6, 1=selected, 0=not selected, only one can be selected in request
         */
        public byte[] vioSelect() { return vioSelect; }
        public OperationTypes operation() { return operation; }
        public TelemetryProtocol _root() { return _root; }
        public TelemetryProtocol _parent() { return _parent; }
    }
    public static class ExtendedStatusReport extends KaitaiStruct {
        public static ExtendedStatusReport fromFile(String fileName) throws IOException {
            return new ExtendedStatusReport(new ByteBufferKaitaiStream(fileName));
        }

        public ExtendedStatusReport(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ExtendedStatusReport(KaitaiStream _io, TelemetryProtocol _parent) {
            this(_io, _parent, null);
        }

        public ExtendedStatusReport(KaitaiStream _io, TelemetryProtocol _parent, TelemetryProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sourceIp = new RadioIp(this._io);
            this.targetIp = new RadioIp(this._io);
            this.pcFlag = TelemetryProtocol.PcFlagTypes.byId(this._io.readU1());
            this.callType = TelemetryProtocol.CallTypes.byId(this._io.readU1());
            this.vioSelect = this._io.readBytes(1);
            this.resultMessages = new VioExtendedStatus(this._io, this, _root);
        }
        private RadioIp sourceIp;
        private RadioIp targetIp;
        private PcFlagTypes pcFlag;
        private CallTypes callType;
        private byte[] vioSelect;
        private VioExtendedStatus resultMessages;
        private TelemetryProtocol _root;
        private TelemetryProtocol _parent;
        public RadioIp sourceIp() { return sourceIp; }
        public RadioIp targetIp() { return targetIp; }
        public PcFlagTypes pcFlag() { return pcFlag; }

        /**
         * answer should be always of type private call for now
         */
        public CallTypes callType() { return callType; }

        /**
         * reserved
         */
        public byte[] vioSelect() { return vioSelect; }
        public VioExtendedStatus resultMessages() { return resultMessages; }
        public TelemetryProtocol _root() { return _root; }
        public TelemetryProtocol _parent() { return _parent; }
    }
    public static class StandardStatusRequest extends KaitaiStruct {
        public static StandardStatusRequest fromFile(String fileName) throws IOException {
            return new StandardStatusRequest(new ByteBufferKaitaiStream(fileName));
        }

        public StandardStatusRequest(KaitaiStream _io) {
            this(_io, null, null);
        }

        public StandardStatusRequest(KaitaiStream _io, TelemetryProtocol _parent) {
            this(_io, _parent, null);
        }

        public StandardStatusRequest(KaitaiStream _io, TelemetryProtocol _parent, TelemetryProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sourceIp = new RadioIp(this._io);
            this.targetIp = new RadioIp(this._io);
            this.pcFlag = TelemetryProtocol.PcFlagTypes.byId(this._io.readU1());
            this.callType = TelemetryProtocol.CallTypes.byId(this._io.readU1());
            this.vioSelect = this._io.readBytes(1);
        }
        private RadioIp sourceIp;
        private RadioIp targetIp;
        private PcFlagTypes pcFlag;
        private CallTypes callType;
        private byte[] vioSelect;
        private TelemetryProtocol _root;
        private TelemetryProtocol _parent;
        public RadioIp sourceIp() { return sourceIp; }
        public RadioIp targetIp() { return targetIp; }
        public PcFlagTypes pcFlag() { return pcFlag; }
        public CallTypes callType() { return callType; }

        /**
         * reserved
         */
        public byte[] vioSelect() { return vioSelect; }
        public TelemetryProtocol _root() { return _root; }
        public TelemetryProtocol _parent() { return _parent; }
    }
    private ServiceSpecificTypes specificService;
    public ServiceSpecificTypes specificService() {
        if (this.specificService != null)
            return this.specificService;
        long _pos = this._io.pos();
        this._io.seek(0);
        this.specificService = ServiceSpecificTypes.byId(this._io.readU2be());
        this._io.seek(_pos);
        return this.specificService;
    }
    private ServiceTypes serviceTypeOpcode;
    private int specificServiceOpcode;
    private int messageLength;
    private KaitaiStruct data;
    private TelemetryProtocol _root;
    private KaitaiStruct _parent;
    public ServiceTypes serviceTypeOpcode() { return serviceTypeOpcode; }
    public int specificServiceOpcode() { return specificServiceOpcode; }

    /**
     * length of the message from next field to the end of TP message
     */
    public int messageLength() { return messageLength; }
    public KaitaiStruct data() { return data; }
    public TelemetryProtocol _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
