package com.company.netsdk.module;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

import com.company.NetSDK.EM_EVENT_SUB_CODE;
import com.company.NetSDK.EM_MOBILE_SERVER_TYPE;
import com.company.NetSDK.FinalVar;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.NET_IN_ADD_MOBILE_PUSHER_NOTIFICATION;
import com.company.NetSDK.NET_IN_DEL_MOBILE_PUSHER_NOTIFICATION;
import com.company.NetSDK.NET_IN_GET_MOBILE_PUSHER_CAPS;
import com.company.NetSDK.NET_MOBILE_PUSH_NOTIFY;
import com.company.NetSDK.NET_MOBILE_PUSH_NOTIFY_CFG;
import com.company.NetSDK.NET_MOBILE_PUSH_NOTIFY_CFG_DEL;
import com.company.NetSDK.NET_MOBILE_PUSH_NOTIFY_DEL;
import com.company.NetSDK.NET_OUT_ADD_MOBILE_PUSHER_NOTIFICATION;
import com.company.NetSDK.NET_OUT_DELETECFG;
import com.company.NetSDK.NET_OUT_DEL_MOBILE_PUSHER_NOTIFICATION;
import com.company.NetSDK.NET_OUT_GET_MOBILE_PUSHER_CAPS;
import com.company.NetSDK.NET_CUSTOM_TILTER_OF_FACE_COMPARISION;
import com.company.netsdk.R;
import com.company.netsdk.activity.MainActivity;
import com.company.netsdk.activity.NetSDKApplication;
import com.company.netsdk.common.PushHelper;
import com.company.netsdk.common.ToolKits;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.IllegalFormatCodePointException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by 29779 on 2017/4/8.
 */
public class AlarmPushModule {
    private final static String TAG = "AlarmPushModule";
    NetSDKApplication app;
    Context mContext;
    private int resId;
    private boolean bEnablePush;

    public AlarmPushModule(Context context) {
        mContext = context;
        app = ((NetSDKApplication)((AppCompatActivity)mContext).getApplication());
        resId = R.string.NET_ERROR;
        bEnablePush = false;
    }

    /**
     *  Subscribe Alarm Push, support VideoMotion
     */
    public boolean subscribe(String deviceName) {


        bEnablePush = false;

        /// Get register id form google service
        String registerID = PushHelper.instance().getRegisterID(mContext);
        if (registerID == null) {
            Log.d(TAG, "not support google service.");
            resId = R.string.alarm_push_not_support_google_service;
            return false;
        }

        if (getMobilePusherCaps()) {
            bEnablePush = true;
            return addMobilePusherNotification(registerID, deviceName);
        }

        return setMobileSubscribeCfg(registerID, deviceName);

    }

    /**
     * unsubscribe Alarm Push
     */
    public boolean unsubscribe() {

        /// Get register id form google service
        String registerID = PushHelper.instance().getRegisterID(mContext);
        if (registerID == null) {
            Log.d(TAG, "not support google service.");
            resId = R.string.alarm_push_not_support_google_service;
            return false;
        }

        if (bEnablePush) {
            return DelMobilePusherNotification(registerID);
        }

        return delMobileSubscribeCfg(registerID);

    }

    /**
     * Get Mobile Pusher Caps
     */
    public boolean getMobilePusherCaps() {
        NET_IN_GET_MOBILE_PUSHER_CAPS stIn = new NET_IN_GET_MOBILE_PUSHER_CAPS();
        NET_OUT_GET_MOBILE_PUSHER_CAPS stOut = new NET_OUT_GET_MOBILE_PUSHER_CAPS();
        if(!INetSDK.GetMobilePusherCaps(app.getLoginHandle(), stIn, stOut, 5000)) {
            ToolKits.writeErrorLog("Get Mobile Pusher Caps failed!");
            return false;
        }
        return stOut.bAddNotification && stOut.bDelNotification;
    }

    /**
     * Get Res ID
     */
    public int getResId() {
        return resId;
    }

    /**
     * Copy Strings data to Byte Array data
     * @param str
     * @param bytes
     */
    private void StringToByteArray(String str, byte[] bytes) {
        System.arraycopy(str.getBytes(), 0, bytes, 0, str.getBytes().length);
    }

