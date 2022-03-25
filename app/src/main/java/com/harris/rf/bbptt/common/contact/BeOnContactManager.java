package com.harris.rf.bbptt.common.contact;

import com.harris.rf.bbptt.core.BeOnLocation;
import com.harris.rf.bbptt.core.BeOnUserId;
import com.harris.rf.bbptt.core.IBbPttCore;
/* loaded from: classes.dex */
public class BeOnContactManager implements IBeOnContactManager {
    private long handle = 0;

    private native int nativeAddContact(long j, BeOnContact beOnContact);

    private native long nativeCreateBeOnContactManager();

    private native int nativeDeleteContact(long j, BeOnUserId beOnUserId);

    private native void nativeDestroyBeOnContactManager(long j);

    private native BeOnContact[] nativeGetAllContacts(long j);

    private native BeOnContact nativeGetContact(long j, BeOnUserId beOnUserId);

    private native int nativeGetContactCount(long j);

    private native BeOnContact[] nativeGetContacts(long j, String str, String str2, String str3);

    private native BeOnContact[] nativeGetContactsByName(long j, String str);

    private native BeOnLocation[] nativeGetLocationHistory(long j, BeOnUserId beOnUserId);

    private native int nativeInitialize(long j);

    private native boolean nativeIsInitialized(long j);

    private native boolean nativeIsStarted(long j);

    private native int nativeRegisterForCoreEvents(long j, long j2);

    private native int nativeSetDataDir(long j, String str);

    private native int nativeShutdown(long j);

    private native int nativeStartup(long j);

    private native int nativeUninitialize(long j);

    private native int nativeUnregisterForCoreEvents(long j, long j2);

    private native int nativeUpdateContact(long j, BeOnContact beOnContact, BeOnContact beOnContact2);

    private native int nativeUpdateLocation(long j, BeOnUserId beOnUserId, BeOnLocation beOnLocation, int i, int i2);

    public BeOnContactManager() {
        createBeOnContactManager();
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public void createBeOnContactManager() {
        this.handle = nativeCreateBeOnContactManager();
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public void destroyBeOnContactManager() {
        nativeDestroyBeOnContactManager(this.handle);
        this.handle = 0L;
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public IBbPttCore.Status setDataDir(String str) {
        return IBbPttCore.Status.values()[nativeSetDataDir(this.handle, str)];
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public IBbPttCore.Status initialize() {
        return IBbPttCore.Status.values()[nativeInitialize(this.handle)];
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public IBbPttCore.Status uninitialize() {
        return IBbPttCore.Status.values()[nativeUninitialize(this.handle)];
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public boolean isInitialized() {
        return nativeIsInitialized(this.handle);
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public IBbPttCore.Status startup() {
        return IBbPttCore.Status.values()[nativeStartup(this.handle)];
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public IBbPttCore.Status shutdown() {
        return IBbPttCore.Status.values()[nativeShutdown(this.handle)];
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public boolean isStarted() {
        return nativeIsStarted(this.handle);
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public IBbPttCore.Status registerForCoreEvents(long j) {
        return IBbPttCore.Status.values()[nativeRegisterForCoreEvents(this.handle, j)];
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public IBbPttCore.Status unregisterForCoreEvents(long j) {
        return IBbPttCore.Status.values()[nativeUnregisterForCoreEvents(this.handle, j)];
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public int getContactCount() {
        return nativeGetContactCount(this.handle);
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public BeOnContact getContact(BeOnUserId beOnUserId) {
        return nativeGetContact(this.handle, beOnUserId);
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public BeOnContact[] getAllContacts() {
        return nativeGetAllContacts(this.handle);
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public BeOnContact[] getContacts(String str, String str2, String str3) {
        return nativeGetContacts(this.handle, str, str2, str3);
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public BeOnContact[] getContactsByName(String str) {
        return nativeGetContactsByName(this.handle, str);
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public IBbPttCore.Status addContact(BeOnContact beOnContact) {
        return IBbPttCore.Status.values()[nativeAddContact(this.handle, beOnContact)];
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public BeOnLocation[] getLocationHistory(BeOnUserId beOnUserId) {
        return nativeGetLocationHistory(this.handle, beOnUserId);
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public IBbPttCore.Status updateContact(BeOnContact beOnContact, BeOnContact beOnContact2) {
        return IBbPttCore.Status.values()[nativeUpdateContact(this.handle, beOnContact, beOnContact2)];
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public IBbPttCore.Status updateLocation(BeOnUserId beOnUserId, BeOnLocation beOnLocation, int i, int i2) {
        return IBbPttCore.Status.values()[nativeUpdateLocation(this.handle, beOnUserId, beOnLocation, i, i2)];
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public IBbPttCore.Status deleteContact(BeOnUserId beOnUserId) {
        return IBbPttCore.Status.values()[nativeDeleteContact(this.handle, beOnUserId)];
    }

    @Override // com.harris.rf.bbptt.common.contact.IBeOnContactManager
    public long getContactManagerHandle() {
        return this.handle;
    }
}
