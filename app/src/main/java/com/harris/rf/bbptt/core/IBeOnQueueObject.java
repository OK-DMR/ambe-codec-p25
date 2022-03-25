package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public interface IBeOnQueueObject {

    /* loaded from: classes.dex */
    public enum IBeOnQueueObjectType {
        OBJECT_TYPE_LAP,
        OBJECT_TYPE_EVENT,
        OBJECT_TYPE_ACK
    }

    IBeOnQueueObjectType getObjectType();
}
