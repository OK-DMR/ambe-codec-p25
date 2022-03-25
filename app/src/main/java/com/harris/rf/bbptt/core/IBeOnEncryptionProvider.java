package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public interface IBeOnEncryptionProvider {
    IBeOnP25EncryptionLibrary[] getEncryptionLibraries(int[] iArr);

    IBeOnKeyFileHandler getKeyFileHandler();

    IBeOnKeyManager getKeyManager();
}
