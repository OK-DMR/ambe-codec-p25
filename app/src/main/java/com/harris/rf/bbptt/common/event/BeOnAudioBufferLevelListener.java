package com.harris.rf.bbptt.common.event;
/* loaded from: classes.dex */
public class BeOnAudioBufferLevelListener implements IBeOnAudioBufferLevelListener {
    private long nativeHandle;

    private native void nativeAudioBufferNeedsData(long j);

    public BeOnAudioBufferLevelListener(long j) {
        this.nativeHandle = 0L;
        this.nativeHandle = j;
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnAudioBufferLevelListener
    public void audioBufferNeedsData() {
        nativeAudioBufferNeedsData(this.nativeHandle);
    }
}
