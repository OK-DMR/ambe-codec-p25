package com.harris.rf.bbptt.common.event;

import com.harris.rf.bbptt.core.IBbPttCore;
/* loaded from: classes.dex */
public interface IBeOnEventManager {
    IBbPttCore.Status cancelPlayback(long j);

    void createBeOnEventManager();

    IBbPttCore.Status deleteAllEvents();

    IBbPttCore.Status deleteEventById(long j);

    IBbPttCore.Status deleteEventsByConversation(int i);

    IBbPttCore.Status deregisterEventManagerForCoreEvents(long j);

    void destroyBeOnEventManager();

    int getConversationTimeout();

    IBeOnQueryResult<BeOnEvent> getEvents(BeOnEventRule beOnEventRule);

    IBeOnQueryResult<BeOnEvent> getNextPage(IBeOnQueryResult<BeOnEvent> iBeOnQueryResult);

    IBeOnQueryResult<BeOnEvent> getPage(int i, IBeOnQueryResult<BeOnEvent> iBeOnQueryResult);

    IBeOnQueryResult<BeOnEvent> getPreviousPage(IBeOnQueryResult<BeOnEvent> iBeOnQueryResult);

    IBbPttCore.Status initialize();

    boolean isInitialized();

    boolean isRecordOnCall();

    boolean isStarted();

    IBbPttCore.Status registerEventManagerForCoreEvents(long j);

    IBbPttCore.Status releaseResult(IBeOnQueryResult<BeOnEvent> iBeOnQueryResult);

    IBbPttCore.Status setConversationTimeout(int i);

    IBbPttCore.Status setDataDir(String str);

    IBbPttCore.Status setMaxNumEventsInDb(int i);

    void setRecordOnCall(boolean z);

    IBbPttCore.Status shutdown();

    IBbPttCore.Status startPlayback(long j, IBeOnAudioPlaybackProvider iBeOnAudioPlaybackProvider, BeOnCallEvent beOnCallEvent);

    IBbPttCore.Status startup();

    IBbPttCore.Status uninitialize();
}
