package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public class BeOnKeyPresence {
    private BeOnEntity entity;
    private boolean isKeyLoaded;
    private int keyId;
    private long sln;

    public BeOnKeyPresence(long j, BeOnEntity beOnEntity, int i, boolean z) {
        this.sln = j;
        this.entity = makeNewBeOnEntity(beOnEntity);
        this.keyId = i;
        this.isKeyLoaded = z;
    }

    public BeOnKeyPresence(BeOnKeyPresence beOnKeyPresence) {
        this.sln = beOnKeyPresence.sln;
        this.entity = makeNewBeOnEntity(beOnKeyPresence.entity);
        this.keyId = beOnKeyPresence.keyId;
        this.isKeyLoaded = beOnKeyPresence.isKeyLoaded;
    }

    public long getSln() {
        return this.sln;
    }

    public BeOnKeyPresence setSln(long j) {
        this.sln = j;
        return this;
    }

    public BeOnEntity getEntity() {
        return this.entity;
    }

    public BeOnKeyPresence setEntity(BeOnEntity beOnEntity) {
        this.entity = makeNewBeOnEntity(beOnEntity);
        return this;
    }

    public int getKeyId() {
        return this.keyId;
    }

    public BeOnKeyPresence setKeyId(int i) {
        this.keyId = i;
        return this;
    }

    public boolean isKeyLoaded() {
        return this.isKeyLoaded;
    }

    public BeOnKeyPresence setKeyLoaded(boolean z) {
        this.isKeyLoaded = z;
        return this;
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
