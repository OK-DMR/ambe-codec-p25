package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public class BeOnGroupMembership {
    private int expectedTotalUesConveyed;
    private BeOnGroupId groupId;
    private BeOnInterestedUeData[] interestedUeData;
    private int lastSequenceNumber;
    private long lastTimePublished;
    private int numUesConveyed;
    private int numUesCumulativelyConveyed;
    private int stamp;
    private int totalNumUes;

    public BeOnGroupMembership() {
    }

    public BeOnGroupMembership(BeOnGroupId beOnGroupId, int i, int i2, int i3, int i4, int i5, BeOnInterestedUeData[] beOnInterestedUeDataArr, int i6, long j) {
        this.groupId = beOnGroupId;
        this.stamp = i;
        this.totalNumUes = i2;
        this.expectedTotalUesConveyed = i3;
        this.numUesConveyed = i4;
        this.numUesCumulativelyConveyed = i5;
        this.interestedUeData = beOnInterestedUeDataArr;
        this.lastSequenceNumber = i6;
        this.lastTimePublished = j;
    }

    public BeOnGroupMembership(BeOnGroupId beOnGroupId, int i, int i2, BeOnInterestedUeData[] beOnInterestedUeDataArr) {
        this.groupId = beOnGroupId;
        this.stamp = 0;
        this.totalNumUes = i;
        this.expectedTotalUesConveyed = 0;
        this.numUesConveyed = i2;
        this.numUesCumulativelyConveyed = 0;
        this.interestedUeData = beOnInterestedUeDataArr;
        this.lastSequenceNumber = 0;
        this.lastTimePublished = 0L;
    }

    public BeOnGroupMembership(BeOnGroupMembership beOnGroupMembership) {
        this.groupId = beOnGroupMembership.groupId == null ? null : new BeOnGroupId(beOnGroupMembership.groupId);
        this.stamp = beOnGroupMembership.stamp;
        this.totalNumUes = beOnGroupMembership.totalNumUes;
        this.expectedTotalUesConveyed = beOnGroupMembership.expectedTotalUesConveyed;
        this.numUesConveyed = beOnGroupMembership.numUesConveyed;
        this.numUesCumulativelyConveyed = beOnGroupMembership.numUesCumulativelyConveyed;
        BeOnInterestedUeData[] beOnInterestedUeDataArr = beOnGroupMembership.interestedUeData;
        if (beOnInterestedUeDataArr != null) {
            BeOnInterestedUeData[] beOnInterestedUeDataArr2 = new BeOnInterestedUeData[beOnInterestedUeDataArr.length];
            this.interestedUeData = beOnInterestedUeDataArr2;
            BeOnInterestedUeData[] beOnInterestedUeDataArr3 = beOnGroupMembership.interestedUeData;
            System.arraycopy(beOnInterestedUeDataArr3, 0, beOnInterestedUeDataArr2, 0, beOnInterestedUeDataArr3.length);
        } else {
            this.interestedUeData = null;
        }
        this.lastSequenceNumber = beOnGroupMembership.lastSequenceNumber;
        this.lastTimePublished = beOnGroupMembership.lastTimePublished;
    }

    public BeOnGroupId getGroupId() {
        return this.groupId;
    }

    public int getStamp() {
        return this.stamp;
    }

    public int getTotalNumUes() {
        return this.totalNumUes;
    }

    public int getExpectedTotalUesConveyed() {
        return this.expectedTotalUesConveyed;
    }

    public int getNumUesConveyed() {
        return this.numUesConveyed;
    }

    public int getNumUesCumulativelyConveyed() {
        return this.numUesCumulativelyConveyed;
    }

    public BeOnInterestedUeData[] getInterestedUeData() {
        return this.interestedUeData;
    }

    public int getLastSequenceNumber() {
        return this.lastSequenceNumber;
    }

    public long getLastTimePublished() {
        return this.lastTimePublished;
    }

    public int hashCode() {
        BeOnGroupId beOnGroupId = this.groupId;
        if (beOnGroupId != null) {
            return beOnGroupId.hashCode();
        }
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BeOnGroupMembership)) {
            return false;
        }
        return this.groupId.equals(((BeOnGroupMembership) obj).groupId);
    }

    public String toString() {
        return String.format("%s: total UEs: %d, num UEs conveyed:%d", this.groupId, Integer.valueOf(this.totalNumUes), Integer.valueOf(this.numUesConveyed));
    }
}
