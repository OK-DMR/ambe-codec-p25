package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public interface IBeOnWorkQueueProvider {
    IBeOnWorkQueue createWorkQueue();

    void releaseWorkQueue();
}
