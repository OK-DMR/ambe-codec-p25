package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public abstract class BeOnEntity {
    public static int ENTITY_TYPE_GROUP = 1;
    public static int ENTITY_TYPE_PATCH = 2;
    public static int ENTITY_TYPE_SIMULSELECT = 3;
    public static int ENTITY_TYPE_USER;

    public abstract BeOnEntity cloneEntity();

    public abstract int getType();

    public boolean isGroupId() {
        return getType() == ENTITY_TYPE_GROUP;
    }

    public boolean isUserId() {
        return getType() == ENTITY_TYPE_USER;
    }

    public boolean isPatchId() {
        return getType() == ENTITY_TYPE_PATCH;
    }

    public boolean isSimulselectId() {
        return getType() == ENTITY_TYPE_SIMULSELECT;
    }
}