    /**
     *  Set Mobile Subscribe
     */
    public boolean addMobilePusherNotification(String registerID, String deviceName) {

        int nChnCount = app.getDeviceInfo().nChanNum;
        NET_IN_ADD_MOBILE_PUSHER_NOTIFICATION stNotify = new NET_IN_ADD_MOBILE_PUSHER_NOTIFICATION(2);
        NET_OUT_ADD_MOBILE_PUSHER_NOTIFICATION stuOut = new NET_OUT_ADD_MOBILE_PUSHER_NOTIFICATION();

        StringToByteArray("com.company.netsdk", stNotify.szAppID);
        ///default value
        long period = 500646880;

        //RegisterID
        StringToByteArray(registerID, stNotify.szRegisterID); // for device service to

        //serverType
        stNotify.emServerType = EM_MOBILE_SERVER_TYPE.EM_MOBILE_SERVER_TYPE_ANDROID;

        //PeriodOfValidity
        stNotify.nPeriodOfValidity = (int) period;

        //AuthServer -- invalid since google not supported C2DM any more
        StringToByteArray("https://www.google.com/accounts/ClientLogin", stNotify.szAuthServerAddr); //
        stNotify.nAuthServerPort = 443;

        //PushServer -- proxy server.
        StringToByteArray("https://fcm.googleapis.com/fcm/send", stNotify.szPushServerAddr);
        stNotify.nPushServerPort = 443;

        // PushServer
        String PushServer = "https://fcm.googleapis.com/fcm/send";
        StringToByteArray(PushServer, stNotify.stuPushServerMain.szAddress);
        stNotify.stuPushServerMain.nPort = 443;

        // DevName
        StringToByteArray(deviceName, stNotify.szDevName);

//        // DevID
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String devID = format.format(new Date());
        StringToByteArray(devID, stNotify.szDevID);
//        System.arraycopy(app.getDeviceInfo().sSerialNumber, 0, stNotify.szDevID, 0, app.getDeviceInfo().sSerialNumber.length);
        // user
        StringToByteArray(PushHelper.instance().getApiKey(), stNotify.szUser);
        //password
        StringToByteArray("", stNotify.szSecretKey);

        stNotify.nSubScribeNum = 2;
        StringToByteArray("VideoMotion", stNotify.pstuSubscribes[0].szCode);
        StringToByteArray("CallNoAnswered", stNotify.pstuSubscribes[1].szCode);
        stNotify.pstuSubscribes[0].nChnNum = nChnCount;
        stNotify.pstuSubscribes[1].nChnNum = nChnCount;
        for (int i = 0; i < nChnCount; i++) {
            stNotify.pstuSubscribes[0].nIndexs[i] = i;
            stNotify.pstuSubscribes[1].nIndexs[i] = i;
        }

        boolean bRet = INetSDK.AddMobilePusherNotification(app.getLoginHandle(), stNotify, stuOut, 5000);
        if (!bRet) {
            ToolKits.writeErrorLog("Add Mobile Pusher Notification failed");
            resId = R.string.alarm_push_sub_failed;
        }else {
            ToolKits.writeLog("Add Mobile Pusher Notification Succeed!");
            resId = R.string.alarm_push_sub_successed;
        }
        return bRet;
    }

    /**
     * Del Mobile Pusher Notification
     */
    public boolean DelMobilePusherNotification(String registerID) {

        NET_IN_DEL_MOBILE_PUSHER_NOTIFICATION stIn = new NET_IN_DEL_MOBILE_PUSHER_NOTIFICATION();
        StringToByteArray(registerID, stIn.szRegisterID);
        StringToByteArray("com.company.netsdk", stIn.szAppID);
        NET_OUT_DEL_MOBILE_PUSHER_NOTIFICATION stOut = new NET_OUT_DEL_MOBILE_PUSHER_NOTIFICATION();
        boolean bRet = INetSDK.DelMobilePusherNotification(app.getLoginHandle(), stIn, stOut, 5000);
        if (!bRet) {
            resId = R.string.alarm_push_unsub_failed;
            ToolKits.writeErrorLog("Del Mobile Pusher Notification failed");
        } else {
            resId = R.string.alarm_push_unsub_successed;
            ToolKits.writeLog("Del Mobile Pusher Notification Succeed!");
        }
        return bRet;
    }

