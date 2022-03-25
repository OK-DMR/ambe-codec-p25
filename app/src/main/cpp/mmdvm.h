#ifndef MMDVM_MMDVM_H
#define MMDVM_MMDVM_H
#include <jni.h>

extern "C"
JNIEXPORT jint JNICALL
Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeUpdateLocation(JNIEnv *env,
                                                                                jobject thiz,
                                                                                jlong j,
                                                                                jobject be_on_user_id,
                                                                                jobject be_on_location,
                                                                                jint i, jint i2);

extern "C"
JNIEXPORT jint JNICALL
Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeUpdateContact(JNIEnv *env,
                                                                               jobject thiz,
                                                                               jlong j,
                                                                               jobject be_on_contact,
                                                                               jobject be_on_contact2);
extern "C"
JNIEXPORT jint JNICALL
Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeUnregisterForCoreEvents(
        JNIEnv *env, jobject thiz, jlong j, jlong j2);
extern "C"
JNIEXPORT jint JNICALL
Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeUninitialize(JNIEnv *env,
                                                                              jobject thiz,
                                                                              jlong j);

extern "C"
JNIEXPORT jint JNICALL
Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeStartup(JNIEnv *env, jobject thiz,
                                                                         jlong j);
extern "C"
JNIEXPORT jint JNICALL
Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeShutdown(JNIEnv *env, jobject thiz,
                                                                          jlong j);
extern "C"
JNIEXPORT jint JNICALL
Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeSetDataDir(JNIEnv *env,
                                                                            jobject thiz, jlong j,
                                                                            jstring str);
extern "C"
JNIEXPORT jint JNICALL
Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeRegisterForCoreEvents(JNIEnv *env,
                                                                                       jobject thiz,
                                                                                       jlong j,
                                                                                       jlong j2);
extern "C"
JNIEXPORT jboolean
Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeIsStarted(JNIEnv *env,
                                                                           jobject thiz, jlong j);
extern "C"
JNIEXPORT jboolean JNICALL
Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeIsInitialized(JNIEnv *env,
                                                                               jobject thiz,
                                                                               jlong j);
extern "C"
JNIEXPORT jint JNICALL
Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeInitialize(JNIEnv *env,
                                                                            jobject thiz, jlong j);
extern "C"
JNIEXPORT jobjectArray JNICALL
Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeGetLocationHistory(JNIEnv *env,
                                                                                    jobject thiz,
                                                                                    jlong j,
                                                                                    jobject be_on_user_id);

extern "C"
JNIEXPORT jobjectArray JNICALL
Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeGetContactsByName(JNIEnv *env,
                                                                                   jobject thiz,
                                                                                   jlong j,
                                                                                   jstring str);
extern "C"
JNIEXPORT jobjectArray JNICALL
Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeGetContacts(JNIEnv *env,
                                                                             jobject thiz, jlong j,
                                                                             jstring str,
                                                                             jstring str2,
                                                                             jstring str3);
extern "C"
JNIEXPORT jint JNICALL
Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeGetContactCount(JNIEnv *env,
                                                                                 jobject thiz,
                                                                                 jlong j);
extern "C"
JNIEXPORT jobject JNICALL
Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeGetContact(JNIEnv *env,
                                                                            jobject thiz, jlong j,
                                                                            jobject be_on_user_id);
extern "C"
JNIEXPORT jobjectArray JNICALL
Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeGetAllContacts(JNIEnv *env,
                                                                                jobject thiz,
                                                                                jlong j);
