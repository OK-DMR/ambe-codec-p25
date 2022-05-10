// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.hytera;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import io.kaitai.struct.KaitaiStruct;

public class HyteraDmrApplicationProtocol extends KaitaiStruct {
    private boolean isReliableMessage;
    private MessageHeaderTypes messageHeader;
    private KaitaiStruct data;
    private int checksum;
    private byte[] messageFooter;
    private HyteraDmrApplicationProtocol _root;
    private KaitaiStruct _parent;

    public HyteraDmrApplicationProtocol(KaitaiStream _io) {
        this(_io, null, null);
    }
    public HyteraDmrApplicationProtocol(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }
    public HyteraDmrApplicationProtocol(KaitaiStream _io, KaitaiStruct _parent, HyteraDmrApplicationProtocol _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }

    public static HyteraDmrApplicationProtocol fromFile(String fileName) throws IOException {
        return new HyteraDmrApplicationProtocol(new ByteBufferKaitaiStream(fileName));
    }

    private void _read() {
        this.isReliableMessage = this._io.readBitsIntBe(1) != 0;
        this.messageHeader = MessageHeaderTypes.byId(this._io.readBitsIntBe(7));
        this._io.alignToByte();
        {
            MessageHeaderTypes on = messageHeader();
            if (on != null) {
                switch (messageHeader()) {
                    case RADIO_REGISTRATION: {
                        this.data = new RadioRegistrationService(this._io);
                        break;
                    }
                    case TELEMETRY_PROTOCOL: {
                        this.data = new TelemetryProtocol(this._io);
                        break;
                    }
                    case RADIO_CONTROL_PROTOCOL: {
                        this.data = new RadioControlProtocol(this._io);
                        break;
                    }
                    case TEXT_MESSAGE_PROTOCOL: {
                        this.data = new TextMessageProtocol(this._io);
                        break;
                    }
                    case DATA_DELIVERY_STATES: {
                        this.data = new DataDeliveryStates(this._io);
                        break;
                    }
                    case LOCATION_PROTOCOL: {
                        this.data = new LocationProtocol(this._io);
                        break;
                    }
                    case DATA_TRANSMIT_PROTOCOL: {
                        this.data = new DataTransmitProtocol(this._io);
                        break;
                    }
                }
            }
        }
        this.checksum = this._io.readU1();
        this.messageFooter = this._io.readBytes(1);
        if (!(Arrays.equals(messageFooter(), new byte[]{3}))) {
            throw new KaitaiStream.ValidationNotEqualError(new byte[]{3}, messageFooter(), _io(), "/seq/4");
        }
    }

    /**
     * first bit of message_header indicates if the message is reliable
     */
    public boolean isReliableMessage() {
        return isReliableMessage;
    }

    public MessageHeaderTypes messageHeader() {
        return messageHeader;
    }

    /**
     * contains opcode (2 bytes), payload length (2 bytes) and payload (if length > 0)
     */
    public KaitaiStruct data() {
        return data;
    }

    public int checksum() {
        return checksum;
    }

    public byte[] messageFooter() {
        return messageFooter;
    }

    public HyteraDmrApplicationProtocol _root() {
        return _root;
    }

    public KaitaiStruct _parent() {
        return _parent;
    }

    public enum MessageHeaderTypes {
        RADIO_CONTROL_PROTOCOL(2),
        LOCATION_PROTOCOL(8),
        TEXT_MESSAGE_PROTOCOL(9),
        RADIO_REGISTRATION(17),
        TELEMETRY_PROTOCOL(18),
        DATA_TRANSMIT_PROTOCOL(19),
        DATA_DELIVERY_STATES(20);

        private static final Map<Long, MessageHeaderTypes> byId = new HashMap<Long, MessageHeaderTypes>(7);

        static {
            for (MessageHeaderTypes e : MessageHeaderTypes.values())
                byId.put(e.id(), e);
        }

        private final long id;

        MessageHeaderTypes(long id) {
            this.id = id;
        }

        public static MessageHeaderTypes byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    public static class UndefinedProtocol extends KaitaiStruct {
        private byte[] data;
        private HyteraDmrApplicationProtocol _root;
        private KaitaiStruct _parent;

        public UndefinedProtocol(KaitaiStream _io) {
            this(_io, null, null);
        }

        public UndefinedProtocol(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public UndefinedProtocol(KaitaiStream _io, KaitaiStruct _parent, HyteraDmrApplicationProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static UndefinedProtocol fromFile(String fileName) throws IOException {
            return new UndefinedProtocol(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.data = this._io.readBytesFull();
        }

        public byte[] data() {
            return data;
        }

        public HyteraDmrApplicationProtocol _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }
}
