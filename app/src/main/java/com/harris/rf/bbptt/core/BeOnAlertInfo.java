package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public class BeOnAlertInfo {
    public static final int ALERTTYPEALERT = 1;
    public static final int ALERTTYPECLEAR = 0;
    public static final int ALERT_TYPE_UNKNOWN = 255;
    public static final int CLEARERTYPEIPCONSOLE = 4;
    public static final int CLEARERTYPERNM = 2;
    public static final int CLEARERTYPEUNKNOWN = 0;
    public static final int CLEARERTYPEUSER = 1;
    private final BeOnGroupId alertTalkGroupId;
    private final int alertType;
    private final int clearerType;
    private final BeOnUserId clearerVidaId;
    private final String talkGroupAlias;
    private final long timeOfAlertOrClear;
    private final BeOnUserId userId;

    public BeOnAlertInfo(BeOnUserId beOnUserId, int i, long j, BeOnGroupId beOnGroupId, int i2, BeOnUserId beOnUserId2, String str) {
        this.userId = beOnUserId;
        this.alertType = i;
        this.timeOfAlertOrClear = j;
        this.alertTalkGroupId = beOnGroupId;
        this.clearerType = i2;
        this.clearerVidaId = beOnUserId2;
        this.talkGroupAlias = str;
    }

    public BeOnAlertInfo(BeOnAlertInfo beOnAlertInfo) {
        BeOnUserId beOnUserId = null;
        this.userId = beOnAlertInfo.userId == null ? null : new BeOnUserId(beOnAlertInfo.userId);
        this.alertType = beOnAlertInfo.alertType;
        this.timeOfAlertOrClear = beOnAlertInfo.timeOfAlertOrClear;
        this.alertTalkGroupId = beOnAlertInfo.alertTalkGroupId == null ? null : new BeOnGroupId(beOnAlertInfo.alertTalkGroupId);
        this.clearerType = beOnAlertInfo.clearerType;
        this.clearerVidaId = beOnAlertInfo.clearerVidaId != null ? new BeOnUserId(beOnAlertInfo.clearerVidaId) : beOnUserId;
        this.talkGroupAlias = beOnAlertInfo.talkGroupAlias;
    }

    public BeOnUserId getUserId() {
        return this.userId;
    }

    public int getAlertType() {
        return this.alertType;
    }

    public long getTimeOfAlertOrClear() {
        return this.timeOfAlertOrClear;
    }

    public BeOnGroupId getAlertTalkGroupId() {
        return this.alertTalkGroupId;
    }

    public int getClearerType() {
        return this.clearerType;
    }

    public BeOnUserId getClearerVidaId() {
        return this.clearerVidaId;
    }

    public String getTalkGroupAlias() {
        return this.talkGroupAlias;
    }
}
