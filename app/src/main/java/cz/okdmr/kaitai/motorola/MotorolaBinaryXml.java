// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.motorola;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


/**
 * Motorola Binary XML parsing, contains and references LRRP (Location Request Response Protocol)
 * and ARRP (Accessories Request Response Protocol), xml documents encoded in binary form
 */
public class MotorolaBinaryXml extends KaitaiStruct {
    public static MotorolaBinaryXml fromFile(String fileName) throws IOException {
        return new MotorolaBinaryXml(new ByteBufferKaitaiStream(fileName));
    }

    public enum Docids {
        LRRP_IMMEDIATE_REQUEST(4),
        LRRP_IMMEDIATE_REQUEST_NCDT(5),
        LRRP_IMMEDIATE_RESPONSE(6),
        LRRP_IMMEDIATE_RESPONSE_NCDT(7);

        private final long id;
        Docids(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, Docids> byId = new HashMap<Long, Docids>(4);
        static {
            for (Docids e : Docids.values())
                byId.put(e.id(), e);
        }
        public static Docids byId(long id) { return byId.get(id); }
    }

    public enum LrrpElements {
        REQUEST_ID_22_OPAQUE(34),
        REQUEST_ID_23_OPAQUE_1BYTE(35),
        REQUEST_ID_24_CDT_REFERENCE(36);

        private final long id;
        LrrpElements(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, LrrpElements> byId = new HashMap<Long, LrrpElements>(3);
        static {
            for (LrrpElements e : LrrpElements.values())
                byId.put(e.id(), e);
        }
        public static LrrpElements byId(long id) { return byId.get(id); }
    }

    public MotorolaBinaryXml(KaitaiStream _io) {
        this(_io, null, null);
    }

