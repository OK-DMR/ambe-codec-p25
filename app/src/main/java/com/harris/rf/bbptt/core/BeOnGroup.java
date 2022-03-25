package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public class BeOnGroup extends BeOnGroupId {
    public static final int RECEIPT_COUNT = 150;
    public static final int RECEIPT_NONE = 50;
    public static final int RECEIPT_ONE = 100;
    private String name;
    private int textReceipt;

    public BeOnGroup() {
    }

    public BeOnGroup(int i, String str, int i2) {
        super(i);
        this.name = str;
        this.textReceipt = i2;
    }

    public BeOnGroup(BeOnGroup beOnGroup) {
        super(beOnGroup.groupId);
        this.name = beOnGroup.name;
        this.textReceipt = beOnGroup.textReceipt;
    }

    @Override // com.harris.rf.bbptt.core.BeOnGroupId
    public boolean equals(Object obj) {
        return this == obj || (obj != null && (obj instanceof BeOnGroup) && super.equals(obj));
    }

    public String getName() {
        return this.name;
    }

    public BeOnGroup setName(String str) {
        this.name = str;
        return this;
    }

    public int getGroupTextReceipt() {
        return this.textReceipt;
    }

    public BeOnGroup setGroupTextReceipt(int i) {
        this.textReceipt = i;
        return this;
    }

    @Override // com.harris.rf.bbptt.core.BeOnGroupId
    public int hashCode() {
        return super.hashCode();
    }
}
