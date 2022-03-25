package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public class BeOnUser extends BeOnUserId {
    public static final int UE_TYPE_BEON = 1;
    public static final int UE_TYPE_CONSOLE = 5;
    public static final int UE_TYPE_OPENSKY = 3;
    public static final int UE_TYPE_OTHER = 4;
    public static final int UE_TYPE_P25 = 2;
    public static final int UE_TYPE_UNKNOWN = 0;
    protected String name;

    public BeOnUser() {
    }

    public BeOnUser(BeOnUserId beOnUserId, String str) {
        super(beOnUserId);
        this.name = str;
    }

    public BeOnUser(BeOnUser beOnUser) {
        super(beOnUser);
        this.name = beOnUser.getName();
    }

    @Override // com.harris.rf.bbptt.core.BeOnUserId
    public boolean equals(Object obj) {
        return this == obj || (obj != null && (obj instanceof BeOnUser) && super.equals((BeOnUser) obj));
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    @Override // com.harris.rf.bbptt.core.BeOnUserId
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.harris.rf.bbptt.core.BeOnUserId
    public String toString() {
        return this.name + "-" + super.toString();
    }
}
