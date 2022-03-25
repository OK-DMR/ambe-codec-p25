package com.harris.rf.bbptt.core;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class BeOnSlnInfo {
    public static int CRYPTO_ALGORITHM_AES_128_ENCRYPTION = 133;
    public static int CRYPTO_ALGORITHM_AES_ENCRYPTION = 132;
    public static int CRYPTO_ALGORITHM_UNENCRYPTED = 128;
    public static int CRYPTO_TYPE_NORMAL_CRYPTO_NET = 0;
    public static int CRYPTO_TYPE_P25_SYSTEM_KEY = 1;
    private int cryptoNetAlgorithm;
    private int cryptoNetType;
    List<BeOnGroupId> groupIds;
    private int groupProvisionId;
    private long sln;
    private int totalNumberOfTalkGroups;

    public BeOnSlnInfo() {
        this.sln = 0L;
        this.groupProvisionId = 0;
        this.cryptoNetType = CRYPTO_TYPE_NORMAL_CRYPTO_NET;
        this.cryptoNetAlgorithm = CRYPTO_ALGORITHM_UNENCRYPTED;
        this.totalNumberOfTalkGroups = 0;
        this.groupIds = new ArrayList();
    }

    public BeOnSlnInfo(int i, int i2, int i3, int i4, int i5) {
        this.sln = i;
        this.groupProvisionId = i2;
        this.cryptoNetType = i3;
        this.cryptoNetAlgorithm = i4;
        this.totalNumberOfTalkGroups = i5;
        this.groupIds = new ArrayList();
    }

    public BeOnSlnInfo(BeOnSlnInfo beOnSlnInfo) {
        this.sln = beOnSlnInfo.sln;
        this.groupProvisionId = beOnSlnInfo.groupProvisionId;
        this.cryptoNetType = beOnSlnInfo.cryptoNetType;
        this.cryptoNetAlgorithm = beOnSlnInfo.cryptoNetAlgorithm;
        this.totalNumberOfTalkGroups = beOnSlnInfo.totalNumberOfTalkGroups;
        ArrayList arrayList = new ArrayList();
        this.groupIds = arrayList;
        arrayList.addAll(beOnSlnInfo.groupIds);
    }

    public long getSln() {
        return this.sln;
    }

    public void setSln(long j) {
        this.sln = j;
    }

    public int getGroupProvisionId() {
        return this.groupProvisionId;
    }

    public void setGroupProvisionId(int i) {
        this.groupProvisionId = i;
    }

    public int getCryptoNetType() {
        return this.cryptoNetType;
    }

    public void setCryptoNetType(int i) {
        this.cryptoNetType = i;
    }

    public int getCryptoNetAlgorithm() {
        return this.cryptoNetAlgorithm;
    }

    public void setCryptoNetAlgorithm(int i) {
        this.cryptoNetAlgorithm = i;
    }

    public int getTotalNumberOfTalkGroups() {
        return this.totalNumberOfTalkGroups;
    }

    public void setTotalNumberOfTalkGroups(int i) {
        this.totalNumberOfTalkGroups = i;
    }

    public List<BeOnGroupId> getGroupIds() {
        return this.groupIds;
    }

    public void addGroupId(BeOnGroupId beOnGroupId) {
        this.groupIds.add(beOnGroupId);
    }
}
