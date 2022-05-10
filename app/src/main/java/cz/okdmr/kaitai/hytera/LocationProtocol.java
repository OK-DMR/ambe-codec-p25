// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.hytera;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class LocationProtocol extends KaitaiStruct {
    public static LocationProtocol fromFile(String fileName) throws IOException {
        return new LocationProtocol(new ByteBufferKaitaiStream(fileName));
    }

    public enum CmdTypes {
        CANCEL_REQUEST(0),
        START_REQUEST(1);

        private final long id;
        CmdTypes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, CmdTypes> byId = new HashMap<Long, CmdTypes>(2);
        static {
            for (CmdTypes e : CmdTypes.values())
                byId.put(e.id(), e);
        }
        public static CmdTypes byId(long id) { return byId.get(id); }
    }

    public enum LpSpecificTypes {
        STANDARD_REQUEST(40961),
        STANDARD_ANSWER(40962),
        STANDARD_ANSWER_WITH_RSSI(40963),
        STANDARD_ANSWER_GPS_BT(40964),
        EMERGENCY_REPORT_STOP_REQUEST(45057),
        EMERGENCY_REPORT_STOP_ANSWER(45058),
        EMERGENCY_REPORT(45059),
        TRIGGERED_REPORT_REQUEST(49153),
        TRIGGERED_REPORT_ANSWER(49154),
        TRIGGERED_REPORT(49155),
        TRIGGERED_REPORT_STOP_REQUEST(49156),
        TRIGGERED_REPORT_STOP_ANSWER(49157),
        CONDITION_REPORT_REQUEST(53249),
        CONDITION_REPORT_ANSWER(53250),
        CONDITION_REPORT(53251),
        CONDITION_REPORT_WITH_RSSI(53252),
        CONDITION_QUICK_GPS_REQUEST(53265),
        CONDITION_QUICK_GPS_ANSWER(53266);

        private final long id;
        LpSpecificTypes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, LpSpecificTypes> byId = new HashMap<Long, LpSpecificTypes>(18);
        static {
            for (LpSpecificTypes e : LpSpecificTypes.values())
                byId.put(e.id(), e);
        }
        public static LpSpecificTypes byId(long id) { return byId.get(id); }
    }

    public enum LpGeneralTypes {
        STANDARD_LOCATION_IMMEDIATE_SERVICE(160),
        EMERGENCY_LOCATION_REPORTING_SERVICE(176),
        TRIGGERED_LOCATION_REPORTING_SERVICE(192),
        CONDITION_TRIGGERED_REPORTING_SERVICE(208),
        RSSI_REPORT_CONFIGURING_SERVICE(224);

        private final long id;
        LpGeneralTypes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, LpGeneralTypes> byId = new HashMap<Long, LpGeneralTypes>(5);
        static {
            for (LpGeneralTypes e : LpGeneralTypes.values())
                byId.put(e.id(), e);
        }
        public static LpGeneralTypes byId(long id) { return byId.get(id); }
    }

    public enum TriggerTypes {
        CANCEL_REQUEST(0),
        DISTANCE(1),
        TIME(2),
        DISTANCE_AND_TIME(3),
        DISTANCE_OR_TIME(4);

        private final long id;
        TriggerTypes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, TriggerTypes> byId = new HashMap<Long, TriggerTypes>(5);
        static {
            for (TriggerTypes e : TriggerTypes.values())
                byId.put(e.id(), e);
        }
        public static TriggerTypes byId(long id) { return byId.get(id); }
    }

    public enum ResultCodes {
        OK(0),
        POSITION_METHOD_FAILURE(6),
        REQUEST_FORMAT_ERROR(105);

        private final long id;
        ResultCodes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ResultCodes> byId = new HashMap<Long, ResultCodes>(3);
        static {
            for (ResultCodes e : ResultCodes.values())
                byId.put(e.id(), e);
        }
        public static ResultCodes byId(long id) { return byId.get(id); }
    }

    public LocationProtocol(KaitaiStream _io) {
        this(_io, null, null);
    }

    public LocationProtocol(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public LocationProtocol(KaitaiStream _io, KaitaiStruct _parent, LocationProtocol _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.opcodeHeader = LpSpecificTypes.byId(this._io.readU2be());
        this.messageLength = this._io.readU2be();
        {
            LpSpecificTypes on = opcodeHeader();
            if (on != null) {
                switch (opcodeHeader()) {
                case TRIGGERED_REPORT_ANSWER: {
                    this.data = new TriggeredReportAnswer(this._io, this, _root);
                    break;
                }
                case EMERGENCY_REPORT_STOP_REQUEST: {
                    this.data = new EmergencyReportStopRequest(this._io, this, _root);
                    break;
                }
                case CONDITION_QUICK_GPS_REQUEST: {
                    this.data = new ConditionQuickGpsRequest(this._io, this, _root);
                    break;
                }
                case CONDITION_REPORT: {
                    this.data = new ConditionReport(this._io, this, _root);
                    break;
                }
                case EMERGENCY_REPORT_STOP_ANSWER: {
                    this.data = new EmergencyReportStopAnswer(this._io, this, _root);
                    break;
                }
                case CONDITION_REPORT_ANSWER: {
                    this.data = new ConditionReportAnswer(this._io, this, _root);
                    break;
                }
                case STANDARD_ANSWER: {
                    this.data = new StandardAnswer(this._io, this, _root);
                    break;
                }
                case STANDARD_REQUEST: {
                    this.data = new StandardRequest(this._io, this, _root);
                    break;
                }
                case TRIGGERED_REPORT: {
                    this.data = new TriggeredReport(this._io, this, _root);
                    break;
                }
                case TRIGGERED_REPORT_STOP_ANSWER: {
                    this.data = new TriggeredReportStopAnswer(this._io, this, _root);
                    break;
                }
                case STANDARD_ANSWER_WITH_RSSI: {
                    this.data = new StandardAnswerWithRssi(this._io, this, _root);
                    break;
                }
                case CONDITION_REPORT_WITH_RSSI: {
                    this.data = new ConditionReportWithRssi(this._io, this, _root);
                    break;
                }
                case TRIGGERED_REPORT_STOP_REQUEST: {
                    this.data = new TriggeredReportStopRequest(this._io, this, _root);
                    break;
                }
                case EMERGENCY_REPORT: {
                    this.data = new EmergencyReport(this._io, this, _root);
                    break;
                }
                case CONDITION_REPORT_REQUEST: {
                    this.data = new ConditionReportRequest(this._io, this, _root);
                    break;
                }
                case TRIGGERED_REPORT_REQUEST: {
                    this.data = new TriggeredReportRequest(this._io, this, _root);
                    break;
                }
                case CONDITION_QUICK_GPS_ANSWER: {
                    this.data = new ConditionQuickGpsAnswer(this._io, this, _root);
                    break;
                }
                }
            }
        }
    }
    public static class TriggeredReportStopAnswer extends KaitaiStruct {
        public static TriggeredReportStopAnswer fromFile(String fileName) throws IOException {
            return new TriggeredReportStopAnswer(new ByteBufferKaitaiStream(fileName));
        }

        public TriggeredReportStopAnswer(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TriggeredReportStopAnswer(KaitaiStream _io, LocationProtocol _parent) {
            this(_io, _parent, null);
        }

        public TriggeredReportStopAnswer(KaitaiStream _io, LocationProtocol _parent, LocationProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.requestId = this._io.readU4be();
            this.radioIp = new RadioIp(this._io);
            this.result = LocationProtocol.ResultCodes.byId(this._io.readU2be());
        }
        private long requestId;
        private RadioIp radioIp;
        private ResultCodes result;
        private LocationProtocol _root;
        private LocationProtocol _parent;
        public long requestId() { return requestId; }
        public RadioIp radioIp() { return radioIp; }
        public ResultCodes result() { return result; }
        public LocationProtocol _root() { return _root; }
        public LocationProtocol _parent() { return _parent; }
    }
    public static class ConditionReportRequest extends KaitaiStruct {
        public static ConditionReportRequest fromFile(String fileName) throws IOException {
            return new ConditionReportRequest(new ByteBufferKaitaiStream(fileName));
        }

        public ConditionReportRequest(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ConditionReportRequest(KaitaiStream _io, LocationProtocol _parent) {
            this(_io, _parent, null);
        }

        public ConditionReportRequest(KaitaiStream _io, LocationProtocol _parent, LocationProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.requestId = this._io.readU4be();
            this.radioIp = new RadioIp(this._io);
            this.triggerType = this._io.readU1();
            this.distance = this._io.readU4be();
            this.startTime = new Datetimestring(this._io);
            this.stopTime = new Datetimestring(this._io);
            this.interval = new Intervalstring(this._io);
            this.maxInterval = new Intervalstring(this._io);
        }
        private long requestId;
        private RadioIp radioIp;
        private int triggerType;
        private long distance;
        private Datetimestring startTime;
        private Datetimestring stopTime;
        private Intervalstring interval;
        private Intervalstring maxInterval;
        private LocationProtocol _root;
        private LocationProtocol _parent;
        public long requestId() { return requestId; }
        public RadioIp radioIp() { return radioIp; }
        public int triggerType() { return triggerType; }
        public long distance() { return distance; }
        public Datetimestring startTime() { return startTime; }
        public Datetimestring stopTime() { return stopTime; }
        public Intervalstring interval() { return interval; }
        public Intervalstring maxInterval() { return maxInterval; }
        public LocationProtocol _root() { return _root; }
        public LocationProtocol _parent() { return _parent; }
    }
    public static class ConditionQuickGpsRequest extends KaitaiStruct {
        public static ConditionQuickGpsRequest fromFile(String fileName) throws IOException {
            return new ConditionQuickGpsRequest(new ByteBufferKaitaiStream(fileName));
        }

        public ConditionQuickGpsRequest(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ConditionQuickGpsRequest(KaitaiStream _io, LocationProtocol _parent) {
            this(_io, _parent, null);
        }

        public ConditionQuickGpsRequest(KaitaiStream _io, LocationProtocol _parent, LocationProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.requestId = this._io.readU4be();
            this.radioIp = new RadioIp(this._io);
            this.cmdType = LocationProtocol.CmdTypes.byId(this._io.readU1());
            if (cmdType() == LocationProtocol.CmdTypes.START_REQUEST) {
                this.quickGpsPayload = new QuickGpsPayload(this._io, this, _root);
            }
        }
        private long requestId;
        private RadioIp radioIp;
        private CmdTypes cmdType;
        private QuickGpsPayload quickGpsPayload;
        private LocationProtocol _root;
        private LocationProtocol _parent;
        public long requestId() { return requestId; }
        public RadioIp radioIp() { return radioIp; }
        public CmdTypes cmdType() { return cmdType; }
        public QuickGpsPayload quickGpsPayload() { return quickGpsPayload; }
        public LocationProtocol _root() { return _root; }
        public LocationProtocol _parent() { return _parent; }
    }
    public static class ConditionReport extends KaitaiStruct {
        public static ConditionReport fromFile(String fileName) throws IOException {
            return new ConditionReport(new ByteBufferKaitaiStream(fileName));
        }

        public ConditionReport(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ConditionReport(KaitaiStream _io, LocationProtocol _parent) {
            this(_io, _parent, null);
        }

        public ConditionReport(KaitaiStream _io, LocationProtocol _parent, LocationProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.requestId = this._io.readU4be();
            this.radioIp = new RadioIp(this._io);
            this.gpsdata = new Gpsdata(this._io);
        }
        private long requestId;
        private RadioIp radioIp;
        private Gpsdata gpsdata;
        private LocationProtocol _root;
        private LocationProtocol _parent;
        public long requestId() { return requestId; }
        public RadioIp radioIp() { return radioIp; }
        public Gpsdata gpsdata() { return gpsdata; }
        public LocationProtocol _root() { return _root; }
        public LocationProtocol _parent() { return _parent; }
    }
    public static class EmergencyReport extends KaitaiStruct {
        public static EmergencyReport fromFile(String fileName) throws IOException {
            return new EmergencyReport(new ByteBufferKaitaiStream(fileName));
        }

        public EmergencyReport(KaitaiStream _io) {
            this(_io, null, null);
        }

        public EmergencyReport(KaitaiStream _io, LocationProtocol _parent) {
            this(_io, _parent, null);
        }

        public EmergencyReport(KaitaiStream _io, LocationProtocol _parent, LocationProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.radioIp = new RadioIp(this._io);
            this.emergencyType = this._io.readU1();
            this.gpsdata = new Gpsdata(this._io);
        }
        private RadioIp radioIp;
        private int emergencyType;
        private Gpsdata gpsdata;
        private LocationProtocol _root;
        private LocationProtocol _parent;
        public RadioIp radioIp() { return radioIp; }
        public int emergencyType() { return emergencyType; }
        public Gpsdata gpsdata() { return gpsdata; }
        public LocationProtocol _root() { return _root; }
        public LocationProtocol _parent() { return _parent; }
    }
    public static class TriggeredReportAnswer extends KaitaiStruct {
        public static TriggeredReportAnswer fromFile(String fileName) throws IOException {
            return new TriggeredReportAnswer(new ByteBufferKaitaiStream(fileName));
        }

        public TriggeredReportAnswer(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TriggeredReportAnswer(KaitaiStream _io, LocationProtocol _parent) {
            this(_io, _parent, null);
        }

        public TriggeredReportAnswer(KaitaiStream _io, LocationProtocol _parent, LocationProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.requestId = this._io.readU4be();
            this.radioIp = new RadioIp(this._io);
            this.result = LocationProtocol.ResultCodes.byId(this._io.readU2be());
        }
        private long requestId;
        private RadioIp radioIp;
        private ResultCodes result;
        private LocationProtocol _root;
        private LocationProtocol _parent;
        public long requestId() { return requestId; }
        public RadioIp radioIp() { return radioIp; }
        public ResultCodes result() { return result; }
        public LocationProtocol _root() { return _root; }
        public LocationProtocol _parent() { return _parent; }
    }
    public static class StandardAnswerWithRssi extends KaitaiStruct {
        public static StandardAnswerWithRssi fromFile(String fileName) throws IOException {
            return new StandardAnswerWithRssi(new ByteBufferKaitaiStream(fileName));
        }

        public StandardAnswerWithRssi(KaitaiStream _io) {
            this(_io, null, null);
        }

        public StandardAnswerWithRssi(KaitaiStream _io, LocationProtocol _parent) {
            this(_io, _parent, null);
        }

        public StandardAnswerWithRssi(KaitaiStream _io, LocationProtocol _parent, LocationProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.requestId = this._io.readU4be();
            this.radioIp = new RadioIp(this._io);
            this.result = LocationProtocol.ResultCodes.byId(this._io.readU2be());
            this.gpsdata = new Gpsdata(this._io);
            this.rssiValue = this._io.readS2be();
        }
        private long requestId;
        private RadioIp radioIp;
        private ResultCodes result;
        private Gpsdata gpsdata;
        private short rssiValue;
        private LocationProtocol _root;
        private LocationProtocol _parent;
        public long requestId() { return requestId; }
        public RadioIp radioIp() { return radioIp; }
        public ResultCodes result() { return result; }
        public Gpsdata gpsdata() { return gpsdata; }

        /**
         * -240-0
         */
        public short rssiValue() { return rssiValue; }
        public LocationProtocol _root() { return _root; }
        public LocationProtocol _parent() { return _parent; }
    }
    public static class QuickGpsPayload extends KaitaiStruct {
        public static QuickGpsPayload fromFile(String fileName) throws IOException {
            return new QuickGpsPayload(new ByteBufferKaitaiStream(fileName));
        }

        public QuickGpsPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public QuickGpsPayload(KaitaiStream _io, LocationProtocol.ConditionQuickGpsRequest _parent) {
            this(_io, _parent, null);
        }

        public QuickGpsPayload(KaitaiStream _io, LocationProtocol.ConditionQuickGpsRequest _parent, LocationProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.startTime = new Datetimestring(this._io);
            this.stopTime = new Datetimestring(this._io);
            this.interval = new Intervalstring(this._io);
            this.sendStep = this._io.readU2be();
            this.channelUsePercentage = this._io.readU1();
            this.sendOrder = this._io.readU2be();
        }
        private Datetimestring startTime;
        private Datetimestring stopTime;
        private Intervalstring interval;
        private int sendStep;
        private int channelUsePercentage;
        private int sendOrder;
        private LocationProtocol _root;
        private LocationProtocol.ConditionQuickGpsRequest _parent;
        public Datetimestring startTime() { return startTime; }
        public Datetimestring stopTime() { return stopTime; }
        public Intervalstring interval() { return interval; }

        /**
         * milliseconds
         */
        public int sendStep() { return sendStep; }
        public int channelUsePercentage() { return channelUsePercentage; }

        /**
         * sequence number, ie. n-th radio to report position once the interval time is up
         */
        public int sendOrder() { return sendOrder; }
        public LocationProtocol _root() { return _root; }
        public LocationProtocol.ConditionQuickGpsRequest _parent() { return _parent; }
    }
    public static class StandardRequest extends KaitaiStruct {
        public static StandardRequest fromFile(String fileName) throws IOException {
            return new StandardRequest(new ByteBufferKaitaiStream(fileName));
        }

        public StandardRequest(KaitaiStream _io) {
            this(_io, null, null);
        }

        public StandardRequest(KaitaiStream _io, LocationProtocol _parent) {
            this(_io, _parent, null);
        }

        public StandardRequest(KaitaiStream _io, LocationProtocol _parent, LocationProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.requestId = this._io.readU4be();
            this.radioIp = new RadioIp(this._io);
        }
        private long requestId;
        private RadioIp radioIp;
        private LocationProtocol _root;
        private LocationProtocol _parent;
        public long requestId() { return requestId; }
        public RadioIp radioIp() { return radioIp; }
        public LocationProtocol _root() { return _root; }
        public LocationProtocol _parent() { return _parent; }
    }
    public static class TriggeredReportRequest extends KaitaiStruct {
        public static TriggeredReportRequest fromFile(String fileName) throws IOException {
            return new TriggeredReportRequest(new ByteBufferKaitaiStream(fileName));
        }

        public TriggeredReportRequest(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TriggeredReportRequest(KaitaiStream _io, LocationProtocol _parent) {
            this(_io, _parent, null);
        }

        public TriggeredReportRequest(KaitaiStream _io, LocationProtocol _parent, LocationProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.requestId = this._io.readU4be();
            this.radioIp = new RadioIp(this._io);
            this.startTime = new Datetimestring(this._io);
            this.stopTime = new Datetimestring(this._io);
            this.interval = new Intervalstring(this._io);
        }
        private long requestId;
        private RadioIp radioIp;
        private Datetimestring startTime;
        private Datetimestring stopTime;
        private Intervalstring interval;
        private LocationProtocol _root;
        private LocationProtocol _parent;
        public long requestId() { return requestId; }
        public RadioIp radioIp() { return radioIp; }
        public Datetimestring startTime() { return startTime; }
        public Datetimestring stopTime() { return stopTime; }
        public Intervalstring interval() { return interval; }
        public LocationProtocol _root() { return _root; }
        public LocationProtocol _parent() { return _parent; }
    }
    public static class StandardAnswer extends KaitaiStruct {
        public static StandardAnswer fromFile(String fileName) throws IOException {
            return new StandardAnswer(new ByteBufferKaitaiStream(fileName));
        }

        public StandardAnswer(KaitaiStream _io) {
            this(_io, null, null);
        }

        public StandardAnswer(KaitaiStream _io, LocationProtocol _parent) {
            this(_io, _parent, null);
        }

        public StandardAnswer(KaitaiStream _io, LocationProtocol _parent, LocationProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.requestId = this._io.readU4be();
            this.radioIp = new RadioIp(this._io);
            this.result = LocationProtocol.ResultCodes.byId(this._io.readU2be());
            this.gpsdata = new Gpsdata(this._io);
        }
        private long requestId;
        private RadioIp radioIp;
        private ResultCodes result;
        private Gpsdata gpsdata;
        private LocationProtocol _root;
        private LocationProtocol _parent;
        public long requestId() { return requestId; }
        public RadioIp radioIp() { return radioIp; }
        public ResultCodes result() { return result; }
        public Gpsdata gpsdata() { return gpsdata; }
        public LocationProtocol _root() { return _root; }
        public LocationProtocol _parent() { return _parent; }
    }
    public static class ConditionReportAnswer extends KaitaiStruct {
        public static ConditionReportAnswer fromFile(String fileName) throws IOException {
            return new ConditionReportAnswer(new ByteBufferKaitaiStream(fileName));
        }

        public ConditionReportAnswer(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ConditionReportAnswer(KaitaiStream _io, LocationProtocol _parent) {
            this(_io, _parent, null);
        }

        public ConditionReportAnswer(KaitaiStream _io, LocationProtocol _parent, LocationProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.requestId = this._io.readU4be();
            this.radioIp = new RadioIp(this._io);
            this.triggerType = LocationProtocol.TriggerTypes.byId(this._io.readU1());
            this.result = LocationProtocol.ResultCodes.byId(this._io.readU2be());
        }
        private long requestId;
        private RadioIp radioIp;
        private TriggerTypes triggerType;
        private ResultCodes result;
        private LocationProtocol _root;
        private LocationProtocol _parent;
        public long requestId() { return requestId; }
        public RadioIp radioIp() { return radioIp; }
        public TriggerTypes triggerType() { return triggerType; }
        public ResultCodes result() { return result; }
        public LocationProtocol _root() { return _root; }
        public LocationProtocol _parent() { return _parent; }
    }
    public static class EmergencyReportStopRequest extends KaitaiStruct {
        public static EmergencyReportStopRequest fromFile(String fileName) throws IOException {
            return new EmergencyReportStopRequest(new ByteBufferKaitaiStream(fileName));
        }

        public EmergencyReportStopRequest(KaitaiStream _io) {
            this(_io, null, null);
        }

        public EmergencyReportStopRequest(KaitaiStream _io, LocationProtocol _parent) {
            this(_io, _parent, null);
        }

        public EmergencyReportStopRequest(KaitaiStream _io, LocationProtocol _parent, LocationProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.requestId = this._io.readU4be();
            this.radioIp = new RadioIp(this._io);
        }
        private long requestId;
        private RadioIp radioIp;
        private LocationProtocol _root;
        private LocationProtocol _parent;
        public long requestId() { return requestId; }
        public RadioIp radioIp() { return radioIp; }
        public LocationProtocol _root() { return _root; }
        public LocationProtocol _parent() { return _parent; }
    }
    public static class ConditionQuickGpsAnswer extends KaitaiStruct {
        public static ConditionQuickGpsAnswer fromFile(String fileName) throws IOException {
            return new ConditionQuickGpsAnswer(new ByteBufferKaitaiStream(fileName));
        }

        public ConditionQuickGpsAnswer(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ConditionQuickGpsAnswer(KaitaiStream _io, LocationProtocol _parent) {
            this(_io, _parent, null);
        }

        public ConditionQuickGpsAnswer(KaitaiStream _io, LocationProtocol _parent, LocationProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.requestId = this._io.readU4be();
            this.radioIp = new RadioIp(this._io);
            this.cmdType = LocationProtocol.CmdTypes.byId(this._io.readU1());
            this.result = LocationProtocol.ResultCodes.byId(this._io.readU2be());
        }
        private long requestId;
        private RadioIp radioIp;
        private CmdTypes cmdType;
        private ResultCodes result;
        private LocationProtocol _root;
        private LocationProtocol _parent;
        public long requestId() { return requestId; }
        public RadioIp radioIp() { return radioIp; }
        public CmdTypes cmdType() { return cmdType; }
        public ResultCodes result() { return result; }
        public LocationProtocol _root() { return _root; }
        public LocationProtocol _parent() { return _parent; }
    }
    public static class TriggeredReport extends KaitaiStruct {
        public static TriggeredReport fromFile(String fileName) throws IOException {
            return new TriggeredReport(new ByteBufferKaitaiStream(fileName));
        }

        public TriggeredReport(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TriggeredReport(KaitaiStream _io, LocationProtocol _parent) {
            this(_io, _parent, null);
        }

        public TriggeredReport(KaitaiStream _io, LocationProtocol _parent, LocationProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.requestId = this._io.readU4be();
            this.radioIp = new RadioIp(this._io);
            this.timeRemaining = new Intervalstring(this._io);
            this.gpsdata = new Gpsdata(this._io);
        }
        private long requestId;
        private RadioIp radioIp;
        private Intervalstring timeRemaining;
        private Gpsdata gpsdata;
        private LocationProtocol _root;
        private LocationProtocol _parent;
        public long requestId() { return requestId; }
        public RadioIp radioIp() { return radioIp; }
        public Intervalstring timeRemaining() { return timeRemaining; }
        public Gpsdata gpsdata() { return gpsdata; }
        public LocationProtocol _root() { return _root; }
        public LocationProtocol _parent() { return _parent; }
    }
    public static class ConditionReportWithRssi extends KaitaiStruct {
        public static ConditionReportWithRssi fromFile(String fileName) throws IOException {
            return new ConditionReportWithRssi(new ByteBufferKaitaiStream(fileName));
        }

        public ConditionReportWithRssi(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ConditionReportWithRssi(KaitaiStream _io, LocationProtocol _parent) {
            this(_io, _parent, null);
        }

        public ConditionReportWithRssi(KaitaiStream _io, LocationProtocol _parent, LocationProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.requestId = this._io.readU4be();
            this.radioIp = new RadioIp(this._io);
            this.result = LocationProtocol.ResultCodes.byId(this._io.readU2be());
            this.gpsdata = new Gpsdata(this._io);
            this.rssiValue = this._io.readS2be();
        }
        private long requestId;
        private RadioIp radioIp;
        private ResultCodes result;
        private Gpsdata gpsdata;
        private short rssiValue;
        private LocationProtocol _root;
        private LocationProtocol _parent;
        public long requestId() { return requestId; }
        public RadioIp radioIp() { return radioIp; }
        public ResultCodes result() { return result; }
        public Gpsdata gpsdata() { return gpsdata; }

        /**
         * -240-0
         */
        public short rssiValue() { return rssiValue; }
        public LocationProtocol _root() { return _root; }
        public LocationProtocol _parent() { return _parent; }
    }
    public static class EmergencyReportStopAnswer extends KaitaiStruct {
        public static EmergencyReportStopAnswer fromFile(String fileName) throws IOException {
            return new EmergencyReportStopAnswer(new ByteBufferKaitaiStream(fileName));
        }

        public EmergencyReportStopAnswer(KaitaiStream _io) {
            this(_io, null, null);
        }

        public EmergencyReportStopAnswer(KaitaiStream _io, LocationProtocol _parent) {
            this(_io, _parent, null);
        }

        public EmergencyReportStopAnswer(KaitaiStream _io, LocationProtocol _parent, LocationProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.requestId = this._io.readU4be();
            this.radioIp = new RadioIp(this._io);
            this.result = LocationProtocol.ResultCodes.byId(this._io.readU2be());
        }
        private long requestId;
        private RadioIp radioIp;
        private ResultCodes result;
        private LocationProtocol _root;
        private LocationProtocol _parent;
        public long requestId() { return requestId; }
        public RadioIp radioIp() { return radioIp; }
        public ResultCodes result() { return result; }
        public LocationProtocol _root() { return _root; }
        public LocationProtocol _parent() { return _parent; }
    }
    public static class TriggeredReportStopRequest extends KaitaiStruct {
        public static TriggeredReportStopRequest fromFile(String fileName) throws IOException {
            return new TriggeredReportStopRequest(new ByteBufferKaitaiStream(fileName));
        }

        public TriggeredReportStopRequest(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TriggeredReportStopRequest(KaitaiStream _io, LocationProtocol _parent) {
            this(_io, _parent, null);
        }

        public TriggeredReportStopRequest(KaitaiStream _io, LocationProtocol _parent, LocationProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.requestId = this._io.readU4be();
            this.radioIp = new RadioIp(this._io);
        }
        private long requestId;
        private RadioIp radioIp;
        private LocationProtocol _root;
        private LocationProtocol _parent;
        public long requestId() { return requestId; }
        public RadioIp radioIp() { return radioIp; }
        public LocationProtocol _root() { return _root; }
        public LocationProtocol _parent() { return _parent; }
    }
    private LpGeneralTypes opcode;
    public LpGeneralTypes opcode() {
        if (this.opcode != null)
            return this.opcode;
        long _pos = this._io.pos();
        this._io.seek(0);
        this.opcode = LpGeneralTypes.byId(this._io.readU1());
        this._io.seek(_pos);
        return this.opcode;
    }
    private LpSpecificTypes opcodeHeader;
    private int messageLength;
    private KaitaiStruct data;
    private LocationProtocol _root;
    private KaitaiStruct _parent;
    public LpSpecificTypes opcodeHeader() { return opcodeHeader; }

    /**
     * length of the message from next field to the end of LP message
     */
    public int messageLength() { return messageLength; }
    public KaitaiStruct data() { return data; }
    public LocationProtocol _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
