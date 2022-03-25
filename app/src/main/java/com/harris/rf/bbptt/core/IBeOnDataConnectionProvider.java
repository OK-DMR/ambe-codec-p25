package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public interface IBeOnDataConnectionProvider {
    BeOnDataConnection getDataConnection();

    boolean isConnected();

    void sentUdpPacket();

    boolean setLapAddress(String str, int i);
}
