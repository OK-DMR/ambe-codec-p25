package com.harris.rf.bbptt.core;

import java.util.Arrays;
/* loaded from: classes.dex */
public class BeOnInternetDataConnection extends BeOnDataConnection {
    public static final int INTERNET_MAX_LSAI_SIZE = 32;

    public BeOnInternetDataConnection(int i, String str) {
        super(i, 32);
        this.lsai = str.getBytes();
    }

    public BeOnInternetDataConnection(BeOnInternetDataConnection beOnInternetDataConnection) {
        super(beOnInternetDataConnection.atid, 32);
        this.lsai = beOnInternetDataConnection.lsai;
    }

    @Override // com.harris.rf.bbptt.core.BeOnDataConnection
    public int getLsaiLength() {
        return this.lsai.length;
    }

    @Override // com.harris.rf.bbptt.core.BeOnDataConnection
    public int hashCode() {
        return this.atid * 31;
    }

    @Override // com.harris.rf.bbptt.core.BeOnDataConnection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BeOnInternetDataConnection)) {
            return false;
        }
        BeOnInternetDataConnection beOnInternetDataConnection = (BeOnInternetDataConnection) obj;
        return this.atid == beOnInternetDataConnection.atid && Arrays.equals(this.lsai, beOnInternetDataConnection.lsai);
    }
}
