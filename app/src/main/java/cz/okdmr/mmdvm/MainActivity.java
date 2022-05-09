package cz.okdmr.mmdvm;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    native void getNativeString();

    static {
        System.loadLibrary("mmdvm");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button t = findViewById(R.id.hello);
        t.setOnClickListener(v -> getNativeString());
    }
}