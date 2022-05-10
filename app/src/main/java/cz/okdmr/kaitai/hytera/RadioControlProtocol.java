// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.hytera;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import io.kaitai.struct.KaitaiStruct;

public class RadioControlProtocol extends KaitaiStruct {
    private ServiceTypes serviceType;
    private int messageLength;
    private KaitaiStruct data;
    private RadioControlProtocol _root;
    private KaitaiStruct _parent;

    public RadioControlProtocol(KaitaiStream _io) {
        this(_io, null, null);
    }

    public RadioControlProtocol(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public RadioControlProtocol(KaitaiStream _io, KaitaiStruct _parent, RadioControlProtocol _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }

    public static RadioControlProtocol fromFile(String fileName) throws IOException {
        return new RadioControlProtocol(new ByteBufferKaitaiStream(fileName));
    }

    private void _read() {
        this.serviceType = ServiceTypes.byId(this._io.readU2le());
        this.messageLength = this._io.readU2le();
        {
            ServiceTypes on = serviceType();
            if (on != null) {
                switch (serviceType()) {
                    case CALL_REPLY: {
                        this.data = new CallReply(this._io, this, _root);
                        break;
                    }
                    case RADIO_IDENTIFICATION_REPLY: {
                        this.data = new RadioIdentificationReply(this._io, this, _root);
                        break;
                    }
                    case BROADCAST_STATUS_CONFIGURATION_REQUEST: {
                        this.data = new BroadcastStatusConfigurationRequest(this._io, this, _root);
                        break;
                    }
                    case CALL_REQUEST: {
                        this.data = new CallRequest(this._io, this, _root);
                        break;
                    }
                    case REMOVE_RADIO_REQUEST: {
                        this.data = new RemoveRadioRequest(this._io, this, _root);
                        break;
                    }
                    case BROADCAST_STATUS_CONFIGURATION_REPLY: {
                        this.data = new BroadcastStatusConfigurationReply(this._io, this, _root);
                        break;
                    }
                    case REMOVE_RADIO_REPLY: {
                        this.data = new RemoveRadioReply(this._io, this, _root);
                        break;
                    }
                    default: {
                        this.data = new GenericData(this._io, this, _root);
                        break;
                    }
                }
            } else {
                this.data = new GenericData(this._io, this, _root);
            }
        }
    }

    public ServiceTypes serviceType() {
        return serviceType;
    }

    /**
     * length of the message from next field to the end of RCP message
     */
    public int messageLength() {
        return messageLength;
    }

    public KaitaiStruct data() {
        return data;
    }

    public RadioControlProtocol _root() {
        return _root;
    }

    public KaitaiStruct _parent() {
        return _parent;
    }

    public enum ServiceTypes {
        RADIO_IDENTIFICATION_REQUEST(4),
        BUTTON_AND_KEYBOARD_OPERATION_REQUEST(65),
        INTERNAL_EXTERNAL_MIC_ENABLE_DISABLE_REQUEST(67),
        INTERNAL_EXTERNAL_MIC_GAIN_CHECK_CONTROL_REQUEST(68),
        INTERNAL_EXTERNAL_SPEAKER_ENABLE_DISABLE_REQUEST(69),
        VOLUME_CHECK_CONTROL_REQUEST(70),
        RADIO_CONFIGURE_OVER_AIR_REQUEST(192),
        ZONE_AND_CHANNEL_OPERATION_REQUEST(196),
        RADIO_CONNECT_LOGIN_REQUEST(202),
        RADIO_CONNECT_LOGOUT_REQUEST(203),
        CHANNEL_STATUS_OR_PARAM_CHECK_REQUEST(231),
        FUNCTION_STATUS_CHECK_REQUEST(237),
        FUNCTION_ENABLE_DISABLE_REQUEST(238),
        CHANNEL_ALIAS_REQUEST(305),
        RADIO_MESSAGE_QUERY_REQUEST(513),
        CHANNEL_NUMBER_OF_ZONE_REQUEST(1104),
        UPDATE_AUTHENTICATION_KEY_REQUEST(1105),
        RADIO_ID_AND_RADIO_IP_QUERY_REQUEST(1106),
        RADIO_CHECK(2099),
        REMOTE_MONITOR(2100),
        ALLERT_CALL(2101),
        CALL_REQUEST(2113),
        REMOVE_RADIO_REQUEST(2114),
        DELETE_SUBJECT_LINE_MESSAGE_REQUEST(2118),
        RADIO_DISABLE(2121),
        RADIO_ENABLE(2122),
        RADIO_STATUS_CONFIGURE_REQUEST(4295),
        BROADCAST_STATUS_CONFIGURATION_REQUEST(4297),
        BUTTON_AND_KEYBOARD_OPERATION_REPLY(32833),
        INTERNAL_EXTERNAL_MIC_ENABLE_DISABLE_REPLY(32835),
        INTERNAL_EXTERNAL_MIC_GAIN_CHECK_CONTROL_REPLY(32836),
        INTERNAL_EXTERNAL_SPEAKER_ENABLE_DISABLE_REPLY(32837),
        VOLUME_CHECK_CONTROL_REPLY(32838),
        RADIO_CONFIGURE_OVER_AIR_REPLY(32960),
        ZONE_AND_CHANNEL_OPERATION_REPLY(32964),
        RADIO_STATUS_CONFIGURE_REPLY(32967),
        BROADCAST_STATUS_CONFIGURATION_REPLY(32969),
        RADIO_CONNECT_LOGIN_REPLY(32970),
        RADIO_CONNECT_LOGOUT_REPLY(32971),
        CHANNEL_STATUS_OR_PARAM_CHECK_REPLY(32999),
        FUNCTION_STATUS_CHECK_REPLY(33005),
        FUNCTION_ENABLE_DISABLE_REPLY(33006),
        CHANNEL_ALIAS_REPLY(33073),
        RADIO_MESSAGE_QUERY_REPLY(33281),
        RADIO_IDENTIFICATION_REPLY(33492),
        CHANNEL_NUMBER_OF_ZONE_REPLY(33872),
        UPDATE_AUTHENTICATION_KEY_REPLY(33873),
        RADIO_ID_AND_RADIO_IP_QUERY_REPLY(33874),
        RADIO_CHECK_ACK(34867),
        REMOTE_MONITOR_ACK(34868),
        ALERT_CALL_ACK(34869),
        CALL_REPLY(34881),
        REMOVE_RADIO_REPLY(34882),
        DELETE_SUBJECT_LINE_MESSAGE_REPLY(34886),
        RADIO_DISABLE_ACK(34889),
        RADIO_ENABLE_ACK(34890),
        RADIO_STATUS_REPORT(45256),
        BROADCAST_TRANSMIT_STATUS(47171),
        REPEATER_BROADCAST_TRANSMIT_STATUS(47173),
        BROADCAST_RECEIVE_STATUS(47428);

        private static final Map<Long, ServiceTypes> byId = new HashMap<Long, ServiceTypes>(60);

        static {
            for (ServiceTypes e : ServiceTypes.values())
                byId.put(e.id(), e);
        }

        private final long id;

        ServiceTypes(long id) {
            this.id = id;
        }

        public static ServiceTypes byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    public enum CallTypes {
        PRIVATE_CALL(0),
        GROUP_CALL(1),
        ALL_CALL(2),
        EMERGENCY_GROUP_CALL(3),
        REMOTE_MONITOR_CALL(4),
        RESERVED(5),
        PRIORITY_PRIVATE_CALL(6),
        PRIORITY_GROUP_CALL(7),
        PRIORITY_ALL_CALL(8);

        private static final Map<Long, CallTypes> byId = new HashMap<Long, CallTypes>(9);

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

    public enum ReplyResults {
        SUCCESS(0),
        FAILURE(1);

        private static final Map<Long, ReplyResults> byId = new HashMap<Long, ReplyResults>(2);

        static {
            for (ReplyResults e : ReplyResults.values())
                byId.put(e.id(), e);
        }

        private final long id;

        ReplyResults(long id) {
            this.id = id;
        }

        public static ReplyResults byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    public static class BroadcastStatusConfigurationReply extends KaitaiStruct {
        private ReplyResults result;
        private RadioControlProtocol _root;
        private RadioControlProtocol _parent;

        public BroadcastStatusConfigurationReply(KaitaiStream _io) {
            this(_io, null, null);
        }

        public BroadcastStatusConfigurationReply(KaitaiStream _io, RadioControlProtocol _parent) {
            this(_io, _parent, null);
        }

        public BroadcastStatusConfigurationReply(KaitaiStream _io, RadioControlProtocol _parent, RadioControlProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static BroadcastStatusConfigurationReply fromFile(String fileName) throws IOException {
            return new BroadcastStatusConfigurationReply(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.result = RadioControlProtocol.ReplyResults.byId(this._io.readU1());
        }

        public ReplyResults result() {
            return result;
        }

        public RadioControlProtocol _root() {
            return _root;
        }

        public RadioControlProtocol _parent() {
            return _parent;
        }
    }

    public static class BroadcastConfiguration extends KaitaiStruct {
        private int configOperation;
        private int configTarget;
        private RadioControlProtocol _root;
        private RadioControlProtocol.BroadcastStatusConfigurationRequest _parent;

        public BroadcastConfiguration(KaitaiStream _io) {
            this(_io, null, null);
        }

        public BroadcastConfiguration(KaitaiStream _io, RadioControlProtocol.BroadcastStatusConfigurationRequest _parent) {
            this(_io, _parent, null);
        }
        public BroadcastConfiguration(KaitaiStream _io, RadioControlProtocol.BroadcastStatusConfigurationRequest _parent, RadioControlProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static BroadcastConfiguration fromFile(String fileName) throws IOException {
            return new BroadcastConfiguration(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.configOperation = this._io.readU1();
            this.configTarget = this._io.readU1();
        }

        /**
         * 0x00 => notifications off 0x01 => notifications on
         */
        public int configOperation() {
            return configOperation;
        }

        /**
         * 0x00 => broadcast transmit status, 0x01 => broadcast receive status, 0x02 => repeater broadcast transmit status
         */
        public int configTarget() {
            return configTarget;
        }

        public RadioControlProtocol _root() {
            return _root;
        }

        public RadioControlProtocol.BroadcastStatusConfigurationRequest _parent() {
            return _parent;
        }
    }

    /**
     * This message is used to enable/disable broadcast transmit/receive status reporting to RCP Application.
     */
    public static class BroadcastStatusConfigurationRequest extends KaitaiStruct {
        private int numBroadcastConfiguration;
        private ArrayList<BroadcastConfiguration> broadcastConfiguration;
        private RadioControlProtocol _root;
        private RadioControlProtocol _parent;

        public BroadcastStatusConfigurationRequest(KaitaiStream _io) {
            this(_io, null, null);
        }

        public BroadcastStatusConfigurationRequest(KaitaiStream _io, RadioControlProtocol _parent) {
            this(_io, _parent, null);
        }
        public BroadcastStatusConfigurationRequest(KaitaiStream _io, RadioControlProtocol _parent, RadioControlProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static BroadcastStatusConfigurationRequest fromFile(String fileName) throws IOException {
            return new BroadcastStatusConfigurationRequest(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.numBroadcastConfiguration = this._io.readU1();
            this.broadcastConfiguration = new ArrayList<BroadcastConfiguration>();
            for (int i = 0; i < numBroadcastConfiguration(); i++) {
                this.broadcastConfiguration.add(new BroadcastConfiguration(this._io, this, _root));
            }
        }

        public int numBroadcastConfiguration() {
            return numBroadcastConfiguration;
        }

        public ArrayList<BroadcastConfiguration> broadcastConfiguration() {
            return broadcastConfiguration;
        }

        public RadioControlProtocol _root() {
            return _root;
        }

        public RadioControlProtocol _parent() {
            return _parent;
        }
    }

    public static class RadioIdentificationReply extends KaitaiStruct {
        private byte[] header;
        private String text;
        private byte[] footer;
        private RadioControlProtocol _root;
        private RadioControlProtocol _parent;

        public RadioIdentificationReply(KaitaiStream _io) {
            this(_io, null, null);
        }
        public RadioIdentificationReply(KaitaiStream _io, RadioControlProtocol _parent) {
            this(_io, _parent, null);
        }
        public RadioIdentificationReply(KaitaiStream _io, RadioControlProtocol _parent, RadioControlProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static RadioIdentificationReply fromFile(String fileName) throws IOException {
            return new RadioIdentificationReply(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            if (_parent().messageLength() >= 6) {
                this.header = this._io.readBytes(6);
            }
            if (_parent().messageLength() >= 198) {
                this.text = new String(this._io.readBytes(192), Charset.forName("utf-16-be"));
            }
            if (_parent().messageLength() >= 206) {
                this.footer = this._io.readBytes(8);
            }
        }

        public byte[] header() {
            return header;
        }

        public String text() {
            return text;
        }

        public byte[] footer() {
            return footer;
        }

        public RadioControlProtocol _root() {
            return _root;
        }

        public RadioControlProtocol _parent() {
            return _parent;
        }
    }

    public static class GenericData extends KaitaiStruct {
        private byte[] data;
        private RadioControlProtocol _root;
        private RadioControlProtocol _parent;

        public GenericData(KaitaiStream _io) {
            this(_io, null, null);
        }

        public GenericData(KaitaiStream _io, RadioControlProtocol _parent) {
            this(_io, _parent, null);
        }

        public GenericData(KaitaiStream _io, RadioControlProtocol _parent, RadioControlProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static GenericData fromFile(String fileName) throws IOException {
            return new GenericData(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.data = this._io.readBytes(_parent().messageLength());
        }

        public byte[] data() {
            return data;
        }

        public RadioControlProtocol _root() {
            return _root;
        }

        public RadioControlProtocol _parent() {
            return _parent;
        }
    }

    public static class CallRequest extends KaitaiStruct {
        private CallTypes callType;
        private long targetId;
        private RadioControlProtocol _root;
        private RadioControlProtocol _parent;

        public CallRequest(KaitaiStream _io) {
            this(_io, null, null);
        }

        public CallRequest(KaitaiStream _io, RadioControlProtocol _parent) {
            this(_io, _parent, null);
        }
        public CallRequest(KaitaiStream _io, RadioControlProtocol _parent, RadioControlProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static CallRequest fromFile(String fileName) throws IOException {
            return new CallRequest(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.callType = RadioControlProtocol.CallTypes.byId(this._io.readU1());
            this.targetId = this._io.readU4le();
        }

        public CallTypes callType() {
            return callType;
        }

        /**
         * ignored for all_call
         */
        public long targetId() {
            return targetId;
        }

        public RadioControlProtocol _root() {
            return _root;
        }

        public RadioControlProtocol _parent() {
            return _parent;
        }
    }

    /**
     * Response from Dispatch Station
     */
    public static class RemoveRadioReply extends KaitaiStruct {
        private ReplyResults result;
        private RadioControlProtocol _root;
        private RadioControlProtocol _parent;

        public RemoveRadioReply(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RemoveRadioReply(KaitaiStream _io, RadioControlProtocol _parent) {
            this(_io, _parent, null);
        }

        public RemoveRadioReply(KaitaiStream _io, RadioControlProtocol _parent, RadioControlProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static RemoveRadioReply fromFile(String fileName) throws IOException {
            return new RemoveRadioReply(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.result = RadioControlProtocol.ReplyResults.byId(this._io.readU1());
        }

        public ReplyResults result() {
            return result;
        }

        public RadioControlProtocol _root() {
            return _root;
        }

        public RadioControlProtocol _parent() {
            return _parent;
        }
    }

    /**
     * Remove Radio Request is used by RCP Application to clear the last call target which was set by Call Request.
     * If there is no call target, this request will do nothing.
     */
    public static class RemoveRadioRequest extends KaitaiStruct {
        private RadioControlProtocol _root;
        private RadioControlProtocol _parent;

        public RemoveRadioRequest(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RemoveRadioRequest(KaitaiStream _io, RadioControlProtocol _parent) {
            this(_io, _parent, null);
        }

        public RemoveRadioRequest(KaitaiStream _io, RadioControlProtocol _parent, RadioControlProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static RemoveRadioRequest fromFile(String fileName) throws IOException {
            return new RemoveRadioRequest(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
        }

        public RadioControlProtocol _root() {
            return _root;
        }

        public RadioControlProtocol _parent() {
            return _parent;
        }
    }

    public static class CallReply extends KaitaiStruct {
        private ReplyResults result;
        private RadioControlProtocol _root;
        private RadioControlProtocol _parent;

        public CallReply(KaitaiStream _io) {
            this(_io, null, null);
        }

        public CallReply(KaitaiStream _io, RadioControlProtocol _parent) {
            this(_io, _parent, null);
        }

        public CallReply(KaitaiStream _io, RadioControlProtocol _parent, RadioControlProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static CallReply fromFile(String fileName) throws IOException {
            return new CallReply(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.result = RadioControlProtocol.ReplyResults.byId(this._io.readU1());
        }

        public ReplyResults result() {
            return result;
        }

        public RadioControlProtocol _root() {
            return _root;
        }

        public RadioControlProtocol _parent() {
            return _parent;
        }
    }
}
