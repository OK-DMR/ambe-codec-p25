package cz.okdmr.mmdvm;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.service_start).setOnClickListener(v -> {
            startService(new Intent(this, MmdvmService.class));
        });
        findViewById(R.id.service_stop).setOnClickListener(v -> {
            startService((new Intent(this, MmdvmService.class)).setAction(MmdvmService.ACTION_STOP_MMDVM_SERVICE));
        });
    }
}