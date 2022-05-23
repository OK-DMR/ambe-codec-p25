package cz.okdmr.mmdvm;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.Nullable;

import cz.okdmr.mmdvm.model.StoredContact;

public class SettingsStorage {

    public static String SPREF_NAME = "mmdvm_settings";

    public static String PREFIX_SERVERS = "_s-";
    public static String PREFIX_IDENTITIES = "_i-";
    public static String PREFIX_CONTACTS = "_c-";

    SharedPreferences mSettings;

    public SettingsStorage(Context c) {
        this.mSettings = c.getSharedPreferences(SPREF_NAME, Context.MODE_PRIVATE);
    }

    public int count(String prefix) {
        int count = 0;
        for (String key : mSettings.getAll().keySet()) {
            if (key.startsWith(prefix)) {
                count++;
            }
        }
        return count;
    }

    @Nullable
    public StoredContact getContact(int id) {
        if (id < 0) {
            return new StoredContact();
        }
        String serializedContact = mSettings.getString(PREFIX_CONTACTS + id, null);
        return StoredContact.deserialize(id, serializedContact);
    }

    public StoredContact storeContact(StoredContact contact) {
        if (contact._id == null) {
            contact._id = getNextFreeStorageIndex(PREFIX_CONTACTS);
        }
        mSettings.edit().putString(PREFIX_CONTACTS+contact._id, contact.serialize()).apply();
        return contact;
    }

    private int getNextFreeStorageIndex(String storage_prefix) {
        int index = 0;
        while (mSettings.getString(storage_prefix + index, null) != null) {
            index++;
        }
        return index;
    }

}
