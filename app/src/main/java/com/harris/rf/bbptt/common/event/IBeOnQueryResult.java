package com.harris.rf.bbptt.common.event;

import java.util.List;
/* loaded from: classes.dex */
public interface IBeOnQueryResult<T> {
    long getQueryResultHandle();

    IBeOnResultChangeListener getResultChangeListener();

    List<T> getResultList();

    boolean hasNext();

    void setResultChangeListener(IBeOnResultChangeListener iBeOnResultChangeListener);
}
