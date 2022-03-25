package com.harris.rf.bbptt.core;

import com.harris.rf.bbptt.core.IBeOnVocoder;
/* loaded from: classes.dex */
public interface IBeOnP25EncryptionLibrary {
    public static final int ENCRYPTION_2_KEY_TRIPLE_DES = 1;
    public static final int ENCRYPTION_3_KEY_TRIPLE_DES = 2;
    public static final int ENCRYPTION_AES_128 = 4;
    public static final int ENCRYPTION_AES_256 = 3;
    public static final int ENCRYPTION_DES = 0;
    public static final int ENCRYPTION_NONE = 128;
    public static final int MAX_KEY_LENGTH = 32;
    public static final int MESSAGE_INDICATOR_LENGTH = 9;

    int decryptLocation(Object obj, byte[] bArr);

    int decryptVoice(Object obj, byte[] bArr, int i);

    int encryptLocation(Object obj, byte[] bArr);

    int encryptVoice(Object obj, byte[] bArr, int i);

    int generatePseudoRandomBytes(Object obj, byte[] bArr, int i);

    int getAlgorithmId();

    int getEncryptionBlockSizeInBytes();

    int getEncryptionKeySizeInBytes();

    int getEncryptionStateSizeInBytes();

    int getP25LocationEncryptionStateSizeInBytes();

    int getP25VoiceEncryptionStateSizeInBytes();

    int getPrngStateSizeInBytes();

    int getVoiceEncryptionMessageIndicator(Object obj, byte[] bArr);

    int initializeLocationEncryption(Object obj, Object obj2);

    int initializePrng(Object obj, byte[] bArr, int i);

    int initializeVoiceEncryption(Object obj, Object obj2, IBeOnVocoder.Type type);

    int resetVoiceEncryption(Object obj);

    int setLocationEncryptionKey(Object obj, byte[] bArr, int i);

    int setLocationEncryptionMessageIndicator(Object obj, byte[] bArr);

    int setVoiceEncryptionKey(Object obj, byte[] bArr, int i);

    int setVoiceEncryptionMessageIndicator(Object obj, byte[] bArr);
}
