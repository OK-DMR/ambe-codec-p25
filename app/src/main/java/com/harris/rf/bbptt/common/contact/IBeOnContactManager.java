package com.harris.rf.bbptt.common.contact;

import com.harris.rf.bbptt.core.BeOnLocation;
import com.harris.rf.bbptt.core.BeOnUserId;
import com.harris.rf.bbptt.core.IBbPttCore;
/* loaded from: classes.dex */
public interface IBeOnContactManager {
    IBbPttCore.Status addContact(BeOnContact beOnContact);

    void createBeOnContactManager();

    IBbPttCore.Status deleteContact(BeOnUserId beOnUserId);

    void destroyBeOnContactManager();

    BeOnContact[] getAllContacts();

    BeOnContact getContact(BeOnUserId beOnUserId);

    int getContactCount();

    long getContactManagerHandle();

    BeOnContact[] getContacts(String str, String str2, String str3);

    BeOnContact[] getContactsByName(String str);

    BeOnLocation[] getLocationHistory(BeOnUserId beOnUserId);

    IBbPttCore.Status initialize();

    boolean isInitialized();

    boolean isStarted();

    IBbPttCore.Status registerForCoreEvents(long j);

    IBbPttCore.Status setDataDir(String str);

    IBbPttCore.Status shutdown();

    IBbPttCore.Status startup();

    IBbPttCore.Status uninitialize();

    IBbPttCore.Status unregisterForCoreEvents(long j);

    IBbPttCore.Status updateContact(BeOnContact beOnContact, BeOnContact beOnContact2);

    IBbPttCore.Status updateLocation(BeOnUserId beOnUserId, BeOnLocation beOnLocation, int i, int i2);
}
