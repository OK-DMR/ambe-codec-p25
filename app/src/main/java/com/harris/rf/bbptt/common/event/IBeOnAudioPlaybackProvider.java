package com.harris.rf.bbptt.common.event;

import com.harris.rf.bbptt.core.IBeOnAudioProvider;
/* loaded from: classes.dex */
public interface IBeOnAudioPlaybackProvider extends IBeOnAudioProvider {

    /* loaded from: classes.dex */
    public interface IAudioPlayerListener {
        void onAudioStart();

        void onAudioStop();
    }

    boolean isAudioBufferFull();

    boolean setAudioBufferLevelListener(IBeOnAudioBufferLevelListener iBeOnAudioBufferLevelListener);

    void setAudioPlayerListener(IAudioPlayerListener iAudioPlayerListener);
}
