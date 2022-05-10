// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.hytera;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import io.kaitai.struct.KaitaiStruct;

public class HyteraSimpleTransportReliabilityProtocol extends KaitaiStruct {
    private byte[] header;
    private int version;
    private long reserved;
    private boolean hasOption;
    private boolean isReject;
    private boolean isClose;
    private boolean isConnect;
    private boolean isHeartbeat;
    private boolean isAck;
    private int sequenceNumber;
    private ArrayList<Option> options;
    private ArrayList<HyteraDmrApplicationProtocol> data;
    private byte[] extraData;
    private HyteraSimpleTransportReliabilityProtocol _root;
    private KaitaiStruct _parent;
    public HyteraSimpleTransportReliabilityProtocol(KaitaiStream _io) {
        this(_io, null, null);
    }
    public HyteraSimpleTransportReliabilityProtocol(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }
    public HyteraSimpleTransportReliabilityProtocol(KaitaiStream _io, KaitaiStruct _parent, HyteraSimpleTransportReliabilityProtocol _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }

    public static HyteraSimpleTransportReliabilityProtocol fromFile(String fileName) throws IOException {
        return new HyteraSimpleTransportReliabilityProtocol(new ByteBufferKaitaiStream(fileName));
    }

    private void _read() {
        this.header = this._io.readBytes(2);
        if (!(Arrays.equals(header(), new byte[]{50, 66}))) {
            throw new KaitaiStream.ValidationNotEqualError(new byte[]{50, 66}, header(), _io(), "/seq/0");
        }
        this.version = this._io.readU1();
        this.reserved = this._io.readBitsIntBe(2);
        this.hasOption = this._io.readBitsIntBe(1) != 0;
        this.isReject = this._io.readBitsIntBe(1) != 0;
        this.isClose = this._io.readBitsIntBe(1) != 0;
        this.isConnect = this._io.readBitsIntBe(1) != 0;
        this.isHeartbeat = this._io.readBitsIntBe(1) != 0;
        this.isAck = this._io.readBitsIntBe(1) != 0;
        this._io.alignToByte();
        this.sequenceNumber = this._io.readU2be();
        if (((!(_io().isEof())) && (!(isHeartbeat())) && (hasOption()))) {
            this.options = new ArrayList<Option>();
            {
                Option _it;
                int i = 0;
                do {
                    _it = new Option(this._io, this, _root);
                    this.options.add(_it);
                    i++;
                } while (!(!(_it.expectMoreOptions())));
            }
        }
        if (((!(_io().isEof())) && (!(isReject())) && (!(isClose())) && (!(isConnect())))) {
            this.data = new ArrayList<HyteraDmrApplicationProtocol>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.data.add(new HyteraDmrApplicationProtocol(this._io));
                    i++;
                }
            }
        }
        if (!(_io().isEof())) {
            this.extraData = this._io.readBytesFull();
        }
    }

    /**
     * should be ascii 2B
     */
    public byte[] header() {
        return header;
    }

    /**
     * current version is 0x00
     */
    public int version() {
        return version;
    }

    public long reserved() {
        return reserved;
    }

    public boolean hasOption() {
        return hasOption;
    }

    public boolean isReject() {
        return isReject;
    }

    public boolean isClose() {
        return isClose;
    }

    public boolean isConnect() {
        return isConnect;
    }

    public boolean isHeartbeat() {
        return isHeartbeat;
    }

    public boolean isAck() {
        return isAck;
    }

    /**
     * number equal for ACK and retransmited messages, and raised for each reply/new message
     */
    public int sequenceNumber() {
        return sequenceNumber;
    }

    public ArrayList<Option> options() {
        return options;
    }

    public ArrayList<HyteraDmrApplicationProtocol> data() {
        return data;
    }

    public byte[] extraData() {
        return extraData;
    }

    public HyteraSimpleTransportReliabilityProtocol _root() {
        return _root;
    }

    public KaitaiStruct _parent() {
        return _parent;
    }

    public enum OptionCommands {
        REALTIME(1),
        DEVICE_ID(3),
        CHANNEL_ID(4);

        private static final Map<Long, OptionCommands> byId = new HashMap<Long, OptionCommands>(3);

        static {
            for (OptionCommands e : OptionCommands.values())
                byId.put(e.id(), e);
        }

        private final long id;

        OptionCommands(long id) {
            this.id = id;
        }

        public static OptionCommands byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    public static class Option extends KaitaiStruct {
        private boolean expectMoreOptions;
        private OptionCommands command;
        private int lenOptionPayload;
        private byte[] optionPayload;
        private HyteraSimpleTransportReliabilityProtocol _root;
        private HyteraSimpleTransportReliabilityProtocol _parent;
        public Option(KaitaiStream _io) {
            this(_io, null, null);
        }
        public Option(KaitaiStream _io, HyteraSimpleTransportReliabilityProtocol _parent) {
            this(_io, _parent, null);
        }
        public Option(KaitaiStream _io, HyteraSimpleTransportReliabilityProtocol _parent, HyteraSimpleTransportReliabilityProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static Option fromFile(String fileName) throws IOException {
            return new Option(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.expectMoreOptions = this._io.readBitsIntBe(1) != 0;
            this.command = HyteraSimpleTransportReliabilityProtocol.OptionCommands.byId(this._io.readBitsIntBe(7));
            this._io.alignToByte();
            this.lenOptionPayload = this._io.readU1();
            this.optionPayload = this._io.readBytes(lenOptionPayload());
        }

        public boolean expectMoreOptions() {
            return expectMoreOptions;
        }

        public OptionCommands command() {
            return command;
        }

        public int lenOptionPayload() {
            return lenOptionPayload;
        }

        public byte[] optionPayload() {
            return optionPayload;
        }

        public HyteraSimpleTransportReliabilityProtocol _root() {
            return _root;
        }

        public HyteraSimpleTransportReliabilityProtocol _parent() {
            return _parent;
        }
    }
}
