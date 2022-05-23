package cz.okdmr.mmdvm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import cz.okdmr.mmdvm.model.StoredContact;

public class ContactsAdapter extends BaseAdapter {

    SettingsStorage prefs;
    Context context;

    public ContactsAdapter(Context c) {
        prefs = new SettingsStorage(c);
        context = c;
    }

    @Override
    public int getCount() {
        return prefs.count(SettingsStorage.PREFIX_CONTACTS);
    }

    @Override
    public Object getItem(int position) {
        return prefs.getContact(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(android.R.layout.test_list_item, parent, false);
        }

        StoredContact sc = prefs.getContact(position);

        TextView tv = convertView.findViewById(android.R.id.text1);
        if (sc != null) {
            tv.setText(sc.display_name);
        }
        tv.setText("FUCK OFF");

        return convertView;
    }
}
