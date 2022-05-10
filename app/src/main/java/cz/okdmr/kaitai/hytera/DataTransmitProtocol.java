// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.hytera;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import io.kaitai.struct.KaitaiStruct;

public class DataTransmitProtocol extends KaitaiStruct {
    private ServiceTypes serviceType;
    private ServiceSpecificTypes serviceSpecificType;
    private int messageLength;
    private KaitaiStruct data;
    private DataTransmitProtocol _root;
    private KaitaiStruct _parent;

    public DataTransmitProtocol(KaitaiStream _io) {
        this(_io, null, null);
    }

    public DataTransmitProtocol(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public DataTransmitProtocol(KaitaiStream _io, KaitaiStruct _parent, DataTransmitProtocol _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }

    public static DataTransmitProtocol fromFile(String fileName) throws IOException {
        return new DataTransmitProtocol(new ByteBufferKaitaiStream(fileName));
    }

    private void _read() {
        this.serviceType = ServiceTypes.byId(this._io.readU1());
        this.serviceSpecificType = ServiceSpecificTypes.byId(this._io.readU1());
        this.messageLength = this._io.readU2be();
        {
            ServiceSpecificTypes on = serviceSpecificType();
            if (on != null) {
                switch (serviceSpecificType()) {
                    case DTP_REQUEST: {
                        this.data = new DtpRequest(this._io, this, _root);
                        break;
                    }
                    case DATA_SLICE_TRANSMIT: {
                        this.data = new DataSliceTransmit(this._io, this, _root);
                        break;
                    }
                    case DATA_SLICE_ANSWER: {
                        this.data = new DataSliceAnswer(this._io, this, _root);
                        break;
                    }
                    case LAST_DATA_SLICE_ANSWER: {
                        this.data = new LastDataSliceAnswer(this._io, this, _root);
                        break;
                    }
                    case DTP_ANSWER: {
                        this.data = new DtpAnswer(this._io, this, _root);
                        break;
                    }
                    case LAST_DATA_SLICE: {
                        this.data = new LastDataSlice(this._io, this, _root);
                        break;
                    }
                }
            }
        }
    }

    /**
     * should be always 0xA0 Data Transmit Protocol
     */
    public ServiceTypes serviceType() {
        return serviceType;
    }

    public ServiceSpecificTypes serviceSpecificType() {
        return serviceSpecificType;
    }

    /**
     * length of the message from next field to the end of DTP message
     */
    public int messageLength() {
        return messageLength;
    }

    public KaitaiStruct data() {
        return data;
    }

    public DataTransmitProtocol _root() {
        return _root;
    }

    public KaitaiStruct _parent() {
        return _parent;
    }
    public enum ServiceTypes {
        DATA_TRANSMIT_PROTOCOL(160);

        private static final Map<Long, ServiceTypes> byId = new HashMap<Long, ServiceTypes>(1);

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
    public enum ServiceSpecificTypes {
        DTP_REQUEST(1),
        DATA_SLICE_TRANSMIT(2),
        LAST_DATA_SLICE(3),
        DTP_ANSWER(17),
        DATA_SLICE_ANSWER(18),
        LAST_DATA_SLICE_ANSWER(19);

        private static final Map<Long, ServiceSpecificTypes> byId = new HashMap<Long, ServiceSpecificTypes>(6);

        static {
            for (ServiceSpecificTypes e : ServiceSpecificTypes.values())
                byId.put(e.id(), e);
        }

        private final long id;

        ServiceSpecificTypes(long id) {
            this.id = id;
        }

        public static ServiceSpecificTypes byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }
    public enum Results {
        SUCCESS(0),
        FAILURE(1);

        private static final Map<Long, Results> byId = new HashMap<Long, Results>(2);

        static {
            for (Results e : Results.values())
                byId.put(e.id(), e);
        }

        private final long id;

        Results(long id) {
            this.id = id;
        }

        public static Results byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    /**
     * sent by transmit source, requires answer from the destination
     */
    public static class LastDataSlice extends KaitaiStruct {
        private RadioIp destinationIp;
        private RadioIp sourceIp;
        private DataTransmitProtocol _root;
        private DataTransmitProtocol _parent;

        public LastDataSlice(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LastDataSlice(KaitaiStream _io, DataTransmitProtocol _parent) {
            this(_io, _parent, null);
        }
        public LastDataSlice(KaitaiStream _io, DataTransmitProtocol _parent, DataTransmitProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static LastDataSlice fromFile(String fileName) throws IOException {
            return new LastDataSlice(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.destinationIp = new RadioIp(this._io);
            this.sourceIp = new RadioIp(this._io);
        }

        /**
         * transmit recipient ip
         */
        public RadioIp destinationIp() {
            return destinationIp;
        }

        /**
         * transmit sender ip
         */
        public RadioIp sourceIp() {
            return sourceIp;
        }

        public DataTransmitProtocol _root() {
            return _root;
        }

        public DataTransmitProtocol _parent() {
            return _parent;
        }
    }

    public static class DtpRequest extends KaitaiStruct {
        private RadioIp destinationIp;
        private RadioIp sourceIp;
        private int fileSize;
        private String fileName;
        private DataTransmitProtocol _root;
        private DataTransmitProtocol _parent;
        public DtpRequest(KaitaiStream _io) {
            this(_io, null, null);
        }
        public DtpRequest(KaitaiStream _io, DataTransmitProtocol _parent) {
            this(_io, _parent, null);
        }
        public DtpRequest(KaitaiStream _io, DataTransmitProtocol _parent, DataTransmitProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static DtpRequest fromFile(String fileName) throws IOException {
            return new DtpRequest(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.destinationIp = new RadioIp(this._io);
            this.sourceIp = new RadioIp(this._io);
            this.fileSize = this._io.readU2be();
            this.fileName = new String(this._io.readBytes((_parent().messageLength() - 10)), Charset.forName("UTF-16LE"));
        }

        public RadioIp destinationIp() {
            return destinationIp;
        }

        public RadioIp sourceIp() {
            return sourceIp;
        }

        /**
         * size in bytes
         */
        public int fileSize() {
            return fileSize;
        }

        /**
         * maximum of 256 bytes including file extension, if longer, recipient should refuse the transmission
         */
        public String fileName() {
            return fileName;
        }

        public DataTransmitProtocol _root() {
            return _root;
        }

        public DataTransmitProtocol _parent() {
            return _parent;
        }
    }

    public static class DataSliceAnswer extends KaitaiStruct {
        private RadioIp destinationIp;
        private RadioIp sourceIp;
        private int blockNumber;
        private Results result;
        private DataTransmitProtocol _root;
        private DataTransmitProtocol _parent;
        public DataSliceAnswer(KaitaiStream _io) {
            this(_io, null, null);
        }
        public DataSliceAnswer(KaitaiStream _io, DataTransmitProtocol _parent) {
            this(_io, _parent, null);
        }
        public DataSliceAnswer(KaitaiStream _io, DataTransmitProtocol _parent, DataTransmitProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static DataSliceAnswer fromFile(String fileName) throws IOException {
            return new DataSliceAnswer(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.destinationIp = new RadioIp(this._io);
            this.sourceIp = new RadioIp(this._io);
            this.blockNumber = this._io.readU2be();
            this.result = DataTransmitProtocol.Results.byId(this._io.readU1());
        }

        public RadioIp destinationIp() {
            return destinationIp;
        }

        public RadioIp sourceIp() {
            return sourceIp;
        }

        /**
         * sequence number in transfer, same as data_slice_transmit.block_number the response is for
         */
        public int blockNumber() {
            return blockNumber;
        }

        /**
         * result of transmit from receiving end
         */
        public Results result() {
            return result;
        }

        public DataTransmitProtocol _root() {
            return _root;
        }

        public DataTransmitProtocol _parent() {
            return _parent;
        }
    }

    public static class DataSliceTransmit extends KaitaiStruct {
        private RadioIp destinationIp;
        private RadioIp sourceIp;
        private int blockNumber;
        private byte[] fileData;
        private DataTransmitProtocol _root;
        private DataTransmitProtocol _parent;
        public DataSliceTransmit(KaitaiStream _io) {
            this(_io, null, null);
        }
        public DataSliceTransmit(KaitaiStream _io, DataTransmitProtocol _parent) {
            this(_io, _parent, null);
        }
        public DataSliceTransmit(KaitaiStream _io, DataTransmitProtocol _parent, DataTransmitProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static DataSliceTransmit fromFile(String fileName) throws IOException {
            return new DataSliceTransmit(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.destinationIp = new RadioIp(this._io);
            this.sourceIp = new RadioIp(this._io);
            this.blockNumber = this._io.readU2be();
            this.fileData = this._io.readBytes((_parent().messageLength() - 10));
        }

        public RadioIp destinationIp() {
            return destinationIp;
        }

        public RadioIp sourceIp() {
            return sourceIp;
        }

        /**
         * sequence number in transfer, starting with 1
         */
        public int blockNumber() {
            return blockNumber;
        }

        /**
         * 448 bytes slice of transmitted file, or shorter if current slice is the last one
         */
        public byte[] fileData() {
            return fileData;
        }

        public DataTransmitProtocol _root() {
            return _root;
        }

        public DataTransmitProtocol _parent() {
            return _parent;
        }
    }

    public static class LastDataSliceAnswer extends KaitaiStruct {
        private RadioIp destinationIp;
        private RadioIp sourceIp;
        private Results result;
        private DataTransmitProtocol _root;
        private DataTransmitProtocol _parent;

        public LastDataSliceAnswer(KaitaiStream _io) {
            this(_io, null, null);
        }
        public LastDataSliceAnswer(KaitaiStream _io, DataTransmitProtocol _parent) {
            this(_io, _parent, null);
        }
        public LastDataSliceAnswer(KaitaiStream _io, DataTransmitProtocol _parent, DataTransmitProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static LastDataSliceAnswer fromFile(String fileName) throws IOException {
            return new LastDataSliceAnswer(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.destinationIp = new RadioIp(this._io);
            this.sourceIp = new RadioIp(this._io);
            this.result = DataTransmitProtocol.Results.byId(this._io.readU1());
        }

        /**
         * transmit sender ip
         */
        public RadioIp destinationIp() {
            return destinationIp;
        }

        /**
         * transmit recipient ip
         */
        public RadioIp sourceIp() {
            return sourceIp;
        }

        public Results result() {
            return result;
        }

        public DataTransmitProtocol _root() {
            return _root;
        }

        public DataTransmitProtocol _parent() {
            return _parent;
        }
    }

    public static class DtpAnswer extends KaitaiStruct {
        private RadioIp destinationIp;
        private RadioIp sourceIp;
        private Results result;
        private DataTransmitProtocol _root;
        private DataTransmitProtocol _parent;

        public DtpAnswer(KaitaiStream _io) {
            this(_io, null, null);
        }
        public DtpAnswer(KaitaiStream _io, DataTransmitProtocol _parent) {
            this(_io, _parent, null);
        }
        public DtpAnswer(KaitaiStream _io, DataTransmitProtocol _parent, DataTransmitProtocol _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }

        public static DtpAnswer fromFile(String fileName) throws IOException {
            return new DtpAnswer(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.destinationIp = new RadioIp(this._io);
            this.sourceIp = new RadioIp(this._io);
            this.result = DataTransmitProtocol.Results.byId(this._io.readU1());
        }

        public RadioIp destinationIp() {
            return destinationIp;
        }

        public RadioIp sourceIp() {
            return sourceIp;
        }

        public Results result() {
            return result;
        }

        public DataTransmitProtocol _root() {
            return _root;
        }

        public DataTransmitProtocol _parent() {
            return _parent;
        }
    }
}
