package com.harris.rf.bbptt.core;

import com.harris.rf.bbptt.core.IBbPttCore;
import java.util.List;
/* loaded from: classes.dex */
public class BbPttCore implements IBbPttCore {
    private final long coreHandle = nativeCreateBbPttCore();

    private native int nativeAddListener(long j, int i, IBeOnEventListener iBeOnEventListener);

    private native boolean nativeCanRaiseEmergency(long j);

    private native int nativeClearEmergency(long j, BeOnEntity beOnEntity);

    private native int nativeContinueTxPtt(long j, BeOnEntity beOnEntity);

    private static native long nativeCreateBbPttCore();

    private native int nativeDeregisterUser(long j);

    private static native void nativeDestroyBbPttCore(long j);

    private native int nativeFreeMemory(long j);

    private static native void nativeGetBbPttCoreVersion(int[] iArr, char[] cArr, int[] iArr2, int[] iArr3);

    private native boolean nativeGetCoreInitiatedHeartbeatEnabled(long j);

    private native int nativeGetCurrentEmergencyGroup(long j, BeOnGroupId beOnGroupId);

    private native int nativeGetCurrentPresence(long j, BeOnPresence beOnPresence);

    private native int nativeGetCurrentProfile(long j, BeOnProfile beOnProfile);

    private native int nativeGetCurrentPtt(long j, BeOnPtt beOnPtt);

    private native int nativeGetCurrentUser(long j, BeOnUser beOnUser);

    private native int nativeGetEmergencies(long j, List<BeOnEntity> list);

    private native int nativeGetEmergencyStatus(long j);

    private native int nativeGetEntitiesInSimulselect(long j, BeOnSimulselectId beOnSimulselectId, List<BeOnEntity> list);

    private native int nativeGetGroupById(long j, BeOnGroup beOnGroup);

    private native int nativeGetGroupInProfile(long j, int i, int i2, BeOnGroupInProfile beOnGroupInProfile);

    private native int nativeGetGroupInProfileById(long j, int i, BeOnGroupInProfile beOnGroupInProfile);

    private native int nativeGetGroupScanMask(long j);

    private native int nativeGetGroupsInPatch(long j, BeOnPatchId beOnPatchId, List<BeOnGroupId> list);

    private native int nativeGetGroupsInProfile(long j, int i, List<BeOnGroupInProfile> list);

    private native int nativeGetKeyPresences(long j, List<BeOnKeyPresence> list);

    private native int nativeGetLastPtt(long j, BeOnPtt beOnPtt);

    private native int nativeGetLocation(long j, BeOnLocation beOnLocation);

    private native int nativeGetNumPresences(long j);

    private native int nativeGetNumProfiles(long j);

    private native int nativeGetPatchesAndSimulselects(long j, List<BeOnEntity> list);

    private native int nativeGetPatchesAndSimulselectsForEntity(long j, BeOnEntity beOnEntity, List<BeOnEntity> list);

    private native int nativeGetPresence(long j, int i, BeOnPresence beOnPresence);

    private native int nativeGetPresences(long j, List<BeOnPresence> list);

    private native int nativeGetProfile(long j, int i, BeOnProfile beOnProfile);

    private native int nativeGetProfileName(long j, int i, String[] strArr);

    private native int nativeGetProfiles(long j, List<BeOnProfile> list);

    private native int nativeGetProvisioningStatus(long j);

    private native int nativeGetSelectedGroupIndex(long j);

    private native int nativeGetSelectedPresenceIndex(long j);

    private native int nativeGetSelectedProfileIndex(long j);

    private native int nativeGetSmartLocationConfiguration(long j, int[] iArr, int[] iArr2, int[] iArr3);

    private native int nativeGetTalkBackTimerDuration(long j);

    private native int nativeGetTileServerUrl(long j, String[] strArr);

    private native int nativeGetVideoServer(long j, String[] strArr, int[] iArr);

    private native int nativeIgnorePtt(long j, BeOnUserId beOnUserId);

    private native int nativeInitialize(long j);

    private native boolean nativeIsAirlinkEncrypted(long j);

    private native boolean nativeIsAppLockRequired(long j);

    private native boolean nativeIsAuthenticationKeyLoaded(long j);

    private native boolean nativeIsCallRecordingAllowed(long j);

    private native boolean nativeIsDeviceLockRequired(long j);

