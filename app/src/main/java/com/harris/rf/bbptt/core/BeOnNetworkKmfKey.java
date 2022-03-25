package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public class BeOnNetworkKmfKey {
    public static final int KEY_TYPE_KEK = 0;
    public static final int KEY_TYPE_LLAK = 1;
    protected final int algId;
    protected final byte[] key;
    protected final int keyId;
    protected final int keySize;
    protected final int keyType;
    protected final int keysetId;
    protected final int kmfRsi;
    protected final int sln;
    protected final int ueRsi;

    public BeOnNetworkKmfKey(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, int i8) {
        this.keyType = i;
        this.ueRsi = i2;
        this.algId = i3;
        this.keyId = i4;
        this.keysetId = i5;
        this.sln = i6;
        this.key = bArr;
        this.keySize = i7;
        this.kmfRsi = i8;
    }

    public int getKeyType() {
        return this.keyType;
    }

    public int getUeRsi() {
        return this.ueRsi;
    }

    public int getAlgId() {
        return this.algId;
    }

    public int getKeyId() {
        return this.keyId;
    }

    public int getKeysetId() {
        return this.keysetId;
    }

    public int getSln() {
        return this.sln;
    }

    public byte[] getKey() {
        return this.key;
    }

    public int getKeySize() {
        return this.keySize;
    }

    public int getKmfRsi() {
        return this.kmfRsi;
    }
}
