// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.etsi;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;


/**
 * ETSI TS 102 361-3 V1.3.1, section 7, PDUs
 */
public class DmrIpUdp extends KaitaiStruct {
    public static DmrIpUdp fromFile(String fileName) throws IOException {
        return new DmrIpUdp(new ByteBufferKaitaiStream(fileName));
    }

    public enum SourceIpAddressIds {
        RADIO_NETWORK(0),
        USB_ETHERNET_INTERFACE_NETWORK(1);

        private final long id;
        SourceIpAddressIds(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, SourceIpAddressIds> byId = new HashMap<Long, SourceIpAddressIds>(2);
        static {
            for (SourceIpAddressIds e : SourceIpAddressIds.values())
                byId.put(e.id(), e);
        }
        public static SourceIpAddressIds byId(long id) { return byId.get(id); }
    }

    public enum DestinationIpAddressIds {
        RADIO_NETWORK(0),
        USB_ETHERNET_INTERFACE_NETWORK(1),
        GROUP_NETWORK(2);

        private final long id;
        DestinationIpAddressIds(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, DestinationIpAddressIds> byId = new HashMap<Long, DestinationIpAddressIds>(3);
        static {
            for (DestinationIpAddressIds e : DestinationIpAddressIds.values())
                byId.put(e.id(), e);
        }
        public static DestinationIpAddressIds byId(long id) { return byId.get(id); }
    }

    public enum UdpPortIds {
        PRESENT_IN_EXTENDED_HEADER(0),
        UTF16BE_TEXT_MESSAGE_PORT_5016(1),
        LOCATION_INTERFACE_PROTOCOL(2);

        private final long id;
        UdpPortIds(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, UdpPortIds> byId = new HashMap<Long, UdpPortIds>(3);
        static {
            for (UdpPortIds e : UdpPortIds.values())
                byId.put(e.id(), e);
        }
        public static UdpPortIds byId(long id) { return byId.get(id); }
    }

    public DmrIpUdp(KaitaiStream _io) {
        this(_io, null, null);
    }

    public DmrIpUdp(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public DmrIpUdp(KaitaiStream _io, KaitaiStruct _parent, DmrIpUdp _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
    }

    /**
     * 7.2.3 UDP/IPv4 Compressed Header, Table 7.14
     */
    public static class UdpIpv4CompressedHeader extends KaitaiStruct {
        public static UdpIpv4CompressedHeader fromFile(String fileName) throws IOException {
            return new UdpIpv4CompressedHeader(new ByteBufferKaitaiStream(fileName));
        }

        public UdpIpv4CompressedHeader(KaitaiStream _io) {
            this(_io, null, null);
        }

        public UdpIpv4CompressedHeader(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public UdpIpv4CompressedHeader(KaitaiStream _io, KaitaiStruct _parent, DmrIpUdp _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.ipv4Identification = this._io.readBytes(2);
            this.sourceIpAddressId = DmrIpUdp.SourceIpAddressIds.byId(this._io.readBitsIntBe(4));
            this.destinationIpAddressId = DmrIpUdp.DestinationIpAddressIds.byId(this._io.readBitsIntBe(4));
            this.headerCompressionOpcodeMsb = this._io.readBitsIntBe(1) != 0;
            this.udpSourcePortId = DmrIpUdp.UdpPortIds.byId(this._io.readBitsIntBe(7));
            this.headerCompressionOpcodeLsb = this._io.readBitsIntBe(1) != 0;
            this.udpDestinationPortId = DmrIpUdp.UdpPortIds.byId(this._io.readBitsIntBe(7));
            this._io.alignToByte();
            if (udpSourcePortId() == DmrIpUdp.UdpPortIds.PRESENT_IN_EXTENDED_HEADER) {
                this.udpSourcePort = this._io.readBytes(2);
            }
            if (udpDestinationPortId() == DmrIpUdp.UdpPortIds.PRESENT_IN_EXTENDED_HEADER) {
                this.udpDestinationPort = this._io.readBytes(2);
            }
            this.userData = this._io.readBytesFull();
        }
        private byte[] ipv4Identification;
        private SourceIpAddressIds sourceIpAddressId;
        private DestinationIpAddressIds destinationIpAddressId;
        private boolean headerCompressionOpcodeMsb;
        private UdpPortIds udpSourcePortId;
        private boolean headerCompressionOpcodeLsb;
        private UdpPortIds udpDestinationPortId;
        private byte[] udpSourcePort;
        private byte[] udpDestinationPort;
        private byte[] userData;
        private DmrIpUdp _root;
        private KaitaiStruct _parent;
        public byte[] ipv4Identification() { return ipv4Identification; }

        /**
         * SAID
         */
        public SourceIpAddressIds sourceIpAddressId() { return sourceIpAddressId; }

        /**
         * DAID
         */
        public DestinationIpAddressIds destinationIpAddressId() { return destinationIpAddressId; }
        public boolean headerCompressionOpcodeMsb() { return headerCompressionOpcodeMsb; }

        /**
         * SPID
         */
        public UdpPortIds udpSourcePortId() { return udpSourcePortId; }
        public boolean headerCompressionOpcodeLsb() { return headerCompressionOpcodeLsb; }

        /**
         * DPID
         */
        public UdpPortIds udpDestinationPortId() { return udpDestinationPortId; }
        public byte[] udpSourcePort() { return udpSourcePort; }
        public byte[] udpDestinationPort() { return udpDestinationPort; }
        public byte[] userData() { return userData; }
        public DmrIpUdp _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    private DmrIpUdp _root;
    private KaitaiStruct _parent;
    public DmrIpUdp _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
