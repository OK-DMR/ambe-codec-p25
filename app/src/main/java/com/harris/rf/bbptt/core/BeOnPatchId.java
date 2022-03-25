package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public class BeOnPatchId extends BeOnEntity {
    protected boolean isSupervisor;
    protected int said;

    public BeOnPatchId() {
    }

    public BeOnPatchId(int i, boolean z) {
        this.said = i;
        this.isSupervisor = z;
    }

    public BeOnPatchId(int i) {
        this(i, false);
    }

    public BeOnPatchId(BeOnPatchId beOnPatchId) {
        this(beOnPatchId.said, beOnPatchId.isSupervisor);
    }

    public int getSaid() {
        return this.said;
    }

    public BeOnPatchId setSaid(int i) {
        this.said = i;
        return this;
    }

    public boolean isSupervisor() {
        return this.isSupervisor;
    }

    public BeOnPatchId setSupervisor(boolean z) {
        this.isSupervisor = z;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof BeOnPatchId) && this.said == ((BeOnPatchId) obj).said;
    }

    public int hashCode() {
        return this.said * 31;
    }

    public String toString() {
        return new StringBuilder(String.format("%04d", Integer.valueOf(this.said))).toString();
    }

    @Override // com.harris.rf.bbptt.core.BeOnEntity
    public int getType() {
        return ENTITY_TYPE_PATCH;
    }

    @Override // com.harris.rf.bbptt.core.BeOnEntity
    public BeOnEntity cloneEntity() {
        return new BeOnPatchId(this);
    }
}
