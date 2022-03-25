package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public class BeOnProfile {
    public static final int EMERGENCY_BEHAVIOR_DEFAULT_GROUP = 6;
    public static final int EMERGENCY_BEHAVIOR_DEFAULT_GROUP_SELF = 4;
    public static final int EMERGENCY_BEHAVIOR_NONE = 0;
    public static final int EMERGENCY_BEHAVIOR_SELECTED_GROUP = 7;
    public static final int EMERGENCY_BEHAVIOR_SELECTED_GROUP_SELF = 5;
    public static final int EMERGENCY_BEHAVIOR_SELF_ONLY = 1;
    public static final int INVALID_PROFILE_INDEX = -1;
    public static final int PROFILE_MAX_GROUPS = 16;
    protected int defaultEmergencyGroupIndex;
    protected int defaultSelectedGroupIndex;
    protected int emergencyBehavior;
    protected String name;
    protected int priority1GroupIndex;
    protected int priority2GroupIndex;
    protected int profileIndex;
    protected String shortName;

    public BeOnProfile() {
        this.profileIndex = -1;
    }

    public BeOnProfile(int i, String str, String str2, int i2, int i3, int i4, int i5, int i6) {
        this.profileIndex = i;
        this.name = str;
        this.shortName = str2;
        this.defaultSelectedGroupIndex = i2;
        this.priority1GroupIndex = i3;
        this.priority2GroupIndex = i4;
        this.defaultEmergencyGroupIndex = i5;
        this.emergencyBehavior = i6;
    }

    public BeOnProfile(BeOnProfile beOnProfile) {
        this.profileIndex = beOnProfile.profileIndex;
        this.name = beOnProfile.name;
        this.shortName = beOnProfile.shortName;
        this.defaultSelectedGroupIndex = beOnProfile.defaultSelectedGroupIndex;
        this.priority1GroupIndex = beOnProfile.priority1GroupIndex;
        this.priority2GroupIndex = beOnProfile.priority2GroupIndex;
        this.defaultEmergencyGroupIndex = beOnProfile.defaultEmergencyGroupIndex;
        this.emergencyBehavior = beOnProfile.emergencyBehavior;
    }

    public int getProfileIndex() {
        return this.profileIndex;
    }

    public void setProfileIndex(int i) {
        this.profileIndex = i;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(String str) {
        this.shortName = str;
    }

    public int getDefaultSelectedGroupIndex() {
        return this.defaultSelectedGroupIndex;
    }

    public void setDefaultSelectedGroupIndex(int i) {
        this.defaultSelectedGroupIndex = i;
    }

    public int getPriority1GroupIndex() {
        return this.priority1GroupIndex;
    }

    public void setPriority1GroupIndex(int i) {
        this.priority1GroupIndex = i;
    }

    public int getPriority2GroupIndex() {
        return this.priority2GroupIndex;
    }

    public void setPriority2GroupIndex(int i) {
        this.priority2GroupIndex = i;
    }

    public int getDefaultEmergencyGroupIndex() {
        return this.defaultEmergencyGroupIndex;
    }

    public void setDefaultEmergencyGroupIndex(int i) {
        this.defaultEmergencyGroupIndex = i;
    }

    public int getEmergencyBehavior() {
        return this.emergencyBehavior;
    }

    public void setEmergencyBehavior(int i) {
        this.emergencyBehavior = i;
    }

    public int hashCode() {
        return this.profileIndex * 31;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof BeOnProfile) && this.profileIndex == ((BeOnProfile) obj).profileIndex;
    }
}
