package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public class BeOnEmergency {
    private BeOnLocation location;
    private BeOnUserId source;
    private BeOnEntity target;

    public BeOnEmergency(BeOnEntity beOnEntity, BeOnUserId beOnUserId, BeOnLocation beOnLocation) {
        this.target = beOnEntity;
        this.source = beOnUserId;
        this.location = beOnLocation;
    }

    public BeOnEmergency(BeOnEmergency beOnEmergency) {
        this.target = beOnEmergency.target;
        this.source = beOnEmergency.source;
        this.location = beOnEmergency.location;
    }

    public BeOnEmergency setTarget(BeOnEntity beOnEntity) {
        this.target = beOnEntity;
        return this;
    }

    public BeOnEntity getTarget() {
        return this.target;
    }

    public BeOnEmergency setSource(BeOnUserId beOnUserId) {
        this.source = beOnUserId;
        return this;
    }

    public BeOnUserId getSource() {
        return this.source;
    }

    public BeOnEmergency setLocation(BeOnLocation beOnLocation) {
        this.location = new BeOnLocation(beOnLocation);
        return this;
    }

    public BeOnLocation getLocation() {
        return this.location;
    }

    public boolean equals(Object obj) {
        BeOnUserId beOnUserId;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof BeOnEmergency)) {
            BeOnEmergency beOnEmergency = (BeOnEmergency) obj;
            BeOnEntity beOnEntity = beOnEmergency.target;
            BeOnUserId beOnUserId2 = beOnEmergency.source;
            BeOnEntity beOnEntity2 = this.target;
            if (beOnEntity2 != null && beOnEntity != null && beOnEntity2.equals(beOnEntity)) {
                return true;
            }
            if (this.target == null && beOnEntity == null && (beOnUserId = this.source) != null && beOnUserId.equals(beOnUserId2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        BeOnEntity beOnEntity = this.target;
        int i = 0;
        int hashCode = ((beOnEntity == null ? 0 : beOnEntity.hashCode()) + 31) * 31;
        BeOnUserId beOnUserId = this.source;
        if (beOnUserId != null) {
            i = beOnUserId.hashCode();
        }
        return hashCode + i;
    }
}
