package com.harris.rf.bbptt.common.event;

import com.harris.rf.bbptt.common.event.BeOnEvent;
import com.harris.rf.bbptt.core.BeOnEntity;
import com.harris.rf.bbptt.core.BeOnLocation;
import com.harris.rf.bbptt.core.BeOnUserId;
import java.util.Date;
/* loaded from: classes.dex */
public class BeOnUserEvent extends BeOnEvent {
    private long time;

    public BeOnUserEvent() {
    }

    public BeOnUserEvent(long j, BeOnUserId beOnUserId, BeOnEntity beOnEntity, BeOnLocation beOnLocation, int i, int i2, long j2) {
        super(j, BeOnEvent.EventType.EVENT_TYPE_USER.getValue(), beOnUserId, beOnEntity, beOnLocation, i, i2);
        setTimeInMillis(j2);
    }

    public Date getTime() {
        return new Date(this.time);
    }

    public long getTimeInMillis() {
        return this.time;
    }

    public void setTimeInMillis(long j) {
        this.time = j;
    }

    public void setTime(Date date) {
        this.time = date.getTime();
    }
}
