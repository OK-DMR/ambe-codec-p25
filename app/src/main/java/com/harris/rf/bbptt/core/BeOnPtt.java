package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public class BeOnPtt {
    private String announcementGroupName;
    private boolean isConfirmed;
    private boolean isEmergency;
    private boolean isEncrypted;
    private BeOnUserId source;
    private BeOnEntity target;

    public BeOnPtt() {
    }

    public BeOnPtt(BeOnUserId beOnUserId, BeOnEntity beOnEntity, String str, boolean z, boolean z2, boolean z3) {
        this.source = new BeOnUserId(beOnUserId);
        this.target = makeNewBeOnEntity(beOnEntity);
        this.isEmergency = z2;
        this.isConfirmed = z;
        this.isEncrypted = z3;
        this.announcementGroupName = str;
    }

    public BeOnPtt(BeOnPtt beOnPtt) {
        this.source = new BeOnUserId(beOnPtt.source);
        this.target = makeNewBeOnEntity(this.target);
        this.announcementGroupName = beOnPtt.announcementGroupName;
        this.isEmergency = beOnPtt.isEmergency;
        this.isConfirmed = beOnPtt.isConfirmed;
        this.isEncrypted = beOnPtt.isEncrypted;
    }

    public BeOnUserId getSource() {
        return this.source;
    }

    public void setSource(BeOnUserId beOnUserId) {
        this.source = beOnUserId;
    }

    public BeOnEntity getTarget() {
        return this.target;
    }

    public void setTarget(BeOnEntity beOnEntity) {
        this.target = beOnEntity;
    }

    public String getAnnouncementGroupName() {
        return this.announcementGroupName;
    }

    public void setAnnouncementGroupName(String str) {
        this.announcementGroupName = str;
    }

    public boolean isAnnouncement() {
        return !this.announcementGroupName.isEmpty();
    }

    public boolean isEmergency() {
        return this.isEmergency;
    }

    public void setEmergency(boolean z) {
        this.isEmergency = z;
    }

    public boolean isConfirmed() {
        return this.isConfirmed;
    }

    public void setConfirmed(boolean z) {
        this.isConfirmed = z;
    }

    public boolean isEncrypted() {
        return this.isEncrypted;
    }

    public void setEncrypted(boolean z) {
        this.isEncrypted = z;
    }

    private BeOnEntity makeNewBeOnEntity(BeOnEntity beOnEntity) {
        if (beOnEntity == null) {
            return null;
        }
        if (beOnEntity.isGroupId()) {
            return new BeOnGroupId((BeOnGroupId) beOnEntity);
        }
        if (beOnEntity.isUserId()) {
            return new BeOnUserId((BeOnUserId) beOnEntity);
        }
        if (beOnEntity.isPatchId()) {
            return new BeOnPatchId((BeOnPatchId) beOnEntity);
        }
        if (beOnEntity.isSimulselectId()) {
            return new BeOnSimulselectId((BeOnSimulselectId) beOnEntity);
        }
        return null;
    }
}
