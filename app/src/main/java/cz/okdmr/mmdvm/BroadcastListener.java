package cz.okdmr.mmdvm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BroadcastListener extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("BroadcastListener", "onReceive action " + intent.getAction());
        if (Intent.ACTION_BOOT_COMPLETED.equalsIgnoreCase(intent.getAction())) {
            context.startService(new Intent(context, MmdvmService.class));
        }
    }
}
