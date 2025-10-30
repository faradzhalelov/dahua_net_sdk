package com.company.netsdk.common;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;

import com.company.netsdk.R;
import com.company.netsdk.activity.MainActivity;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


/**
 * Created by 30380 on 2020/6/2.
 */
public class EMFCMMSGService extends FirebaseMessagingService {
    private static final String TAG = "EMFCMMSGService";
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
            if (remoteMessage.getData().size() > 0) {
            String msg = remoteMessage.getData().get("msg");
                /// message format 设备名称::设备ID::通道号::报警类型::报警时间
                /// deviceName::deviceID::ChannelID::AlarmType::AlarmTime
                int alarmTypeResId = R.string.alarm_push_unknown_type;
                String strs[] = msg.split("::");
                String alarmType = "";
                String alarmTime = "";
                String channelNum = "";
                String deviceId = "";
                String deviceName = "";
                if (strs.length >= 5 ) {
                    deviceName = strs[0];
                    deviceId = strs[1];
                    channelNum = strs[2];
                    alarmType = strs[3];
                    alarmTime = strs[4];

                    /// only deal with video-motion-event here.
                    if (alarmType.equals("VideoMotion")) {
                        alarmTypeResId = R.string.alarm_push_video_motion;
                    }
                    else if (alarmType.equals("CallNoAnswered")) {
                        alarmTypeResId = R.string.alarm_push_call_no_answer;
                    }
                }

                Resources r = getResources();

                Intent intent1 = new Intent(Intent.ACTION_MAIN);
                intent1.addCategory(Intent.CATEGORY_LAUNCHER);
                intent1.setClass(this, MainActivity.class);
                PendingIntent pi = PendingIntent.getActivity(this, 0, intent1, 0);

                String message =  r.getString(R.string.channel) + "-" + channelNum + " "	+ r.getString(alarmTypeResId);
                String title = deviceName + " " + r.getString(R.string.alarm_push_title) + " " +alarmTime;

                Notification.Builder builder =new Notification.Builder(this);
                builder.setSmallIcon(android.R.mipmap.sym_def_app_icon);
                Notification notification = builder.setContentIntent(pi).setContentTitle(title).setContentText(message).build();
                NotificationManager notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);

                if(Build.VERSION.SDK_INT > Build.VERSION_CODES.N_MR1) {
                    NotificationChannel channel = new NotificationChannel(title, title, NotificationManager.IMPORTANCE_HIGH);
                    notificationManager.createNotificationChannel(channel);
                    notification = builder.setChannelId(title).build();
                }
                notificationManager.notify(0, notification);
        }

    }
}