    private native boolean nativeIsEntityEncrypted(long j, BeOnEntity beOnEntity);

    private native boolean nativeIsFeatureEnabled(long j, int i);

    private native boolean nativeIsInEmergency(long j, BeOnEntity beOnEntity);

    private native boolean nativeIsInitialized(long j);

    private native boolean nativeIsKeyLoaded(long j, BeOnEntity beOnEntity);

    private native boolean nativeIsKmfReady(long j);

    private native boolean nativeIsKmfRegistered(long j);

    private native boolean nativeIsLockRequiredToSavePassword(long j);

    private native boolean nativeIsOtarReady(long j);

    private native boolean nativeIsScanningEnabled(long j);

    private native boolean nativeIsScanningLocked(long j);

    private native boolean nativeIsSmartLocationEnabled(long j);

    private native boolean nativeIsStarted(long j);

    private native boolean nativeIsUserRegistered(long j);

    private native boolean nativeIsVidaConnected(long j);

    private native int nativeLoadKeyFile(long j, String str, byte[] bArr);

    private native int nativeMarkTextMessageRead(long j, BeOnTextMessage beOnTextMessage);

    private native int nativeNotifyDataConnectionChange(long j);

    private native int nativeNotifyDataConnectionStatus(long j, int i, String str, int i2);

    private native int nativePlayPlaybackAudio(long j, byte[] bArr, int i);

    private native int nativeRaiseEmergency(long j);

    private native int nativeRegisterUser(long j, BeOnUserId beOnUserId, byte[] bArr);

    private native int nativeRemoveListener(long j, int i, IBeOnEventListener iBeOnEventListener);

    private native int nativeRequestRekey(long j);

    private native int nativeResetRsiMessageNumbers(long j);

    private native int nativeSendHeartbeat(long j);

    private native int nativeSendTextMessage(long j, BeOnTextMessage beOnTextMessage);

    private native int nativeSendTxPttAudio(long j, BeOnEntity beOnEntity, int i, short[] sArr, int i2);

    private native int nativeSendTxPttFrame(long j, BeOnEntity beOnEntity, byte[] bArr, int i);

    private native int nativeSetAudioProvider(long j, IBeOnAudioProvider iBeOnAudioProvider);

    private static native void nativeSetBbPttCoreLogLevel(int i);

    private static native void nativeSetBbPttCoreLogger(IBeOnLogger iBeOnLogger);

    private native int nativeSetClientType(long j, int i);

    private native int nativeSetContactListHash(long j, byte[] bArr, int i);

    private native int nativeSetCoreInitiatedHeartbeatEnabled(long j, boolean z);

    private native int nativeSetDataConnectionProvider(long j, IBeOnDataConnectionProvider iBeOnDataConnectionProvider);

    private native int nativeSetDataDir(long j, String str);

    private native int nativeSetDeviceConfiguration(long j, int i, String str);

    private native int nativeSetEncryptIcalls(long j, boolean z);

    private native int nativeSetEncryptionProvider(long j, IBeOnEncryptionProvider iBeOnEncryptionProvider);

    private native int nativeSetGroupScanMask(long j, int i);

    private native int nativeSetLocation(long j, BeOnLocation beOnLocation, boolean z);

    private native int nativeSetNetworkConfiguration(long j, String str, int i, String str2, int i2, int i3);

    private native int nativeSetPowerManagementProvider(long j, IBeOnPowerManagementProvider iBeOnPowerManagementProvider);

    private native int nativeSetPresence(long j, BeOnPresence beOnPresence);

    private native int nativeSetScanningEnabled(long j, boolean z);

    private native int nativeSetSelectedGroup(long j, int i);

    private native int nativeSetSelectedPresence(long j, int i);

    private native int nativeSetSelectedProfile(long j, int i);

    private native int nativeSetSmartLocationConfiguration(long j, int i, int i2, int i3);

    private native int nativeSetSmartLocationEnabled(long j, boolean z);

    private native int nativeSetTalkBackTimerDuration(long j, int i);

    private native int nativeSetWorkQueueProvider(long j, IBeOnWorkQueueProvider iBeOnWorkQueueProvider);

    private native boolean nativeShouldEncryptIcalls(long j);

    private native int nativeShutdown(long j);

    private native int nativeStartPlaybackAudio(long j);

    private native int nativeStartTxPtt(long j, BeOnEntity beOnEntity);

    private native int nativeStartup(long j);

