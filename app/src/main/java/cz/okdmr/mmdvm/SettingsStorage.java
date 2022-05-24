package cz.okdmr.mmdvm;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Map;

import cz.okdmr.mmdvm.model.StoredContact;

public class SettingsStorage {

    public static String SPREF_NAME = "mmdvm_settings";

    public static String PREFIX_SERVERS = "_s-";
    public static String PREFIX_IDENTITIES = "_i-";
    public static String PREFIX_CONTACTS = "_c-";

    public static String ALLOW_ACCESSIBILITY = "app.allow_accessibility";
    public static String CONNECT_AUTOMATICALLY = "app.connect_automatically";

    public static String KEY_GPS_SETTINGS = "app.gps_settings";

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
    public StoredContact getContactByDmrId(int dmr_id) {
        String prefix = dmr_id + "|";
        for(String key: mSettings.getAll().keySet()) {
            if (key.startsWith(PREFIX_CONTACTS)) {
                String val = mSettings.getString(key, "");
                if (val.startsWith(prefix)) {
                    return StoredContact.deserialize(Integer.parseInt(key.replace(PREFIX_CONTACTS, "")), val);
                }
            }
        }
        return null;
    }

    @Nullable
    public StoredContact getContact(int id) {
        if (id < 0) {
            return new StoredContact();
        }
        String serializedContact = mSettings.getString(PREFIX_CONTACTS + id, null);
        StoredContact sc = StoredContact.deserialize(id, serializedContact);
        if (sc == null) {
            deleteContact(new StoredContact() {{
                _id = id;
            }});
        } else {
            // set id into the record
            sc._id = id;
        }
        return sc;
    }

    public StoredContact storeContact(StoredContact contact) {
        if (contact._id < 0) {
            contact._id = getNextFreeStorageIndex(PREFIX_CONTACTS);
        }
        mSettings.edit().putString(PREFIX_CONTACTS + contact._id, contact.serialize()).apply();
        return contact;
    }

    private int getNextFreeStorageIndex(String storage_prefix) {
        int index = 0;
        while (mSettings.getString(storage_prefix + index, null) != null) {
            index++;
        }
        return index;
    }

    public boolean deleteContact(StoredContact contact) {
        if (contact._id >= 0) {
            return mSettings.edit().remove(PREFIX_CONTACTS + contact._id).commit();
        }
        return false;
    }

    public ArrayList<Integer> getIds(String storage_prefix) {
        ArrayList<Integer> ids = new ArrayList<>();
        for (String key : mSettings.getAll().keySet()) {
            if (key.startsWith(PREFIX_CONTACTS)) {
                ids.add(Integer.parseInt(key.replace(PREFIX_CONTACTS, "")));
            }
        }
        return ids;
    }
}
