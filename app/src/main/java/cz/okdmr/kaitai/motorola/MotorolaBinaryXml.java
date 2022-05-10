// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package cz.okdmr.kaitai.motorola;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import io.kaitai.struct.KaitaiStruct;


/**
 * Motorola Binary XML parsing, contains and references LRRP (Location Request Response Protocol)
 * and ARRP (Accessories Request Response Protocol), xml documents encoded in binary form
 */
public class MotorolaBinaryXml extends KaitaiStruct {
    private ArrayList<MbxmlDocument> documents;
    private MotorolaBinaryXml _root;
    private KaitaiStruct _parent;

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

    public static MotorolaBinaryXml fromFile(String fileName) throws IOException {
        return new MotorolaBinaryXml(new ByteBufferKaitaiStream(fileName));
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

    public ArrayList<MbxmlDocument> documents() {
        return documents;
    }

    public MotorolaBinaryXml _root() {
        return _root;
    }

    public KaitaiStruct _parent() {
        return _parent;
    }

    public enum Docids {
        LRRP_IMMEDIATE_REQUEST(4),
        LRRP_IMMEDIATE_REQUEST_NCDT(5),
        LRRP_IMMEDIATE_RESPONSE(6),
        LRRP_IMMEDIATE_RESPONSE_NCDT(7);

        private static final Map<Long, Docids> byId = new HashMap<Long, Docids>(4);

        static {
            for (Docids e : Docids.values())
                byId.put(e.id(), e);
        }

        private final long id;

        Docids(long id) {
            this.id = id;
        }

        public static Docids byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    public enum LrrpElements {
        REQUEST_ID_22_OPAQUE(34),
        REQUEST_ID_23_OPAQUE_1BYTE(35),
        REQUEST_ID_24_CDT_REFERENCE(36);

        private static final Map<Long, LrrpElements> byId = new HashMap<Long, LrrpElements>(3);

        static {
            for (LrrpElements e : LrrpElements.values())
                byId.put(e.id(), e);
        }

        private final long id;

        LrrpElements(long id) {
            this.id = id;
        }

        public static LrrpElements byId(long id) {
            return byId.get(id);
        }

        public long id() {
            return id;
        }
    }

    public static class LrrpImmediateRequestNcdt extends KaitaiStruct {
        private LrrpElement elements;
        private MotorolaBinaryXml _root;
        private MotorolaBinaryXml.MbxmlDocument _parent;

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

        public static LrrpImmediateRequestNcdt fromFile(String fileName) throws IOException {
            return new LrrpImmediateRequestNcdt(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.elements = new LrrpElement(this._io, this, _root);
        }

        public LrrpElement elements() {
            return elements;
        }

        public MotorolaBinaryXml _root() {
            return _root;
        }

        public MotorolaBinaryXml.MbxmlDocument _parent() {
            return _parent;
        }
    }

    public static class Opaque3byteValue extends KaitaiStruct {
        private byte[] value;
        private MotorolaBinaryXml _root;
        private KaitaiStruct _parent;

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

        public static Opaque3byteValue fromFile(String fileName) throws IOException {
            return new Opaque3byteValue(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.value = this._io.readBytes(3);
        }

        public byte[] value() {
            return value;
        }

        public MotorolaBinaryXml _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    public static class LrrpElement extends KaitaiStruct {
        private LrrpElements lrrpElementType;
        private KaitaiStruct lrrpElementData;
        private MotorolaBinaryXml _root;
        private MotorolaBinaryXml.LrrpImmediateRequestNcdt _parent;

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

        public static LrrpElement fromFile(String fileName) throws IOException {
            return new LrrpElement(new ByteBufferKaitaiStream(fileName));
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

        public LrrpElements lrrpElementType() {
            return lrrpElementType;
        }

        public KaitaiStruct lrrpElementData() {
            return lrrpElementData;
        }

        public MotorolaBinaryXml _root() {
            return _root;
        }

        public MotorolaBinaryXml.LrrpImmediateRequestNcdt _parent() {
            return _parent;
        }
    }

    /**
     * Variable length signed float, first sintvar (signed integer part) then uintvar (unsigned fraction part)
     */
    public static class Sfloatvar extends KaitaiStruct {
        private Sintvar sintPayload;
        private Uintvar fractionPayload;
        private MotorolaBinaryXml _root;
        private KaitaiStruct _parent;

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

        public static Sfloatvar fromFile(String fileName) throws IOException {
            return new Sfloatvar(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.sintPayload = new Sintvar(this._io, this, _root);
            this.fractionPayload = new Uintvar(this._io, this, _root);
        }

        public Sintvar sintPayload() {
            return sintPayload;
        }

        public Uintvar fractionPayload() {
            return fractionPayload;
        }

        public MotorolaBinaryXml _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    public static class Opaque5byteValue extends KaitaiStruct {
        private byte[] value;
        private MotorolaBinaryXml _root;
        private KaitaiStruct _parent;

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

        public static Opaque5byteValue fromFile(String fileName) throws IOException {
            return new Opaque5byteValue(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.value = this._io.readBytes(5);
        }

        public byte[] value() {
            return value;
        }

        public MotorolaBinaryXml _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    public static class Opaque1byteValue extends KaitaiStruct {
        private byte[] value;
        private MotorolaBinaryXml _root;
        private MotorolaBinaryXml.LrrpElement _parent;

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

        public static Opaque1byteValue fromFile(String fileName) throws IOException {
            return new Opaque1byteValue(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.value = this._io.readBytes(1);
        }

        public byte[] value() {
            return value;
        }

        public MotorolaBinaryXml _root() {
            return _root;
        }

        public MotorolaBinaryXml.LrrpElement _parent() {
            return _parent;
        }
    }

    /**
     * Variable length unsigned integer, first bit is "continue flag", 7 bits are payload
     * maximum size is 2^32 - 1, ie. max size of uintvar is 32 bits
     */
    public static class Uintvar extends KaitaiStruct {
        private ArrayList<Integer> payload;
        private MotorolaBinaryXml _root;
        private KaitaiStruct _parent;

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

        public static Uintvar fromFile(String fileName) throws IOException {
            return new Uintvar(new ByteBufferKaitaiStream(fileName));
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
                } while (!((((_it & 128) == 0) || (_io().isEof()))));
            }
        }

        public ArrayList<Integer> payload() {
            return payload;
        }

        public MotorolaBinaryXml _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    /**
     * Variable length unsigned float, two consecutive uintvars, first represents integer part,
     * second fraction part of float
     */
    public static class Ufloatvar extends KaitaiStruct {
        private Uintvar uintPayload;
        private Uintvar fractionPayload;
        private MotorolaBinaryXml _root;
        private KaitaiStruct _parent;

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

        public static Ufloatvar fromFile(String fileName) throws IOException {
            return new Ufloatvar(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.uintPayload = new Uintvar(this._io, this, _root);
            this.fractionPayload = new Uintvar(this._io, this, _root);
        }

        public Uintvar uintPayload() {
            return uintPayload;
        }

        public Uintvar fractionPayload() {
            return fractionPayload;
        }

        public MotorolaBinaryXml _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    public static class ConstantDataTableReference extends KaitaiStruct {
        private Uintvar byteOffsetFromCdtStart;
        private MotorolaBinaryXml _root;
        private MotorolaBinaryXml.LrrpElement _parent;

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

        public static ConstantDataTableReference fromFile(String fileName) throws IOException {
            return new ConstantDataTableReference(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.byteOffsetFromCdtStart = new Uintvar(this._io, this, _root);
        }

        public Uintvar byteOffsetFromCdtStart() {
            return byteOffsetFromCdtStart;
        }

        public MotorolaBinaryXml _root() {
            return _root;
        }

        public MotorolaBinaryXml.LrrpElement _parent() {
            return _parent;
        }
    }

    /**
     * MBXML payload can contain multiple documents concatenated
     */
    public static class MbxmlDocument extends KaitaiStruct {
        private Docids documentId;
        private Uintvar numDocumentBytes;
        private LrrpImmediateRequestNcdt documentData;
        private MotorolaBinaryXml _root;
        private MotorolaBinaryXml _parent;

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

        public static MbxmlDocument fromFile(String fileName) throws IOException {
            return new MbxmlDocument(new ByteBufferKaitaiStream(fileName));
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

        /**
         * this should be uintvar, but enum matching is not possible against user-types, and maximum current docid is 0x27
         * so it should not matter, unless new docid is bigger than 0x7F (dec:127)
         */
        public Docids documentId() {
            return documentId;
        }

        public Uintvar numDocumentBytes() {
            return numDocumentBytes;
        }

        public LrrpImmediateRequestNcdt documentData() {
            return documentData;
        }

        public MotorolaBinaryXml _root() {
            return _root;
        }

        public MotorolaBinaryXml _parent() {
            return _parent;
        }
    }

    public static class OpaqueElementValue extends KaitaiStruct {
        private int lenValue;
        private byte[] value;
        private MotorolaBinaryXml _root;
        private MotorolaBinaryXml.LrrpElement _parent;

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

        public static OpaqueElementValue fromFile(String fileName) throws IOException {
            return new OpaqueElementValue(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.lenValue = this._io.readU1();
            this.value = this._io.readBytes(lenValue());
        }

        public int lenValue() {
            return lenValue;
        }

        public byte[] value() {
            return value;
        }

        public MotorolaBinaryXml _root() {
            return _root;
        }

        public MotorolaBinaryXml.LrrpElement _parent() {
            return _parent;
        }
    }

    public static class Opaque2byteValue extends KaitaiStruct {
        private byte[] value;
        private MotorolaBinaryXml _root;
        private KaitaiStruct _parent;

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

        public static Opaque2byteValue fromFile(String fileName) throws IOException {
            return new Opaque2byteValue(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.value = this._io.readBytes(2);
        }

        public byte[] value() {
            return value;
        }

        public MotorolaBinaryXml _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    /**
     * Variable length signed integer, first bit is "continue flag", 7 bits are payload
     * (first bit of first payload is sign bit)
     * maximum size is 2^32 - 1, ie. max size of sintvar is 32 bits
     */
    public static class Sintvar extends KaitaiStruct {
        private ArrayList<Integer> payload;
        private MotorolaBinaryXml _root;
        private KaitaiStruct _parent;

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

        public static Sintvar fromFile(String fileName) throws IOException {
            return new Sintvar(new ByteBufferKaitaiStream(fileName));
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
                } while (!((((_it & 128) == 0) || (_io().isEof()))));
            }
        }

        public ArrayList<Integer> payload() {
            return payload;
        }

        public MotorolaBinaryXml _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }

    public static class Opaque4byteValue extends KaitaiStruct {
        private byte[] value;
        private MotorolaBinaryXml _root;
        private KaitaiStruct _parent;

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

        public static Opaque4byteValue fromFile(String fileName) throws IOException {
            return new Opaque4byteValue(new ByteBufferKaitaiStream(fileName));
        }

        private void _read() {
            this.value = this._io.readBytes(4);
        }

        public byte[] value() {
            return value;
        }

        public MotorolaBinaryXml _root() {
            return _root;
        }

        public KaitaiStruct _parent() {
            return _parent;
        }
    }
}
