package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public interface IBeOnVocoder {
    int decode(byte[] bArr, int i, short[] sArr);

    void decodeInit();

    int encode(short[] sArr, int i, byte[] bArr);

    void encodeInit();

    int getMaxEncodedFrameLengthInBytes();

    int getMaxFrameLength();

    String getParameterString(String str);

    int getSampleRate();

    Type getType();

    boolean setParameterString(String str, String str2);

    /* loaded from: classes.dex */
    public enum Type {
        TYPE_RAW(0),
        TYPE_AMBE_FULL_RATE(7),
        TYPE_AMBE_HALF_RATE(13),
        TYPE_AMR_NB(16),
        TYPE_AMR_WB(17),
        TYPE_NOT_VALID(255);
        
        private int value;

        Type(int i) {
            this.value = i;
        }

        public int toInteger() {
            return this.value;
        }
    }
}
