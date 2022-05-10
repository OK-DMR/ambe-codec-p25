package cz.okdmr.mmdvm;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.WindowManager;

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
        checkAccessibilityPermission();
    }

    public void checkAccessibilityPermission() {
        int accessEnabled = 0;
        try {
            accessEnabled = Settings.Secure.getInt(this.getContentResolver(), Settings.Secure.ACCESSIBILITY_ENABLED);
        } catch (Settings.SettingNotFoundException e) {
            Log.e(LOG_TAG, "cannot query ACCESSIBILITY_ENABLED", e);
        }
        if (accessEnabled == 0) {
            Intent intent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }
}