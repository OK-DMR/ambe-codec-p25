package com.harris.rf.bbptt.common.event;

import com.harris.rf.bbptt.common.event.BeOnEvent;
import com.harris.rf.bbptt.core.BeOnEntity;
import com.harris.rf.bbptt.core.BeOnLocation;
import com.harris.rf.bbptt.core.BeOnUserId;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.Date;
/* loaded from: classes.dex */
public class BeOnCallEvent extends BeOnEvent implements Serializable {
    private int conversation;
    private boolean emergency;
    private boolean encrypted;
    private long endTime;
    private long startTime;
    private String fileLocation = null;
    private FileOutputStream audioFileStrm = null;
    private String annGroupName = null;

    public BeOnCallEvent() {
    }

    public BeOnCallEvent(long j, BeOnUserId beOnUserId, BeOnEntity beOnEntity, BeOnLocation beOnLocation, long j2, long j3, boolean z, boolean z2, String str, int i, int i2, int i3, FileOutputStream fileOutputStream) {
        super(j, BeOnEvent.EventType.EVENT_TYPE_CALL.getValue(), beOnUserId, beOnEntity, beOnLocation, i2, i3);
        setStartTimeInMillis(j2);
        setEndTimeInMillis(j3);
        setEmergency(z);
        setFileLocation(str);
        setConversation(i);
        setEncrypted(z2);
    }

    public BeOnCallEvent(long j, BeOnUserId beOnUserId, BeOnEntity beOnEntity, BeOnLocation beOnLocation, long j2, long j3, boolean z, boolean z2, String str, int i, int i2, int i3, FileOutputStream fileOutputStream, String str2) {
        super(j, BeOnEvent.EventType.EVENT_TYPE_CALL.getValue(), beOnUserId, beOnEntity, beOnLocation, i2, i3);
        setStartTimeInMillis(j2);
        setEndTimeInMillis(j3);
        setEmergency(z);
        setFileLocation(str);
        setConversation(i);
        setEncrypted(z2);
        setAudioFileStrm(fileOutputStream);
        setAnnGroupName(str2);
    }

    public Date getStartTime() {
        return new Date(this.startTime);
    }

    public long getStartTimeInMillis() {
        return this.startTime;
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

    public long getEndTimeInMillis() {
        return this.endTime;
    }

    public void setEndTimeInMillis(long j) {
        this.endTime = j;
    }

    public void setEndTime(Date date) {
        this.endTime = date.getTime();
    }

    public boolean isEmergency() {
        return this.emergency;
    }

    public void setEmergency(boolean z) {
        this.emergency = z;
    }

    public boolean isEncrypted() {
        return this.encrypted;
    }

    public void setEncrypted(boolean z) {
        this.encrypted = z;
    }

    public String getFileLocation() {
        return this.fileLocation;
    }

    public void setFileLocation(String str) {
        this.fileLocation = str;
    }

    public int getConversation() {
        return this.conversation;
    }

    public void setConversation(int i) {
        this.conversation = i;
    }

    public FileOutputStream getAudioFileStrm() {
        return this.audioFileStrm;
    }

    public void setAudioFileStrm(FileOutputStream fileOutputStream) {
        this.audioFileStrm = fileOutputStream;
    }

    public String getAnnGroupName() {
        return this.annGroupName;
    }

    public boolean isAnnouncement() {
        return this.annGroupName != null;
    }

    public void setAnnGroupName(String str) {
        this.annGroupName = str;
    }
}
