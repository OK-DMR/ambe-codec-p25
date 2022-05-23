package cz.okdmr.mmdvm.model;

import androidx.annotation.Nullable;

import java.util.Locale;

public class StoredContact {

    public Integer _id = null;
    public int dmr_id = 0;
    public boolean is_private = true;
    public String dmr_callsign = "";
    public String display_name = "";

    public String serialize() {
        return String.format(Locale.US, "%d|%b|%s|%s", dmr_id, is_private, dmr_callsign.replace("|",""), display_name.replace("|",""));
    }

    @Nullable
    public static StoredContact deserialize(int storage_id, String serialized) {
        String[] parts = (serialized == null?"":serialized).split("\\|");
        if (serialized == null || parts.length < 4) {
            return null;
        }
        return new StoredContact(){{
            _id = storage_id;
            dmr_id = Integer.parseInt(parts[0]);
            is_private = Boolean.parseBoolean(parts[1]);
            dmr_callsign = parts[2];
            display_name = parts[3];
        }};
    }

}
