package com.company.netsdk.module;

import com.company.NetSDK.CB_fPostLoginTask;
import com.company.NetSDK.EM_LOCAL_MODE;
import com.company.NetSDK.EM_LOGIN_SPAC_CAP_TYPE;
import com.company.NetSDK.FinalVar;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.NET_DEVICEINFO_Ex;
import com.company.NetSDK.NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY;
import com.company.NetSDK.NET_IN_POST_LOGIN_TASK;
import com.company.NetSDK.NET_LOGIN_PARAM;
import com.company.NetSDK.NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY;
import com.company.NetSDK.NET_OUT_POST_LOGIN_TASK;
import com.company.NetSDK.NET_POST_LOGIN_TASK;
import com.company.netsdk.common.ToolKits;

/**
 * Created by 29779 on 2017/4/8.
 */
public class IPLoginModule {
    public static final int NET_USER_FLASEPWD_TRYTIME = FinalVar.NET_USER_FLASEPWD_TRYTIME;
    public static final int NET_LOGIN_ERROR_PASSWORD = FinalVar.NET_LOGIN_ERROR_PASSWORD;
    public static final int NET_LOGIN_ERROR_USER = FinalVar.NET_LOGIN_ERROR_USER;
    public static final int NET_LOGIN_ERROR_TIMEOUT = FinalVar.NET_LOGIN_ERROR_TIMEOUT;
    public static final int NET_LOGIN_ERROR_RELOGGIN = FinalVar.NET_LOGIN_ERROR_RELOGGIN;
    public static final int NET_LOGIN_ERROR_LOCKED = FinalVar.NET_LOGIN_ERROR_LOCKED;
    public static final int NET_LOGIN_ERROR_BLACKLIST = FinalVar.NET_LOGIN_ERROR_BLACKLIST;
    public static final int NET_LOGIN_ERROR_BUSY = FinalVar.NET_LOGIN_ERROR_BUSY;
    public static final int NET_LOGIN_ERROR_CONNECT = FinalVar.NET_LOGIN_ERROR_CONNECT;
    public static final int NET_LOGIN_ERROR_NETWORK = FinalVar.NET_LOGIN_ERROR_NETWORK;

    private long mLoginHandle;
    private NET_DEVICEINFO_Ex mDeviceInfo;
    private NET_LOGIN_PARAM pstLoginParam;
    private int mLoginType = 0;
    private int mErrorCode = 0;
    private String mDeviceName;

    enum LOGIN_TYPE {
        IP, P2P
    }

    public IPLoginModule() {
        mLoginHandle = 0;
        setLoginType(LOGIN_TYPE.IP);
    }

    public void setLoginType(LOGIN_TYPE type) {
        if (LOGIN_TYPE.IP == type ) {
            mLoginType = EM_LOGIN_SPAC_CAP_TYPE.EM_LOGIN_SPEC_CAP_MOBILE;
        } else if (LOGIN_TYPE.P2P == type) {
            mLoginType = EM_LOGIN_SPAC_CAP_TYPE.EM_LOGIN_SPEC_CAP_P2P;
        }
    }

    public NET_DEVICEINFO_Ex getDeviceInfo() {
        return mDeviceInfo;
    }

    public String getDeviceName(){
        return  mDeviceName;
    }

    public long getLoginHandle() {
        return this.mLoginHandle;
    }

    public boolean login(String address, String port, String username, String password) {
        Integer err = new Integer(0);
//        mDeviceInfo = new NET_DEVICEINFO_Ex();
        NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY stuIn = new NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY();
        System.arraycopy(address.getBytes(), 0, stuIn.szIP, 0, address.getBytes().length);
        stuIn.nPort = Integer.parseInt(port);
        System.arraycopy(username.getBytes(), 0, stuIn.szUserName, 0, username.getBytes().length);
        System.arraycopy(password.getBytes(), 0, stuIn.szPassword, 0, password.getBytes().length);
        stuIn.emSpecCap = EM_LOGIN_SPAC_CAP_TYPE.EM_LOGIN_SPEC_CAP_TCP;
        NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY stuOut = new NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY();
        mLoginHandle = INetSDK.LoginWithHighLevelSecurity(stuIn, stuOut);
//        mLoginHandle = INetSDK.LoginEx2(address, Integer.parseInt(port), username, password, mLoginType, null, mDeviceInfo, err);

        /////////// TLS加密策略登录扩展接口 ///////////////////
//        pstLoginParam = new NET_LOGIN_PARAM();
//        System.arraycopy(address.getBytes(), 0, pstLoginParam.szDVRIP, 0, address.getBytes().length); // IP
//        pstLoginParam.wDVRPort = Integer.parseInt(port);  // 端口号
//        System.arraycopy(username.getBytes(), 0, pstLoginParam.szUserName, 0, username.getBytes().length); // 用户名
//        System.arraycopy(password.getBytes(), 0, pstLoginParam.szPassword, 0, password.getBytes().length); // 密码
//        pstLoginParam.emTlsPolicy = EM_TLS_ENCRYPTION_POLICY.EM_TLS_ENCRYPTION_COMPULSIVE;
//        pstLoginParam.emSpecCap = EM_LOGIN_SPAC_CAP_TYPE.EM_LOGIN_SPEC_CAP_TCP;
//        mLoginHandle = INetSDK.LoginEx3(pstLoginParam, mDeviceInfo, err);

        if (0 == mLoginHandle) {
            mErrorCode = INetSDK.GetLastError();
            ToolKits.writeErrorLog("Failed to Login Device " + address);
            return false;
        }
        mDeviceName = address;
        mDeviceInfo = stuOut.stuDeviceInfo;
        // 设置预览优化模式，建议使用
        int nPlayValue = 0x01|0x02;
        boolean bPlayRet = INetSDK.SetLocalMode(mLoginHandle, EM_LOCAL_MODE.EM_LOCAL_PLAY_FLAG_MODE, nPlayValue);
        if(bPlayRet == false)
        {
            ToolKits.writeLog("SetLocalMode-EM_LOCAL_PLAY_FLAG_MODE failed,nPlayValue:" + nPlayValue + "LastError:" + INetSDK.GetLastError());
        }
        //设置回放优化模式，建议使用
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
}
