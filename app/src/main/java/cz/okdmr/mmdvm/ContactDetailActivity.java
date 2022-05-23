package cz.okdmr.mmdvm;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import cz.okdmr.mmdvm.model.StoredContact;

public class ContactDetailActivity extends AppCompatActivity {

    public static String EXTRA_INT_CONTACT_ID = "CONTACT_ID";

    SettingsStorage prefs;
    StoredContact contact;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_edit);
        setTitle("Detail kontaktu");
        prefs = new SettingsStorage(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent launch = getIntent();
        int contact_id = -1;
        if (launch != null) {
            contact_id = launch.getIntExtra(EXTRA_INT_CONTACT_ID, -1);
        }
        contact = prefs.getContact(contact_id);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == 1) {
            contact = prefs.storeContact(contact);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem i = menu.add(0,1,0,"Uložit");
        i.setIcon(android.R.drawable.ic_menu_save);
        i.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        return super.onCreateOptionsMenu(menu);
    }
}
