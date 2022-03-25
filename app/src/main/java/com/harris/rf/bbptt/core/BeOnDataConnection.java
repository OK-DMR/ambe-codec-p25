package com.harris.rf.bbptt.core;

import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class BeOnDataConnection {
    public static final int AIRLINK_TECHNOLOGY_EDGE = 1;
    public static final int AIRLINK_TECHNOLOGY_INTERNET = 3;
    public static final int AIRLINK_TECHNOLOGY_LTE = 4;
    public static final int AIRLINK_TECHNOLOGY_PROTOTYPE = 5;
    public static final int AIRLINK_TECHNOLOGY_WCDMA = 2;
    public static final int AIRLINK_TECHNOLOGY_WIFI = 0;
    protected int atid;
    protected byte[] lsai;

    public int getLsaiLength() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BeOnDataConnection(int i, int i2) {
        this.atid = i;
        this.lsai = new byte[i2];
    }

    public BeOnDataConnection setAirlinkTechnology(int i) {
        this.atid = i;
        return this;
    }

    public int getAirlinkTechnology() {
        return this.atid;
    }

    public BeOnDataConnection setLsai(byte[] bArr, int i) {
        this.lsai = Arrays.copyOf(bArr, i);
        return this;
    }

    public byte[] getLsai() {
        return this.lsai;
    }

    public int hashCode() {
        return this.atid * 31;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BeOnDataConnection)) {
            return false;
        }
        BeOnDataConnection beOnDataConnection = (BeOnDataConnection) obj;
        return this.atid == beOnDataConnection.atid && Arrays.equals(this.lsai, beOnDataConnection.lsai);
    }
}
