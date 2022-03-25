package cz.okdmr.mmdvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.harris.rf.bbptt.core.BbPttCore;
import com.harris.rf.bbptt.core.IBeOnEventListener;

public class MainActivity extends AppCompatActivity {

    private IBeOnEventListener pttListener = new IBeOnEventListener() {
        @Override
        public void onBeOnEvent(int i, int i2, int i3, Object obj) {
            Log.d("PttListener", String.format("onBeOnEvent %d %d %d", i, i2, i3));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = findViewById(R.id.hello);
        t.setText("Čau");

        BbPttCore core = new BbPttCore();
        BbPttCore.setBbPttCoreLogLevel(0);
        core.addListener(0, pttListener);
        Log.d("MainActivity", core.isStarted() ? "STARTED" : "CLOSED");
    }
}