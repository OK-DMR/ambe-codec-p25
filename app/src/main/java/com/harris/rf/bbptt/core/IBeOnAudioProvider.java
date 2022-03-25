package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public interface IBeOnAudioProvider {
    public static final int AUDIO_LAYER_HARDWARE = 1;
    public static final int AUDIO_LAYER_SOFTWARE = 0;

    /* loaded from: classes.dex */
    public enum ToneType {
        TONE_TYPE_EMERGENCY,
        TONE_TYPE_INBOUND_GROUP_CALL,
        TONE_TYPE_INBOUND_INDIVIDUAL_CALL,
        TONE_TYPE_OUTBOUND_GROUP_CALL,
        TONE_TYPE_OUTBOUND_INDIVIDUAL_CALL,
        TONE_TYPE_INBOUND_TEXT_MESSAGE,
        TONE_TYPE_CALL_QUEUED,
        TONE_TYPE_CALL_DENY,
        TONE_TYPE_PROCEED,
        TONE_TYPE_FAIL,
        TONE_TYPE_REMOVED,
        TONE_TYPE_UNENCRYPTED_WARNING
    }

    int getAudioLayerType();

    IBeOnVocoder[] getVocoders(int[] iArr);

    void playAudio(BeOnPtt beOnPtt, int i, short[] sArr, int i2);

    boolean playRxPttAudio(BeOnPtt beOnPtt, int i, short[] sArr, int i2);

    void playTone(BeOnPtt beOnPtt, int i);

    boolean startRxPttAudio(BeOnPtt beOnPtt);

    void stopRxPttAudio(BeOnPtt beOnPtt);
}
