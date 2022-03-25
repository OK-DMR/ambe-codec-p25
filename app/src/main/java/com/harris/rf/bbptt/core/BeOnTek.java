package com.harris.rf.bbptt.core;

import java.util.Arrays;
/* loaded from: classes.dex */
public class BeOnTek {
    protected final int algId;
    protected final boolean isInteropKey;
    protected final byte[] key;
    protected final int keyId;
    protected final int keySize;
    protected final int keysetId;
    protected final String keysetName;
    protected final String platform;
    protected final int sln;

    BeOnTek(int i, String str, int i2, int i3, String str2, int i4, byte[] bArr, int i5, boolean z) {
        this.algId = i;
        this.platform = str;
        this.keyId = i2;
        this.keysetId = i3;
        this.keysetName = str2;
        this.sln = i4;
        this.key = bArr;
        this.keySize = i5;
        this.isInteropKey = z;
    }

    public int getAlgorithmId() {
        return this.algId;
    }

    public String getPlatform() {
        return this.platform;
    }

    public int getKeyId() {
        return this.keyId;
    }

    public int getKeysetId() {
        return this.keysetId;
    }

    public String getKeysetName() {
        return this.keysetName;
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

    public boolean isInteropKey() {
        return this.isInteropKey;
    }

    public void clearKey() {
        Arrays.fill(this.key, (byte) 0);
    }
}
