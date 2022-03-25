package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public class BeOnTextMessage {
    public static int MAX_TEXT_LENGTH_BYTES = 214;
    protected int groupTextReceiptType;
    protected int groupTextReceivedCount;
    protected boolean isReadReceiptRequested;
    protected String message;
    protected int referenceNumber;
    protected BeOnUserId source;
    protected BeOnEntity target;
    protected long timeSent;

    public BeOnTextMessage() {
    }

    public BeOnTextMessage(BeOnUserId beOnUserId, BeOnEntity beOnEntity, String str, long j, int i, boolean z, int i2, int i3) {
        this.source = beOnUserId;
        this.target = beOnEntity;
        this.message = str;
        this.timeSent = j;
        this.referenceNumber = i;
        this.isReadReceiptRequested = z;
        this.groupTextReceiptType = i2;
        this.groupTextReceivedCount = i3;
    }

    public BeOnTextMessage(BeOnUserId beOnUserId, BeOnEntity beOnEntity, String str, int i) {
        this.source = beOnUserId;
        this.target = beOnEntity;
        this.message = str;
        this.referenceNumber = i;
        this.groupTextReceiptType = 50;
        this.groupTextReceivedCount = 0;
        this.timeSent = 0L;
    }

    public BeOnTextMessage(BeOnTextMessage beOnTextMessage) {
        this.source = beOnTextMessage.source;
        this.target = makeNewBeOnEntity(beOnTextMessage.target);
        this.message = beOnTextMessage.message;
        this.referenceNumber = beOnTextMessage.referenceNumber;
        this.isReadReceiptRequested = beOnTextMessage.isReadReceiptRequested;
        this.groupTextReceiptType = beOnTextMessage.groupTextReceiptType;
        this.groupTextReceivedCount = beOnTextMessage.groupTextReceivedCount;
        this.timeSent = beOnTextMessage.timeSent;
    }

    public BeOnUserId getSource() {
        return this.source;
    }

    public BeOnEntity getTarget() {
        return this.target;
    }

    public String getText() {
        return this.message;
    }

    public boolean isGroupText() {
        BeOnEntity beOnEntity = this.target;
        return beOnEntity != null && beOnEntity.isGroupId();
    }

    public int getReferenceNumber() {
        return this.referenceNumber;
    }

    public boolean isReadReceiptRequested() {
        return this.isReadReceiptRequested;
    }

    public long getTimeSent() {
        return this.timeSent;
    }

    public int getGroupTextReceiptType() {
        return this.groupTextReceiptType;
    }

    public int getGroupTextReceivedCount() {
        return this.groupTextReceivedCount;
    }

    public int hashCode() {
        this.source.hashCode();
        this.target.hashCode();
        return this.referenceNumber * 31;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BeOnTextMessage)) {
            return false;
        }
        BeOnTextMessage beOnTextMessage = (BeOnTextMessage) obj;
        return this.source.equals(beOnTextMessage.source) && this.target.equals(beOnTextMessage.target) && this.referenceNumber == beOnTextMessage.referenceNumber;
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
