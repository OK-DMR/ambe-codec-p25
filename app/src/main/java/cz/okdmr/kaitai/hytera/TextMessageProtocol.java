// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.hytera;

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

    public enum AckFlags {
        ACK_REQUIRED(0),
        ACK_NOT_REQUIRED(1);

        private final long id;
        AckFlags(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, AckFlags> byId = new HashMap<Long, AckFlags>(2);
        static {
            for (AckFlags e : AckFlags.values())
                byId.put(e.id(), e);
        }
        public static AckFlags byId(long id) { return byId.get(id); }
    }

    public enum OptionFlags {
        OPTION_LEN_AND_FIELD_DISABLED(0),
        OPTION_LEN_AND_FIELD_ENABLED(1);

        private final long id;
        OptionFlags(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, OptionFlags> byId = new HashMap<Long, OptionFlags>(2);
        static {
            for (OptionFlags e : OptionFlags.values())
                byId.put(e.id(), e);
        }
        public static OptionFlags byId(long id) { return byId.get(id); }
    }

    public enum ServiceTypes {
        SEND_PRIVATE_MESSAGE(161),
        SEND_PRIVATE_MESSAGE_ACK(162),
        SEND_GROUP_MESSAGE(177),
        SEND_GROUP_MESSAGE_ACK(178);

        private final long id;
        ServiceTypes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ServiceTypes> byId = new HashMap<Long, ServiceTypes>(4);
        static {
            for (ServiceTypes e : ServiceTypes.values())
                byId.put(e.id(), e);
        }
        public static ServiceTypes byId(long id) { return byId.get(id); }
    }

    public enum ResultCodes {
        OK(0),
        FAIL(1),
        INVALID_PARAMS(3),
        CHANNEL_BUSY(4),
        RX_ONLY(5),
        LOW_BATTERY(6),
        PLL_UNLOCK(7),
        PRIVATE_CALL_NO_ACK(8),
        REPEATER_WAKEUP_FAIL(9),
        NO_CONTACT(10),
        TX_DENY(11),
        TX_INTERRUPTED(12);

        private final long id;
        ResultCodes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ResultCodes> byId = new HashMap<Long, ResultCodes>(12);
        static {
            for (ResultCodes e : ResultCodes.values())
                byId.put(e.id(), e);
        }
        public static ResultCodes byId(long id) { return byId.get(id); }
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
        this.ackFlag = AckFlags.byId(this._io.readBitsIntBe(1));
        this.optionFlag = OptionFlags.byId(this._io.readBitsIntBe(1));
        this.reserved = this._io.readBitsIntBe(6);
        this._io.alignToByte();
        this.serviceType = ServiceTypes.byId(this._io.readU1());
        this.messageLength = this._io.readU2be();
        if (optionFlag().id() == 1) {
            this.optionFieldLen = this._io.readU2be();
        }
        this.requestId = this._io.readU4be();
        this.destinationIp = new RadioIp(this._io);
        if (serviceType() != ServiceTypes.SEND_GROUP_MESSAGE_ACK) {
            this.sourceIp = new RadioIp(this._io);
        }
        if ( ((serviceType() == ServiceTypes.SEND_PRIVATE_MESSAGE_ACK) || (serviceType() == ServiceTypes.SEND_GROUP_MESSAGE_ACK)) ) {
            this.result = ResultCodes.byId(this._io.readU1());
        }
        if ( ((serviceType() == ServiceTypes.SEND_PRIVATE_MESSAGE) || (serviceType() == ServiceTypes.SEND_GROUP_MESSAGE)) ) {
            this.tmdata = new String(this._io.readBytes(((((messageLength() - 4) - 4) - 4) - optionSumLen())), Charset.forName("UTF-16LE"));
        }
        if (optionFlag().id() == 1) {
            this.optionField = new String(this._io.readBytes(optionFieldLen()), Charset.forName("UTF-16LE"));
        }
    }
    private Integer optionSumLen;
    public Integer optionSumLen() {
        if (this.optionSumLen != null)
            return this.optionSumLen;
        int _tmp = (int) ((optionFlag().id() == 1 ? (optionFieldLen() + 2) : 0));
        this.optionSumLen = _tmp;
        return this.optionSumLen;
    }
    private AckFlags ackFlag;
    private OptionFlags optionFlag;
    private long reserved;
    private ServiceTypes serviceType;
    private int messageLength;
    private Integer optionFieldLen;
    private long requestId;
    private RadioIp destinationIp;
    private RadioIp sourceIp;
    private ResultCodes result;
    private String tmdata;
    private String optionField;
    private TextMessageProtocol _root;
    private KaitaiStruct _parent;
    public AckFlags ackFlag() { return ackFlag; }

    /**
     * option fields might not be supported yet
     */
    public OptionFlags optionFlag() { return optionFlag; }
    public long reserved() { return reserved; }
    public ServiceTypes serviceType() { return serviceType; }

    /**
     * length of the message from next field to the end of TMP message
     */
    public int messageLength() { return messageLength; }
    public Integer optionFieldLen() { return optionFieldLen; }
    public long requestId() { return requestId; }

    /**
     * single or group target in ipv4 format
     */
    public RadioIp destinationIp() { return destinationIp; }

    /**
     * source of the message in ipv4 format
     */
    public RadioIp sourceIp() { return sourceIp; }
    public ResultCodes result() { return result; }
    public String tmdata() { return tmdata; }
    public String optionField() { return optionField; }
    public TextMessageProtocol _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
