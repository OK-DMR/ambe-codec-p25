package com.harris.rf.bbptt.common.subscription;
/* loaded from: classes.dex */
public interface IBeOnSubscriptionManagerEvent {
    public static final int REASON_LEGACY_SUBSCRIPTION_BEHAVIOR = 8;
    public static final int REASON_LINK_TO_PRESENCE_SERVICE_DOWN = 12;
    public static final int REASON_NONE = 0;
    public static final int REASON_NOT_READY = 13;
    public static final int REASON_PR_GROUP_DISABLED = 5;
    public static final int REASON_PR_IND_DISABLED = 6;
    public static final int REASON_SERVICE_RESOURCE_CONSTRAINED = 14;
    public static final int REASON_STATUS_AWARE_UPDATE = 15;
    public static final int REASON_SUBSCR_INVALID = 10;
    public static final int REASON_SUBSCR_OUT_OF_SYNC = 9;
    public static final int REASON_TIMED_OUT = 1;
    public static final int REASON_TOO_MANY_SUBSCR = 11;
    public static final int REASON_UNAUTHORIZED_SERVICE = 7;
    public static final int REASON_USER_DEREGISTERED = 3;
    public static final int REASON_VNIC_DOWN = 2;
    public static final int REASON_VNIC_UNREACHABLE = 4;
    public static final int STATUS_CONTINUING = 6;
    public static final int STATUS_END = 4;
    public static final int STATUS_FAILURE = 2;
    public static final int STATUS_INFO = 7;
    public static final int STATUS_IS_PENDING = 5;
    public static final int STATUS_NONE = 0;
    public static final int STATUS_START = 3;
    public static final int STATUS_SUCCESS = 1;
    public static final int SUBSCR_MGR_EVENT_ALL = -1;
    public static final int SUBSCR_MGR_EVENT_GROUP_MEMBERSHIP = 2;
    public static final int SUBSCR_MGR_EVENT_SUBSCRIPTION_SET = 0;
    public static final int SUBSCR_MGR_EVENT_USER_PRESENCE_AND_LOCATION = 1;
}