    /**
     *  Set Mobile Subscribe Cfg
     */
    public boolean setMobileSubscribeCfg(String registerID, String deviceName) {

        int nChnCount = app.getDeviceInfo().nChanNum;
        NET_MOBILE_PUSH_NOTIFY_CFG stNotify = new NET_MOBILE_PUSH_NOTIFY_CFG(2);
        StringToByteArray("com_company_netsdk", stNotify.szAppID);

        ///default value
        long period = 500646880;

        //RegisterID
        StringToByteArray(registerID, stNotify.szRegisterID); // for device service to

        //serverType
        stNotify.emServerType = EM_MOBILE_SERVER_TYPE.EM_MOBILE_SERVER_TYPE_ANDROID;

        //PeriodOfValidity
        stNotify.nPeriodOfValidity = (int) period;

        //AuthServer -- invalid since google not supported C2DM any more
        StringToByteArray("https://www.google.com/accounts/ClientLogin", stNotify.szAuthServerAddr); //
        stNotify.nAuthServerPort = 443;

        //PushServer -- proxy server.
        StringToByteArray("https://fcm.googleapis.com/fcm/send", stNotify.szPushServerAddr);
        stNotify.nPushServerPort = 443;

        // PushServer
        String PushServer = "https://fcm.googleapis.com/fcm/send";
        StringToByteArray(PushServer, stNotify.stuPushServerMain.szAddress);
        stNotify.stuPushServerMain.nPort = 443;

        // DevName
        StringToByteArray(deviceName, stNotify.szDevName);
        // DevID
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String devID = format.format(new Date());
        StringToByteArray(devID, stNotify.szDevID);
        //System.arraycopy(app.getDeviceInfo().sSerialNumber, 0, stNotify.szDevID, 0, app.getDeviceInfo().sSerialNumber.length);
        // user
        StringToByteArray(PushHelper.instance().getApiKey(), stNotify.szUser);
        //password
        StringToByteArray("", stNotify.szPassword);

        stNotify.pstuSubscribes[0].nCode = FinalVar.EVENT_ALARM_MOTIONDETECT;
        stNotify.pstuSubscribes[0].emSubCode = EM_EVENT_SUB_CODE.EM_EVENT_SUB_CODE_UNKNOWN;
        stNotify.pstuSubscribes[0].nChnNum = nChnCount;
        for (int i = 0; i < nChnCount; i++) {
            stNotify.pstuSubscribes[0].nIndexs[i] = i;
        }

        stNotify.pstuSubscribes[1].nCode = FinalVar.EVENT_IVS_CALLNOANSWERED;
        stNotify.pstuSubscribes[1].emSubCode = EM_EVENT_SUB_CODE.EM_EVENT_SUB_CODE_UNKNOWN;
        stNotify.pstuSubscribes[1].nChnNum = nChnCount;
        for (int j = 0; j < nChnCount; j++) {
            stNotify.pstuSubscribes[1].nIndexs[j] = j;
        }

        stNotify.nSubScribeMax = 2;

        Integer stuErr = new Integer(0);
        Integer stuRes = new Integer(0);
        boolean bRet = INetSDK.SetMobileSubscribeCfg(app.getLoginHandle(), stNotify, stuErr, stuRes, 5000);
        if (!bRet) {
            ToolKits.writeErrorLog("Set Mobile Subscribe Cfg failed");
            resId = R.string.alarm_push_sub_failed;
        }else {
            ToolKits.writeLog("Set Mobile Subscribe Cfg Succeed!");
            resId = R.string.alarm_push_sub_successed;
        }
        return bRet;
    }

