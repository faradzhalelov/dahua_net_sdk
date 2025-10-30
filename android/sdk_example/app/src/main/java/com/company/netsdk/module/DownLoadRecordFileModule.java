package com.company.netsdk.module;

import android.content.Context;
import android.content.res.Resources;

import com.company.NetSDK.*;
import com.company.netsdk.R;
import com.company.netsdk.common.ToolKits;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 32940 on 2017/6/29.
 */
public class DownLoadRecordFileModule {
    public long lDownloadHandle = 0;
    Context mContext;
    Resources res;

    private int nErrorCode = 0;

    public DownLoadRecordFileModule(Context context) {
        this.mContext = context;
        res = mContext.getResources();
    }

    public boolean startDownLocadRecord(long loginHandle, int nChn, int stream, NET_TIME startTime, NET_TIME endTime, CB_fTimeDownLoadPosCallBack cb_fTimeDownLoadPosCallBack) {

        if(INetSDK.SetDeviceMode(loginHandle, EM_USEDEV_MODE.SDK_RECORD_STREAM_TYPE, stream)) {
            ToolKits.writeLog("Set Stream Succeed!" + stream);
        } else {
            ToolKits.writeErrorLog("Set Stream Failed!");
            return false;
        }

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(new Date());
        String recFileName = mContext.getExternalFilesDir(null).getAbsolutePath()+"/" + time.replace(":","_") + " download.dav";
        ToolKits.writeLog("开始下载, current time = " + new Date(System.currentTimeMillis()));
        lDownloadHandle = INetSDK.DownloadByTimeEx(loginHandle, nChn, EM_QUERY_RECORD_TYPE.EM_RECORD_TYPE_ALL,
                startTime, endTime, recFileName, cb_fTimeDownLoadPosCallBack, null, null);

        if(lDownloadHandle == 0) {
            ToolKits.writeErrorLog("DownLoad Failed.");
            nErrorCode = INetSDK.GetLastError();
        }
        return lDownloadHandle ==0 ? false : true;
    }

    /**
     *
     * @param loginHandle 登录句柄
     * @param nChn  通道号
     * @param stream 转码码流类型，参考{@link EM_REAL_DATA_TYPE}
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @param cb_fTimeDownLoadPosCallBack 下载位置回调
     * @return
     */
    public boolean startDownloadByDataType(long loginHandle, int nChn, int stream, NET_TIME startTime, NET_TIME endTime, CB_fTimeDownLoadPosCallBack cb_fTimeDownLoadPosCallBack){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(new Date());
        NET_IN_DOWNLOAD_BY_DATA_TYPE stuIn = new NET_IN_DOWNLOAD_BY_DATA_TYPE();
        stuIn.nChannelID = nChn;
        stuIn.emDataType = stream;
        stuIn.emRecordType = EM_QUERY_RECORD_TYPE.EM_RECORD_TYPE_ALL;
        stuIn.stStartTime = startTime;
        stuIn.stStopTime = endTime;
        stuIn.cbDownLoadPos =  cb_fTimeDownLoadPosCallBack;
        stuIn.fDownLoadDataCallBack = new CB_fDataCallBack() {
            @Override
            public int invoke(long lRealHandle, int dwDataType, byte buffer[], int dwBufferSize) {
                if (dwDataType == stream + FinalVar.NET_DATA_CALL_BACK_VALUE )
                {
                    FileOutputStream fileStream;
                    try {
                        fileStream = new FileOutputStream(mContext.getExternalFilesDir(null).getAbsolutePath()+"/" + time.replace(":","_") + " download.dav", true);
                        fileStream.write(buffer,0,dwBufferSize);
                        fileStream.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    ToolKits.writeLog("DownloadByDataType callback");
                    return 1;
                }
                return 0;
            }
        };
        String streamType[] = {"Private","GBPS","TS","MP4","H264&H265","FLV","PS"};
        if(stream == 5) {
            stuIn.szSavedFileName  = mContext.getExternalFilesDir(null).getAbsolutePath()+"/" + time.replace(":","_") + " download-" + streamType[stream] + ".flv";
        } else {
            stuIn.szSavedFileName  = mContext.getExternalFilesDir(null).getAbsolutePath()+"/" + time.replace(":","_") + " download-" + streamType[stream] + ".mp4";
        }

        ToolKits.writeLog("szSavedFileName:"+stuIn.szSavedFileName.trim());
        NET_OUT_DOWNLOAD_BY_DATA_TYPE stuOut = new NET_OUT_DOWNLOAD_BY_DATA_TYPE();

        long FileRet = INetSDK.DownloadByDataType(loginHandle, stuIn, stuOut, 5000);

        if(FileRet != 0)
        {
            ToolKits.writeLog("Call DownloadByDataType success");
            return true;
        }
        else
        {
            ToolKits.writeErrorLog("DownLoadByDataType Failed.");
            nErrorCode = INetSDK.GetLastError();
        }
        return false;
    }

    public boolean stopDownLoadRecord() {
        if(lDownloadHandle == 0) {
            return false;
        }
        nErrorCode = 0;
        boolean bRet = INetSDK.StopDownload(lDownloadHandle);
        if(bRet){
            lDownloadHandle = 0;
        }

        return bRet;
    }

    ///要显示的码流类型
    public List getStreamTypeList(){
        ArrayList<String> list = new ArrayList<String>();
        String[] streamNames = res.getStringArray(R.array.stream_array);
        for (int i = 0; i < 3; i++){
            list.add(streamNames[i]);
        }
        return list;
    }

    /// is no record
    /// 是否无记录
    public boolean isNoRecord(){
        return nErrorCode == FinalVar.NET_NO_RECORD_FOUND;
    }

}
