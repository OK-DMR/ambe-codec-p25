package cz.okdmr.mmdvm;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cz.okdmr.mmdvm.model.StoredContact;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ContactsActivity extends AppCompatActivity {

    ContactsAdapter contactsAdapter;
    SettingsStorage settingsStorage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        setTitle("Kontakty");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        settingsStorage = new SettingsStorage(this);

        ListView lv = findViewById(R.id.list_view);
        contactsAdapter = new ContactsAdapter(this);
        lv.setAdapter(contactsAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent detailIntent = new Intent(ContactsActivity.this, ContactDetailActivity.class);
                detailIntent.putExtra(ContactDetailActivity.EXTRA_INT_CONTACT_ID, contactsAdapter.ids.get(position));
                startActivity(detailIntent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        contactsAdapter.refresh();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case 1:
                startActivity(new Intent(this, ContactDetailActivity.class));
                return true;
            case 2:
                downloadAndSaveContacts();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void downloadAndSaveContacts() {

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://testsetting.ok-dmr.cz/PoC_API.php?DMR_ID=2308105&Token=pokujrqwlmfsad")
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                Log.e("downloadAndSaveContacts", "failed", e);
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                String downloaded = Objects.requireNonNull(response.body()).string();
                Pattern section = Pattern.compile("\\[([ \\w]+)]");
                int TYPE_USER = 1, TYPE_GROUP = 2, TYPE_CHANNEL = 3, TYPE_RX_LIST = 4, TYPE_ZONE = 5, TYPE_RX_LIST_MEMBERS = 6, TYPE_ZONE_MEMBERS = 7;
                int current_type = 0;
                for (String line : downloaded.split("\n")) {
                    Matcher header = section.matcher(line);
                    if (header.matches()) {
                        switch(header.group(1)) {
                            case "User":
                                current_type = TYPE_USER;
                                break;
                            case "Channel":
                                current_type = TYPE_CHANNEL;
                                break;
                            case "Group":
                                current_type = TYPE_GROUP;
                                break;
                            case "Zone members":
                                current_type = TYPE_ZONE_MEMBERS;
                                break;
                            case "RX list":
                                current_type = TYPE_RX_LIST;
                                break;
                            case "Zone":
                                current_type = TYPE_ZONE;
                                break;
                            case "RX list members":
                                current_type = TYPE_RX_LIST_MEMBERS;
                                break;
                        }
                        continue;
                    }
                    if (current_type == TYPE_USER) {
                        // DMR ID | CALLSIGN | ALIAS
                        String[] parts = line.split("\\|");
                        int dmr_id = 0;
                        try {
                            dmr_id = Integer.parseInt(parts[0]);
                        } catch(Throwable e) {
                        }
                        if (parts.length == 3 && dmr_id > 0) {
                            StoredContact sc = settingsStorage.getContactByDmrId(dmr_id);
                            if (sc==null) {sc = new StoredContact();}

                            sc.dmr_id = dmr_id;
                            sc.dmr_callsign = parts[1];
                            sc.display_name = parts[2];
                            sc.is_private = true;
                            settingsStorage.storeContact(sc);

                        }
                    } else if (current_type == TYPE_GROUP) {
                        // DB_ID | DMR ID | CALLSIGN | ALIAS
                        String[] parts = line.replace("||", "| |").split("\\|");
                        int dmr_id = 0;
                        try {
                            dmr_id = Integer.parseInt(parts[1]);
                        } catch(Throwable e) {
                        }
                        if (parts.length == 4 && dmr_id > 0) {
                            StoredContact sc = settingsStorage.getContactByDmrId(dmr_id);
                            if (sc==null) {sc = new StoredContact();}

                            sc.dmr_id = dmr_id;
                            sc.dmr_callsign = parts[2];
                            sc.display_name = parts[3];
                            sc.is_private = false;
                            settingsStorage.storeContact(sc);

                        }
                    }
                }
                contactsAdapter.refresh();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem o = menu.add(0, 2, 0, "Stáhnout");
        o.setIcon(R.drawable.ic_baseline_cloud_download_24);
        o.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        MenuItem i = menu.add(0, 1, 0, "Přidat kontakt");
        i.setIcon(R.drawable.ic_baseline_add_24);
        i.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        return super.onCreateOptionsMenu(menu);
    }
}
