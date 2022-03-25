package com.harris.rf.bbptt.common.event;

import com.harris.rf.bbptt.common.event.BeOnEvent;
import com.harris.rf.bbptt.core.BeOnEntity;
import com.harris.rf.bbptt.core.BeOnGroupId;
import com.harris.rf.bbptt.core.BeOnUserId;
import com.harris.rf.bbptt.core.IBbPttCore;
import java.util.Iterator;
import java.util.Vector;
/* loaded from: classes.dex */
public class BeOnEventRule {
    private int textReferenceId = -1;
    private Vector<BeOnEvent.EventType> eventTypes = new Vector<>();
    private Vector<BeOnEntity> orBeOnEntities = new Vector<>();
    private Vector<BeOnEntity> andBeOnEntities = new Vector<>();
    private long startTime = -1;
    private long endTime = -1;

    public IBbPttCore.Status addOrFilterEventType(BeOnEvent.EventType eventType) {
        return this.eventTypes.add(eventType) ? IBbPttCore.Status.STATUS_SUCCESS : IBbPttCore.Status.STATUS_FAILURE;
    }

    public IBbPttCore.Status addOrFilterBeOnEntity(BeOnEntity beOnEntity) {
        return this.orBeOnEntities.add(beOnEntity) ? IBbPttCore.Status.STATUS_SUCCESS : IBbPttCore.Status.STATUS_FAILURE;
    }

    public IBbPttCore.Status addAndFilterBeOnEntity(BeOnEntity beOnEntity) {
        return this.andBeOnEntities.add(beOnEntity) ? IBbPttCore.Status.STATUS_SUCCESS : IBbPttCore.Status.STATUS_FAILURE;
    }

    public void setTimeRange(long j, long j2) {
        this.startTime = j;
        this.endTime = j2;
    }

    public void addWhereClause(StringBuilder sb) {
        boolean z;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        boolean z2 = true;
        if (this.eventTypes.size() > 0) {
            sb2.append(" (");
            Iterator<BeOnEvent.EventType> it = this.eventTypes.iterator();
            boolean z3 = true;
            while (it.hasNext()) {
                BeOnEvent.EventType next = it.next();
                if (!z3) {
                    sb2.append(" OR ");
                } else {
                    z3 = false;
                }
                sb2.append("type = ");
                sb2.append(next);
            }
            sb2.append(")");
            z = false;
        } else {
            z = true;
        }
        if (this.orBeOnEntities.size() > 0) {
            if (!z) {
                sb2.append(" AND ");
            } else {
                z = false;
            }
            sb2.append(" (");
            Iterator<BeOnEntity> it2 = this.orBeOnEntities.iterator();
            boolean z4 = true;
            while (it2.hasNext()) {
                BeOnEntity next2 = it2.next();
                if (!z4) {
                    sb2.append(" OR ");
                } else {
                    z4 = false;
                }
                if (next2.isUserId()) {
                    BeOnUserId beOnUserId = (BeOnUserId) next2;
                    sb2.append("(source = ");
                    it2 = it2;
                    sb2.append(beOnUserId.getBeOnUserIdValue());
                    sb2.append(" OR (target_type = 1 AND target = ");
                    sb2.append(beOnUserId.getBeOnUserIdValue());
                    sb2.append("))");
                } else {
                    it2 = it2;
                    if (next2.isGroupId()) {
                        sb2.append("(target_type = 2 AND target = ");
                        sb2.append(((BeOnGroupId) next2).getGroupId());
                        sb2.append(")");
                    }
                }
            }
            sb2.append(")");
        }
        if (this.andBeOnEntities.size() > 0) {
            if (!z) {
                sb2.append(" AND ");
            } else {
                z = false;
            }
            sb2.append(" (");
            Iterator<BeOnEntity> it3 = this.andBeOnEntities.iterator();
            while (it3.hasNext()) {
                BeOnEntity next3 = it3.next();
                if (!z2) {
                    sb2.append(" AND ");
                } else {
                    z2 = false;
                }
                if (next3.isUserId()) {
                    BeOnUserId beOnUserId2 = (BeOnUserId) next3;
                    sb2.append("(source = ");
                    sb2.append(beOnUserId2.getBeOnUserIdValue());
                    sb2.append(" OR (target_type = 1 AND target = ");
                    sb2.append(beOnUserId2.getBeOnUserIdValue());
                    sb2.append("))");
                } else if (next3.isGroupId()) {
                    sb2.append("(target_type = 2 AND target = ");
                    sb2.append(((BeOnGroupId) next3).getGroupId());
                    sb2.append(")");
                }
            }
            sb2.append(")");
        }
        if (this.startTime > 0 && this.endTime > 0) {
            if (!z) {
                sb2.append(" AND ");
                z = z;
            } else {
                z = false;
            }
            sb2.append(" ((start_time >= ");
            sb2.append(this.startTime);
            sb2.append(" AND start_time <= ");
            sb2.append(this.endTime);
            sb2.append(") OR (end_time >= ");
            sb2.append(this.startTime);
            sb2.append(" AND end_time <= ");
            sb2.append(this.endTime);
            sb2.append("))");
        }
        if (this.textReferenceId >= 0) {
            if (!z) {
                sb2.append(" AND ");
            }
            sb2.append(" reference = ");
            sb2.append(this.textReferenceId);
        }
        if (sb2.length() > 0) {
            sb3.append("WHERE");
            sb3.append((CharSequence) sb2);
            sb.append('/');
            sb.append((CharSequence) sb3);
        }
    }

    public void addOrderClause(StringBuilder sb) {
        sb.append(" ORDER BY start_time DESC");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a0, code lost:
        if (r10 <= r17.endTime) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0154, code lost:
        if (r5 <= r17.endTime) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0168, code lost:
        if (r5 <= r17.endTime) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017c, code lost:
        if (r5 <= r17.endTime) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0194, code lost:
        if (r6 <= r17.endTime) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isMatch(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harris.rf.bbptt.common.event.BeOnEventRule.isMatch(java.lang.Object):boolean");
    }

    /* renamed from: com.harris.rf.bbptt.common.event.BeOnEventRule$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$harris$rf$bbptt$common$event$BeOnEvent$EventType;

        static {
            int[] iArr = new int[BeOnEvent.EventType.values().length];
            $SwitchMap$com$harris$rf$bbptt$common$event$BeOnEvent$EventType = iArr;
            try {
                iArr[BeOnEvent.EventType.EVENT_TYPE_CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$harris$rf$bbptt$common$event$BeOnEvent$EventType[BeOnEvent.EventType.EVENT_TYPE_EMERGENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$harris$rf$bbptt$common$event$BeOnEvent$EventType[BeOnEvent.EventType.EVENT_TYPE_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$harris$rf$bbptt$common$event$BeOnEvent$EventType[BeOnEvent.EventType.EVENT_TYPE_USER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public void setTextReferenceId(int i) {
        this.textReferenceId = i;
    }

    public int[] getEventTypesArray() {
        int[] iArr = new int[this.eventTypes.size()];
        Iterator<BeOnEvent.EventType> it = this.eventTypes.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().getValue();
            i++;
        }
        return iArr;
    }

    public BeOnEntity[] getOrBeOnEntitiesArray() {
        Vector<BeOnEntity> vector = this.orBeOnEntities;
        return (BeOnEntity[]) vector.toArray(new BeOnEntity[vector.size()]);
    }

    public BeOnEntity[] getAndBeOnEntitiesArray() {
        Vector<BeOnEntity> vector = this.andBeOnEntities;
        return (BeOnEntity[]) vector.toArray(new BeOnEntity[vector.size()]);
    }
}
