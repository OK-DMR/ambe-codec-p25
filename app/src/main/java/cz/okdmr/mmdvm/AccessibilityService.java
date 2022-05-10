package cz.okdmr.mmdvm;

import android.util.Log;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;

public class AccessibilityService extends android.accessibilityservice.AccessibilityService {
    public static final String LOG_TAG = "MmdvmAccessibility";

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {

    }

    @Override
    public void onInterrupt() {

    }

    @Override
    protected boolean onKeyEvent(KeyEvent event) {

        if (event.getKeyCode() == 142) {
            // PTT pushed
            Log.e(LOG_TAG, event.getAction() == KeyEvent.ACTION_DOWN ? "PTT pushed" : "PTT released");
        } else if (event.getKeyCode() == 140) {
            Log.e(LOG_TAG, event.getAction() == KeyEvent.ACTION_DOWN ? "Emergency pushed" : "Emergency released");
        } else {
            Log.e(LOG_TAG, "onKeyEvent " + event.getKeyCode());
        }

        return false;
    }
}