    private native int nativeStopPlaybackAudio(long j);

    private native int nativeStopTxPtt(long j, BeOnEntity beOnEntity);

    private native int nativeTestVidaConnection(long j, String str, int i, int i2, String str2);

    private native int nativeUninitialize(long j);

    private native int nativeZeroize(long j);

    public static void load() {
        System.loadLibrary("crypto");
        System.loadLibrary("ssl");
        System.loadLibrary("secdll");
        System.loadLibrary("mutauth");
        System.loadLibrary("lib-core");
    }

    public static void getBbPttCoreVersion(int[] iArr, char[] cArr, int[] iArr2, int[] iArr3) {
        nativeGetBbPttCoreVersion(iArr, cArr, iArr2, iArr3);
    }

    public static void setBbPttCoreLogger(IBeOnLogger iBeOnLogger) {
        nativeSetBbPttCoreLogger(iBeOnLogger);
    }

    public static void setBbPttCoreLogLevel(int i) {
        nativeSetBbPttCoreLogLevel(i);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public long getCoreHandle() {
        return this.coreHandle;
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public void destroy() {
        nativeDestroyBbPttCore(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setDataDir(String str) {
        return IBbPttCore.Status.values()[nativeSetDataDir(this.coreHandle, str)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status initialize() {
        return IBbPttCore.Status.values()[nativeInitialize(this.coreHandle)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status uninitialize() {
        return IBbPttCore.Status.values()[nativeUninitialize(this.coreHandle)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isInitialized() {
        return nativeIsInitialized(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status startup() {
        return IBbPttCore.Status.values()[nativeStartup(this.coreHandle)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status shutdown() {
        return IBbPttCore.Status.values()[nativeShutdown(this.coreHandle)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isStarted() {
        return nativeIsStarted(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status freeMemory() {
        return IBbPttCore.Status.values()[nativeFreeMemory(this.coreHandle)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setNetworkConfiguration(String str, int i, String str2, int i2, int i3) {
        return IBbPttCore.Status.values()[nativeSetNetworkConfiguration(this.coreHandle, str, i, str2, i2, i3)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setDeviceConfiguration(int i, String str) {
        return IBbPttCore.Status.values()[nativeSetDeviceConfiguration(this.coreHandle, i, str)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setClientType(IBbPttCore.ClientType clientType) {
        return IBbPttCore.Status.values()[nativeSetClientType(this.coreHandle, clientType.getValue())];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setDataConnectionProvider(IBeOnDataConnectionProvider iBeOnDataConnectionProvider) {
        return IBbPttCore.Status.values()[nativeSetDataConnectionProvider(this.coreHandle, iBeOnDataConnectionProvider)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setAudioProvider(IBeOnAudioProvider iBeOnAudioProvider) {
        return IBbPttCore.Status.values()[nativeSetAudioProvider(this.coreHandle, iBeOnAudioProvider)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setPowerManagementProvider(IBeOnPowerManagementProvider iBeOnPowerManagementProvider) {
        return IBbPttCore.Status.values()[nativeSetPowerManagementProvider(this.coreHandle, iBeOnPowerManagementProvider)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setEncryptionProvider(IBeOnEncryptionProvider iBeOnEncryptionProvider) {
        return IBbPttCore.Status.values()[nativeSetEncryptionProvider(this.coreHandle, iBeOnEncryptionProvider)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setWorkQueueProvider(IBeOnWorkQueueProvider iBeOnWorkQueueProvider) {
        return IBbPttCore.Status.values()[nativeSetWorkQueueProvider(this.coreHandle, iBeOnWorkQueueProvider)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status addListener(int i, IBeOnEventListener iBeOnEventListener) {
        return IBbPttCore.Status.values()[nativeAddListener(this.coreHandle, i, iBeOnEventListener)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status removeListener(int i, IBeOnEventListener iBeOnEventListener) {
        return IBbPttCore.Status.values()[nativeRemoveListener(this.coreHandle, i, iBeOnEventListener)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status registerUser(BeOnUserId beOnUserId, byte[] bArr) {
        return IBbPttCore.Status.values()[nativeRegisterUser(this.coreHandle, beOnUserId, bArr)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status deregisterUser() {
        return IBbPttCore.Status.values()[nativeDeregisterUser(this.coreHandle)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isUserRegistered() {
        return nativeIsUserRegistered(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getCurrentUser(BeOnUser beOnUser) {
        return IBbPttCore.Status.values()[nativeGetCurrentUser(this.coreHandle, beOnUser)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setContactListHash(byte[] bArr, int i) {
        return IBbPttCore.Status.values()[nativeSetContactListHash(this.coreHandle, bArr, i)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isVidaConnected() {
        return nativeIsVidaConnected(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status testVidaConnection(String str, int i, int i2, String str2) {
        return IBbPttCore.Status.values()[nativeTestVidaConnection(this.coreHandle, str, i, i2, str2)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status notifyDataConnectionChange() {
        return IBbPttCore.Status.values()[nativeNotifyDataConnectionChange(this.coreHandle)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.ProvisioningStatus getProvisioningStatus() {
        return IBbPttCore.ProvisioningStatus.values()[nativeGetProvisioningStatus(this.coreHandle)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public int getNumProfiles() {
        return nativeGetNumProfiles(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getProfiles(List<BeOnProfile> list) {
        return IBbPttCore.Status.values()[nativeGetProfiles(this.coreHandle, list)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getProfile(int i, BeOnProfile beOnProfile) {
        return IBbPttCore.Status.values()[nativeGetProfile(this.coreHandle, i, beOnProfile)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getProfileName(int i, String[] strArr) {
        return IBbPttCore.Status.values()[nativeGetProfileName(this.coreHandle, i, strArr)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getGroupsInProfile(int i, List<BeOnGroupInProfile> list) {
        return IBbPttCore.Status.values()[nativeGetGroupsInProfile(this.coreHandle, i, list)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getGroupInProfile(int i, int i2, BeOnGroupInProfile beOnGroupInProfile) {
        return IBbPttCore.Status.values()[nativeGetGroupInProfile(this.coreHandle, i, i2, beOnGroupInProfile)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getGroupInProfileById(int i, BeOnGroupInProfile beOnGroupInProfile) {
        return IBbPttCore.Status.values()[nativeGetGroupInProfileById(this.coreHandle, i, beOnGroupInProfile)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getGroupById(BeOnGroup beOnGroup) {
        return IBbPttCore.Status.values()[nativeGetGroupById(this.coreHandle, beOnGroup)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public int getNumPresences() {
        return nativeGetNumPresences(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getPresences(List<BeOnPresence> list) {
        return IBbPttCore.Status.values()[nativeGetPresences(this.coreHandle, list)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getPresence(int i, BeOnPresence beOnPresence) {
        return IBbPttCore.Status.values()[nativeGetPresence(this.coreHandle, i, beOnPresence)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getTileServerUrl(String[] strArr) {
        return IBbPttCore.Status.values()[nativeGetTileServerUrl(this.coreHandle, strArr)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getVideoServer(String[] strArr, int[] iArr) {
        return IBbPttCore.Status.values()[nativeGetVideoServer(this.coreHandle, strArr, iArr)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isCallRecordingAllowed() {
        return nativeIsCallRecordingAllowed(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isDeviceLockRequired() {
        return nativeIsDeviceLockRequired(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isAppLockRequired() {
        return nativeIsAppLockRequired(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isLockRequiredToSavePassword() {
        return nativeIsLockRequiredToSavePassword(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isFeatureEnabled(IBbPttCore.FeatureType featureType) {
        return nativeIsFeatureEnabled(this.coreHandle, featureType.getValue());
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setSelectedProfile(int i) {
        return IBbPttCore.Status.values()[nativeSetSelectedProfile(this.coreHandle, i)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public int getSelectedProfileIndex() {
        return nativeGetSelectedProfileIndex(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setSelectedGroup(int i) {
        return IBbPttCore.Status.values()[nativeSetSelectedGroup(this.coreHandle, i)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public int getSelectedGroupIndex() {
        return nativeGetSelectedGroupIndex(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setSelectedPresence(int i) {
        return IBbPttCore.Status.values()[nativeSetSelectedPresence(this.coreHandle, i)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public int getSelectedPresenceIndex() {
        return nativeGetSelectedPresenceIndex(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setTalkBackTimerDuration(int i) {
        return IBbPttCore.Status.values()[nativeSetTalkBackTimerDuration(this.coreHandle, i)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public int getTalkBackTimerDuration() {
        return nativeGetTalkBackTimerDuration(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setSmartLocationEnabled(boolean z) {
        return IBbPttCore.Status.values()[nativeSetSmartLocationEnabled(this.coreHandle, z)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isSmartLocationEnabled() {
        return nativeIsSmartLocationEnabled(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setSmartLocationConfiguration(int i, int i2, int i3) {
        return IBbPttCore.Status.values()[nativeSetSmartLocationConfiguration(this.coreHandle, i, i2, i3)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getSmartLocationConfiguration(int[] iArr, int[] iArr2, int[] iArr3) {
        return IBbPttCore.Status.values()[nativeGetSmartLocationConfiguration(this.coreHandle, iArr, iArr2, iArr3)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setEncryptIcalls(boolean z) {
        return IBbPttCore.Status.values()[nativeSetEncryptIcalls(this.coreHandle, z)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean shouldEncryptIcalls() {
        return nativeShouldEncryptIcalls(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status startTxPtt(BeOnEntity beOnEntity) {
        return IBbPttCore.Status.values()[nativeStartTxPtt(this.coreHandle, beOnEntity)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status sendTxPttAudio(BeOnEntity beOnEntity, int i, short[] sArr, int i2) {
        return IBbPttCore.Status.values()[nativeSendTxPttAudio(this.coreHandle, beOnEntity, i, sArr, i2)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status sendTxPttFrame(BeOnEntity beOnEntity, byte[] bArr, int i) {
        return IBbPttCore.Status.values()[nativeSendTxPttFrame(this.coreHandle, beOnEntity, bArr, i)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status stopTxPtt(BeOnEntity beOnEntity) {
        return IBbPttCore.Status.values()[nativeStopTxPtt(this.coreHandle, beOnEntity)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status continueTxPtt(BeOnEntity beOnEntity) {
        return IBbPttCore.Status.values()[nativeContinueTxPtt(this.coreHandle, beOnEntity)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status ignorePtt(BeOnUserId beOnUserId) {
        return IBbPttCore.Status.values()[nativeIgnorePtt(this.coreHandle, beOnUserId)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getCurrentPtt(BeOnPtt beOnPtt) {
        return IBbPttCore.Status.values()[nativeGetCurrentPtt(this.coreHandle, beOnPtt)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getLastPtt(BeOnPtt beOnPtt) {
        return IBbPttCore.Status.values()[nativeGetLastPtt(this.coreHandle, beOnPtt)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean canRaiseEmergency() {
        return nativeCanRaiseEmergency(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status raiseEmergency() {
        return IBbPttCore.Status.values()[nativeRaiseEmergency(this.coreHandle)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status clearEmergency(BeOnEntity beOnEntity) {
        return IBbPttCore.Status.values()[nativeClearEmergency(this.coreHandle, beOnEntity)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.EmergencyStatus getEmergencyStatus() {
        return IBbPttCore.EmergencyStatus.values()[nativeGetEmergencyStatus(this.coreHandle)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isInEmergency(BeOnEntity beOnEntity) {
        return nativeIsInEmergency(this.coreHandle, beOnEntity);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getEmergencies(List<BeOnEntity> list) {
        return IBbPttCore.Status.values()[nativeGetEmergencies(this.coreHandle, list)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getCurrentEmergencyGroup(BeOnGroupId beOnGroupId) {
        return IBbPttCore.Status.values()[nativeGetCurrentEmergencyGroup(this.coreHandle, beOnGroupId)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isScanningLocked() {
        return nativeIsScanningLocked(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status sendTextMessage(BeOnTextMessage beOnTextMessage) {
        return IBbPttCore.Status.values()[nativeSendTextMessage(this.coreHandle, beOnTextMessage)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status markTextMessageRead(BeOnTextMessage beOnTextMessage) {
        return IBbPttCore.Status.values()[nativeMarkTextMessageRead(this.coreHandle, beOnTextMessage)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getCurrentProfile(BeOnProfile beOnProfile) {
        return IBbPttCore.Status.values()[nativeGetCurrentProfile(this.coreHandle, beOnProfile)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setScanningEnabled(boolean z) {
        return IBbPttCore.Status.values()[nativeSetScanningEnabled(this.coreHandle, z)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isScanningEnabled() {
        return nativeIsScanningEnabled(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getPatchesAndSimulselects(List<BeOnEntity> list) {
        return IBbPttCore.Status.values()[nativeGetPatchesAndSimulselects(this.coreHandle, list)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getGroupsInPatch(BeOnPatchId beOnPatchId, List<BeOnGroupId> list) {
        return IBbPttCore.Status.values()[nativeGetGroupsInPatch(this.coreHandle, beOnPatchId, list)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getEntitiesInSimulselect(BeOnSimulselectId beOnSimulselectId, List<BeOnEntity> list) {
        return IBbPttCore.Status.values()[nativeGetEntitiesInSimulselect(this.coreHandle, beOnSimulselectId, list)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getPatchesAndSimulselectsForEntity(BeOnEntity beOnEntity, List<BeOnEntity> list) {
        return IBbPttCore.Status.values()[nativeGetPatchesAndSimulselectsForEntity(this.coreHandle, beOnEntity, list)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setPresence(BeOnPresence beOnPresence) {
        return IBbPttCore.Status.values()[nativeSetPresence(this.coreHandle, beOnPresence)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getCurrentPresence(BeOnPresence beOnPresence) {
        return IBbPttCore.Status.values()[nativeGetCurrentPresence(this.coreHandle, beOnPresence)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setLocation(BeOnLocation beOnLocation, boolean z) {
        return IBbPttCore.Status.values()[nativeSetLocation(this.coreHandle, beOnLocation, z)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getLocation(BeOnLocation beOnLocation) {
        return IBbPttCore.Status.values()[nativeGetLocation(this.coreHandle, beOnLocation)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status requestPresenceLocation(List<BeOnEntity> list) {
        return IBbPttCore.Status.STATUS_FAILURE;
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status subscribeToPresenceLocation(List<BeOnEntity> list, boolean z) {
        return IBbPttCore.Status.STATUS_FAILURE;
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status loadKeyFile(String str, byte[] bArr) {
        return IBbPttCore.Status.values()[nativeLoadKeyFile(this.coreHandle, str, bArr)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isAuthenticationKeyLoaded() {
        return nativeIsAuthenticationKeyLoaded(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isEntityEncrypted(BeOnEntity beOnEntity) {
        return nativeIsEntityEncrypted(this.coreHandle, beOnEntity);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isKeyLoaded(BeOnEntity beOnEntity) {
        return nativeIsKeyLoaded(this.coreHandle, beOnEntity);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status zeroize() {
        return IBbPttCore.Status.values()[nativeZeroize(this.coreHandle)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status resetRsiMessageNumbers() {
        return IBbPttCore.Status.values()[nativeResetRsiMessageNumbers(this.coreHandle)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status requestRekey() {
        return IBbPttCore.Status.values()[nativeRequestRekey(this.coreHandle)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status getKeyPresences(List<BeOnKeyPresence> list) {
        return IBbPttCore.Status.values()[nativeGetKeyPresences(this.coreHandle, list)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isKmfRegistered() {
        return nativeIsKmfRegistered(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isKmfReady() {
        return nativeIsKmfReady(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isOtarReady() {
        return nativeIsOtarReady(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean isAirlinkEncrypted() {
        return nativeIsAirlinkEncrypted(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status notifyDataConnectionStatus(IBbPttCore.DataConnectionStatus dataConnectionStatus, String str, int i) {
        return IBbPttCore.Status.values()[nativeNotifyDataConnectionStatus(this.coreHandle, dataConnectionStatus.getValue(), str, i)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setCoreInitiatedHeartbeatEnabled(boolean z) {
        return IBbPttCore.Status.values()[nativeSetCoreInitiatedHeartbeatEnabled(this.coreHandle, z)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public boolean getCoreInitiatedHeartbeatEnabled() {
        return nativeGetCoreInitiatedHeartbeatEnabled(this.coreHandle);
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status sendHeartbeat() {
        return IBbPttCore.Status.values()[nativeSendHeartbeat(this.coreHandle)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status startPlaybackAudio() {
        return IBbPttCore.Status.STATUS_NOT_SUPPORTED;
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status playPlaybackAudio(byte[] bArr, int i) {
        return IBbPttCore.Status.STATUS_NOT_SUPPORTED;
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status stopPlaybackAudio() {
        return IBbPttCore.Status.STATUS_NOT_SUPPORTED;
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public IBbPttCore.Status setGroupScanMask(int i) {
        return IBbPttCore.Status.values()[nativeSetGroupScanMask(this.coreHandle, i)];
    }

    @Override // com.harris.rf.bbptt.core.IBbPttCore
    public int getGroupScanMask() {
        return nativeGetGroupScanMask(this.coreHandle);
    }
}
