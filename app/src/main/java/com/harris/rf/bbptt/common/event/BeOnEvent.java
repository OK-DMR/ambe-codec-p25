package com.harris.rf.bbptt.common.event;

import com.harris.rf.bbptt.core.BeOnEntity;
import com.harris.rf.bbptt.core.BeOnGroupId;
import com.harris.rf.bbptt.core.BeOnLocation;
import com.harris.rf.bbptt.core.BeOnPatchId;
import com.harris.rf.bbptt.core.BeOnSimulselectId;
import com.harris.rf.bbptt.core.BeOnUserId;
/* loaded from: classes.dex */
public abstract class BeOnEvent {
    private long id;
    private BeOnLocation location;
    private int reason;
    private BeOnUserId source;
    private int status;
    private BeOnEntity target;
    private EventType type;

    /* loaded from: classes.dex */
    public enum EventType {
        EVENT_TYPE_CONVERSATION(-1),
        EVENT_TYPE_CALL(0),
        EVENT_TYPE_EMERGENCY(1),
        EVENT_TYPE_TEXT(2),
        EVENT_TYPE_USER(3);
        
        private int value;

        EventType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public static EventType getFromValue(int i) {
            if (i == 0) {
                return EVENT_TYPE_CALL;
            }
            if (i == 1) {
                return EVENT_TYPE_EMERGENCY;
            }
            if (i == 2) {
                return EVENT_TYPE_TEXT;
            }
            if (i != 3) {
                return null;
            }
            return EVENT_TYPE_USER;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BeOnEvent() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BeOnEvent(long j, int i, BeOnUserId beOnUserId, BeOnEntity beOnEntity, BeOnLocation beOnLocation, int i2, int i3) {
        this.id = j;
        this.type = EventType.getFromValue(i);
        this.source = beOnUserId;
        this.target = beOnEntity;
        this.location = beOnLocation;
        this.status = i2;
        this.reason = i3;
    }

    protected BeOnEvent(BeOnEvent beOnEvent) {
        this.id = beOnEvent.id;
        this.type = beOnEvent.type;
        this.source = (BeOnUserId) makeNewBeOnEntity(beOnEvent.source);
        this.target = makeNewBeOnEntity(beOnEvent.target);
        this.location = new BeOnLocation(beOnEvent.location);
        this.status = beOnEvent.status;
        this.reason = beOnEvent.reason;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long j) {
        this.id = j;
    }

    public EventType getType() {
        return this.type;
    }

    public void setType(EventType eventType) {
        this.type = eventType;
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

    public BeOnLocation getLocation() {
        return this.location;
    }

    public void setLocation(BeOnLocation beOnLocation) {
        this.location = beOnLocation;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public int getReason() {
        return this.reason;
    }

    public void setReason(int i) {
        this.reason = i;
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