    /**
     * Del Mobile Subscribe Cfg
     */
    public boolean delMobileSubscribeCfg(String registerID) {

        NET_MOBILE_PUSH_NOTIFY_CFG_DEL stIn = new NET_MOBILE_PUSH_NOTIFY_CFG_DEL();
        StringToByteArray(registerID, stIn.szRegisterID);
        StringToByteArray("com_company_netsdk", stIn.szAppID);
        NET_OUT_DELETECFG stOut = new NET_OUT_DELETECFG();
        boolean bRet = INetSDK.DelMobileSubscribeCfg(app.getLoginHandle(), stIn, stOut, 5000);
        if (!bRet) {
            resId = R.string.alarm_push_unsub_failed;
            ToolKits.writeErrorLog("Del Mobile Subscribe Cfg failed");
        } else {
            if(0 == stOut.dwOptionMask)
            {
                resId = R.string.alarm_push_unsub_successed;
                ToolKits.writeLog("Del Mobile Subscribe Cfg Succeed!");
            }
            else
            {
                resId = R.string.alarm_push_unsub_failed;
                ToolKits.writeErrorLog("Del Mobile Subscribe Cfg failed");
                bRet = false;
            }

        }

        // double ensure delete
//        NET_MOBILE_PUSH_NOTIFY_CFG stNotify = new NET_MOBILE_PUSH_NOTIFY_CFG(0);
//        StringToByteArray("com_company_netsdk", stNotify.szAppID);
//
//        ///default value
//        long period = 500646880;
//        String devName = "deviceName";
//
//        //RegisterID
//        StringToByteArray(registerID, stNotify.szRegisterID); // for device service to
//
//        //serverType
//        stNotify.emServerType = EM_MOBILE_SERVER_TYPE.EM_MOBILE_SERVER_TYPE_ANDROID;
//
//        //PeriodOfValidity
//        stNotify.nPeriodOfValidity = (int) period;
//
//        // DevName
//        StringToByteArray(devName, stNotify.szDevName);
//        // DevID
//        System.arraycopy(app.getDeviceInfo().sSerialNumber, 0, stNotify.szDevID, 0, app.getDeviceInfo().sSerialNumber.length);
//        // user
//        StringToByteArray(PushHelper.instance().getApiKey(), stNotify.szUser);
//        //password
//        StringToByteArray("", stNotify.szPassword);
//
//        Integer stuErr = new Integer(0);
//        Integer stuRes = new Integer(0);
//        bRet = INetSDK.SetMobileSubscribeCfg(app.getLoginHandle(), stNotify, stuErr, stuRes, 5000);
//        if (!bRet) {
//            ToolKits.writeErrorLog("Empty Mobile Subscribe Cfg failed");
//            resId = R.string.alarm_push_unsub_failed;
//        }else {
//            ToolKits.writeLog("Empty Mobile Subscribe Cfg Succeed!");
//            resId = R.string.alarm_push_unsub_successed;
//        }
        return bRet;
    }

//    /**
//     *  Set Mobile Subscribe
//     */
//    public boolean setMobileSubscribe(String registerID) {
//
//        int nChnCount = app.getDeviceInfo().nChanNum;
//        NET_MOBILE_PUSH_NOTIFY stNotify = new NET_MOBILE_PUSH_NOTIFY(1);
//
//        ///default value
//        long period = 500646880;
//        String devName = "deviceName";
//
//        //RegisterID
//        StringToByteArray(registerID, stNotify.szRegisterID); // for device service to
//
//        //serverType
//        stNotify.emServerType = EM_MOBILE_SERVER_TYPE.EM_MOBILE_SERVER_TYPE_ANDROID;
//
//        //PeriodOfValidity
//        stNotify.nPeriodOfValidity = (int) period;
//
//        //AuthServer -- invalid since google not supported C2DM any more
//        StringToByteArray("https://www.google.com/accounts/ClientLogin", stNotify.szAuthServerAddr); //
//        stNotify.nAuthServerPort = 443;
//
//        //PushServer -- proxy server.
//        StringToByteArray("https://cellphonepush.quickddns.com/gcm/send", stNotify.szPushServerAddr);
//        stNotify.nPushServerPort = 443;
//
//        // PushServer
//        String PushServer = "https://android.googleapis.com/gcm/send";
//        StringToByteArray(PushServer, stNotify.stuPushServerMain.szAddress);
//        stNotify.stuPushServerMain.nPort = 443;
//
//        // DevName
//        StringToByteArray(devName, stNotify.szDevName);
//        // DevID
//        System.arraycopy(app.getDeviceInfo().sSerialNumber, 0, stNotify.szDevID, 0, app.getDeviceInfo().sSerialNumber.length);
//        // user
//        StringToByteArray(PushHelper.instance().getApiKey(), stNotify.szUser);
//        //password
//        StringToByteArray("", stNotify.szPassword);
//
//        stNotify.pstuSubscribes[0].nCode = FinalVar.EVENT_ALARM_MOTIONDETECT;
//        stNotify.pstuSubscribes[0].emSubCode = EM_EVENT_SUB_CODE.EM_EVENT_SUB_CODE_UNKNOWN;
//        stNotify.pstuSubscribes[0].nChnNum = nChnCount;
//        for (int i = 0; i < nChnCount; i++) {
//            stNotify.pstuSubscribes[0].nIndexs[i] = i;
//        }
//
//        Integer stuErr = new Integer(0);
//        Integer stuRes = new Integer(0);
//        boolean bRet = INetSDK.SetMobileSubscribe(app.getLoginHandle(), stNotify, stuErr, stuRes, 5000);
//        if (!bRet) {
//            ToolKits.writeErrorLog("subscribe SetMobilePushNotify failed");
//            resId = R.string.alarm_push_sub_failed;
//        }else {
//            ToolKits.writeLog("subscribe SetMobilePushNotify Succeed!");
//            resId = R.string.alarm_push_sub_successed;
//        }
//        return bRet;
//    }
//
//    /**
//     * Del Mobile Subscribe
//     */
//    public boolean delMobileSubscribe(String registerID) {
//
//        NET_MOBILE_PUSH_NOTIFY_DEL stIn = new NET_MOBILE_PUSH_NOTIFY_DEL();
//        StringToByteArray(registerID, stIn.szRegisterID);
//        NET_OUT_DELETECFG stOut = new NET_OUT_DELETECFG();
//        boolean bRet = INetSDK.DelMobileSubscribe(app.getLoginHandle(), stIn, stOut, 5000);
//        if (!bRet) {
//            resId = R.string.alarm_push_unsub_failed;
//            ToolKits.writeErrorLog("Del Mobile Subscribe failed");
//        } else {
//            resId = R.string.alarm_push_unsub_successed;
//            ToolKits.writeLog("Del Mobile Subscribe Succeed!");
//        }
//
//        // double ensure delete
//        NET_MOBILE_PUSH_NOTIFY stNotify = new NET_MOBILE_PUSH_NOTIFY(0);
//
//        ///default value
//        long period = 500646880;
//        String devName = "deviceName";
//
//        //RegisterID
//        StringToByteArray(registerID, stNotify.szRegisterID); // for device service to
//
//        //serverType
//        stNotify.emServerType = EM_MOBILE_SERVER_TYPE.EM_MOBILE_SERVER_TYPE_ANDROID;
//
//        //PeriodOfValidity
//        stNotify.nPeriodOfValidity = (int) period;
//
//        // DevName
//        StringToByteArray(devName, stNotify.szDevName);
//        // DevID
//        System.arraycopy(app.getDeviceInfo().sSerialNumber, 0, stNotify.szDevID, 0, app.getDeviceInfo().sSerialNumber.length);
//        // user
//        StringToByteArray(PushHelper.instance().getApiKey(), stNotify.szUser);
//        //password
//        StringToByteArray("", stNotify.szPassword);
//
//        Integer stuErr = new Integer(0);
//        Integer stuRes = new Integer(0);
//        bRet = INetSDK.SetMobileSubscribe(app.getLoginHandle(), stNotify, stuErr, stuRes, 5000);
//        if (!bRet) {
//            ToolKits.writeErrorLog("Empty Mobile Subscribe failed");
//            resId = R.string.alarm_push_unsub_failed;
//        }else {
//            ToolKits.writeLog("Empty Mobile Subscribe Succeed!");
//            resId = R.string.alarm_push_unsub_successed;
//        }
//        return bRet;
//    }

}
