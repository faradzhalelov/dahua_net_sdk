package com.company.netsdk.module;

import android.content.Context;
import android.net.wifi.ScanResult;

import com.company.NetSDK.CB_fSearchDevicesCB;
import com.company.NetSDK.INetSDK;
import com.company.SmartConfig.ISmartConfig;
import com.company.netsdk.common.ToolKits;

/**
 * Created by 29779 on 2017/4/8.
 */
public class WIFIConfigurationModule {
    Context mContext;

    public WIFIConfigurationModule(Context context) {
        this.mContext = context;
    }

    ///Wifi config
    ///Wifi配置
    public void startSearchIPCWifi(String sn, String ssid, String pwd){
        if ((sn == null||ssid == null||pwd == null)
                ||(sn.equals("")||ssid.equals(""))){
            ToolKits.writeLog("parameters is invalied");
            return;
        }
        ISmartConfig.StartSearchIPCWifi(sn, ssid, pwd);
    }

    /// 停止Wifi配置
    public void stopSearchIPCWifi() {
        ISmartConfig.StopSearchIPCWifi();
    }

}
