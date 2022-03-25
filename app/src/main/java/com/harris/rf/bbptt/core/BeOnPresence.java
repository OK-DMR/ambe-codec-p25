package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public class BeOnPresence {
    public static final int INVALID_PRESENCE_INDEX = -1;
    public static final int PRES_AVAILABLE = 2;
    public static final String PRES_AVAILABLE_TEXT = "Available";
    public static final int PRES_BUSY = 4;
    public static final String PRES_BUSY_TEXT = "Busy";
    public static final int PRES_DO_NOT_DISTURB = 5;
    public static final String PRES_EICAL_TEXT = "In Call";
    public static final int PRES_ICALL_EM = 7;
    public static final int PRES_ICALL_NORMAL = 6;
    public static final String PRES_NICAL_TEXT = "In Call";
    public static final int PRES_SILENT = 3;
    public static final String PRES_SILENT_TEXT = "Silent";
    public static final int PRES_UNAVAILABLE = 1;
    public static final String PRES_UNAVAILABLE_TEXT = "Unavailable";
    protected boolean isSelectable;
    protected String name;
    protected int presenceIndex;
    protected int primaryState;
    protected int secondaryState;

    public BeOnPresence() {
        this.presenceIndex = -1;
    }

    public BeOnPresence(int i, int i2, int i3, String str, boolean z) {
        this.presenceIndex = i;
        this.primaryState = i2;
        this.secondaryState = i3;
        this.name = str;
        this.isSelectable = z;
    }

    public BeOnPresence(BeOnPresence beOnPresence) {
        this.presenceIndex = beOnPresence.presenceIndex;
        this.primaryState = beOnPresence.primaryState;
        this.secondaryState = beOnPresence.secondaryState;
        this.name = beOnPresence.name;
        this.isSelectable = beOnPresence.isSelectable;
    }

    public int getPrimaryState() {
        return this.primaryState;
    }

    public void setPrimaryState(int i) {
        this.primaryState = i;
    }

    public int getSecondaryState() {
        return this.secondaryState;
    }

    public void setSecondaryState(int i) {
        this.secondaryState = i;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public boolean isSelectable() {
        return this.isSelectable;
    }

    public void setSelectable(boolean z) {
        this.isSelectable = z;
    }

    public int getPresenceIndex() {
        return this.presenceIndex;
    }

    public void setPresenceIndex(int i) {
        this.presenceIndex = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BeOnPresence)) {
            return false;
        }
        BeOnPresence beOnPresence = (BeOnPresence) obj;
        return this.primaryState == beOnPresence.primaryState && this.secondaryState == beOnPresence.secondaryState;
    }

    public int hashCode() {
        return ((this.primaryState + 31) * 31) + this.secondaryState;
    }

    public String toString() {
        return "Primary: " + this.primaryState + " Secondary: " + this.secondaryState + " Name: " + this.name;
    }
}
