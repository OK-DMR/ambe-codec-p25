// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.hytera;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import io.kaitai.struct.KaitaiStruct;


/**
 * each packet should contain 60ms of voice data for AMBE compatibility
 */
public class RealTimeTransportProtocol extends KaitaiStruct {
    private Integer lenPaddingIfExists;
    private Integer lenPadding;
    private FixedHeader fixedHeader;
    private HeaderExtension headerExtension;
    private byte[] audioData;
    private byte[] padding;
    private RealTimeTransportProtocol _root;
    private KaitaiStruct _parent;

    public RealTimeTransportProtocol(KaitaiStream _io) {
        this(_io, null, null);
    }

    public RealTimeTransportProtocol(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public RealTimeTransportProtocol(KaitaiStream _io, KaitaiStruct _parent, RealTimeTransportProtocol _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }

    public static RealTimeTransportProtocol fromFile(String fileName) throws IOException {
        return new RealTimeTransportProtocol(new ByteBufferKaitaiStream(fileName));
    }

    private void _read() {
        this.fixedHeader = new FixedHeader(this._io, this, _root);
        if (fixedHeader().extension()) {
            this.headerExtension = new HeaderExtension(this._io, this, _root);
        }
        this.audioData = this._io.readBytes(((_io().size() - _io().pos()) - lenPadding()));
        if (fixedHeader().padding()) {
            this.padding = this._io.readBytes(lenPadding());
        }
    }

    public Integer lenPaddingIfExists() {
        if (this.lenPaddingIfExists != null)
            return this.lenPaddingIfExists;
        if (fixedHeader().padding()) {
            long _pos = this._io.pos();
            this._io.seek((_io().size() - 1));
            this.lenPaddingIfExists = this._io.readU1();
            this._io.seek(_pos);
        }
        return this.lenPaddingIfExists;
    }

    public Integer lenPadding() {
        if (this.lenPadding != null)
            return this.lenPadding;
        int _tmp = (int) ((fixedHeader().padding() ? lenPaddingIfExists() : 0));
        this.lenPadding = _tmp;
        return this.lenPadding;
    }

    public FixedHeader fixedHeader() {
        return fixedHeader;
    }

    public HeaderExtension headerExtension() {
        return headerExtension;
    }

    public byte[] audioData() {
        return audioData;
    }

    public byte[] padding() {
        return padding;
    }

    public RealTimeTransportProtocol _root() {
        return _root;
    }

    public KaitaiStruct _parent() {
        return _parent;
    }

    public enum RtpPayloadTypes {
        MU_LAW(0),
        A_LAW(8);

        private static final Map<Long, RtpPayloadTypes> byId = new HashMap<Long, RtpPayloadTypes>(2);

        static {
            for (RtpPayloadTypes e : RtpPayloadTypes.values())
                byId.put(e.id(), e);
        }

        private final long id;

        RtpPayloadTypes(long id) {
            this.id = id;
        }

        public static RtpPayloadTypes byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    public enum CallTypes {
        PRIVATE_CALL(0),
        GROUP_CALL(1),
        ALL_CALL(2);

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

    public static class FixedHeader extends KaitaiStruct {
        private long version;
        private boolean padding;
        private boolean extension;
        private long numCsrc;
        private boolean marker;
        private long payloadType;
        private int sequenceNumber;
        private long timestamp;
        private long ssrc;
        private ArrayList<Long> csrc;
        private RealTimeTransportProtocol _root;
        private RealTimeTransportProtocol _parent;
        public FixedHeader(KaitaiStream _io) {
            this(_io, null, null);
        }
        public FixedHeader(KaitaiStream _io, RealTimeTransportProtocol _parent) {
            this(_io, _parent, null);
        }
        public FixedHeader(KaitaiStream _io, RealTimeTransportProtocol _parent, RealTimeTransportProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static FixedHeader fromFile(String fileName) throws IOException {
            return new FixedHeader(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.version = this._io.readBitsIntBe(2);
            if (!(version() == 2)) {
                throw new KaitaiStream.ValidationNotEqualError(2, version(), _io(), "/types/fixed_header/seq/0");
            }
            this.padding = this._io.readBitsIntBe(1) != 0;
            this.extension = this._io.readBitsIntBe(1) != 0;
            this.numCsrc = this._io.readBitsIntBe(4);
            this.marker = this._io.readBitsIntBe(1) != 0;
            this.payloadType = this._io.readBitsIntBe(7);
            this._io.alignToByte();
            this.sequenceNumber = this._io.readU2be();
            this.timestamp = this._io.readU4be();
            this.ssrc = this._io.readU4be();
            this.csrc = new ArrayList<Long>();
            for (int i = 0; i < numCsrc(); i++) {
                this.csrc.add(this._io.readU4be());
            }
        }

        public long version() {
            return version;
        }

        /**
         * if set, this packet contains padding bytes at the end
         */
        public boolean padding() {
            return padding;
        }

        /**
         * if set, fixed header is followed by single header extension
         */
        public boolean extension() {
            return extension;
        }

        /**
         * number of csrc identifiers that follow fixed header (val. 0-15)
         */
        public long numCsrc() {
            return numCsrc;
        }

        /**
         * marker meaning is defined by RTP profile, for HDAP should be always 0
         */
        public boolean marker() {
            return marker;
        }

        public long payloadType() {
            return payloadType;
        }

        /**
         * sequence does not start from 0, but from random number
         */
        public int sequenceNumber() {
            return sequenceNumber;
        }

        /**
         * sampling instant of the first octet in this RTP packet
         */
        public long timestamp() {
            return timestamp;
        }

        /**
         * synchronized source identifier
         */
        public long ssrc() {
            return ssrc;
        }

        /**
         * contributing sources
         */
        public ArrayList<Long> csrc() {
            return csrc;
        }

        public RealTimeTransportProtocol _root() {
            return _root;
        }

        public RealTimeTransportProtocol _parent() {
            return _parent;
        }
    }

    public static class HeaderExtension extends KaitaiStruct {
        private int headerIdentifier;
        private int length;
        private long slot;
        private boolean lastFlag;
        private RadioId sourceId;
        private RadioId destinationId;
        private CallTypes callType;
        private byte[] reserved;
        private RealTimeTransportProtocol _root;
        private RealTimeTransportProtocol _parent;
        public HeaderExtension(KaitaiStream _io) {
            this(_io, null, null);
        }
        public HeaderExtension(KaitaiStream _io, RealTimeTransportProtocol _parent) {
            this(_io, _parent, null);
        }
        public HeaderExtension(KaitaiStream _io, RealTimeTransportProtocol _parent, RealTimeTransportProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static HeaderExtension fromFile(String fileName) throws IOException {
            return new HeaderExtension(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.headerIdentifier = this._io.readU2be();
            this.length = this._io.readU2be();
            this.slot = this._io.readBitsIntBe(7);
            this.lastFlag = this._io.readBitsIntBe(1) != 0;
            this._io.alignToByte();
            this.sourceId = new RadioId(this._io);
            this.destinationId = new RadioId(this._io);
            this.callType = RealTimeTransportProtocol.CallTypes.byId(this._io.readU1());
            this.reserved = this._io.readBytes(4);
        }

        public int headerIdentifier() {
            return headerIdentifier;
        }

        /**
         * number of 32bit words following the header+length fields
         */
        public int length() {
            return length;
        }

        /**
         * slot number 1 or 2
         */
        public long slot() {
            return slot;
        }

        /**
         * indicates end of voice call
         */
        public boolean lastFlag() {
            return lastFlag;
        }

        public RadioId sourceId() {
            return sourceId;
        }

        public RadioId destinationId() {
            return destinationId;
        }

        public CallTypes callType() {
            return callType;
        }

        /**
         * reserved 32bits
         */
        public byte[] reserved() {
            return reserved;
        }

        public RealTimeTransportProtocol _root() {
            return _root;
        }

        public RealTimeTransportProtocol _parent() {
            return _parent;
        }
    }
}
