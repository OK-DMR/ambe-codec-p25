package cz.okdmr.mmdvm;

import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

public class MmdvmService extends Service {
    public static String NOTIFICATION_CHANNEL_GROUP_ID = "mmdvm";
    public static String NOTIFICATION_CHANNEL_GROUP_NAME = "MMDVM";
    public static String NOTIFICATION_CHANNEL_ID = "mmdvm_service";
    public static String NOTIFICATION_CHANNEL_NAME = "MMDVM Service";
    public static String ACTION_STOP_MMDVM_SERVICE = "cz.okdmr.mmdvm.stop_mmdvm_service";
    public static int FOREGROUND_NOTIFICATION_ID = 0x1213;

    public static String ACTION_SOS_PRESSED = "android.intent.action.SOS.down";
    public static String ACTION_SOS_RELEASED = "android.intent.action.SOS.up";
    public static String ACTION_PTT_PRESSED = "com.dfl.a9.camdown";
    public static String ACTION_PTT_RELEASED = "com.dfl.a9.camup";

    private Notification mNotification;
    private NotificationManager mNotificationManager;
    private PendingIntent mStartMainActivityIntent;
    private NotificationChannel mNotificationChannel;
    private PowerManager mPowerManager;
    private PowerManager.WakeLock mWakeLock;
    private KeyguardManager mKeyguardManager;
    private KeyguardManager.KeyguardLock mKeyguardLock;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent != null && ACTION_STOP_MMDVM_SERVICE.equalsIgnoreCase(intent.getAction())) {
            registerBroadcasts(false);
            stopForeground(true);
            stopSelf();
        } else {
            showForegroundNotification();
            registerBroadcasts(true);
            setupWakeLock(false);
        }
        return START_STICKY;
    }

    private final BroadcastListener dfl_a9_receiver = new BroadcastListener() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.d("dfl_a9_receiver", "action " + intent.getAction());
            setupWakeLock(true);
        }
    };

    private void registerBroadcasts(boolean setActive) {
        if (setActive) {
            IntentFilter filter = new IntentFilter(ACTION_PTT_PRESSED);
            filter.addAction(ACTION_PTT_RELEASED);
            filter.addAction(ACTION_SOS_PRESSED);
            filter.addAction(ACTION_SOS_RELEASED);
            registerReceiver(dfl_a9_receiver, filter);
        } else {
            unregisterReceiver(dfl_a9_receiver);
        }
    }

    private void setupWakeLock(boolean keepScreenWoke) {
        if (mPowerManager == null) {
            mPowerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
        }
        if (mWakeLock == null) {
            mWakeLock = mPowerManager.newWakeLock((PowerManager.SCREEN_BRIGHT_WAKE_LOCK | PowerManager.FULL_WAKE_LOCK | PowerManager.ACQUIRE_CAUSES_WAKEUP), NOTIFICATION_CHANNEL_ID);
        }
        if (mKeyguardManager == null) {
            mKeyguardManager = (KeyguardManager) getSystemService(Context.KEYGUARD_SERVICE);
        }
        if (mKeyguardLock == null) {
            mKeyguardLock = mKeyguardManager.newKeyguardLock(NOTIFICATION_CHANNEL_ID);
        }
        if (keepScreenWoke && !mWakeLock.isHeld()) {
            mWakeLock.acquire(10 * 60 * 1000L /*10 minutes*/);
        } else if (mWakeLock.isHeld()) {
            mWakeLock.release();
        }
        if (keepScreenWoke) {
            startActivity(new Intent(this, MainActivity.class));
            mKeyguardLock.disableKeyguard();
        } else {
            mKeyguardLock.reenableKeyguard();
        }
    }

    private void showForegroundNotification() {
        if (mNotificationManager == null) {
            mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        }
        if (mStartMainActivityIntent == null) {
            mStartMainActivityIntent = PendingIntent.getActivity(this, 0, new Intent(this, MainActivity.class), PendingIntent.FLAG_IMMUTABLE);
        }
        mNotificationManager.createNotificationChannelGroup((new NotificationChannelGroup(NOTIFICATION_CHANNEL_GROUP_ID, NOTIFICATION_CHANNEL_GROUP_NAME)));
        if (mNotificationChannel == null) {
            mNotificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, NOTIFICATION_CHANNEL_NAME, NotificationManager.IMPORTANCE_MIN);
            mNotificationChannel.enableLights(true);
            mNotificationChannel.setLockscreenVisibility(Notification.VISIBILITY_PUBLIC);
            mNotificationManager.createNotificationChannel(mNotificationChannel);
        }
        if (mNotification == null) {
            NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID);
            notificationBuilder
                    .setContentTitle("Content title")
                    .setTicker("ticker text")
                    .setContentText("content text")
                    .setSmallIcon(R.drawable.ic_launcher_foreground)
                    .setPriority(NotificationCompat.PRIORITY_LOW)
                    .setWhen(0)
                    .setOnlyAlertOnce(true)
                    .setContentIntent(mStartMainActivityIntent)
                    .setOngoing(true)
                    .setColor(getResources().getColor(R.color.teal_700, null));
            mNotification = notificationBuilder.build();
        }
        startForeground(FOREGROUND_NOTIFICATION_ID, mNotification);
    }
}
