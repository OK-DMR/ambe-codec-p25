package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public interface IBeOnTimer {
    long getTimeoutValue();

    int getTimerId();

    boolean isTimerRunning();

    void resetTimer();

    void setTimeoutValue(long j);

    void startTimer();

    void stopTimer();
}
