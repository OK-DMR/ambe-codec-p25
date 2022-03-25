package com.harris.rf.bbptt.common.event;

import com.harris.rf.bbptt.core.IBbPttCore;
/* loaded from: classes.dex */
public class BeOnEventManager implements IBeOnEventManager {
    private long eventManagerHandle = 0;

    private native int nativeCancelPlayback(long j, long j2);

    private native long nativeCreateBeOnEventManager();

    private native int nativeDeleteAllEvents(long j);

    private native int nativeDeleteEventById(long j, long j2);

    private native int nativeDeleteEventsByConversation(long j, int i);

    private native int nativeDeregisterEventManagerForCoreEvents(long j, long j2);

    private native void nativeDestroyBeOnEventManager(long j);

    private native int nativeGetConversationTimeout(long j);

    private native IBeOnQueryResult<BeOnEvent> nativeGetEvents(long j, BeOnEventRule beOnEventRule);

    private native IBeOnQueryResult<BeOnEvent> nativeGetNextPage(long j, IBeOnQueryResult<BeOnEvent> iBeOnQueryResult);

    private native IBeOnQueryResult<BeOnEvent> nativeGetPage(long j, int i, IBeOnQueryResult<BeOnEvent> iBeOnQueryResult);

    private native IBeOnQueryResult<BeOnEvent> nativeGetPreviousPage(long j, IBeOnQueryResult<BeOnEvent> iBeOnQueryResult);

    private native int nativeInitialize(long j);

    private native boolean nativeIsInitialized(long j);

    private native boolean nativeIsRecordOnCall(long j);

    private native boolean nativeIsStarted(long j);

    private native int nativeRegisterEventManagerForCoreEvents(long j, long j2);

    private native int nativeReleaseResult(long j, IBeOnQueryResult<BeOnEvent> iBeOnQueryResult);

    private native int nativeSetConversationTimeout(long j, int i);

    private native int nativeSetDataDir(long j, String str);

    private native int nativeSetMaxNumEventsInDB(long j, int i);

    private native void nativeSetRecordOnCall(long j, boolean z);

    private native int nativeShutdown(long j);

    private native int nativeStartPlayback(long j, long j2, IBeOnAudioPlaybackProvider iBeOnAudioPlaybackProvider, BeOnCallEvent beOnCallEvent);

    private native int nativeStartup(long j);

    private native int nativeUninitialize(long j);

    public BeOnEventManager() {
        createBeOnEventManager();
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public void createBeOnEventManager() {
        if (this.eventManagerHandle == 0) {
            this.eventManagerHandle = nativeCreateBeOnEventManager();
        }
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public void destroyBeOnEventManager() {
        nativeDestroyBeOnEventManager(this.eventManagerHandle);
        this.eventManagerHandle = 0L;
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public IBbPttCore.Status setDataDir(String str) {
        return IBbPttCore.Status.values()[nativeSetDataDir(this.eventManagerHandle, str)];
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public IBbPttCore.Status initialize() {
        return IBbPttCore.Status.values()[nativeInitialize(this.eventManagerHandle)];
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public IBbPttCore.Status uninitialize() {
        return IBbPttCore.Status.values()[nativeUninitialize(this.eventManagerHandle)];
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public boolean isInitialized() {
        return nativeIsInitialized(this.eventManagerHandle);
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public IBbPttCore.Status startup() {
        return IBbPttCore.Status.values()[nativeStartup(this.eventManagerHandle)];
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public IBbPttCore.Status shutdown() {
        return IBbPttCore.Status.values()[nativeShutdown(this.eventManagerHandle)];
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public boolean isStarted() {
        return nativeIsStarted(this.eventManagerHandle);
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public IBbPttCore.Status registerEventManagerForCoreEvents(long j) {
        return IBbPttCore.Status.values()[nativeRegisterEventManagerForCoreEvents(this.eventManagerHandle, j)];
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public IBbPttCore.Status deregisterEventManagerForCoreEvents(long j) {
        return IBbPttCore.Status.values()[nativeDeregisterEventManagerForCoreEvents(this.eventManagerHandle, j)];
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public IBbPttCore.Status setConversationTimeout(int i) {
        return IBbPttCore.Status.values()[nativeSetConversationTimeout(this.eventManagerHandle, i)];
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public int getConversationTimeout() {
        return nativeGetConversationTimeout(this.eventManagerHandle);
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public boolean isRecordOnCall() {
        return nativeIsRecordOnCall(this.eventManagerHandle);
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public void setRecordOnCall(boolean z) {
        nativeSetRecordOnCall(this.eventManagerHandle, z);
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public IBbPttCore.Status startPlayback(long j, IBeOnAudioPlaybackProvider iBeOnAudioPlaybackProvider, BeOnCallEvent beOnCallEvent) {
        return IBbPttCore.Status.values()[nativeStartPlayback(this.eventManagerHandle, j, iBeOnAudioPlaybackProvider, beOnCallEvent)];
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public IBbPttCore.Status cancelPlayback(long j) {
        return IBbPttCore.Status.values()[nativeCancelPlayback(this.eventManagerHandle, j)];
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public IBeOnQueryResult<BeOnEvent> getEvents(BeOnEventRule beOnEventRule) {
        return nativeGetEvents(this.eventManagerHandle, beOnEventRule);
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public IBbPttCore.Status deleteEventById(long j) {
        return IBbPttCore.Status.values()[nativeDeleteEventById(this.eventManagerHandle, j)];
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public IBbPttCore.Status deleteEventsByConversation(int i) {
        return IBbPttCore.Status.values()[nativeDeleteEventsByConversation(this.eventManagerHandle, i)];
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public IBbPttCore.Status deleteAllEvents() {
        return IBbPttCore.Status.values()[nativeDeleteAllEvents(this.eventManagerHandle)];
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public IBbPttCore.Status releaseResult(IBeOnQueryResult<BeOnEvent> iBeOnQueryResult) {
        return IBbPttCore.Status.values()[nativeReleaseResult(this.eventManagerHandle, iBeOnQueryResult)];
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public IBeOnQueryResult<BeOnEvent> getNextPage(IBeOnQueryResult<BeOnEvent> iBeOnQueryResult) {
        return nativeGetNextPage(this.eventManagerHandle, iBeOnQueryResult);
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public IBeOnQueryResult<BeOnEvent> getPreviousPage(IBeOnQueryResult<BeOnEvent> iBeOnQueryResult) {
        return nativeGetPreviousPage(this.eventManagerHandle, iBeOnQueryResult);
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public IBeOnQueryResult<BeOnEvent> getPage(int i, IBeOnQueryResult<BeOnEvent> iBeOnQueryResult) {
        return nativeGetPage(this.eventManagerHandle, i, iBeOnQueryResult);
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnEventManager
    public IBbPttCore.Status setMaxNumEventsInDb(int i) {
        return IBbPttCore.Status.values()[nativeSetMaxNumEventsInDB(this.eventManagerHandle, i)];
    }
}
