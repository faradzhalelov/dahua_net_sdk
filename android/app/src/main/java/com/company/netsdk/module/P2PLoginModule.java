package com.company.netsdk.module;

import com.company.NetSDK.EM_LOCAL_MODE;
import com.company.NetSDK.EM_LOGIN_SPAC_CAP_TYPE;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.NET_DEVICEINFO_Ex;
import com.company.NetSDK.NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY;
import com.company.NetSDK.NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY;
import com.company.netsdk.common.P2pClient;
import com.company.netsdk.common.ToolKits;

/**
 * Created by 29779 on 2017/4/8.
 */
public class P2PLoginModule{
    private static final String TAG = "P2PLoginModule";
    private P2pClient mP2pClient;
    private long mLoginHandle = 0;
    private NET_DEVICEINFO_Ex mDeviceInfo;
    private int mErrorCode = 0;
    private boolean mServiceStarted = false;
    private String mDeviceName;

    public P2PLoginModule() {
        mP2pClient = new P2pClient();
    }

    public boolean isServiceStarted() {
        return mServiceStarted;
    }
  public boolean startP2pService( String svrAddress, String svrPort, String username, String svrKey,
                                   String deviceSn, String devicePort, String p2pDeviceUsername, String p2pDevicePassword) {
	  mDeviceName = deviceSn;
	  if(mP2pClient.startService(svrAddress, svrPort, username, svrKey, deviceSn, devicePort, p2pDeviceUsername, p2pDevicePassword)) {
           mServiceStarted = true;
       } else {
           mServiceStarted = false;
           return false;
       }
        return true;
    }

    public boolean stopP2pService() {
        mLoginHandle = 0;
        mServiceStarted = false;
        mDeviceInfo = null;
        mErrorCode = 0;
        return mP2pClient.stopService();
    }

    public boolean login(String username, String password) {
        Integer err = new Integer(0);
        mDeviceInfo = new NET_DEVICEINFO_Ex();

        /// default device login ip.
        final String deviceIP = "127.0.0.1";
        NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY stuIn = new NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY();
        System.arraycopy(deviceIP.getBytes(), 0, stuIn.szIP, 0, deviceIP.getBytes().length);
        stuIn.nPort = mP2pClient.getP2pPort();
        System.arraycopy(username.getBytes(), 0, stuIn.szUserName, 0, username.getBytes().length);
        System.arraycopy(password.getBytes(), 0, stuIn.szPassword, 0, password.getBytes().length);
        stuIn.emSpecCap = EM_LOGIN_SPAC_CAP_TYPE.EM_LOGIN_SPEC_CAP_P2P;
        NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY stuOut = new NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY();
        mLoginHandle = INetSDK.LoginWithHighLevelSecurity(stuIn, stuOut);
//        mLoginHandle = INetSDK.LoginEx2(deviceIP, mP2pClient.getP2pPort(), username, password,
//                EM_LOGIN_SPAC_CAP_TYPE.EM_LOGIN_SPEC_CAP_P2P, "", mDeviceInfo, err);
        if (0 == mLoginHandle) {
            mErrorCode = INetSDK.GetLastError();
            ToolKits.writeErrorLog("Failed to Login Device.");
            return false;
        }
        mDeviceInfo = stuOut.stuDeviceInfo;
        // 设置预览优化模式
        int nPlayValue = 0x01|0x02;
        boolean bPlayRet = INetSDK.SetLocalMode(mLoginHandle, EM_LOCAL_MODE.EM_LOCAL_PLAY_FLAG_MODE, nPlayValue);
        if(bPlayRet == false)
        {
            ToolKits.writeLog("SetLocalMode-EM_LOCAL_PLAY_FLAG_MODE failed,nPlayValue:" + nPlayValue + "LastError:" + INetSDK.GetLastError());
        }
        //设置回放优化模式
        int nPlaybackValue = 0x01;
        boolean bPlaybackRet = INetSDK.SetLocalMode(mLoginHandle, EM_LOCAL_MODE.EM_LOCAL_PLAYBACK_FLAG_MODE, nPlaybackValue);
        if(bPlaybackRet == false)
        {
            ToolKits.writeLog("SetLocalMode-EM_LOCAL_PLAYBACK_FLAG_MODE failed,nPlaybackValue：" + nPlaybackValue + "LastError:" + INetSDK.GetLastError());
        }
        return true;
    }

    public boolean logout() {
        if (0 == mLoginHandle) {
            return  false;
        }

        boolean retLogout = INetSDK.Logout(mLoginHandle);
        if (retLogout) {
            mLoginHandle = 0;
        }

        return  retLogout;
    }

    public int errorCode() {
        return mErrorCode;
    }

    public long getLoginHandle() {
        return mLoginHandle;
    }

    public NET_DEVICEINFO_Ex getDeviceInfo() {
        return mDeviceInfo;
    }

    public String getDeviceName(){
        return  mDeviceName;
    }
}
