package cz.okdmr.mmdvm;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

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
        //startService(new Intent(this, MmdvmService.class));
        //checkAccessibilityPermission();
        checkPermissions();
    }

    public void checkAccessibilityPermission() {
        int accessEnabled = 0;
        try {
            accessEnabled = Settings.Secure.getInt(this.getContentResolver(), "accessibility_enabled");
        } catch (Throwable e) {
            Log.e(LOG_TAG, "cannot query ACCESSIBILITY_ENABLED", e);
        }
        if (accessEnabled == 0) {
            Intent intent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }

    public void checkPermissions() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION,
                    Manifest.permission.RECORD_AUDIO
            }, 0);
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
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
        MenuItem o = menu.add(0, 2, 1, "Nastavení");
        o.setIcon(R.drawable.ic_baseline_settings_24);
        o.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        MenuItem i = menu.add(0, 1, 2, "Kontakty");
        i.setIcon(R.drawable.ic_baseline_group_24);
        i.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        return super.onCreateOptionsMenu(menu);
    }
}