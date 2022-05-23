package cz.okdmr.mmdvm;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static String LOG_TAG = "MmdvmMain";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(
                WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
        );
        setShowWhenLocked(true);
        findViewById(R.id.service_start).setOnClickListener(v -> {
            startService(new Intent(this, MmdvmService.class));
        });
        findViewById(R.id.service_stop).setOnClickListener(v -> {
            startService((new Intent(this, MmdvmService.class)).setAction(MmdvmService.ACTION_STOP_MMDVM_SERVICE));
        });
        startService(new Intent(this, MmdvmService.class));
        //checkAccessibilityPermission();
    }

    public void checkAccessibilityPermission() {
        int accessEnabled = 0;
        try {
            accessEnabled = Settings.Secure.getInt(this.getContentResolver(), Settings.Secure.ACCESSIBILITY_ENABLED);
        } catch (Throwable e) {
            Log.e(LOG_TAG, "cannot query ACCESSIBILITY_ENABLED", e);
        }
        if (accessEnabled == 0) {
            Intent intent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this, "Selected id " + item.getItemId(), Toast.LENGTH_SHORT).show();
        switch(item.getItemId()) {
            case 1:
                startActivity(new Intent(MainActivity.this, ContactsActivity.class));
                return true;
            case 2:
                return true;
            case 3:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem i = menu.add(0,1,0,"Kontakty");
        i.setIcon(android.R.drawable.sym_contact_card);
        i.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        MenuItem o = menu.add(0,2,0,"Servery");
        o.setIcon(android.R.drawable.btn_star);
        o.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        MenuItem s = menu.add(0,3,0,"Identity");
        s.setIcon(android.R.drawable.ic_lock_lock);
        s.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        return super.onCreateOptionsMenu(menu);
    }
}