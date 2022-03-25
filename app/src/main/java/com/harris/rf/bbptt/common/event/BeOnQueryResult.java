package com.harris.rf.bbptt.common.event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class BeOnQueryResult<T> implements IBeOnQueryResult<T> {
    private long resultHandle;

    private native IBeOnResultChangeListener nativeGetResultChangeListener(long j);

    private native T[] nativeGetResultList(long j);

    private native boolean nativeHasNext(long j);

    private native void nativeSetResultChangeListener(long j, IBeOnResultChangeListener iBeOnResultChangeListener);

    public BeOnQueryResult(long j) {
        this.resultHandle = 0L;
        this.resultHandle = j;
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnQueryResult
    public long getQueryResultHandle() {
        return this.resultHandle;
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnQueryResult
    public List<T> getResultList() {
        T[] nativeGetResultList = nativeGetResultList(this.resultHandle);
        return nativeGetResultList == null ? new ArrayList() : new ArrayList(Arrays.asList(nativeGetResultList));
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnQueryResult
    public boolean hasNext() {
        return nativeHasNext(this.resultHandle);
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnQueryResult
    public void setResultChangeListener(IBeOnResultChangeListener iBeOnResultChangeListener) {
        nativeSetResultChangeListener(this.resultHandle, iBeOnResultChangeListener);
    }

    @Override // com.harris.rf.bbptt.common.event.IBeOnQueryResult
    public IBeOnResultChangeListener getResultChangeListener() {
        return nativeGetResultChangeListener(this.resultHandle);
    }
}
