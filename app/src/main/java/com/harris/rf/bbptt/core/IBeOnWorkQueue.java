package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public interface IBeOnWorkQueue {
    void addLowPriorityQueueObject(IBeOnAbstractQueueProcessor iBeOnAbstractQueueProcessor, IBeOnQueueObject iBeOnQueueObject);

    void addQueueObject(IBeOnAbstractQueueProcessor iBeOnAbstractQueueProcessor, IBeOnQueueObject iBeOnQueueObject);

    void initialize();

    void shutdown();

    void startup();

    void uninitialize();
}
