package com.harris.rf.bbptt.common.contact;

import com.harris.rf.bbptt.core.BeOnLocation;
import com.harris.rf.bbptt.core.BeOnUserId;
import java.io.Serializable;
/* loaded from: classes.dex */
public class BeOnContact implements Serializable {
    private String firstName;
    private boolean isSystem;
    private String lastName;
    private BeOnLocation location;
    private String nickName;
    private int presenceIndex;
    private int ueType;
    private BeOnUserId userId;

    public BeOnContact() {
        this.firstName = null;
        this.lastName = null;
        this.nickName = null;
        this.userId = null;
        this.ueType = 0;
        this.location = null;
        this.presenceIndex = -1;
        this.isSystem = false;
    }

    public BeOnContact(String str, String str2, String str3, BeOnUserId beOnUserId, int i, BeOnLocation beOnLocation, int i2, boolean z) {
        this.firstName = null;
        this.lastName = null;
        this.nickName = null;
        this.userId = null;
        this.ueType = 0;
        this.location = null;
        this.presenceIndex = -1;
        this.isSystem = false;
        this.firstName = str;
        this.lastName = str2;
        this.nickName = str3;
        this.userId = beOnUserId;
        this.ueType = 0;
        this.location = beOnLocation;
        this.presenceIndex = i2;
        this.isSystem = z;
    }

    public BeOnContact(BeOnContact beOnContact) {
        this.firstName = null;
        this.lastName = null;
        this.nickName = null;
        this.userId = null;
        this.ueType = 0;
        this.location = null;
        this.presenceIndex = -1;
        this.isSystem = false;
        this.firstName = beOnContact.firstName;
        this.lastName = beOnContact.lastName;
        this.nickName = beOnContact.nickName;
        this.userId = beOnContact.userId;
        this.ueType = beOnContact.ueType;
        this.location = beOnContact.location;
        this.presenceIndex = beOnContact.presenceIndex;
        this.isSystem = beOnContact.isSystem;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public BeOnUserId getUserId() {
        return this.userId;
    }

    public void setUserId(BeOnUserId beOnUserId) {
        this.userId = beOnUserId;
    }

    public int getUeType() {
        return this.ueType;
    }

    public void setUeType(int i) {
        this.ueType = i;
    }

    public BeOnLocation getLocation() {
        return this.location;
    }

    public void setLocation(BeOnLocation beOnLocation) {
        this.location = beOnLocation;
    }

    public int getPresenceIndex() {
        return this.presenceIndex;
    }

    public void setPresenceIndex(int i) {
        this.presenceIndex = i;
    }

    public boolean isSystem() {
        return this.isSystem;
    }

    public void setSystem(boolean z) {
        this.isSystem = z;
    }

    public int hashCode() {
        BeOnUserId beOnUserId = this.userId;
        return 31 + (beOnUserId == null ? 0 : beOnUserId.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BeOnContact)) {
            return false;
        }
        return this.userId.equals(((BeOnContact) obj).userId);
    }
}
