package cz.okdmr.mmdvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.harris.rf.bbptt.core.BbPttCore;
import com.harris.rf.bbptt.core.IBeOnEventListener;

public class MainActivity extends AppCompatActivity {

    native String getNativeString();

    static {
        System.loadLibrary("mmdvm");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = findViewById(R.id.hello);
        t.setText(getNativeString());
    }
}