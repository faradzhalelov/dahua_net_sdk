package com.company.netsdk.module;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

import com.company.NetSDK.CB_fAnalyzerDataCallBack;
import com.company.NetSDK.CtrlType;
import com.company.NetSDK.FinalVar;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.NET_IN_SNAP_MNG_SHOT;
import com.company.NetSDK.NET_OUT_SNAP_MNG_SHOT;
import com.company.netsdk.R;
import com.company.netsdk.activity.NetSDKApplication;
import com.company.netsdk.common.ToolKits;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 41299 on 2018/8/13.
 */
public class RealLoadPictureModule {
    private static final String TAG = RealLoadPictureModule.class.getSimpleName();
    NetSDKApplication sdkApp;
    Resources res;
    long m_hAttachHandle = 0;
    public RealLoadPictureModule(Context context){
        sdkApp = (NetSDKApplication)((AppCompatActivity)context).getApplication();
        res = context.getResources();
    }

    /// real load picture
    /// 智能订阅
    public boolean realLoadPicture(int channel, CB_fAnalyzerDataCallBack callback) {

        boolean bNeedPicture = true; // 是否需要图片

        m_hAttachHandle =  INetSDK.RealLoadPictureEx(sdkApp.getLoginHandle(), channel,
                FinalVar.EVENT_IVS_ALL, bNeedPicture, callback, null);

        if(m_hAttachHandle == 0) {
            ToolKits.writeErrorLog("智能订阅失败！");
        }else {
            Log.d(TAG,"通道[" + channel + "]订阅成功！");
        }

        return m_hAttachHandle != 0;
    }

    /// stop real load picture
    /// 停止智能订阅
    public void stopRealLoadPicture(){
        if (m_hAttachHandle == 0) {
            return;
        }
        INetSDK.StopLoadPic(m_hAttachHandle);
        m_hAttachHandle = 0;
    }

    public boolean isRealLoading() {
        return m_hAttachHandle != 0;
    }

    ///获取通道数量
    private int getChannel(){
        if (sdkApp == null)
            return 0;
        return sdkApp.getDeviceInfo().nChanNum;
    }
    ///获取要显示的通道号
    public List getChannelList(){
        ArrayList<String> channelList = new ArrayList<String>();
        for (int i=0;i< getChannel();i++){
            channelList.add(res.getString(R.string.channel)+(i));
        }
        Log.d(TAG,"getChannel: " + getChannel());
        return channelList;
    }

    ///Snap Control
    /// 抓图控制
    public boolean snapCtrl(int channel, int times) {
        boolean bRet = false;

        NET_IN_SNAP_MNG_SHOT stuIn  = new NET_IN_SNAP_MNG_SHOT();
        NET_OUT_SNAP_MNG_SHOT stuOut = new NET_OUT_SNAP_MNG_SHOT();

        stuIn.nChannel = channel;
        stuIn.nTime = times;    // 连拍次数, 0表示停止抓拍,正数表示连续抓拍的张数

        bRet = INetSDK.ControlDeviceEx(sdkApp.getLoginHandle(), CtrlType.SDK_CTRL_SNAP_MNG_SNAP_SHOT, stuIn, stuOut, 3000);
        if (!bRet) {
            ToolKits.writeLog("ControlDeviceEx Snap Failed!");
        }
        return bRet;
    }
}