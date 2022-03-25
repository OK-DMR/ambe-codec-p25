package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public class BeOnGroupId extends BeOnEntity {
    public static final int INVALID_GROUP_ID = 0;
    protected int groupId;

    public BeOnGroupId() {
        this.groupId = 0;
    }

    public BeOnGroupId(int i) {
        this.groupId = i;
    }

    public BeOnGroupId(BeOnGroupId beOnGroupId) {
        this.groupId = beOnGroupId.groupId;
    }

    @Override // com.harris.rf.bbptt.core.BeOnEntity
    public BeOnGroupId cloneEntity() {
        return new BeOnGroupId(this);
    }

    public BeOnGroupId setGroupId(int i) {
        this.groupId = i;
        return this;
    }

    public int getGroupId() {
        return this.groupId;
    }

    @Override // com.harris.rf.bbptt.core.BeOnEntity
    public int getType() {
        return ENTITY_TYPE_GROUP;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof BeOnGroupId) && this.groupId == ((BeOnGroupId) obj).groupId;
    }

    public int hashCode() {
        return this.groupId * 31;
    }

    public String toString() {
        return new StringBuilder(String.format("%04d", Integer.valueOf(this.groupId))).toString();
    }
}
