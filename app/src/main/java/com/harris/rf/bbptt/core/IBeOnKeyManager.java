package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public interface IBeOnKeyManager {
    public static final int INVALID_KEY_IDxFFFF = 65535;
    public static final int KEY_MANAGER_TYPE_ES = 1;
    public static final int KEY_MANAGER_TYPE_NULL = 0;

    boolean cleanStore();

    boolean deleteLlak();

    int getAlgorithmId(BeOnEntity beOnEntity);

    boolean getKeyByKeyId(int i, int i2, byte[] bArr, int[] iArr);

    int getKeyId(BeOnEntity beOnEntity, int i);

    BeOnKeyPresence getKeyPresence(int[] iArr);

    int getLlakKeyId(int i);

    int getUkekKeyId(int[] iArr);

    boolean isAuthenticationKeyLoaded();

    boolean isEntityEncrypted(BeOnEntity beOnEntity);

    boolean isKmfConfigured();

    boolean isKmfRegistered();

    boolean isOtarProcessingEnabled();

    boolean isReadyForKeyLoad();

    boolean loadLlak(BeOnLlak beOnLlak);

    boolean loadTeks(BeOnTek[] beOnTekArr, int i);

    boolean loadUkek(BeOnUkek beOnUkek);

    void onInitialize();

    void onShutdown();

    void onStartup();

    void onUninitialize();

    void processDeregisterRequest();

    void processKmfRegistrationTimeout();

    void processProvisionData();

    void processReceivedKmfMessage(int i, byte[] bArr);

    void processRegisterRequest();

    void processSendKmtHeartbeat();

    boolean requestRekey();

    boolean resetRsiMessageNumbers();

    boolean zeroize();
}
