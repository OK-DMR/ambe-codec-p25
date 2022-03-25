package com.harris.rf.bbptt.core;

import java.io.Serializable;
/* loaded from: classes.dex */
public class BeOnInterestedUeData implements Serializable {
    private int changeType;
    private int presenceIndex;
    private int supervisorFlags;
    private BeOnUserId userId;

    public BeOnInterestedUeData() {
    }

    public BeOnInterestedUeData(BeOnUserId beOnUserId, int i, int i2, int i3) {
        this.userId = beOnUserId;
        this.presenceIndex = i;
        this.supervisorFlags = i2;
        this.changeType = i3;
    }

    public BeOnUserId getUserId() {
        return this.userId;
    }

    public int getPresenceIndex() {
        return this.presenceIndex;
    }

    public int getSupervisorFlags() {
        return this.supervisorFlags;
    }

    public int getChangeType() {
        return this.changeType;
    }

    public int hashCode() {
        return this.userId.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BeOnInterestedUeData)) {
            return false;
        }
        return this.userId.equals(((BeOnInterestedUeData) obj).userId);
    }

    public String toString() {
        return String.format("%s: Presence: %d", this.userId, Integer.valueOf(this.presenceIndex));
    }
}
