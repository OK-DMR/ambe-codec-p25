// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.motorola;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class AutomaticRegistrationService extends KaitaiStruct {
    public static AutomaticRegistrationService fromFile(String fileName) throws IOException {
        return new AutomaticRegistrationService(new ByteBufferKaitaiStream(fileName));
    }

    public enum RegistrationEvents {
        INITIAL_EVENT(1),
        REFRESH_EVENT(2);

        private final long id;
        RegistrationEvents(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, RegistrationEvents> byId = new HashMap<Long, RegistrationEvents>(2);
        static {
            for (RegistrationEvents e : RegistrationEvents.values())
                byId.put(e.id(), e);
        }
        public static RegistrationEvents byId(long id) { return byId.get(id); }
    }

    public enum FailureReasons {
        DEVICE_NOT_AUTHORIZED(0);

        private final long id;
        FailureReasons(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, FailureReasons> byId = new HashMap<Long, FailureReasons>(1);
        static {
            for (FailureReasons e : FailureReasons.values())
                byId.put(e.id(), e);
        }
        public static FailureReasons byId(long id) { return byId.get(id); }
    }

    public AutomaticRegistrationService(KaitaiStream _io) {
        this(_io, null, null);
    }

    public AutomaticRegistrationService(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public AutomaticRegistrationService(KaitaiStream _io, KaitaiStruct _parent, AutomaticRegistrationService _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.messageSize = this._io.readU2le();
        this.messageHeader = new MessageHeaderBits(this._io, this, _root);
        switch (messageHeader().pduType()) {
        case 0: {
            this.pduContent = new DeviceRegistrationMessage(this._io, this, _root);
            break;
        }
        case 1: {
            this.pduContent = new DeviceDeregistrationMessage(this._io, this, _root);
            break;
        }
        case 4: {
            this.pduContent = new ArsQueryMessage(this._io, this, _root);
            break;
        }
        case 15: {
            this.pduContent = new AcknowledgementMessage(this._io, this, _root);
            break;
        }
        }
        this.unparsedData = this._io.readBytesFull();
    }

    /**
     * sent by ARS service to device as a response to device_registration_message
     * sent by subscriber as a response to ars_query_message
     */
    public static class AcknowledgementMessage extends KaitaiStruct {
        public static AcknowledgementMessage fromFile(String fileName) throws IOException {
            return new AcknowledgementMessage(new ByteBufferKaitaiStream(fileName));
        }

        public AcknowledgementMessage(KaitaiStream _io) {
            this(_io, null, null);
        }

        public AcknowledgementMessage(KaitaiStream _io, AutomaticRegistrationService _parent) {
            this(_io, _parent, null);
        }

        public AcknowledgementMessage(KaitaiStream _io, AutomaticRegistrationService _parent, AutomaticRegistrationService _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            if ( ((_root.messageHeader().extensionBit()) && (_root.messageHeader().acknowledgementBit())) ) {
                this.deviceRegistrationAcknowledgementHeader = new DeviceRegistrationAcknowledgementHeader(this._io, this, _root);
            }
            if ( ((_root.messageHeader().extensionBit()) && (!(_root.messageHeader().acknowledgementBit()))) ) {
                this.deviceRegistrationAcknowledgementFailureReason = new DeviceRegistrationAcknowledgementFailureReason(this._io, this, _root);
            }
        }
        private DeviceRegistrationAcknowledgementHeader deviceRegistrationAcknowledgementHeader;
        private DeviceRegistrationAcknowledgementFailureReason deviceRegistrationAcknowledgementFailureReason;
        private AutomaticRegistrationService _root;
        private AutomaticRegistrationService _parent;
        public DeviceRegistrationAcknowledgementHeader deviceRegistrationAcknowledgementHeader() { return deviceRegistrationAcknowledgementHeader; }
        public DeviceRegistrationAcknowledgementFailureReason deviceRegistrationAcknowledgementFailureReason() { return deviceRegistrationAcknowledgementFailureReason; }
        public AutomaticRegistrationService _root() { return _root; }
        public AutomaticRegistrationService _parent() { return _parent; }
    }
    public static class DeviceRegistrationMessageHeader extends KaitaiStruct {
        public static DeviceRegistrationMessageHeader fromFile(String fileName) throws IOException {
            return new DeviceRegistrationMessageHeader(new ByteBufferKaitaiStream(fileName));
        }

        public DeviceRegistrationMessageHeader(KaitaiStream _io) {
            this(_io, null, null);
        }

        public DeviceRegistrationMessageHeader(KaitaiStream _io, AutomaticRegistrationService.DeviceRegistrationMessage _parent) {
            this(_io, _parent, null);
        }

        public DeviceRegistrationMessageHeader(KaitaiStream _io, AutomaticRegistrationService.DeviceRegistrationMessage _parent, AutomaticRegistrationService _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.extensionBit = this._io.readBitsIntBe(1) != 0;
            this.event = AutomaticRegistrationService.RegistrationEvents.byId(this._io.readBitsIntBe(2));
            this.encoding = this._io.readBitsIntBe(5);
        }
        private boolean extensionBit;
        private RegistrationEvents event;
        private long encoding;
        private AutomaticRegistrationService _root;
        private AutomaticRegistrationService.DeviceRegistrationMessage _parent;

        /**
         * expected 0
         */
        public boolean extensionBit() { return extensionBit; }
        public RegistrationEvents event() { return event; }

        /**
         * expect 0x00 meaning UTF8 encoding of registration message fields
         */
        public long encoding() { return encoding; }
        public AutomaticRegistrationService _root() { return _root; }
        public AutomaticRegistrationService.DeviceRegistrationMessage _parent() { return _parent; }
    }
    public static class MessageHeaderBits extends KaitaiStruct {
        public static MessageHeaderBits fromFile(String fileName) throws IOException {
            return new MessageHeaderBits(new ByteBufferKaitaiStream(fileName));
        }

        public MessageHeaderBits(KaitaiStream _io) {
            this(_io, null, null);
        }

        public MessageHeaderBits(KaitaiStream _io, AutomaticRegistrationService _parent) {
            this(_io, _parent, null);
        }

        public MessageHeaderBits(KaitaiStream _io, AutomaticRegistrationService _parent, AutomaticRegistrationService _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.extensionBit = this._io.readBitsIntBe(1) != 0;
            this.acknowledgementBit = this._io.readBitsIntBe(1) != 0;
            this.priority = this._io.readBitsIntBe(1) != 0;
            this.controlUserBit = this._io.readBitsIntBe(1) != 0;
            this.pduType = this._io.readBitsIntBe(4);
        }
        private boolean extensionBit;
        private boolean acknowledgementBit;
        private boolean priority;
        private boolean controlUserBit;
        private long pduType;
        private AutomaticRegistrationService _root;
        private AutomaticRegistrationService _parent;

        /**
         * optional headers follow if this indicator is set
         */
        public boolean extensionBit() { return extensionBit; }

        /**
         * if this PDU is request, this indicates requirement of "ACK response", if this PDU is response it indicates successfull "ACK response" (0 means failure)
         */
        public boolean acknowledgementBit() { return acknowledgementBit; }

        /**
         * 1 is high priority, 0 is normal priority, in general all control PDUs are set as priority
         */
        public boolean priority() { return priority; }

        /**
         * 1 => this is control pdu message, 0 => this is user pdu message
         */
        public boolean controlUserBit() { return controlUserBit; }

        /**
         * depends on control_user_bit to distinguish pdu class
         */
        public long pduType() { return pduType; }
        public AutomaticRegistrationService _root() { return _root; }
        public AutomaticRegistrationService _parent() { return _parent; }
    }

    /**
     * sent by device in case of deregistration, does not require ACK response
     */
    public static class DeviceDeregistrationMessage extends KaitaiStruct {
        public static DeviceDeregistrationMessage fromFile(String fileName) throws IOException {
            return new DeviceDeregistrationMessage(new ByteBufferKaitaiStream(fileName));
        }

        public DeviceDeregistrationMessage(KaitaiStream _io) {
            this(_io, null, null);
        }

        public DeviceDeregistrationMessage(KaitaiStream _io, AutomaticRegistrationService _parent) {
            this(_io, _parent, null);
        }

        public DeviceDeregistrationMessage(KaitaiStream _io, AutomaticRegistrationService _parent, AutomaticRegistrationService _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
        }
        private AutomaticRegistrationService _root;
        private AutomaticRegistrationService _parent;
        public AutomaticRegistrationService _root() { return _root; }
        public AutomaticRegistrationService _parent() { return _parent; }
    }

    /**
     * part of failure/unsuccessfull ACK response
     */
    public static class DeviceRegistrationAcknowledgementFailureReason extends KaitaiStruct {
        public static DeviceRegistrationAcknowledgementFailureReason fromFile(String fileName) throws IOException {
            return new DeviceRegistrationAcknowledgementFailureReason(new ByteBufferKaitaiStream(fileName));
        }

        public DeviceRegistrationAcknowledgementFailureReason(KaitaiStream _io) {
            this(_io, null, null);
        }

        public DeviceRegistrationAcknowledgementFailureReason(KaitaiStream _io, AutomaticRegistrationService.AcknowledgementMessage _parent) {
            this(_io, _parent, null);
        }

        public DeviceRegistrationAcknowledgementFailureReason(KaitaiStream _io, AutomaticRegistrationService.AcknowledgementMessage _parent, AutomaticRegistrationService _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.extensionBit = this._io.readBitsIntBe(1) != 0;
            this.failureReason = AutomaticRegistrationService.FailureReasons.byId(this._io.readBitsIntBe(7));
        }
        private boolean extensionBit;
        private FailureReasons failureReason;
        private AutomaticRegistrationService _root;
        private AutomaticRegistrationService.AcknowledgementMessage _parent;

        /**
         * expect 0
         */
        public boolean extensionBit() { return extensionBit; }
        public FailureReasons failureReason() { return failureReason; }
        public AutomaticRegistrationService _root() { return _root; }
        public AutomaticRegistrationService.AcknowledgementMessage _parent() { return _parent; }
    }

    /**
     * sent by device to ARS service
     */
    public static class DeviceRegistrationMessage extends KaitaiStruct {
        public static DeviceRegistrationMessage fromFile(String fileName) throws IOException {
            return new DeviceRegistrationMessage(new ByteBufferKaitaiStream(fileName));
        }

        public DeviceRegistrationMessage(KaitaiStream _io) {
            this(_io, null, null);
        }

        public DeviceRegistrationMessage(KaitaiStream _io, AutomaticRegistrationService _parent) {
            this(_io, _parent, null);
        }

        public DeviceRegistrationMessage(KaitaiStream _io, AutomaticRegistrationService _parent, AutomaticRegistrationService _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            if (_root.messageHeader().extensionBit()) {
                this.deviceRegistrationMessageHeader = new DeviceRegistrationMessageHeader(this._io, this, _root);
            }
            this.lenDeviceIdentifier = this._io.readU1();
            if (lenDeviceIdentifier() > 0) {
                this.deviceIdentifier = this._io.readBytes(lenDeviceIdentifier());
            }
            this.lenUserIdentifier = this._io.readU1();
            if (lenUserIdentifier() > 0) {
                this.userIdentifier = this._io.readBytes(lenUserIdentifier());
            }
            this.lenPassword = this._io.readU1();
            if (lenPassword() > 0) {
                this.password = this._io.readBytes(lenPassword());
            }
        }
        private DeviceRegistrationMessageHeader deviceRegistrationMessageHeader;
        private int lenDeviceIdentifier;
        private byte[] deviceIdentifier;
        private int lenUserIdentifier;
        private byte[] userIdentifier;
        private int lenPassword;
        private byte[] password;
        private AutomaticRegistrationService _root;
        private AutomaticRegistrationService _parent;
        public DeviceRegistrationMessageHeader deviceRegistrationMessageHeader() { return deviceRegistrationMessageHeader; }
        public int lenDeviceIdentifier() { return lenDeviceIdentifier; }
        public byte[] deviceIdentifier() { return deviceIdentifier; }
        public int lenUserIdentifier() { return lenUserIdentifier; }
        public byte[] userIdentifier() { return userIdentifier; }
        public int lenPassword() { return lenPassword; }
        public byte[] password() { return password; }
        public AutomaticRegistrationService _root() { return _root; }
        public AutomaticRegistrationService _parent() { return _parent; }
    }

    /**
     * sent by service to device/subscriber to check if the user is registered with ARS
     */
    public static class ArsQueryMessage extends KaitaiStruct {
        public static ArsQueryMessage fromFile(String fileName) throws IOException {
            return new ArsQueryMessage(new ByteBufferKaitaiStream(fileName));
        }

        public ArsQueryMessage(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ArsQueryMessage(KaitaiStream _io, AutomaticRegistrationService _parent) {
            this(_io, _parent, null);
        }

        public ArsQueryMessage(KaitaiStream _io, AutomaticRegistrationService _parent, AutomaticRegistrationService _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
        }
        private AutomaticRegistrationService _root;
        private AutomaticRegistrationService _parent;
        public AutomaticRegistrationService _root() { return _root; }
        public AutomaticRegistrationService _parent() { return _parent; }
    }

    /**
     * part of successfull ACK response
     */
    public static class DeviceRegistrationAcknowledgementHeader extends KaitaiStruct {
        public static DeviceRegistrationAcknowledgementHeader fromFile(String fileName) throws IOException {
            return new DeviceRegistrationAcknowledgementHeader(new ByteBufferKaitaiStream(fileName));
        }

        public DeviceRegistrationAcknowledgementHeader(KaitaiStream _io) {
            this(_io, null, null);
        }

        public DeviceRegistrationAcknowledgementHeader(KaitaiStream _io, AutomaticRegistrationService.AcknowledgementMessage _parent) {
            this(_io, _parent, null);
        }

        public DeviceRegistrationAcknowledgementHeader(KaitaiStream _io, AutomaticRegistrationService.AcknowledgementMessage _parent, AutomaticRegistrationService _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.extensionBit = this._io.readBitsIntBe(1) != 0;
            this.refreshTime = this._io.readBitsIntBe(7);
        }
        private boolean extensionBit;
        private long refreshTime;
        private AutomaticRegistrationService _root;
        private AutomaticRegistrationService.AcknowledgementMessage _parent;

        /**
         * expect 0
         */
        public boolean extensionBit() { return extensionBit; }

        /**
         * 0 = no refresh required, 1 = 30 minutes, 2 = 60 minutes, ..., 127 = 3810 minutes (approx. 2.645 days)
         */
        public long refreshTime() { return refreshTime; }
        public AutomaticRegistrationService _root() { return _root; }
        public AutomaticRegistrationService.AcknowledgementMessage _parent() { return _parent; }
    }
    private int messageSize;
    private MessageHeaderBits messageHeader;
    private KaitaiStruct pduContent;
    private byte[] unparsedData;
    private AutomaticRegistrationService _root;
    private KaitaiStruct _parent;

    /**
     * number of bytes to follow after this field
     */
    public int messageSize() { return messageSize; }
    public MessageHeaderBits messageHeader() { return messageHeader; }
    public KaitaiStruct pduContent() { return pduContent; }
    public byte[] unparsedData() { return unparsedData; }
    public AutomaticRegistrationService _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
