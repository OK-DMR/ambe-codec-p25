package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public interface IBeOnTimerProvider {
    IBeOnTimer createTimer(long j, int i, IBeOnTimerListener iBeOnTimerListener, boolean z);

    void releaseTimer(IBeOnTimer iBeOnTimer);
}
