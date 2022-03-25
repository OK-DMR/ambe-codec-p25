package com.harris.rf.bbptt.core;

import java.util.List;
/* loaded from: classes.dex */
public interface IBbPttCore {
    public static final int PASSWORD_KEY_LENGTH = 16;

    /* loaded from: classes.dex */
    public enum Status {
        STATUS_SUCCESS,
        STATUS_FAILURE,
        STATUS_NO_OBJECT,
        STATUS_TRY_AGAIN,
        STATUS_NOT_SUPPORTED
    }

    Status addListener(int i, IBeOnEventListener iBeOnEventListener);

    boolean canRaiseEmergency();

    Status clearEmergency(BeOnEntity beOnEntity);

    Status continueTxPtt(BeOnEntity beOnEntity);

    Status deregisterUser();

    void destroy();

    Status freeMemory();

    long getCoreHandle();

    boolean getCoreInitiatedHeartbeatEnabled();

    Status getCurrentEmergencyGroup(BeOnGroupId beOnGroupId);

    Status getCurrentPresence(BeOnPresence beOnPresence);

    Status getCurrentProfile(BeOnProfile beOnProfile);

    Status getCurrentPtt(BeOnPtt beOnPtt);

    Status getCurrentUser(BeOnUser beOnUser);

    Status getEmergencies(List<BeOnEntity> list);

    EmergencyStatus getEmergencyStatus();

    Status getEntitiesInSimulselect(BeOnSimulselectId beOnSimulselectId, List<BeOnEntity> list);

    Status getGroupById(BeOnGroup beOnGroup);

    Status getGroupInProfile(int i, int i2, BeOnGroupInProfile beOnGroupInProfile);

    Status getGroupInProfileById(int i, BeOnGroupInProfile beOnGroupInProfile);

    int getGroupScanMask();

    Status getGroupsInPatch(BeOnPatchId beOnPatchId, List<BeOnGroupId> list);

    Status getGroupsInProfile(int i, List<BeOnGroupInProfile> list);

    Status getKeyPresences(List<BeOnKeyPresence> list);

    Status getLastPtt(BeOnPtt beOnPtt);

    Status getLocation(BeOnLocation beOnLocation);

    int getNumPresences();

    int getNumProfiles();

    Status getPatchesAndSimulselects(List<BeOnEntity> list);

    Status getPatchesAndSimulselectsForEntity(BeOnEntity beOnEntity, List<BeOnEntity> list);

    Status getPresence(int i, BeOnPresence beOnPresence);

    Status getPresences(List<BeOnPresence> list);

    Status getProfile(int i, BeOnProfile beOnProfile);

    Status getProfileName(int i, String[] strArr);

    Status getProfiles(List<BeOnProfile> list);

    ProvisioningStatus getProvisioningStatus();

    int getSelectedGroupIndex();

    int getSelectedPresenceIndex();

    int getSelectedProfileIndex();

    Status getSmartLocationConfiguration(int[] iArr, int[] iArr2, int[] iArr3);

    int getTalkBackTimerDuration();

    Status getTileServerUrl(String[] strArr);

    Status getVideoServer(String[] strArr, int[] iArr);

    Status ignorePtt(BeOnUserId beOnUserId);

    Status initialize();

    boolean isAirlinkEncrypted();

    boolean isAppLockRequired();

    boolean isAuthenticationKeyLoaded();

    boolean isCallRecordingAllowed();

    boolean isDeviceLockRequired();

    boolean isEntityEncrypted(BeOnEntity beOnEntity);

    boolean isFeatureEnabled(FeatureType featureType);

    boolean isInEmergency(BeOnEntity beOnEntity);

    boolean isInitialized();

    boolean isKeyLoaded(BeOnEntity beOnEntity);

    boolean isKmfReady();

    boolean isKmfRegistered();

    boolean isLockRequiredToSavePassword();

    boolean isOtarReady();

    boolean isScanningEnabled();

    boolean isScanningLocked();

    boolean isSmartLocationEnabled();

    boolean isStarted();

    boolean isUserRegistered();

    boolean isVidaConnected();

    Status loadKeyFile(String str, byte[] bArr);

    Status markTextMessageRead(BeOnTextMessage beOnTextMessage);

    Status notifyDataConnectionChange();

    Status notifyDataConnectionStatus(DataConnectionStatus dataConnectionStatus, String str, int i);

    Status playPlaybackAudio(byte[] bArr, int i);

    Status raiseEmergency();

    Status registerUser(BeOnUserId beOnUserId, byte[] bArr);

    Status removeListener(int i, IBeOnEventListener iBeOnEventListener);

    Status requestPresenceLocation(List<BeOnEntity> list);

    Status requestRekey();

    Status resetRsiMessageNumbers();

    Status sendHeartbeat();

    Status sendTextMessage(BeOnTextMessage beOnTextMessage);

    Status sendTxPttAudio(BeOnEntity beOnEntity, int i, short[] sArr, int i2);

    Status sendTxPttFrame(BeOnEntity beOnEntity, byte[] bArr, int i);

    Status setAudioProvider(IBeOnAudioProvider iBeOnAudioProvider);

    Status setClientType(ClientType clientType);

    Status setContactListHash(byte[] bArr, int i);

    Status setCoreInitiatedHeartbeatEnabled(boolean z);

    Status setDataConnectionProvider(IBeOnDataConnectionProvider iBeOnDataConnectionProvider);

    Status setDataDir(String str);

    Status setDeviceConfiguration(int i, String str);

    Status setEncryptIcalls(boolean z);

    Status setEncryptionProvider(IBeOnEncryptionProvider iBeOnEncryptionProvider);

