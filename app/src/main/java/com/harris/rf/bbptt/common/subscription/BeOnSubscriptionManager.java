package com.harris.rf.bbptt.common.subscription;

import com.harris.rf.bbptt.core.BeOnEntity;
import com.harris.rf.bbptt.core.BeOnGroupId;
import com.harris.rf.bbptt.core.BeOnGroupMembership;
import com.harris.rf.bbptt.core.BeOnUserId;
import com.harris.rf.bbptt.core.BeOnUserPresenceLocation;
import com.harris.rf.bbptt.core.IBbPttCore;
/* loaded from: classes.dex */
public class BeOnSubscriptionManager implements IBeOnSubscriptionManager {
    private long handle = 0;

    private native int nativeAddListener(long j, int i, IBeOnSubscriptionManagerEventListener iBeOnSubscriptionManagerEventListener);

    private native int nativeClearSubscriptions(long j);

    private native long nativeCreateBeOnSubscriptionManager();

    private native int nativeDeregisterForCoreEvents(long j);

    private native void nativeDestroyBeOnSubscriptionManager(long j);

    private native BeOnGroupMembership nativeGetGroupMembership(long j, BeOnGroupId beOnGroupId);

    private native int nativeGetMaxNumberOfSubscriptions(long j);

    private native BeOnEntity[] nativeGetSubscriptions(long j, int[] iArr);

    private native BeOnUserPresenceLocation nativeGetUserPresenceLocation(long j, BeOnUserId beOnUserId);

    private native int nativeInitialize(long j);

    private native boolean nativeIsInitialized(long j);

    private native boolean nativeIsStarted(long j);

    private native boolean nativeIsUserSubscribed(long j, BeOnUserId beOnUserId);

    private native int nativeRegisterForCoreEvents(long j, long j2);

    private native int nativeRemoveListener(long j, int i, IBeOnSubscriptionManagerEventListener iBeOnSubscriptionManagerEventListener);

    private native int nativeRequestOneTimeForGroupMembers(long j, BeOnGroupId[] beOnGroupIdArr, int i);

    private native int nativeRequestOneTimePresenceLocation(long j, BeOnEntity[] beOnEntityArr, int i);

    private native int nativeShutdown(long j);

    private native int nativeStartup(long j);

    private native int nativeSubscribeForGroupMembers(long j, BeOnGroupId[] beOnGroupIdArr, int i);

    private native int nativeSubscribeForPresenceLocation(long j, BeOnEntity[] beOnEntityArr, int i);

    private native int nativeUninitialize(long j);

    private native int nativeUnsubscribeFromGroupMembers(long j, BeOnGroupId[] beOnGroupIdArr, int i);

    private native int nativeUnsubscribeFromPresenceLocation(long j, BeOnEntity[] beOnEntityArr, int i);

    public BeOnSubscriptionManager() {
        createBeOnSubscriptionManager();
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public void createBeOnSubscriptionManager() {
        this.handle = nativeCreateBeOnSubscriptionManager();
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public void destroyBeOnSubscriptionManager() {
        nativeDestroyBeOnSubscriptionManager(this.handle);
        this.handle = 0L;
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public IBbPttCore.Status initialize() {
        return IBbPttCore.Status.values()[nativeInitialize(this.handle)];
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public IBbPttCore.Status uninitialize() {
        return IBbPttCore.Status.values()[nativeUninitialize(this.handle)];
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public boolean isInitialized() {
        return nativeIsInitialized(this.handle);
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public IBbPttCore.Status startup() {
        return IBbPttCore.Status.values()[nativeStartup(this.handle)];
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public IBbPttCore.Status shutdown() {
        return IBbPttCore.Status.values()[nativeShutdown(this.handle)];
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public boolean isStarted() {
        return nativeIsStarted(this.handle);
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public IBbPttCore.Status registerForCoreEvents(long j) {
        return IBbPttCore.Status.values()[nativeRegisterForCoreEvents(this.handle, j)];
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public IBbPttCore.Status deregisterForCoreEvents() {
        return IBbPttCore.Status.values()[nativeDeregisterForCoreEvents(this.handle)];
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public IBbPttCore.Status addListener(int i, IBeOnSubscriptionManagerEventListener iBeOnSubscriptionManagerEventListener) {
        return IBbPttCore.Status.values()[nativeAddListener(this.handle, i, iBeOnSubscriptionManagerEventListener)];
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public IBbPttCore.Status removeListener(int i, IBeOnSubscriptionManagerEventListener iBeOnSubscriptionManagerEventListener) {
        return IBbPttCore.Status.values()[nativeRemoveListener(this.handle, i, iBeOnSubscriptionManagerEventListener)];
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public boolean isUserSubscribed(BeOnUserId beOnUserId) {
        return nativeIsUserSubscribed(this.handle, beOnUserId);
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public IBbPttCore.Status clearSubscriptions() {
        return IBbPttCore.Status.values()[nativeClearSubscriptions(this.handle)];
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public BeOnGroupMembership getGroupMembership(BeOnGroupId beOnGroupId) {
        return nativeGetGroupMembership(this.handle, beOnGroupId);
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public BeOnUserPresenceLocation getUserPresenceLocation(BeOnUserId beOnUserId) {
        return nativeGetUserPresenceLocation(this.handle, beOnUserId);
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public IBbPttCore.Status requestOneTimeForGroupMembers(BeOnGroupId[] beOnGroupIdArr, int i) {
        return IBbPttCore.Status.values()[nativeRequestOneTimeForGroupMembers(this.handle, beOnGroupIdArr, i)];
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public IBbPttCore.Status subscribeForGroupMembers(BeOnGroupId[] beOnGroupIdArr, int i) {
        return IBbPttCore.Status.values()[nativeSubscribeForGroupMembers(this.handle, beOnGroupIdArr, i)];
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public IBbPttCore.Status unsubscribeFromGroupMembers(BeOnGroupId[] beOnGroupIdArr, int i) {
        return IBbPttCore.Status.values()[nativeUnsubscribeFromGroupMembers(this.handle, beOnGroupIdArr, i)];
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public IBbPttCore.Status requestOneTimePresenceLocation(BeOnEntity[] beOnEntityArr, int i) {
        return IBbPttCore.Status.values()[nativeRequestOneTimePresenceLocation(this.handle, beOnEntityArr, i)];
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public IBbPttCore.Status subscribeForPresenceLocation(BeOnEntity[] beOnEntityArr, int i) {
        return IBbPttCore.Status.values()[nativeSubscribeForPresenceLocation(this.handle, beOnEntityArr, i)];
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public IBbPttCore.Status unsubscribeFromPresenceLocation(BeOnEntity[] beOnEntityArr, int i) {
        return IBbPttCore.Status.values()[nativeUnsubscribeFromPresenceLocation(this.handle, beOnEntityArr, i)];
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public BeOnEntity[] getSubscriptions(int[] iArr) {
        return nativeGetSubscriptions(this.handle, iArr);
    }

    @Override // com.harris.rf.bbptt.common.subscription.IBeOnSubscriptionManager
    public int getMaxNumberOfSubscriptions() {
        return nativeGetMaxNumberOfSubscriptions(this.handle);
    }
}
