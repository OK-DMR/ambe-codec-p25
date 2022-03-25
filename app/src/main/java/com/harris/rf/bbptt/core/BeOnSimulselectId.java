package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public class BeOnSimulselectId extends BeOnEntity {
    protected int said;

    public BeOnSimulselectId() {
    }

    public BeOnSimulselectId(int i) {
        this.said = i;
    }

    public BeOnSimulselectId(BeOnSimulselectId beOnSimulselectId) {
        this.said = beOnSimulselectId.said;
    }

    public void setSaid(int i) {
        this.said = i;
    }

    public int getSaid() {
        return this.said;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof BeOnSimulselectId) && this.said == ((BeOnSimulselectId) obj).said;
    }

    public int hashCode() {
        return this.said * 31;
    }

    public String toString() {
        return new StringBuilder(String.format("%04d", Integer.valueOf(this.said))).toString();
    }

    @Override // com.harris.rf.bbptt.core.BeOnEntity
    public int getType() {
        return ENTITY_TYPE_SIMULSELECT;
    }

    @Override // com.harris.rf.bbptt.core.BeOnEntity
    public BeOnEntity cloneEntity() {
        return new BeOnSimulselectId(this);
    }
}
