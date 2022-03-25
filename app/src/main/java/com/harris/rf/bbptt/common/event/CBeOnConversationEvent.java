package com.harris.rf.bbptt.common.event;

import com.harris.rf.bbptt.core.BeOnEntity;
import com.harris.rf.bbptt.core.BeOnLocation;
import com.harris.rf.bbptt.core.BeOnUserId;
import java.util.Date;
/* loaded from: classes.dex */
public class CBeOnConversationEvent extends BeOnEvent {
    private long endTime;
    private long startTime;

    public CBeOnConversationEvent() {
    }

    public CBeOnConversationEvent(long j, int i, BeOnUserId beOnUserId, BeOnEntity beOnEntity, BeOnLocation beOnLocation, int i2, int i3, long j2, long j3) {
        super(j, i, beOnUserId, beOnEntity, beOnLocation, i2, i3);
        setStartTimeInMillis(j2);
        setEndTimeInMillis(j3);
    }

    public Date getStartTime() {
        return new Date(this.startTime);
    }

    public void setStartTimeInMillis(long j) {
        this.startTime = j;
    }

    public void setStartTime(Date date) {
        this.startTime = date.getTime();
    }

    public Date getEndTime() {
        return new Date(this.endTime);
    }

    public void setEndTimeInMillis(long j) {
        this.endTime = j;
    }

    public void setEndTime(Date date) {
        this.endTime = date.getTime();
    }
}