extern "C"
JNIEXPORT void JNICALL
Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeDestroyBeOnContactManager(
        JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeDeleteContact(JNIEnv *env,
                                                                                       jobject thiz,
jlong j,
        jobject be_on_user_id);
extern "C"
JNIEXPORT jlong JNICALL
        Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeCreateBeOnContactManager(
        JNIEnv *env, jobject thiz);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_common_contact_BeOnContactManager_nativeAddContact(JNIEnv *env,
                                                                                    jobject thiz, jlong j,
        jobject be_on_contact);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeZeroize(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeUninitialize(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeTestVidaConnection(JNIEnv *env, jobject thiz, jlong j,
        jstring str, jint i, jint i2,
jstring str2);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeStopTxPtt(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_entity);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeStopPlaybackAudio(JNIEnv *env, jobject thiz,
jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeStartup(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeStartTxPtt(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_entity);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeStartPlaybackAudio(JNIEnv *env, jobject thiz,
jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeShutdown(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeShouldEncryptIcalls(JNIEnv *env, jobject thiz,
jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetWorkQueueProvider(JNIEnv *env, jobject thiz,
jlong j,
        jobject i_be_on_work_queue_provider);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetTalkBackTimerDuration(JNIEnv *env, jobject thiz,
jlong j, jint i);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetSmartLocationEnabled(JNIEnv *env, jobject thiz,
jlong j, jboolean z);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetSmartLocationConfiguration(JNIEnv *env,
                                                                                    jobject thiz, jlong j,
        jint i, jint i2,
        jint i3);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetSelectedProfile(JNIEnv *env, jobject thiz, jlong j,
        jint i);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetSelectedPresence(JNIEnv *env, jobject thiz,
jlong j, jint i);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetSelectedGroup(JNIEnv *env, jobject thiz, jlong j,
        jint i);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetScanningEnabled(JNIEnv *env, jobject thiz, jlong j,
        jboolean z);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetPresence(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_presence);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetPowerManagementProvider(JNIEnv *env, jobject thiz,
jlong j,
        jobject i_be_on_power_management_provider);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetNetworkConfiguration(JNIEnv *env, jobject thiz,
jlong j, jstring str, jint i,
        jstring str2, jint i2,
        jint i3);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetLocation(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_location, jboolean z);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetGroupScanMask(JNIEnv *env, jobject thiz, jlong j,
        jint i);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetEncryptionProvider(JNIEnv *env, jobject thiz,
jlong j,
        jobject i_be_on_encryption_provider);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetEncryptIcalls(JNIEnv *env, jobject thiz, jlong j,
        jboolean z);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetDeviceConfiguration(JNIEnv *env, jobject thiz,
jlong j, jint i, jstring str);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetDataDir(JNIEnv *env, jobject thiz, jlong j,
        jstring str);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetDataConnectionProvider(JNIEnv *env, jobject thiz,
jlong j,
        jobject i_be_on_data_connection_provider);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetCoreInitiatedHeartbeatEnabled(JNIEnv *env,
                                                                                       jobject thiz,
jlong j,
        jboolean z);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetContactListHash(JNIEnv *env, jobject thiz, jlong j,
        jbyteArray b_arr, jint i);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetClientType(JNIEnv *env, jobject thiz, jlong j,
        jint i);
extern "C"
JNIEXPORT void JNICALL
Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetBbPttCoreLogger(JNIEnv *env, jclass clazz,
        jobject i_be_on_logger);
extern "C"
JNIEXPORT void JNICALL
Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetBbPttCoreLogLevel(JNIEnv *env, jclass clazz,
        jint i);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSetAudioProvider(JNIEnv *env, jobject thiz, jlong j,
        jobject i_be_on_audio_provider);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSendTxPttFrame(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_entity, jbyteArray b_arr,
        jint i);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSendTxPttAudio(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_entity, jint i,
        jshortArray s_arr, jint i2);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSendTextMessage(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_text_message);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeSendHeartbeat(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeResetRsiMessageNumbers(JNIEnv *env, jobject thiz,
jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeRequestRekey(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeRemoveListener(JNIEnv *env, jobject thiz, jlong j,
        jint i,
jobject i_be_on_event_listener);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeRegisterUser(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_user_id,
jbyteArray b_arr);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeRaiseEmergency(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativePlayPlaybackAudio(JNIEnv *env, jobject thiz, jlong j,
        jbyteArray b_arr, jint i);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeNotifyDataConnectionStatus(JNIEnv *env, jobject thiz,
jlong j, jint i,
jstring str, jint i2);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeNotifyDataConnectionChange(JNIEnv *env, jobject thiz,
jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeMarkTextMessageRead(JNIEnv *env, jobject thiz,
jlong j,
        jobject be_on_text_message);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeLoadKeyFile(JNIEnv *env, jobject thiz, jlong j,
        jstring str, jbyteArray b_arr);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsVidaConnected(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsUserRegistered(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsStarted(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsSmartLocationEnabled(JNIEnv *env, jobject thiz,
jlong j);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsScanningLocked(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsScanningEnabled(JNIEnv *env, jobject thiz,
jlong j);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsOtarReady(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsLockRequiredToSavePassword(JNIEnv *env,
                                                                                   jobject thiz, jlong j);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsKmfRegistered(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsKmfReady(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsKeyLoaded(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_entity);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsInitialized(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsInEmergency(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_entity);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsFeatureEnabled(JNIEnv *env, jobject thiz, jlong j,
        jint i);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsEntityEncrypted(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_entity);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsDeviceLockRequired(JNIEnv *env, jobject thiz,
jlong j);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsCallRecordingAllowed(JNIEnv *env, jobject thiz,
jlong j);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsAuthenticationKeyLoaded(JNIEnv *env, jobject thiz,
jlong j);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsAppLockRequired(JNIEnv *env, jobject thiz,
jlong j);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIsAirlinkEncrypted(JNIEnv *env, jobject thiz,
jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeInitialize(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeIgnorePtt(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_user_id);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetVideoServer(JNIEnv *env, jobject thiz, jlong j,
        jobjectArray str_arr,
jintArray i_arr);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetTileServerUrl(JNIEnv *env, jobject thiz, jlong j,
        jobjectArray str_arr);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetTalkBackTimerDuration(JNIEnv *env, jobject thiz,
jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetSmartLocationConfiguration(JNIEnv *env,
                                                                                    jobject thiz, jlong j,
        jintArray i_arr,
jintArray i_arr2,
        jintArray i_arr3);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetSelectedProfileIndex(JNIEnv *env, jobject thiz,
jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetSelectedPresenceIndex(JNIEnv *env, jobject thiz,
jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetSelectedGroupIndex(JNIEnv *env, jobject thiz,
jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetProvisioningStatus(JNIEnv *env, jobject thiz,
jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetProfiles(JNIEnv *env, jobject thiz, jlong j,
        jobject list);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetProfileName(JNIEnv *env, jobject thiz, jlong j,
        jint i, jobjectArray str_arr);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetProfile(JNIEnv *env, jobject thiz, jlong j, jint i,
jobject be_on_profile);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetPresences(JNIEnv *env, jobject thiz, jlong j,
        jobject list);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetPresence(JNIEnv *env, jobject thiz, jlong j,
        jint i, jobject be_on_presence);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetPatchesAndSimulselectsForEntity(JNIEnv *env,
                                                                                         jobject thiz,
jlong j,
        jobject be_on_entity,
jobject list);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetPatchesAndSimulselects(JNIEnv *env, jobject thiz,
jlong j, jobject list);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetNumProfiles(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetNumPresences(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetLocation(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_location);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetLastPtt(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_ptt);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetKeyPresences(JNIEnv *env, jobject thiz, jlong j,
        jobject list);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetGroupsInProfile(JNIEnv *env, jobject thiz, jlong j,
        jint i, jobject list);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetGroupsInPatch(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_patch_id,
jobject list);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetGroupScanMask(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetGroupInProfileById(JNIEnv *env, jobject thiz,
jlong j, jint i,
jobject be_on_group_in_profile);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetGroupInProfile(JNIEnv *env, jobject thiz, jlong j,
        jint i, jint i2,
        jobject be_on_group_in_profile);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetGroupById(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_group);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetEntitiesInSimulselect(JNIEnv *env, jobject thiz,
jlong j,
        jobject be_on_simulselect_id,
jobject list);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetEmergencyStatus(JNIEnv *env, jobject thiz,
jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetEmergencies(JNIEnv *env, jobject thiz, jlong j,
        jobject list);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetCurrentUser(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_user);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetCurrentPtt(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_ptt);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetCurrentProfile(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_profile);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetCurrentPresence(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_presence);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetCurrentEmergencyGroup(JNIEnv *env, jobject thiz,
jlong j,
        jobject be_on_group_id);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetCoreInitiatedHeartbeatEnabled(JNIEnv *env,
                                                                                       jobject thiz,
jlong j);
extern "C"
JNIEXPORT void JNICALL
Java_com_harris_rf_bbptt_core_BbPttCore_nativeGetBbPttCoreVersion(JNIEnv *env, jclass clazz,
        jintArray i_arr, jcharArray c_arr,
        jintArray i_arr2,
jintArray i_arr3);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeFreeMemory(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIEXPORT void JNICALL
Java_com_harris_rf_bbptt_core_BbPttCore_nativeDestroyBbPttCore(JNIEnv *env, jclass clazz, jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeDeregisterUser(JNIEnv *env, jobject thiz, jlong j);
extern "C"
JNIIMPORT jlong
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeCreateBbPttCor(JNIEnv *env, jclass clazz);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeContinueTxPtt(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_entity);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeClearEmergency(JNIEnv *env, jobject thiz, jlong j,
        jobject be_on_entity);
extern "C"
JNIEXPORT jboolean JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeCanRaiseEmergency(JNIEnv *env, jobject thiz,
jlong j);
extern "C"
JNIEXPORT jint JNICALL
        Java_com_harris_rf_bbptt_core_BbPttCore_nativeAddListener(JNIEnv *env, jobject thiz, jlong j,
        jint i, jobject i_be_on_event_listener);

#endif //MMDVM_MMDVM_H
