package cz.okdmr.mmdvm;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import com.google.android.material.button.MaterialButton;

import cz.okdmr.mmdvm.model.StoredContact;

public class ContactDetailActivity extends AppCompatActivity {

    public static String EXTRA_INT_CONTACT_ID = "CONTACT_ID";

    SettingsStorage prefs;
    StoredContact contact = new StoredContact();

    EditText contact_dmr_id;
    EditText contact_dmr_callsign;
    EditText contact_display_name;
    MaterialButton btn_private, btn_group;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_edit);
        setTitle("Detail kontaktu");
        prefs = new SettingsStorage(this);

        contact_dmr_id = findViewById(R.id.contact_dmr_id);
        contact_dmr_callsign = findViewById(R.id.contact_dmr_callsign);
        contact_display_name = findViewById(R.id.contact_display_name);
        btn_private = findViewById(R.id.contact_btn_private);
        btn_group = findViewById(R.id.contact_btn_group);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent launch = getIntent();
        int extra_contact_id = -1;
        if (launch != null) {
            extra_contact_id = launch.getIntExtra(EXTRA_INT_CONTACT_ID, -1);
        }
        contact = prefs.getContact(extra_contact_id);
        if (contact != null) {
            contact_display_name.setText(contact.display_name);
            contact_dmr_id.setText(String.valueOf(contact.dmr_id));
            btn_group.setChecked(!contact.is_private);
            btn_private.setChecked(contact.is_private);
            contact_dmr_callsign.setText(contact.dmr_callsign);
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == 1) {
            contact.display_name = contact_display_name.getText().toString();
            contact.dmr_callsign = contact_dmr_callsign.getText().toString();
            contact.is_private = btn_private.isChecked();
            contact.dmr_id = Integer.parseInt(contact_dmr_id.getText().toString());
            contact = prefs.storeContact(contact);
            finish();
            return true;
        } else if (item.getItemId() == 2) {
            prefs.deleteContact(contact);
            finish();
            return true;
        } else if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem i = menu.add(0, 1, 0, "Uložit");
        i.setIcon(R.drawable.ic_baseline_done_24);
        i.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        MenuItem o = menu.add(0, 2, 0, "Smazat");
        o.setIcon(R.drawable.ic_baseline_delete_forever_24);
        o.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        return super.onCreateOptionsMenu(menu);
    }
}