    public MotorolaBinaryXml(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public MotorolaBinaryXml(KaitaiStream _io, KaitaiStruct _parent, MotorolaBinaryXml _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.documents = new ArrayList<MbxmlDocument>();
        {
            MbxmlDocument _it;
            int i = 0;
            do {
                _it = new MbxmlDocument(this._io, this, _root);
                this.documents.add(_it);
                i++;
            } while (!(!(_io().isEof())));
        }
    }
    public static class LrrpImmediateRequestNcdt extends KaitaiStruct {
        public static LrrpImmediateRequestNcdt fromFile(String fileName) throws IOException {
            return new LrrpImmediateRequestNcdt(new ByteBufferKaitaiStream(fileName));
        }

        public LrrpImmediateRequestNcdt(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LrrpImmediateRequestNcdt(KaitaiStream _io, MotorolaBinaryXml.MbxmlDocument _parent) {
            this(_io, _parent, null);
        }

        public LrrpImmediateRequestNcdt(KaitaiStream _io, MotorolaBinaryXml.MbxmlDocument _parent, MotorolaBinaryXml _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.elements = new LrrpElement(this._io, this, _root);
        }
        private LrrpElement elements;
        private MotorolaBinaryXml _root;
        private MotorolaBinaryXml.MbxmlDocument _parent;
        public LrrpElement elements() { return elements; }
        public MotorolaBinaryXml _root() { return _root; }
        public MotorolaBinaryXml.MbxmlDocument _parent() { return _parent; }
    }
    public static class Opaque3byteValue extends KaitaiStruct {
        public static Opaque3byteValue fromFile(String fileName) throws IOException {
            return new Opaque3byteValue(new ByteBufferKaitaiStream(fileName));
        }

        public Opaque3byteValue(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Opaque3byteValue(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Opaque3byteValue(KaitaiStream _io, KaitaiStruct _parent, MotorolaBinaryXml _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.value = this._io.readBytes(3);
        }
        private byte[] value;
        private MotorolaBinaryXml _root;
        private KaitaiStruct _parent;
        public byte[] value() { return value; }
        public MotorolaBinaryXml _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class LrrpElement extends KaitaiStruct {
        public static LrrpElement fromFile(String fileName) throws IOException {
            return new LrrpElement(new ByteBufferKaitaiStream(fileName));
        }

        public LrrpElement(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LrrpElement(KaitaiStream _io, MotorolaBinaryXml.LrrpImmediateRequestNcdt _parent) {
            this(_io, _parent, null);
        }

        public LrrpElement(KaitaiStream _io, MotorolaBinaryXml.LrrpImmediateRequestNcdt _parent, MotorolaBinaryXml _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.lrrpElementType = MotorolaBinaryXml.LrrpElements.byId(this._io.readU1());
            {
                LrrpElements on = lrrpElementType();
                if (on != null) {
                    switch (lrrpElementType()) {
                    case REQUEST_ID_22_OPAQUE: {
                        this.lrrpElementData = new OpaqueElementValue(this._io, this, _root);
                        break;
                    }
                    case REQUEST_ID_23_OPAQUE_1BYTE: {
                        this.lrrpElementData = new Opaque1byteValue(this._io, this, _root);
                        break;
                    }
                    case REQUEST_ID_24_CDT_REFERENCE: {
                        this.lrrpElementData = new ConstantDataTableReference(this._io, this, _root);
                        break;
                    }
                    }
                }
            }
        }
        private LrrpElements lrrpElementType;
        private KaitaiStruct lrrpElementData;
        private MotorolaBinaryXml _root;
        private MotorolaBinaryXml.LrrpImmediateRequestNcdt _parent;
        public LrrpElements lrrpElementType() { return lrrpElementType; }
        public KaitaiStruct lrrpElementData() { return lrrpElementData; }
        public MotorolaBinaryXml _root() { return _root; }
        public MotorolaBinaryXml.LrrpImmediateRequestNcdt _parent() { return _parent; }
    }

    /**
     * Variable length signed float, first sintvar (signed integer part) then uintvar (unsigned fraction part)
     */
    public static class Sfloatvar extends KaitaiStruct {
        public static Sfloatvar fromFile(String fileName) throws IOException {
            return new Sfloatvar(new ByteBufferKaitaiStream(fileName));
        }

        public Sfloatvar(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sfloatvar(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Sfloatvar(KaitaiStream _io, KaitaiStruct _parent, MotorolaBinaryXml _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sintPayload = new Sintvar(this._io, this, _root);
            this.fractionPayload = new Uintvar(this._io, this, _root);
        }
        private Sintvar sintPayload;
        private Uintvar fractionPayload;
        private MotorolaBinaryXml _root;
        private KaitaiStruct _parent;
        public Sintvar sintPayload() { return sintPayload; }
        public Uintvar fractionPayload() { return fractionPayload; }
        public MotorolaBinaryXml _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class Opaque5byteValue extends KaitaiStruct {
        public static Opaque5byteValue fromFile(String fileName) throws IOException {
            return new Opaque5byteValue(new ByteBufferKaitaiStream(fileName));
        }

        public Opaque5byteValue(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Opaque5byteValue(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Opaque5byteValue(KaitaiStream _io, KaitaiStruct _parent, MotorolaBinaryXml _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.value = this._io.readBytes(5);
        }
        private byte[] value;
        private MotorolaBinaryXml _root;
        private KaitaiStruct _parent;
        public byte[] value() { return value; }
        public MotorolaBinaryXml _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class Opaque1byteValue extends KaitaiStruct {
        public static Opaque1byteValue fromFile(String fileName) throws IOException {
            return new Opaque1byteValue(new ByteBufferKaitaiStream(fileName));
        }

        public Opaque1byteValue(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Opaque1byteValue(KaitaiStream _io, MotorolaBinaryXml.LrrpElement _parent) {
            this(_io, _parent, null);
        }

        public Opaque1byteValue(KaitaiStream _io, MotorolaBinaryXml.LrrpElement _parent, MotorolaBinaryXml _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.value = this._io.readBytes(1);
        }
        private byte[] value;
        private MotorolaBinaryXml _root;
        private MotorolaBinaryXml.LrrpElement _parent;
        public byte[] value() { return value; }
        public MotorolaBinaryXml _root() { return _root; }
        public MotorolaBinaryXml.LrrpElement _parent() { return _parent; }
    }

    /**
     * Variable length unsigned integer, first bit is "continue flag", 7 bits are payload
     * maximum size is 2^32 - 1, ie. max size of uintvar is 32 bits
     */
    public static class Uintvar extends KaitaiStruct {
        public static Uintvar fromFile(String fileName) throws IOException {
            return new Uintvar(new ByteBufferKaitaiStream(fileName));
        }

        public Uintvar(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Uintvar(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Uintvar(KaitaiStream _io, KaitaiStruct _parent, MotorolaBinaryXml _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.payload = new ArrayList<Integer>();
            {
                int _it;
                int i = 0;
                do {
                    _it = this._io.readU1();
                    this.payload.add(_it);
                    i++;
                } while (!( (((_it & 128) == 0) || (_io().isEof())) ));
            }
        }
        private ArrayList<Integer> payload;
        private MotorolaBinaryXml _root;
        private KaitaiStruct _parent;
        public ArrayList<Integer> payload() { return payload; }
        public MotorolaBinaryXml _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }

    /**
     * Variable length unsigned float, two consecutive uintvars, first represents integer part,
     * second fraction part of float
     */
    public static class Ufloatvar extends KaitaiStruct {
        public static Ufloatvar fromFile(String fileName) throws IOException {
            return new Ufloatvar(new ByteBufferKaitaiStream(fileName));
        }

        public Ufloatvar(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Ufloatvar(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Ufloatvar(KaitaiStream _io, KaitaiStruct _parent, MotorolaBinaryXml _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.uintPayload = new Uintvar(this._io, this, _root);
            this.fractionPayload = new Uintvar(this._io, this, _root);
        }
        private Uintvar uintPayload;
        private Uintvar fractionPayload;
        private MotorolaBinaryXml _root;
        private KaitaiStruct _parent;
        public Uintvar uintPayload() { return uintPayload; }
        public Uintvar fractionPayload() { return fractionPayload; }
        public MotorolaBinaryXml _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class ConstantDataTableReference extends KaitaiStruct {
        public static ConstantDataTableReference fromFile(String fileName) throws IOException {
            return new ConstantDataTableReference(new ByteBufferKaitaiStream(fileName));
        }

        public ConstantDataTableReference(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ConstantDataTableReference(KaitaiStream _io, MotorolaBinaryXml.LrrpElement _parent) {
            this(_io, _parent, null);
        }

        public ConstantDataTableReference(KaitaiStream _io, MotorolaBinaryXml.LrrpElement _parent, MotorolaBinaryXml _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.byteOffsetFromCdtStart = new Uintvar(this._io, this, _root);
        }
        private Uintvar byteOffsetFromCdtStart;
        private MotorolaBinaryXml _root;
        private MotorolaBinaryXml.LrrpElement _parent;
        public Uintvar byteOffsetFromCdtStart() { return byteOffsetFromCdtStart; }
        public MotorolaBinaryXml _root() { return _root; }
        public MotorolaBinaryXml.LrrpElement _parent() { return _parent; }
    }

    /**
     * MBXML payload can contain multiple documents concatenated
     */
    public static class MbxmlDocument extends KaitaiStruct {
        public static MbxmlDocument fromFile(String fileName) throws IOException {
            return new MbxmlDocument(new ByteBufferKaitaiStream(fileName));
        }

        public MbxmlDocument(KaitaiStream _io) {
            this(_io, null, null);
        }

        public MbxmlDocument(KaitaiStream _io, MotorolaBinaryXml _parent) {
            this(_io, _parent, null);
        }

        public MbxmlDocument(KaitaiStream _io, MotorolaBinaryXml _parent, MotorolaBinaryXml _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.documentId = MotorolaBinaryXml.Docids.byId(this._io.readU1());
            this.numDocumentBytes = new Uintvar(this._io, this, _root);
            {
                Docids on = documentId();
                if (on != null) {
                    switch (documentId()) {
                    case LRRP_IMMEDIATE_REQUEST_NCDT: {
                        this.documentData = new LrrpImmediateRequestNcdt(this._io, this, _root);
                        break;
                    }
                    }
                }
            }
        }
        private Docids documentId;
        private Uintvar numDocumentBytes;
        private LrrpImmediateRequestNcdt documentData;
        private MotorolaBinaryXml _root;
        private MotorolaBinaryXml _parent;

        /**
         * this should be uintvar, but enum matching is not possible against user-types, and maximum current docid is 0x27
         * so it should not matter, unless new docid is bigger than 0x7F (dec:127)
         */
        public Docids documentId() { return documentId; }
        public Uintvar numDocumentBytes() { return numDocumentBytes; }
        public LrrpImmediateRequestNcdt documentData() { return documentData; }
        public MotorolaBinaryXml _root() { return _root; }
        public MotorolaBinaryXml _parent() { return _parent; }
    }
    public static class OpaqueElementValue extends KaitaiStruct {
        public static OpaqueElementValue fromFile(String fileName) throws IOException {
            return new OpaqueElementValue(new ByteBufferKaitaiStream(fileName));
        }

        public OpaqueElementValue(KaitaiStream _io) {
            this(_io, null, null);
        }

        public OpaqueElementValue(KaitaiStream _io, MotorolaBinaryXml.LrrpElement _parent) {
            this(_io, _parent, null);
        }

        public OpaqueElementValue(KaitaiStream _io, MotorolaBinaryXml.LrrpElement _parent, MotorolaBinaryXml _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.lenValue = this._io.readU1();
            this.value = this._io.readBytes(lenValue());
        }
        private int lenValue;
        private byte[] value;
        private MotorolaBinaryXml _root;
        private MotorolaBinaryXml.LrrpElement _parent;
        public int lenValue() { return lenValue; }
        public byte[] value() { return value; }
        public MotorolaBinaryXml _root() { return _root; }
        public MotorolaBinaryXml.LrrpElement _parent() { return _parent; }
    }
    public static class Opaque2byteValue extends KaitaiStruct {
        public static Opaque2byteValue fromFile(String fileName) throws IOException {
            return new Opaque2byteValue(new ByteBufferKaitaiStream(fileName));
        }

        public Opaque2byteValue(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Opaque2byteValue(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Opaque2byteValue(KaitaiStream _io, KaitaiStruct _parent, MotorolaBinaryXml _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.value = this._io.readBytes(2);
        }
        private byte[] value;
        private MotorolaBinaryXml _root;
        private KaitaiStruct _parent;
        public byte[] value() { return value; }
        public MotorolaBinaryXml _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }

    /**
     * Variable length signed integer, first bit is "continue flag", 7 bits are payload
     * (first bit of first payload is sign bit)
     * maximum size is 2^32 - 1, ie. max size of sintvar is 32 bits
     */
    public static class Sintvar extends KaitaiStruct {
        public static Sintvar fromFile(String fileName) throws IOException {
            return new Sintvar(new ByteBufferKaitaiStream(fileName));
        }

        public Sintvar(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sintvar(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Sintvar(KaitaiStream _io, KaitaiStruct _parent, MotorolaBinaryXml _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.payload = new ArrayList<Integer>();
            {
                int _it;
                int i = 0;
                do {
                    _it = this._io.readU1();
                    this.payload.add(_it);
                    i++;
                } while (!( (((_it & 128) == 0) || (_io().isEof())) ));
            }
        }
        private ArrayList<Integer> payload;
        private MotorolaBinaryXml _root;
        private KaitaiStruct _parent;
        public ArrayList<Integer> payload() { return payload; }
        public MotorolaBinaryXml _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class Opaque4byteValue extends KaitaiStruct {
        public static Opaque4byteValue fromFile(String fileName) throws IOException {
            return new Opaque4byteValue(new ByteBufferKaitaiStream(fileName));
        }

        public Opaque4byteValue(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Opaque4byteValue(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Opaque4byteValue(KaitaiStream _io, KaitaiStruct _parent, MotorolaBinaryXml _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.value = this._io.readBytes(4);
        }
        private byte[] value;
        private MotorolaBinaryXml _root;
        private KaitaiStruct _parent;
        public byte[] value() { return value; }
        public MotorolaBinaryXml _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    private ArrayList<MbxmlDocument> documents;
    private MotorolaBinaryXml _root;
    private KaitaiStruct _parent;
    public ArrayList<MbxmlDocument> documents() { return documents; }
    public MotorolaBinaryXml _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
