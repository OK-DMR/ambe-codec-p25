package cz.okdmr.mmdvm;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

public class MmdvmService extends Service {
    public static String NOTIFICATION_CHANNEL_GROUP_ID = "mmdvm";
    public static String NOTIFICATION_CHANNEL_GROUP_NAME = "MMDVM";
    public static String NOTIFICATION_CHANNEL_ID = "mmdvm_service";
    public static String NOTIFICATION_CHANNEL_NAME = "MMDVM Service";
    public static String ACTION_STOP_MMDVM_SERVICE = "cz.okdmr.mmdvm.stop_mmdvm_service";
    public static int FOREGROUND_NOTIFICATION_ID = 0x1213;

    private Notification mNotification;
    private NotificationManager mNotificationManager;
    private PendingIntent mStartMainActivityIntent;
    private NotificationChannel mNotificationChannel;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (ACTION_STOP_MMDVM_SERVICE.equalsIgnoreCase(intent.getAction())) {
            stopForeground(true);
            stopSelf();
        } else {
            showForegroundNotification();
        }
        return START_STICKY;
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
