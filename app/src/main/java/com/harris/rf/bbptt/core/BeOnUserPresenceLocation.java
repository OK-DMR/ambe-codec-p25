package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public class BeOnUserPresenceLocation {
    public static final int IPV6_RADIO_PRESENTIY_ID_LENGTH = 24;
    public static final int PRESENCE_SETTING_UNKNOWN = -1;
    public static final int PRESENTITY_ID_UNKNOWN = 0;
    private String freeFormatString;
    private int ipv4Radio;
    private byte[] ipv6Radio;
    private byte lastSequenceNumber;
    private long lastTimePublished;
    private BeOnLocation location;
    private int primaryPresenceIndex;
    private int secondaryPresenceIndex;
    private int ueType;
    private BeOnUserId userId;
    private long vini;

    public BeOnUserPresenceLocation() {
    }

    public BeOnUserPresenceLocation(BeOnUserId beOnUserId, long j, int i, byte[] bArr, int i2, int i3, int i4, BeOnLocation beOnLocation, BeOnAlertInfo beOnAlertInfo, String str, byte b, long j2) {
        this.userId = beOnUserId;
        this.vini = j;
        this.ipv4Radio = i;
        this.ipv6Radio = bArr;
        this.ueType = i2;
        this.primaryPresenceIndex = i3;
        this.secondaryPresenceIndex = i4;
        this.location = beOnLocation;
        this.freeFormatString = str;
        this.lastSequenceNumber = b;
        this.lastTimePublished = j2;
    }

    public BeOnUserPresenceLocation(BeOnUserId beOnUserId, int i, int i2, int i3, BeOnLocation beOnLocation) {
        this.userId = beOnUserId;
        this.vini = 0L;
        this.ipv4Radio = 0;
        this.ipv6Radio = null;
        this.ueType = i;
        this.primaryPresenceIndex = i2;
        this.secondaryPresenceIndex = i3;
        this.location = beOnLocation;
        this.lastSequenceNumber = (byte) 0;
        this.lastTimePublished = 0L;
        this.freeFormatString = null;
    }

    public BeOnUserPresenceLocation(BeOnUserPresenceLocation beOnUserPresenceLocation) {
        BeOnLocation beOnLocation = null;
        this.userId = beOnUserPresenceLocation.userId != null ? new BeOnUserId(beOnUserPresenceLocation.userId) : null;
        this.vini = beOnUserPresenceLocation.vini;
        this.ipv4Radio = beOnUserPresenceLocation.ipv4Radio;
        byte[] bArr = beOnUserPresenceLocation.ipv6Radio;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.ipv6Radio = bArr2;
            byte[] bArr3 = beOnUserPresenceLocation.ipv6Radio;
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        } else {
            this.ipv6Radio = null;
        }
        this.ueType = beOnUserPresenceLocation.ueType;
        this.primaryPresenceIndex = beOnUserPresenceLocation.primaryPresenceIndex;
        this.secondaryPresenceIndex = beOnUserPresenceLocation.secondaryPresenceIndex;
        this.location = beOnUserPresenceLocation.location != null ? new BeOnLocation(beOnUserPresenceLocation.location) : beOnLocation;
        this.lastSequenceNumber = beOnUserPresenceLocation.lastSequenceNumber;
        this.lastTimePublished = beOnUserPresenceLocation.lastTimePublished;
        this.freeFormatString = beOnUserPresenceLocation.freeFormatString;
    }

    public BeOnUserId getUser() {
        return this.userId;
    }

    public long getVini() {
        return this.vini;
    }

    public int getIpv4Radio() {
        return this.ipv4Radio;
    }

    public byte[] getIpv6Radio() {
        return this.ipv6Radio;
    }

    public int getUeType() {
        return this.ueType;
    }

    public int getPresenceIndex() {
        return this.primaryPresenceIndex;
    }

    public int getSecondaryPresenceIndex() {
        return this.secondaryPresenceIndex;
    }

    public BeOnLocation getLocation() {
        return this.location;
    }

    public String getFreeFormatString() {
        return this.freeFormatString;
    }

    public byte getLastSequenceNumber() {
        return this.lastSequenceNumber;
    }

    public long getLastTimePublished() {
        return this.lastTimePublished;
    }
}
