package com.harris.rf.bbptt.core;

import java.util.Arrays;
/* loaded from: classes.dex */
public class BeOnCellDataConnection extends BeOnDataConnection {
    public static final int CELL_LSAI_SIZE = 8;

    @Override // com.harris.rf.bbptt.core.BeOnDataConnection
    public int getLsaiLength() {
        return 8;
    }

    public BeOnCellDataConnection(int i, short s, short s2, short s3, short s4) {
        super(i, 8);
        this.lsai[0] = (byte) ((s >> 8) & 255);
        this.lsai[1] = (byte) (s & 255);
        this.lsai[2] = (byte) ((s2 >> 8) & 255);
        this.lsai[3] = (byte) (s2 & 255);
        this.lsai[4] = (byte) ((s3 >> 8) & 255);
        this.lsai[5] = (byte) (s3 & 255);
        this.lsai[6] = (byte) ((s4 >> 8) & 255);
        this.lsai[7] = (byte) (s4 & 255);
    }

    public BeOnCellDataConnection(BeOnCellDataConnection beOnCellDataConnection) {
        super(beOnCellDataConnection.atid, 8);
        for (int i = 0; i < 8; i++) {
            this.lsai[i] = beOnCellDataConnection.lsai[i];
        }
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
        if (obj == null || !(obj instanceof BeOnCellDataConnection)) {
            return false;
        }
        BeOnCellDataConnection beOnCellDataConnection = (BeOnCellDataConnection) obj;
        return this.atid == beOnCellDataConnection.atid && Arrays.equals(this.lsai, beOnCellDataConnection.lsai);
    }
}
