package cz.okdmr.mmdvm.model;

import android.util.Log;

import androidx.annotation.Nullable;

import java.util.Locale;

public class StoredContact {

    public int _id = -1;
    public int dmr_id = 0;
    public boolean is_private = true;
    public String dmr_callsign = "";
    public String display_name = "";

    public String serialize() {
        return String.format(Locale.US, "%d|%b|%s |%s ", dmr_id, is_private, dmr_callsign.replace("|", "").trim().toUpperCase(), display_name.replace("|", "").trim());
    }

    @Nullable
    public static StoredContact deserialize(int storage_id, String serialized) {
        Log.d("StoredContact", "deserialize called with data: " + serialized);
        String[] parts = (serialized == null ? "" : serialized).split("\\|");
        if (serialized == null || parts.length < 4) {
            Log.e("StoredContact", "return null from deserialize in " + serialized + " parts: " + parts.length);
            return null;
        }
        return new StoredContact() {{
            _id = storage_id;
            dmr_id = Integer.parseInt(parts[0]);
            is_private = Boolean.parseBoolean(parts[1]);
            dmr_callsign = parts[2].trim();
            display_name = parts[3].trim();
        }};
    }

}