    Status setGroupScanMask(int i);

    Status setLocation(BeOnLocation beOnLocation, boolean z);

    Status setNetworkConfiguration(String str, int i, String str2, int i2, int i3);

    Status setPowerManagementProvider(IBeOnPowerManagementProvider iBeOnPowerManagementProvider);

    Status setPresence(BeOnPresence beOnPresence);

    Status setScanningEnabled(boolean z);

    Status setSelectedGroup(int i);

    Status setSelectedPresence(int i);

    Status setSelectedProfile(int i);

    Status setSmartLocationConfiguration(int i, int i2, int i3);

    Status setSmartLocationEnabled(boolean z);

    Status setTalkBackTimerDuration(int i);

    Status setWorkQueueProvider(IBeOnWorkQueueProvider iBeOnWorkQueueProvider);

    boolean shouldEncryptIcalls();

    Status shutdown();

    Status startPlaybackAudio();

    Status startTxPtt(BeOnEntity beOnEntity);

    Status startup();

    Status stopPlaybackAudio();

    Status stopTxPtt(BeOnEntity beOnEntity);

    Status subscribeToPresenceLocation(List<BeOnEntity> list, boolean z);

    Status testVidaConnection(String str, int i, int i2, String str2);

    Status uninitialize();

    Status zeroize();

    /* loaded from: classes.dex */
    public enum DeviceIdType {
        DEVICE_ID_TYPE_NONE(0),
        DEVICE_ID_TYPE_MAC_ADDRESS(1),
        DEVICE_ID_TYPE_HARD_DRIVE_ID(2),
        DEVICE_ID_TYPE_CPU_ID(3),
        DEVICE_ID_TYPE_HOSTNAME(4),
        DEVICE_ID_TYPE_SYSTEM_UUID(5),
        DEVICE_ID_TYPE_SYSTEM_SERIAL(6),
        DEVICE_ID_TYPE_HOST_ID(7),
        DEVICE_ID_TYPE_ANDROID_ID(8),
        DEVICE_ID_TYPE_IMEI(9),
        DEVICE_ID_TYPE_MEID(10);
        
        private int value;

        DeviceIdType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public static DeviceIdType getFromValue(int i) {
            switch (i) {
                case 0:
                    return DEVICE_ID_TYPE_NONE;
                case 1:
                    return DEVICE_ID_TYPE_MAC_ADDRESS;
                case 2:
                    return DEVICE_ID_TYPE_HARD_DRIVE_ID;
                case 3:
                    return DEVICE_ID_TYPE_CPU_ID;
                case 4:
                    return DEVICE_ID_TYPE_HOSTNAME;
                case 5:
                    return DEVICE_ID_TYPE_SYSTEM_UUID;
                case 6:
                    return DEVICE_ID_TYPE_SYSTEM_SERIAL;
                case 7:
                    return DEVICE_ID_TYPE_HOST_ID;
                case 8:
                    return DEVICE_ID_TYPE_ANDROID_ID;
                case 9:
                    return DEVICE_ID_TYPE_IMEI;
                case 10:
                    return DEVICE_ID_TYPE_MEID;
                default:
                    return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public enum ClientType {
        CLIENT_WINDOWS(0),
        CLIENT_ANDROID(1),
        CLIENT_IOS(2),
        CLIENT_TYPE_LOTUS(3);
        
        private int value;

        ClientType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public static ClientType getFromValue(int i) {
            if (i == 0) {
                return CLIENT_WINDOWS;
            }
            if (i == 1) {
                return CLIENT_ANDROID;
            }
            if (i == 2) {
                return CLIENT_IOS;
            }
            if (i != 3) {
                return null;
            }
            return CLIENT_TYPE_LOTUS;
        }
    }

    /* loaded from: classes.dex */
    public enum ProvisioningStatus {
        PROVISIONING_STATUS_NOT_PROVISIONED(0),
        PROVISIONING_STATUS_IN_PROCESS(1),
        PROVISIONING_STATUS_PROVISIONED(2);
        
        private int value;

        ProvisioningStatus(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public static ProvisioningStatus getFromValue(int i) {
            if (i == 0) {
                return PROVISIONING_STATUS_NOT_PROVISIONED;
            }
            if (i == 1) {
                return PROVISIONING_STATUS_IN_PROCESS;
            }
            if (i != 2) {
                return null;
            }
            return PROVISIONING_STATUS_PROVISIONED;
        }
    }

    /* loaded from: classes.dex */
    public enum FeatureType {
        FEATURE_TYPE_MAPPING(1),
        FEATURE_TYPE_VIDEO(2),
        FEATURE_TYPE_TEXT_MESSAGING(4),
        FEATURE_TYPE_USER_PREFERENCES(8),
        FEATURE_TYPE_PTT_TRANSMIT(16),
        FEATURE_TYPE_PTT_RECEIVE(32),
        FEATURE_TYPE_PRESENCE_AND_LOCATION(64),
        FEATURE_TYPE_AES_ENCRYPTION(128),
        FEATURE_TYPE_USER_DEFINED_SCANNING(256);
        
        private int value;

        FeatureType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes.dex */
    public enum EmergencyStatus {
        EMERGENCY_STATUS_NONE(0),
        EMERGENCY_STATUS_LOCAL(1),
        EMERGENCY_STATUS_GROUP(2),
        EMERGENCY_STATUS_BOTH(3);
        
        private int value;

        EmergencyStatus(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes.dex */
    public enum DataConnectionStatus {
        DATA_CONNECTION_STATUS_SUCCESS(0),
        DATA_CONNECTION_STATUS_FAILURE(1);
        
        private int value;

        DataConnectionStatus(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }
}
