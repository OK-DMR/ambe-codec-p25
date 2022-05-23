package cz.okdmr.mmdvm;

import android.content.Context;
import android.content.SharedPreferences;

public class SettingsStorage {

    public static String SPREF_NAME = "mmdvm_settings";

    private static String PREFIX_SERVERS = "serv-";
    private static String PREFIX_IDENTITIES = "identity-";
    private static String PREFIX_CONTACTS = "contact-";

    SharedPreferences mSettings;

    public SettingsStorage(Context c) {
        this.mSettings = c.getSharedPreferences(SPREF_NAME, Context.MODE_PRIVATE);
    }



}
