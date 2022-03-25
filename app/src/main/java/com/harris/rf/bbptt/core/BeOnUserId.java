package com.harris.rf.bbptt.core;

import java.io.Serializable;
/* loaded from: classes.dex */
public class BeOnUserId extends BeOnEntity implements Serializable {
    private static final int AGENCY_LENGTH_BITS = 14;
    private static final int AGENCY_SHIFT_BITS = 14;
    private static final int REGION_LENGTH_BITS = 14;
    private static final int REGION_SHIFT_BITS = 28;
    private static final int USER_LENGTH_BITS = 14;
    private static final int USER_SHIFT_BITS = 0;
    private static final int WACN_LENGTH_BITS = 20;
    private static final int WACN_SHIFT_BITS = 42;
    protected int agency;
    protected int region;
    protected int user;
    protected int wacn;

    public BeOnUserId() {
    }

    public BeOnUserId(int i, int i2, int i3, int i4) {
        this.wacn = i;
        this.region = i2;
        this.agency = i3;
        this.user = i4;
    }

    public BeOnUserId(long j) {
        this.wacn = (int) ((j >> 42) & 1048575);
        this.region = (int) ((j >> 28) & 16383);
        this.agency = (int) ((j >> 14) & 16383);
        this.user = (int) ((j >> 0) & 16383);
    }

    public BeOnUserId(BeOnUserId beOnUserId) {
        this.wacn = beOnUserId.wacn;
        this.region = beOnUserId.region;
        this.agency = beOnUserId.agency;
        this.user = beOnUserId.user;
    }

    public int getWacn() {
        return this.wacn;
    }

    public BeOnUserId setWacn(int i) {
        this.wacn = i;
        return this;
    }

    public int getRegion() {
        return this.region;
    }

    public BeOnUserId setRegion(int i) {
        this.region = i;
        return this;
    }

    public int getAgency() {
        return this.agency;
    }

    public BeOnUserId setAgency(int i) {
        this.agency = i;
        return this;
    }

    public int getUser() {
        return this.user;
    }

    public BeOnUserId setUser(int i) {
        this.user = i;
        return this;
    }

    public long getBeOnUserIdValue() {
        return (this.user << 0) | (this.agency << 14) | (this.region << 28) | (this.wacn << 42);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BeOnUserId)) {
            return false;
        }
        BeOnUserId beOnUserId = (BeOnUserId) obj;
        return this.agency == beOnUserId.agency && this.region == beOnUserId.region && this.user == beOnUserId.user && this.wacn == beOnUserId.wacn;
    }

    public String toString() {
        return String.format("%04d", Integer.valueOf(this.wacn)) + ":" + String.format("%04d", Integer.valueOf(this.region)) + ":" + String.format("%04d", Integer.valueOf(this.agency)) + ":" + String.format("%04d", Integer.valueOf(this.user));
    }

    public int hashCode() {
        return ((((((this.agency + 31) * 31) + this.region) * 31) + this.user) * 31) + this.wacn;
    }

    @Override // com.harris.rf.bbptt.core.BeOnEntity
    public int getType() {
        return ENTITY_TYPE_USER;
    }

    @Override // com.harris.rf.bbptt.core.BeOnEntity
    public BeOnEntity cloneEntity() {
        return new BeOnUserId(this);
    }
}
