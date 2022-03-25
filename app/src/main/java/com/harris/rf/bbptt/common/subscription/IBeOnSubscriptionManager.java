package com.harris.rf.bbptt.common.subscription;

import com.harris.rf.bbptt.core.BeOnEntity;
import com.harris.rf.bbptt.core.BeOnGroupId;
import com.harris.rf.bbptt.core.BeOnGroupMembership;
import com.harris.rf.bbptt.core.BeOnUserId;
import com.harris.rf.bbptt.core.BeOnUserPresenceLocation;
import com.harris.rf.bbptt.core.IBbPttCore;
/* loaded from: classes.dex */
public interface IBeOnSubscriptionManager {
    IBbPttCore.Status addListener(int i, IBeOnSubscriptionManagerEventListener iBeOnSubscriptionManagerEventListener);

    IBbPttCore.Status clearSubscriptions();

    void createBeOnSubscriptionManager();

    IBbPttCore.Status deregisterForCoreEvents();

    void destroyBeOnSubscriptionManager();

    BeOnGroupMembership getGroupMembership(BeOnGroupId beOnGroupId);

    int getMaxNumberOfSubscriptions();

    BeOnEntity[] getSubscriptions(int[] iArr);

    BeOnUserPresenceLocation getUserPresenceLocation(BeOnUserId beOnUserId);

    IBbPttCore.Status initialize();

    boolean isInitialized();

    boolean isStarted();

    boolean isUserSubscribed(BeOnUserId beOnUserId);

    IBbPttCore.Status registerForCoreEvents(long j);

    IBbPttCore.Status removeListener(int i, IBeOnSubscriptionManagerEventListener iBeOnSubscriptionManagerEventListener);

    IBbPttCore.Status requestOneTimeForGroupMembers(BeOnGroupId[] beOnGroupIdArr, int i);

    IBbPttCore.Status requestOneTimePresenceLocation(BeOnEntity[] beOnEntityArr, int i);

    IBbPttCore.Status shutdown();

    IBbPttCore.Status startup();

    IBbPttCore.Status subscribeForGroupMembers(BeOnGroupId[] beOnGroupIdArr, int i);

    IBbPttCore.Status subscribeForPresenceLocation(BeOnEntity[] beOnEntityArr, int i);

    IBbPttCore.Status uninitialize();

    IBbPttCore.Status unsubscribeFromGroupMembers(BeOnGroupId[] beOnGroupIdArr, int i);

    IBbPttCore.Status unsubscribeFromPresenceLocation(BeOnEntity[] beOnEntityArr, int i);
}
