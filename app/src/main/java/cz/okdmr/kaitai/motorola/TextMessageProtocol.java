// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.motorola;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.nio.charset.Charset;

public class TextMessageProtocol extends KaitaiStruct {
    public static TextMessageProtocol fromFile(String fileName) throws IOException {
        return new TextMessageProtocol(new ByteBufferKaitaiStream(fileName));
    }

    public enum TmsServiceCapability {
        LIMITED_CAPABILITY(0),
        INTERNAL_CAPABILITY(1),
        EXTERNAL_CAPABILITY(2),
        FULL_CAPABILITY(3);

        private final long id;
        TmsServiceCapability(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, TmsServiceCapability> byId = new HashMap<Long, TmsServiceCapability>(4);
        static {
            for (TmsServiceCapability e : TmsServiceCapability.values())
                byId.put(e.id(), e);
        }
        public static TmsServiceCapability byId(long id) { return byId.get(id); }
    }

    public TextMessageProtocol(KaitaiStream _io) {
        this(_io, null, null);
    }

    public TextMessageProtocol(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public TextMessageProtocol(KaitaiStream _io, KaitaiStruct _parent, TextMessageProtocol _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.messageSize = this._io.readU2be();
        this.messageHeader = new MessageHeaderBits(this._io, this, _root);
        this.lenAddress = this._io.readU1();
        if (lenAddress() > 0) {
            this.address = this._io.readBytes(lenAddress());
        }
        switch (customPduType()) {
        case 48: {
            this.pduContent = new TmsServiceAvailability(this._io, this, _root);
            break;
        }
        case 31: {
            this.pduContent = new TmsAcknowledgement(this._io, this, _root);
            break;
        }
        case 0: {
            this.pduContent = new TextMessage(this._io, this, _root);
            break;
        }
        case 32: {
            this.pduContent = new TextMessage(this._io, this, _root);
            break;
        }
        }
        this.unparsedData = this._io.readBytesFull();
    }

    /**
     * This message is used to send basic text messages.
     */
    public static class TextMessage extends KaitaiStruct {
        public static TextMessage fromFile(String fileName) throws IOException {
            return new TextMessage(new ByteBufferKaitaiStream(fileName));
        }

        public TextMessage(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TextMessage(KaitaiStream _io, TextMessageProtocol _parent) {
            this(_io, _parent, null);
        }

        public TextMessage(KaitaiStream _io, TextMessageProtocol _parent, TextMessageProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            if (_root.messageHeader().extensionBit()) {
                this.textMessageHeaderSequenceAndEncoding = new TextMessageHeaderSequenceAndEncoding(this._io, this, _root);
            }
            this.textMessage = new String(this._io.readBytesFull(), Charset.forName("utf-16-le"));
        }
        private TextMessageHeaderSequenceAndEncoding textMessageHeaderSequenceAndEncoding;
        private String textMessage;
        private TextMessageProtocol _root;
        private TextMessageProtocol _parent;
        public TextMessageHeaderSequenceAndEncoding textMessageHeaderSequenceAndEncoding() { return textMessageHeaderSequenceAndEncoding; }

        /**
         * might include CR (0x0D00) and/or LF (0x0A00) if "message subject" is sent, then it's format is <subject><cr><lf><text>
         */
        public String textMessage() { return textMessage; }
        public TextMessageProtocol _root() { return _root; }
        public TextMessageProtocol _parent() { return _parent; }
    }

    /**
     * This message is used to announce Text Messaging Service availability on the system by the TMS Server
     */
    public static class TmsServiceAvailability extends KaitaiStruct {
        public static TmsServiceAvailability fromFile(String fileName) throws IOException {
            return new TmsServiceAvailability(new ByteBufferKaitaiStream(fileName));
        }

        public TmsServiceAvailability(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TmsServiceAvailability(KaitaiStream _io, TextMessageProtocol _parent) {
            this(_io, _parent, null);
        }

        public TmsServiceAvailability(KaitaiStream _io, TextMessageProtocol _parent, TextMessageProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            if (_root.messageHeader().extensionBit()) {
                this.header = new TmsServiceAvailabilityHeader(this._io, this, _root);
            }
        }
        private TmsServiceAvailabilityHeader header;
        private TextMessageProtocol _root;
        private TextMessageProtocol _parent;
        public TmsServiceAvailabilityHeader header() { return header; }
        public TextMessageProtocol _root() { return _root; }
        public TextMessageProtocol _parent() { return _parent; }
    }
    public static class TextMessageHeaderSequenceAndEncoding extends KaitaiStruct {
        public static TextMessageHeaderSequenceAndEncoding fromFile(String fileName) throws IOException {
            return new TextMessageHeaderSequenceAndEncoding(new ByteBufferKaitaiStream(fileName));
        }

        public TextMessageHeaderSequenceAndEncoding(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TextMessageHeaderSequenceAndEncoding(KaitaiStream _io, TextMessageProtocol.TextMessage _parent) {
            this(_io, _parent, null);
        }

        public TextMessageHeaderSequenceAndEncoding(KaitaiStream _io, TextMessageProtocol.TextMessage _parent, TextMessageProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.hasEncodingHeader = this._io.readBitsIntBe(1) != 0;
            this.reserved1 = this._io.readBitsIntBe(2);
            this.sequenceNumberLsbBits = this._io.readBitsIntBe(5);
            if (hasEncodingHeader()) {
                this.headerEncodingExtension = this._io.readBitsIntBe(1) != 0;
            }
            if (hasEncodingHeader()) {
                this.sequenceNumberMsbBits = this._io.readBitsIntBe(2);
            }
            this.encoding = this._io.readBitsIntBe(5);
        }
        private Integer sequenceNumber;
        public Integer sequenceNumber() {
            if (this.sequenceNumber != null)
                return this.sequenceNumber;
            int _tmp = (int) (((sequenceNumberMsbBits() << 4) + sequenceNumberLsbBits()));
            this.sequenceNumber = _tmp;
            return this.sequenceNumber;
        }
        private boolean hasEncodingHeader;
        private long reserved1;
        private long sequenceNumberLsbBits;
        private Boolean headerEncodingExtension;
        private Long sequenceNumberMsbBits;
        private long encoding;
        private TextMessageProtocol _root;
        private TextMessageProtocol.TextMessage _parent;
        public boolean hasEncodingHeader() { return hasEncodingHeader; }
        public long reserved1() { return reserved1; }
        public long sequenceNumberLsbBits() { return sequenceNumberLsbBits; }
        public Boolean headerEncodingExtension() { return headerEncodingExtension; }
        public Long sequenceNumberMsbBits() { return sequenceNumberMsbBits; }

        /**
         * expected 0x04, only supported, UCS2-LE encoding
         */
        public long encoding() { return encoding; }
        public TextMessageProtocol _root() { return _root; }
        public TextMessageProtocol.TextMessage _parent() { return _parent; }
    }
    public static class MessageHeaderBits extends KaitaiStruct {
        public static MessageHeaderBits fromFile(String fileName) throws IOException {
            return new MessageHeaderBits(new ByteBufferKaitaiStream(fileName));
        }

        public MessageHeaderBits(KaitaiStream _io) {
            this(_io, null, null);
        }

        public MessageHeaderBits(KaitaiStream _io, TextMessageProtocol _parent) {
            this(_io, _parent, null);
        }

        public MessageHeaderBits(KaitaiStream _io, TextMessageProtocol _parent, TextMessageProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.extensionBit = this._io.readBitsIntBe(1) != 0;
            this.acknowledgementRequired = this._io.readBitsIntBe(1) != 0;
            this.reserved = this._io.readBitsIntBe(1) != 0;
            this.controlUserBit = this._io.readBitsIntBe(1) != 0;
            this.pduType = this._io.readBitsIntBe(4);
        }
        private boolean extensionBit;
        private boolean acknowledgementRequired;
        private boolean reserved;
        private boolean controlUserBit;
        private long pduType;
        private TextMessageProtocol _root;
        private TextMessageProtocol _parent;

        /**
         * optional headers follow if this indicator is set
         */
        public boolean extensionBit() { return extensionBit; }

        /**
         * if this PDU is request, this indicates requirement of "ACK response", if this PDU is response it indicates successfull "ACK response" (0 means failure)
         */
        public boolean acknowledgementRequired() { return acknowledgementRequired; }

        /**
         * unused/reserved
         */
        public boolean reserved() { return reserved; }

        /**
         * 1 => this is control pdu message, 0 => this is user pdu message
         */
        public boolean controlUserBit() { return controlUserBit; }

        /**
         * depends on control_user_bit to distinguish pdu class
         */
        public long pduType() { return pduType; }
        public TextMessageProtocol _root() { return _root; }
        public TextMessageProtocol _parent() { return _parent; }
    }

    /**
     * This message is used to positively acknowledge a text message.
     */
    public static class TmsAcknowledgement extends KaitaiStruct {
        public static TmsAcknowledgement fromFile(String fileName) throws IOException {
            return new TmsAcknowledgement(new ByteBufferKaitaiStream(fileName));
        }

        public TmsAcknowledgement(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TmsAcknowledgement(KaitaiStream _io, TextMessageProtocol _parent) {
            this(_io, _parent, null);
        }

        public TmsAcknowledgement(KaitaiStream _io, TextMessageProtocol _parent, TextMessageProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            if (_root.messageHeader().extensionBit()) {
                this.tmsAcknowledgementHeaderSequenceNumber = new TmsAcknowledgementHeaderSequenceNumber(this._io, this, _root);
            }
        }
        private TmsAcknowledgementHeaderSequenceNumber tmsAcknowledgementHeaderSequenceNumber;
        private TextMessageProtocol _root;
        private TextMessageProtocol _parent;
        public TmsAcknowledgementHeaderSequenceNumber tmsAcknowledgementHeaderSequenceNumber() { return tmsAcknowledgementHeaderSequenceNumber; }
        public TextMessageProtocol _root() { return _root; }
        public TextMessageProtocol _parent() { return _parent; }
    }

    /**
     * contains optionally both header bytes (lsb and msb if overflow is needed/occurred)
     */
    public static class TmsAcknowledgementHeaderSequenceNumber extends KaitaiStruct {
        public static TmsAcknowledgementHeaderSequenceNumber fromFile(String fileName) throws IOException {
            return new TmsAcknowledgementHeaderSequenceNumber(new ByteBufferKaitaiStream(fileName));
        }

        public TmsAcknowledgementHeaderSequenceNumber(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TmsAcknowledgementHeaderSequenceNumber(KaitaiStream _io, TextMessageProtocol.TmsAcknowledgement _parent) {
            this(_io, _parent, null);
        }

        public TmsAcknowledgementHeaderSequenceNumber(KaitaiStream _io, TextMessageProtocol.TmsAcknowledgement _parent, TextMessageProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.hasMsbHeader = this._io.readBitsIntBe(1) != 0;
            this.headerLsbReserved = this._io.readBitsIntBe(2);
            this.headerLsbBits = this._io.readBitsIntBe(5);
            if (hasMsbHeader()) {
                this.headerMsbExtension = this._io.readBitsIntBe(1) != 0;
            }
            if (hasMsbHeader()) {
                this.headerMsbBits = this._io.readBitsIntBe(2);
            }
            if (hasMsbHeader()) {
                this.headerMsbReserved = this._io.readBitsIntBe(5);
            }
        }
        private Integer sequenceNumber;
        public Integer sequenceNumber() {
            if (this.sequenceNumber != null)
                return this.sequenceNumber;
            int _tmp = (int) (((headerMsbBits() << 4) + headerLsbBits()));
            this.sequenceNumber = _tmp;
            return this.sequenceNumber;
        }
        private boolean hasMsbHeader;
        private long headerLsbReserved;
        private long headerLsbBits;
        private Boolean headerMsbExtension;
        private Long headerMsbBits;
        private Long headerMsbReserved;
        private TextMessageProtocol _root;
        private TextMessageProtocol.TmsAcknowledgement _parent;
        public boolean hasMsbHeader() { return hasMsbHeader; }
        public long headerLsbReserved() { return headerLsbReserved; }
        public long headerLsbBits() { return headerLsbBits; }
        public Boolean headerMsbExtension() { return headerMsbExtension; }
        public Long headerMsbBits() { return headerMsbBits; }
        public Long headerMsbReserved() { return headerMsbReserved; }
        public TextMessageProtocol _root() { return _root; }
        public TextMessageProtocol.TmsAcknowledgement _parent() { return _parent; }
    }

    /**
     * This message is used to positively acknowledge a service availability message (no headers or payload)
     * Same as tms_acknowledgement, only in ack to tms_service_availability announcement no "sequence number" is expected
     */
    public static class TmsServiceAvailabilityAcknowledgement extends KaitaiStruct {
        public static TmsServiceAvailabilityAcknowledgement fromFile(String fileName) throws IOException {
            return new TmsServiceAvailabilityAcknowledgement(new ByteBufferKaitaiStream(fileName));
        }

        public TmsServiceAvailabilityAcknowledgement(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TmsServiceAvailabilityAcknowledgement(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public TmsServiceAvailabilityAcknowledgement(KaitaiStream _io, KaitaiStruct _parent, TextMessageProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
        }
        private TextMessageProtocol _root;
        private KaitaiStruct _parent;
        public TextMessageProtocol _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class TmsServiceAvailabilityHeader extends KaitaiStruct {
        public static TmsServiceAvailabilityHeader fromFile(String fileName) throws IOException {
            return new TmsServiceAvailabilityHeader(new ByteBufferKaitaiStream(fileName));
        }

        public TmsServiceAvailabilityHeader(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TmsServiceAvailabilityHeader(KaitaiStream _io, TextMessageProtocol.TmsServiceAvailability _parent) {
            this(_io, _parent, null);
        }

        public TmsServiceAvailabilityHeader(KaitaiStream _io, TextMessageProtocol.TmsServiceAvailability _parent, TextMessageProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.extensionBit = this._io.readBitsIntBe(1) != 0;
            this.reserved = this._io.readBitsIntBe(4);
            this.device = TextMessageProtocol.TmsServiceCapability.byId(this._io.readBitsIntBe(3));
        }
        private boolean extensionBit;
        private long reserved;
        private TmsServiceCapability device;
        private TextMessageProtocol _root;
        private TextMessageProtocol.TmsServiceAvailability _parent;

        /**
         * should be 0
         */
        public boolean extensionBit() { return extensionBit; }
        public long reserved() { return reserved; }
        public TmsServiceCapability device() { return device; }
        public TextMessageProtocol _root() { return _root; }
        public TextMessageProtocol.TmsServiceAvailability _parent() { return _parent; }
    }
    private Integer customPduType;

    /**
     * special enumerable pdu type (ack-type + control-or-user + pdu-type-id)
     */
    public Integer customPduType() {
        if (this.customPduType != null)
            return this.customPduType;
        int _tmp = (int) (((((_root.messageHeader().acknowledgementRequired() ? 1 : 0) << 5) + ((_root.messageHeader().controlUserBit() ? 1 : 0) << 4)) + _root.messageHeader().pduType()));
        this.customPduType = _tmp;
        return this.customPduType;
    }
    private int messageSize;
    private MessageHeaderBits messageHeader;
    private int lenAddress;
    private byte[] address;
    private KaitaiStruct pduContent;
    private byte[] unparsedData;
    private TextMessageProtocol _root;
    private KaitaiStruct _parent;

    /**
     * number of bytes to follow, always big endian
     */
    public int messageSize() { return messageSize; }
    public MessageHeaderBits messageHeader() { return messageHeader; }
    public int lenAddress() { return lenAddress; }

    /**
     * variable address field (might be string, int, ip, radio id, ...)
     */
    public byte[] address() { return address; }
    public KaitaiStruct pduContent() { return pduContent; }
    public byte[] unparsedData() { return unparsedData; }
    public TextMessageProtocol _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
