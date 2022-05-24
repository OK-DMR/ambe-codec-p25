package cz.okdmr.mmdvm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

import cz.okdmr.mmdvm.model.StoredContact;

public class ContactsAdapter extends BaseAdapter {

    SettingsStorage prefs;
    Context context;
    ArrayList<Integer> ids;

    public ContactsAdapter(Context c) {
        prefs = new SettingsStorage(c);
        context = c;
        ids = prefs.getIds(SettingsStorage.PREFIX_CONTACTS);
    }

    @Override
    public int getCount() {
        return prefs.count(SettingsStorage.PREFIX_CONTACTS);
    }

    @Override
    public Object getItem(int position) {
        return prefs.getContact(ids.get(position));
    }

    @Override
    public long getItemId(int position) {
        return ids.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.contact_list_item, parent, false);
        }

        StoredContact sc = prefs.getContact(ids.get(position));

        TextView tv = convertView.findViewById(R.id.list_item_text);
        ImageView iv = convertView.findViewById(R.id.list_item_image);
        if (sc != null) {
            tv.setText(String.format(Locale.US, "%d - %s", sc.dmr_id, sc.dmr_callsign));
            iv.setImageResource(sc.is_private ? R.drawable.ic_baseline_person_24 : R.drawable.ic_baseline_group_24);
        }

        return convertView;
    }

    public void refresh() {
        ids = prefs.getIds(SettingsStorage.PREFIX_CONTACTS);
        notifyDataSetChanged();
    }
}
