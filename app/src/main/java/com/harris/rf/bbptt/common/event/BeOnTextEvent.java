package com.harris.rf.bbptt.common.event;

import com.harris.rf.bbptt.common.event.BeOnEvent;
import com.harris.rf.bbptt.core.BeOnEntity;
import com.harris.rf.bbptt.core.BeOnLocation;
import com.harris.rf.bbptt.core.BeOnUserId;
import java.util.Date;
/* loaded from: classes.dex */
public class BeOnTextEvent extends BeOnEvent {
    private long deliveredTime;
    private boolean isReadReceiptRequested;
    private long readTime;
    private int receiveCount;
    private int reference;
    private long sentTime;
    private String text;

    public BeOnTextEvent() {
    }

    public BeOnTextEvent(long j, BeOnUserId beOnUserId, BeOnEntity beOnEntity, BeOnLocation beOnLocation, long j2, long j3, long j4, int i, String str, int i2, int i3, int i4, int i5, boolean z) {
        super(j, BeOnEvent.EventType.EVENT_TYPE_TEXT.getValue(), beOnUserId, beOnEntity, beOnLocation, i4, i5);
        this.sentTime = j2;
        this.deliveredTime = j3;
        this.readTime = j4;
        this.reference = i;
        this.receiveCount = i3;
        this.text = str;
        this.isReadReceiptRequested = z;
    }

    public Date getDeliveredTime() {
        return new Date(this.deliveredTime);
    }

    public long getDeliveredTimeInMillis() {
        return this.deliveredTime;
    }

    public Date getReadTime() {
        return new Date(this.readTime);
    }

    public long getReadTimeInMillis() {
        return this.readTime;
    }

    public int getReceiveCount() {
        return this.receiveCount;
    }

    public int getReference() {
        return this.reference;
    }

    public Date getSentTime() {
        return new Date(this.sentTime);
    }

    public long getSentTimeInMillis() {
        return this.sentTime;
    }

    public String getText() {
        return this.text;
    }

    public boolean getReadReceiptRequested() {
        return this.isReadReceiptRequested;
    }

    public void setDeliveredTime(long j) {
        this.deliveredTime = j;
    }

    public void setReceivedCount(int i) {
        this.receiveCount = i;
    }

    public void setReadTime(long j) {
        this.readTime = j;
    }

    public void setReference(int i) {
        this.reference = i;
    }

    public void setSentTime(long j) {
        this.sentTime = j;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setReadReceiptRequested(boolean z) {
        this.isReadReceiptRequested = z;
    }
}
