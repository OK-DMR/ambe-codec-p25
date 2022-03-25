package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public class BeOnGroupInProfile extends BeOnGroup {
    public static final int INVALID_GROUP_INDEX = -1;
    public static final int SCAN_PRIORITY_NONE = 0;
    public static final int SCAN_PRIORITY_ONE = 1;
    public static final int SCAN_PRIORITY_THREE = 3;
    public static final int SCAN_PRIORITY_TWO = 2;
    protected int groupIndex;
    protected boolean isEmergencyDeclarable;
    protected boolean isSupervisor;
    protected int profileIndex;
    protected int scanPriority;

    public BeOnGroupInProfile() {
    }

    public BeOnGroupInProfile(int i, int i2, BeOnGroup beOnGroup, int i3, boolean z, boolean z2) {
        super(beOnGroup);
        this.profileIndex = i;
        this.groupIndex = i2;
        this.isSupervisor = z;
        this.isEmergencyDeclarable = z2;
        this.scanPriority = i3;
    }

    public BeOnGroupInProfile(BeOnGroupInProfile beOnGroupInProfile) {
        super(beOnGroupInProfile);
        this.profileIndex = beOnGroupInProfile.profileIndex;
        this.groupIndex = beOnGroupInProfile.groupIndex;
        this.isSupervisor = beOnGroupInProfile.isSupervisor;
        this.isEmergencyDeclarable = beOnGroupInProfile.isEmergencyDeclarable;
        this.scanPriority = beOnGroupInProfile.scanPriority;
    }

    protected BeOnGroupInProfile setProfileIndex(int i) {
        this.profileIndex = i;
        return this;
    }

    public int getProfileIndex() {
        return this.profileIndex;
    }

    public int getGroupIndex() {
        return this.groupIndex;
    }

    public BeOnGroupInProfile setGroupIndex(int i) {
        this.groupIndex = i;
        return this;
    }

    public BeOnGroupInProfile setScanPriority(int i) {
        this.scanPriority = i;
        return this;
    }

    public int getScanPriority() {
        return this.scanPriority;
    }

    public BeOnGroupInProfile setSupervisor(boolean z) {
        this.isSupervisor = z;
        return this;
    }

    public boolean isSupervisor() {
        return this.isSupervisor;
    }

    public boolean isEmergencyDeclarable() {
        return this.isEmergencyDeclarable;
    }

    public BeOnGroupInProfile setEmergencyDeclarable(boolean z) {
        this.isEmergencyDeclarable = z;
        return this;
    }

    @Override // com.harris.rf.bbptt.core.BeOnGroup, com.harris.rf.bbptt.core.BeOnGroupId
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BeOnGroupInProfile)) {
            return false;
        }
        return super.equals(obj);
    }

    @Override // com.harris.rf.bbptt.core.BeOnGroup, com.harris.rf.bbptt.core.BeOnGroupId
    public int hashCode() {
        return super.hashCode();
    }
}
