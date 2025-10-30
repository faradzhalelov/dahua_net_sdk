package com.company.netsdk.module;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.company.NetSDK.CB_fRadiometryAttachCB;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.NET_IN_RADIOMETRY_ATTACH;
import com.company.NetSDK.NET_IN_RADIOMETRY_FETCH;
import com.company.NetSDK.NET_IN_RADIOMETRY_RANDOM_REGION_TEMPER;
import com.company.NetSDK.NET_OUT_RADIOMETRY_ATTACH;
import com.company.NetSDK.NET_OUT_RADIOMETRY_FETCH;
import com.company.NetSDK.NET_OUT_RADIOMETRY_RANDOM_REGION_TEMPER;
import com.company.NetSDK.NET_POINT;
import com.company.NetSDK.NET_RADIOMETRY_DATA;
import com.company.netsdk.R;
import com.company.netsdk.activity.NetSDKApplication;
import com.company.netsdk.common.TemperatureUnit;
import com.company.netsdk.common.ToolKits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadiometryModule {

    private static final String TAG = RadiometryModule.class.getSimpleName();
    NetSDKApplication sdkApp;
    Resources res;
    Long __loginHandle;
    long m_hAttachHandle = 0;

    public RadiometryModule(Context context) {
        sdkApp = (NetSDKApplication) ((AppCompatActivity) context).getApplication();
        __loginHandle = ((NetSDKApplication) ((AppCompatActivity) context).getApplication()).getLoginHandle();
        res = context.getResources();
    }

    private int getChannel() {
        if (sdkApp == null)
            return 0;
        return sdkApp.getDeviceInfo().nChanNum;
    }

    ///获取要显示的通道号
    public List getChannelList() {
        ArrayList<String> channelList = new ArrayList<String>();
        for (int i = 0; i < getChannel(); i++) {
            channelList.add(res.getString(R.string.channel) + (i));
        }
        Log.d(TAG, "getChannel: " + getChannel());
        return channelList;
    }

    public String getRandomRegionTemper(int channel, NET_POINT[] coordinates) {
        if (coordinates == null) {
            return "";
        }
        String rst = new String();
        // 入参
        NET_IN_RADIOMETRY_RANDOM_REGION_TEMPER stIn = new NET_IN_RADIOMETRY_RANDOM_REGION_TEMPER();
        stIn.nChannel = channel;
        stIn.nPointNum = 4;
        stIn.stuPolygon[0].nx = coordinates[0].nx;
        stIn.stuPolygon[0].ny = coordinates[0].ny;
        stIn.stuPolygon[1].nx = coordinates[1].nx;
        stIn.stuPolygon[1].ny = coordinates[1].ny;
        stIn.stuPolygon[2].nx = coordinates[2].nx;
        stIn.stuPolygon[2].ny = coordinates[2].ny;
        stIn.stuPolygon[3].nx = coordinates[3].nx;
        stIn.stuPolygon[3].ny = coordinates[3].ny;

        // 出参
        NET_OUT_RADIOMETRY_RANDOM_REGION_TEMPER stOut = new NET_OUT_RADIOMETRY_RANDOM_REGION_TEMPER();
        boolean bRet = INetSDK.RadiometryGetRandomRegionTemper(__loginHandle, stIn, stOut, 5000);
        if (bRet) {
            rst += res.getString(R.string.get_random_region_temper) + " " + res.getString(R.string.success) + "!" + "\n";
            rst += res.getString(R.string.unit) + ":" + res.getString(TemperatureUnit.getResIdByValue(stOut.stuRegionTempInfo.emTemperatureUnit)) + "\n";
            rst += res.getString(R.string.average_temperature) + ":" + ((float)stOut.stuRegionTempInfo.nTemperAver)/100 + "\n";
            rst += res.getString(R.string.max_temperature) + ":" + ((float)stOut.stuRegionTempInfo.nTemperMax)/100 + "\n";
            rst += res.getString(R.string.min_temperature) + ":" + ((float)stOut.stuRegionTempInfo.nTemperMin)/100 + "\n";
            rst += res.getString(R.string.max_temperature_coordinate) + ":" + stOut.stuRegionTempInfo.stuTemperMaxPoint.toCoordinate() + "\n";
            rst += res.getString(R.string.min_temperature_coordinate) + ":" + stOut.stuRegionTempInfo.stuTemperMinPoint.toCoordinate() + "\n";
        } else {
            rst += res.getString(R.string.get_random_region_temper) + " " + res.getString(R.string.failed) + "!" + "\n";
            rst += ToolKits.getLastError();
        }
        return rst;
    }



    public String radiometryAttach(int channel, CB_fRadiometryAttachCB callback) {

        String rst = new String();
        if (m_hAttachHandle != 0) {
            INetSDK.RadiometryDetach(m_hAttachHandle);
        }
        NET_IN_RADIOMETRY_ATTACH stIn = new NET_IN_RADIOMETRY_ATTACH();
        stIn.nChannel = channel;
        stIn.cbNotify = callback;

        // 出参
        NET_OUT_RADIOMETRY_ATTACH stOut = new NET_OUT_RADIOMETRY_ATTACH();
        m_hAttachHandle = INetSDK.RadiometryAttach(__loginHandle, stIn, stOut, 5000);
        if (m_hAttachHandle != 0) {
            rst += res.getString(R.string.radiometry_attach) + " " + res.getString(R.string.success) + "!" + "\n";
        } else {
            rst += res.getString(R.string.radiometry_attach) + " " + res.getString(R.string.failed) + "!" + "\n";
            rst += ToolKits.getLastError();
        }
        return rst;
    }

    public String radiometryDetach() {
        String rst = new String();
        if (INetSDK.RadiometryDetach(m_hAttachHandle)) {
            rst += res.getString(R.string.radiometry_detach) + " " + res.getString(R.string.success) + "!" + "\n";
        } else {
            rst += res.getString(R.string.radiometry_detach) + " " + res.getString(R.string.failed) + "!" + "\n";
            rst += ToolKits.getLastError();
        }
        return rst;
    }

    public String radiometryFetch(int channel) {
        String rst = new String();
        NET_IN_RADIOMETRY_FETCH stIn = new NET_IN_RADIOMETRY_FETCH();
        stIn.nChannel = channel;
        NET_OUT_RADIOMETRY_FETCH stOut = new NET_OUT_RADIOMETRY_FETCH();
        if (INetSDK.RadiometryFetch(__loginHandle, stIn, stOut, 3000)) {
            switch (stOut.nStatus){
                case 1://空闲
                    rst += res.getString(R.string.radiometry_fetch) + " " + res.getString(R.string.success) + "! " + res.getString(R.string.status) + "->" + res.getString(R.string.idle) + "\n";
                    break;
                case 2://获取中
                    rst += res.getString(R.string.radiometry_fetch) + " " + res.getString(R.string.success) + "! " + res.getString(R.string.status) + "->" + res.getString(R.string.acquiring) +  "\n";
                    break;
                default://其他
                    rst += res.getString(R.string.radiometry_fetch) + " " + res.getString(R.string.success) + "! " + res.getString(R.string.status) + "->" + res.getString(R.string.unknown) +  "\n";
                    break;
            }
        } else {
            rst += res.getString(R.string.radiometry_fetch) + " " + res.getString(R.string.failed) + "!" + "\n";
            rst += ToolKits.getLastError();
        }
        return rst;
    }

    public String radiometryDataParse(Context context, NET_RADIOMETRY_DATA tmpData) {
        String rst = new String();
        int arraylenth = tmpData.stMetaData.nHeight * tmpData.stMetaData.nWidth;
        short[] Gray = new short[arraylenth];
        float[] Pixel = new float[arraylenth];
        if (INetSDK.RadiometryDataParse(tmpData, Gray, Pixel)) {
            rst += res.getString(R.string.radiometry_data_parse) + " " + res.getString(R.string.success) + "!" + "\n";
            rst += res.getString(R.string.download_to_local_path) + " " +
                    ToolKits.savePicture(tmpData.pbDataBuf, tmpData.pbDataBuf.length, "Radiometry",context,"yuv") + "\n";
            Arrays.sort(Pixel);
            rst += res.getString(R.string.max_temperature) + ":" + Pixel[0] + "\n";
            rst += res.getString(R.string.min_temperature) + ":" + Pixel[arraylenth - 1] + "\n";
        } else {
            rst += res.getString(R.string.radiometry_data_parse) + " " + res.getString(R.string.failed) + "!" + "\n";
            rst += ToolKits.getLastError();
        }
        return rst;
    }


}
