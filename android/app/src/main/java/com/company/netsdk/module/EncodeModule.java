package com.company.netsdk.module;

import android.content.Context;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

import com.company.NetSDK.*;
import com.company.NetSDK.CFG_DSPENCODECAP_INFO;
import com.company.NetSDK.CFG_ENCODE_INFO;
import com.company.NetSDK.CFG_VIDEOENC_OPT;
import com.company.NetSDK.CFG_VIDEO_COMPRESSION;
import com.company.NetSDK.FinalVar;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.NET_EM_CFG_OPERATE_TYPE;
import com.company.NetSDK.NET_IN_ENCODE_CFG_CAPS;
import com.company.NetSDK.NET_IN_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO;
import com.company.NetSDK.NET_OUT_ENCODE_CFG_CAPS;
import com.company.NetSDK.NET_OUT_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO;
import com.company.NetSDK.NET_STREAM_CFG_CAPS;
import com.company.NetSDK.SDKDEV_DSP_ENCODECAP;
import com.company.NetSDK.SDKDEV_DSP_ENCODECAP_EX;
import com.company.NetSDK.SDKDEV_SYSTEM_ATTR_CFG;
import com.company.NetSDK.SDK_RESOLUTION_INFO;
import com.company.NetSDK.SDK_RealPlayType;
import com.company.netsdk.R;
import com.company.netsdk.activity.NetSDKApplication;
import com.company.netsdk.common.DialogProgress;
import com.company.netsdk.common.NetSDKLib;
import com.company.netsdk.common.ToolKits;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;

/**
 * Created by 29875 on 2018/12/19.
 */
public class EncodeModule {
    private static final String TAG = LivePreviewModule.class.getSimpleName();
    Context mContext;
    Resources res;
    NetSDKApplication sdkApp;

    public EncodeModule(Context context) {
        this.mContext = context;
        res = mContext.getResources();
        sdkApp = ((NetSDKApplication)((AppCompatActivity)mContext).getApplication());
        initLinkedList();
    }

    CFG_ENCODE_INFO mEncInfo = new CFG_ENCODE_INFO();
    NET_OUT_ENCODE_CFG_CAPS mEncodeCfgCaps = new NET_OUT_ENCODE_CFG_CAPS();
    boolean bF6 = false;
    boolean bVideo = false;
    boolean bAudio = false;
    private final short[][][] s_resolution = new short[][][]{
            // pal
            {{704,	576},
                    {352,	576},
                    {704,	288},
                    {352,	288},
                    {176,	144},
                    {640,	480},
                    {320,	240},
                    {480,	480},
                    {160,	128},
                    {800,	592},
                    {1024,	768},
                    {1280,	800},
                    {1280,	1024},
                    {1600,	1024},
                    {1600,	1200},
                    {1900,	1200},
                    {240,	192},
                    {1280,	720},
                    {1920,	1080},
                    {1280,	960},
                    {1872,	1408},
                    {3744,	1408},
                    {2048,	1536},
                    {2432,	2050},
                    {1216,	1024},
                    {1408,	1024},
                    {3296,	2472},
                    {2560,	1920},
                    {960,	576},
                    {60,   720},
                    {640,   360},
                    {320,   180},
                    {160,   90}},

            // ntsc
            {{704,	480},
                    {352,	480},
                    {704,	240},
                    {352,	240},
                    {176,	120},
                    {640,	480},
                    {320,	240},
                    {480,	480},
                    {160,	128},
                    {800,	592},
                    {1024,	768},
                    {1280,	800},
                    {1280,	1024},
                    {1600,	1024},
                    {1600,	1200},
                    {1900,	1200},
                    {240,	192},
                    {1280,	720},
                    {1920,	1080},
                    {1280,	960},
                    {1872,	1408},
                    {3744,	1408},
                    {2048,	1536},
                    {2432,	2050},
                    {1216,	1024},
                    {1408,	1024},
                    {296,	2472},
                    {2560,	1920},
                    {960,	480},
                    {60,   720},
                    {640,   360},
                    {320,   180},
                    {160,   90}}
    };

    /*private final String[] audioEncode  = new String[]{ "Default", "PCM", "G711a", "AMR", "G711u",
            "G726", "G723_53", "G723_63", "AAC", "OGG",
            "G729", "MPEG2", "MPEG2-Layer2", "G.722.1",
            "ADPCM", "MP3"
    };*/

    private final Vector<String>  cfgAudioFormat = new Vector<>(Arrays.asList(new  String[]{"G711a", "PCM", "G711u", "AMR", "AAC", "G726", "MPEG2_Layer2", "G729", "G.722.1"}));
    ;
    private Map<Integer, ArrayList<String>> audioEncodeMap = new HashMap<>();

    private int mVideoStandard;  //0:PAL  ,1:NTSC
    int mModeMask = 0;
    int mResolveMask = 0;
    int nAudioEncodeModeSelected = 0;
    int nAudioRateSelected = 0;
    LinkedList<String> strMode = new LinkedList<>() ;
    LinkedList<String> strModeProfile = new LinkedList<>();
    LinkedList<String> strBitrate = new LinkedList<>();
    final ArrayList<String> mode_data_list = new ArrayList<>();
    final ArrayList<String> resolve_data_list = new ArrayList<>();
    final ArrayList<String> fps_data_list = new ArrayList<>();
    final ArrayList<String> bitrate_data_list = new ArrayList<>();
    final ArrayList<String> audio_encode_mode_list = new ArrayList<>();
    ArrayList<String> audio_rate_list = new ArrayList<>();

    int mCustomer = 0;

    private void initLinkedList(){
        String[] mode = res.getStringArray(R.array.encode_mode);
        int modeCount = mode.length;
        String[] profile = res.getStringArray(R.array.encode_mode_profile);
        int profileCount = profile.length;
        String[] bitrate = res.getStringArray(R.array.encode_bit_rate_item);
        int bitCount = bitrate.length;

        int max = modeCount;
        if (max<profileCount) {
            max = profileCount;
        }
        else if (max<bitCount) {
            max = bitCount;
        }

        for (int i = 0; i < max; i++){
            if (i<modeCount)
                strMode.add(mode[i]);
            if (i<profileCount)
                strModeProfile.add(profile[i]);
            if (i<bitCount)
                strBitrate.add(bitrate[i]);
        }
    }

    ///获取编码配置信息
    private boolean initEncodeData(final int channel, boolean isMainStream){

        bVideo = bAudio = false;

        //获取P/N 首先是要老接口，如果失败，再是要新接口
        // 老接口不支持超过32个通道的获取，但是老设备肯能支持不同制式设备互连，新接口对应新设备，不支持不同制式设备互连
        SDKDEV_SYSTEM_ATTR_CFG[] sysAttrs = new SDKDEV_SYSTEM_ATTR_CFG[1];
        sysAttrs[0] = new SDKDEV_SYSTEM_ATTR_CFG();
		if (INetSDK.GetDevConfig(sdkApp.getLoginHandle(), FinalVar.SDK_DEV_DEVICECFG, channel, sysAttrs, null, NetSDKLib.TIMEOUT_5S)){
            mVideoStandard = sysAttrs[0].byVideoStandard;
        }else {
            NET_CFG_VIDEOSTANDARD_INFO stuVideoStandard = new NET_CFG_VIDEOSTANDARD_INFO();
            if (INetSDK.GetConfig(sdkApp.getLoginHandle(), NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_VIDEOSTANDARD, -1, stuVideoStandard, NetSDKLib.TIMEOUT_5S, null)){
                //private int mVideoStandard;  //0:PAL  ,1:NTSC
                mVideoStandard = stuVideoStandard.emVideoStandard - 1;
            }else {
                ToolKits.writeErrorLog("GetConfig for NET_EM_CFG_VIDEOSTANDARD failed ");
                return false;
            }
        }

        // Get encode
        if (!ToolKits.GetDevConfig(FinalVar.CFG_CMD_ENCODE, mEncInfo, sdkApp.getLoginHandle(), channel, ENCODE_BUFFER_SIZE)){
            ToolKits.writeErrorLog("GetDevConfig for CFG_CMD_ENCODE failed in initEncodeData..");
            return false;
        }

        // Get Video Encode
        bVideo = getVideoEncodeCaps(channel, isMainStream);

        // Get Audio Encode
        bAudio = getAudioEncodeCaps(channel, isMainStream);

        return true;
    }

    public boolean getVideoEncodeCaps(int channel, boolean isMainStream){
        if (isSupportF6(channel, mEncInfo, mEncodeCfgCaps, getStream(isMainStream))) {
            mModeMask = isMainStream ? mEncodeCfgCaps.stuMainFormatCaps[0].dwEncodeModeMask
                    : mEncodeCfgCaps.stuExtraFormatCaps[0].dwEncodeModeMask;
            Log.d(TAG, "Support F6 Configuration. mModeMask " + mModeMask);
            return true;
        }

        SDKDEV_DSP_ENCODECAP stEncodeCapOld = new SDKDEV_DSP_ENCODECAP();
        CFG_DSPENCODECAP_INFO stEncodeCapNew = new CFG_DSPENCODECAP_INFO();
        if ((ToolKits.GetDevConfig(FinalVar.CFG_CMD_HDVR_DSP, stEncodeCapNew, sdkApp.getLoginHandle(), channel,ENCODE_BUFFER_SIZE))
                &&(0!=stEncodeCapNew.dwEncodeModeMask)
                &&(0!=stEncodeCapNew.dwImageSizeMask)){
            mModeMask = stEncodeCapNew.dwEncodeModeMask;
            mResolveMask = stEncodeCapNew.dwImageSizeMask;
            return true;
        }

        if ((INetSDK.QueryDevState(sdkApp.getLoginHandle(),FinalVar.SDK_DEVSTATE_DSP,stEncodeCapOld,NetSDKLib.TIMEOUT_10S))
                &&(0!=stEncodeCapOld.dwEncodeModeMask)
                &&(0!=stEncodeCapOld.dwImageSizeMask)){
            mModeMask = stEncodeCapOld.dwEncodeModeMask;
            mResolveMask = stEncodeCapOld.dwImageSizeMask;
            return true;
        }

        return false;
    }

    public boolean getAudioEncodeCaps(int channel, boolean mainStream){
        audioEncodeMap.clear();
        NET_IN_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO getIn = new NET_IN_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO();
        getIn.nChannel = channel;
        getIn.nStreamType = mainStream? 0:1;
        NET_OUT_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO getOut = new NET_OUT_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO();
        if (!INetSDK.QueryDevInfo(sdkApp.getLoginHandle(),
                FinalVar.NET_QUERY_GET_REMOTE_CHANNEL_AUDIO_ENCODE, getIn, getOut, null, NetSDKLib.TIMEOUT_5S)) {
			ToolKits.writeErrorLog("QueryDevInfo, NET_QUERY_GET_REMOTE_CHANNEL_AUDIO_ENCODE failed");
            return false;
        }

        for (int i = 0; i < getOut.nValidNum; ++i) {
            int encodeType = getOut.stuListAudioEncode[i].encodeType;
            int sampleRate = getOut.stuListAudioEncode[i].dwSampleRate;
            int cfgEncode = getAudioEncodeRelation(encodeType);
            if (cfgEncode == -1) {
                continue;
            }

            ArrayList<String> lstSampleRate = audioEncodeMap.get(cfgEncode);
            if (lstSampleRate != null) {
                lstSampleRate.add(String.valueOf(sampleRate));
            } else {
                ArrayList<String> lstValue = new ArrayList<String>();
                lstValue.add(String.valueOf(sampleRate));
                audioEncodeMap.put(cfgEncode, lstValue);
            }
        }
        return true;
    }

    private int getAudioEncodeRelation(int encodeType) {
        int cfgEncode;
        switch (encodeType){
            case SDK_TALK_CODING_TYPE.SDK_TALK_G711a:
                cfgEncode = CFG_AUDIO_FORMAT.AUDIO_FORMAT_G711A;
                break;
            case SDK_TALK_CODING_TYPE.SDK_TALK_PCM:
                cfgEncode = CFG_AUDIO_FORMAT.AUDIO_FORMAT_PCM;
                break;
            case SDK_TALK_CODING_TYPE.SDK_TALK_G711u:
                cfgEncode = CFG_AUDIO_FORMAT.AUDIO_FORMAT_G711U;
                break;
            case SDK_TALK_CODING_TYPE.SDK_TALK_AMR:
                cfgEncode = CFG_AUDIO_FORMAT.AUDIO_FORMAT_AMR;
                break;
            case SDK_TALK_CODING_TYPE.SDK_TALK_AAC:
                cfgEncode = CFG_AUDIO_FORMAT.AUDIO_FORMAT_AAC;
                break;
            case SDK_TALK_CODING_TYPE.SDK_TALK_G726:
                cfgEncode = CFG_AUDIO_FORMAT.AUDIO_FORMAT_G726;
                break;
            case SDK_TALK_CODING_TYPE.SDK_TALK_MPEG2_Layer2:
                cfgEncode = CFG_AUDIO_FORMAT.AUDIO_FORMAT_MPEG2_LAYER2;
                break;
            case SDK_TALK_CODING_TYPE.SDK_TALK_G729:
                cfgEncode = CFG_AUDIO_FORMAT.AUDIO_FORMAT_G729;
                break;
            case SDK_TALK_CODING_TYPE.SDK_TALK_G722_1:
                cfgEncode = CFG_AUDIO_FORMAT.AUDIO_FORMAT_G7221;
                break;
            default:
                //cfgEncode = CFG_AUDIO_FORMAT.AUDIO_FORMAT_G711A;
                cfgEncode = -1;
        }

        return  cfgEncode;
    }

    private int getAudioEncodeRelation(String encodeType) {
        int cfgEncode = -1;

        for (int i = 0; i < cfgAudioFormat.size(); ++i) {
            if (cfgAudioFormat.get(i).equals(encodeType)) {
                cfgEncode = i;
                break;
            }
        }
        return  cfgEncode;
    }

    public boolean buildAudioEncode(boolean mainStream) {

        nAudioEncodeModeSelected = -1;
        nAudioRateSelected = -1;
        audio_encode_mode_list.clear();
        audio_rate_list.clear();

        if (audioEncodeMap.isEmpty()) {
            return false;
        }

        CFG_VIDEOENC_OPT  stuStream;
        if (mainStream) {
            stuStream = mEncInfo.stuMainStream[0];
        }else {
            stuStream = mEncInfo.stuExtraStream[0];
        }

        int encodePos = 0;
        for ( Integer key :audioEncodeMap.keySet()) {
            audio_encode_mode_list.add(cfgAudioFormat.get(key));
            if (key == stuStream.stuAudioFormat.emCompression) {
                nAudioEncodeModeSelected = encodePos;
            }
            ++encodePos;
        }

        ArrayList<String> lstAudioRate = audioEncodeMap.get(stuStream.stuAudioFormat.emCompression);
        if (lstAudioRate != null) {
            ToolKits.writeLog("Get it!");
            audio_rate_list.addAll(lstAudioRate); // Rate
            for (int i = 0; i < lstAudioRate.size(); ++i) {
                if (Integer.valueOf(lstAudioRate.get(i)) == stuStream.stuAudioFormat.nFrequency) {
                    nAudioRateSelected = i;
                }
            }
        }

        if (nAudioEncodeModeSelected == -1 || nAudioRateSelected == -1) {
            return false;
        }

        return true;
    }

    public void getEncodeData(int channel, boolean mainStream){
        final EncodeTask task = new EncodeTask();
        task.execute(new Integer(channel), new Boolean(mainStream));
    }

    ///
    public int getTypeMask(int channel){
        int streamMask = 0;
        SDKDEV_DSP_ENCODECAP_EX stEncodeCapOld = new SDKDEV_DSP_ENCODECAP_EX();
        CFG_DSPENCODECAP_INFO stEncodeCapNew = new CFG_DSPENCODECAP_INFO();
        if (INetSDK.QueryDevState(sdkApp.getLoginHandle(), FinalVar.SDK_DEVSTATE_DSP_EX, stEncodeCapOld, NetSDKLib.TIMEOUT_10S)) {
            streamMask = stEncodeCapOld.dwStreamCap;
        } else if (ToolKits.GetDevConfig(FinalVar.CFG_CMD_HDVR_DSP, stEncodeCapNew, sdkApp.getLoginHandle(), channel, ENCODE_BUFFER_SIZE*7)) {
            streamMask = stEncodeCapNew.dwStreamCap;
        }
        return streamMask;
    }

    // Get encode cfg caps
    private boolean isSupportF6(final int channel,final CFG_ENCODE_INFO encode_info,final NET_OUT_ENCODE_CFG_CAPS encode_cfg_caps,int streamTpye){
        bF6 = true;
        char[] cJson = new char[ENCODE_BUFFER_SIZE];
        if (!INetSDK.PacketData(FinalVar.CFG_CMD_ENCODE, encode_info, cJson, ENCODE_BUFFER_SIZE)) {
            bF6 = false;
            return false;
        }

        NET_IN_ENCODE_CFG_CAPS in = new NET_IN_ENCODE_CFG_CAPS();
        in.nChannelId = channel;
        in.nStreamType = streamTpye;
        in.pchEncodeJson = getBytes(cJson);

        if (!INetSDK.GetDevCaps(sdkApp.getLoginHandle(),FinalVar.NET_ENCODE_CFG_CAPS, in, encode_cfg_caps, NetSDKLib.TIMEOUT_10S)){
            bF6 = false;
            return false;
        }
        return true;
    }

    private int buildModeData(Boolean mainstream){
        mode_data_list.clear();
        NET_STREAM_CFG_CAPS[] streamCFG;
        streamCFG = mainstream ? mEncodeCfgCaps.stuMainFormatCaps : mEncodeCfgCaps.stuExtraFormatCaps;
        for (int i = 0; i < strMode.size(); i++){
            if ((mModeMask & (1<<i)) != 0 ){
                if (strMode.get(i).equals("H.264")) {
                    for (int j = 0; j < streamCFG[0].nH264ProfileRankNum; j++) {
                        Log.d(TAG,"H.264 mode:" + strModeProfile.get(streamCFG[0].bH264ProfileRank[j]-1));
                        mode_data_list.add(strModeProfile.get(streamCFG[0].bH264ProfileRank[j] - 1));
                    }
                } else {
                    Log.d(TAG, "mode: "+strMode.get(i));
                    mode_data_list.add(strMode.get(i));
                }
            }
        }

        int selectedPos = 0;
        CFG_VIDEOENC_OPT videoencOpt[] = mainstream ? mEncInfo.stuMainStream : mEncInfo.stuExtraStream;

        for (int i = 0; i < mode_data_list.size(); i++) {
            if (mode_data_list.get(i).equals(strMode.get(videoencOpt[0].stuVideoFormat.emCompression))) {
                selectedPos = i;
                break;
            }
            if (CFG_VIDEO_COMPRESSION.VIDEO_FORMAT_H264 == videoencOpt[0].stuVideoFormat.emCompression) {
                if (videoencOpt[0].stuVideoFormat.abProfile
                        && mode_data_list.get(i).equals(strModeProfile.get(videoencOpt[0].stuVideoFormat.emProfile - 1))) {
                    selectedPos = i;
                    break;
                }
            }
        }
        return selectedPos;
    }
    private SpinnerDataCallback mCallback = null;
    public void setSpinnerDataCallBack(SpinnerDataCallback callBack){
        this.mCallback = callBack;
    }
    private SpinnerDataCallback getCallback(){
        return this.mCallback;
    }

    private SpinnerDataUpdateCallback mUpdateCallback = null;
    public void SetSpinnerDataUpdateCallback(SpinnerDataUpdateCallback callBack){
        this.mUpdateCallback =callBack;
    }
    private SpinnerDataUpdateCallback getUpdateCallback(){
        return this.mUpdateCallback;
    }


    private int buildResolveData(boolean ismainStream){
        resolve_data_list.clear();
        CFG_VIDEOENC_OPT[]  streamTpye;
        NET_STREAM_CFG_CAPS[] streamCFG;
        if (ismainStream) {
            streamTpye = mEncInfo.stuMainStream;
            streamCFG = mEncodeCfgCaps.stuMainFormatCaps;
        }else {
            streamTpye = mEncInfo.stuExtraStream;
            streamCFG = mEncodeCfgCaps.stuExtraFormatCaps;
        }
        if(bF6){
            int modeInd  = streamTpye[0].stuVideoFormat.emCompression;
            if (modeInd<=CFG_VIDEO_COMPRESSION.VIDEO_FORMAT_SVAC){
                if (streamCFG[0].abIndivResolution){
                    for (int i=0;i<streamCFG[0].nIndivResolutionNums[modeInd];i++){
                        resolve_data_list.add(streamCFG[0].stuIndivResolutionTypes[modeInd][i].snWidth
                                +"*"+streamCFG[0].stuIndivResolutionTypes[modeInd][i].snHight);
                    }
                }else {
                    for (int i=0;i<streamCFG[0].nResolutionTypeNum;i++){
                        resolve_data_list.add(streamCFG[0].stuResolutionTypes[i].snWidth
                                +"*"+streamCFG[0].stuResolutionTypes[i].snHight);
                    }
                }
            }
        }else{
            String[] strResolution = res.getStringArray(R.array.encode_resolution_item);
            for (int i=0;i<strResolution.length && i<32;i++){
                if ((mResolveMask & (1<<i))!=0){
                    resolve_data_list.add(strResolution[i]+"("+
                            s_resolution[mVideoStandard][i][0]+
                            "*"+s_resolution[mVideoStandard][i][1]+")");
                }
            }
        }
        SDK_RESOLUTION_INFO infor = new SDK_RESOLUTION_INFO();
        infor.snWidth = (short)streamTpye[0].stuVideoFormat.nWidth;
        infor.snHight = (short)streamTpye[0].stuVideoFormat.nHeight;
        resolvePos= resolutionToIndex(infor,resolve_data_list);
        return resolvePos;
    }


    int resolvePos;
    private int resolutionToIndex(SDK_RESOLUTION_INFO info,ArrayList<String> list){
        for (int i=0;i<list.size();i++){
            String[] value = null;
            String temp = list.get(i);
            Log.i(TAG, "temp:"+temp);
            if (bF6){
                value = temp.split("\\*");
            }else {
                String[] a =temp.split("\\(");
                if (a.length>1) {
                    String[] b = a[1].split("\\)");
                    if (b.length>0) {
                        value = b[0].split("\\*");
                    }
                }
                //    value = temp.split("\\(")[1].split("\\)")[0].split("\\*");
            }
            if (value !=null && value.length > 1) {
                if (((int) info.snWidth == Integer.parseInt(value[0]))
                        && ((int) info.snHight == Integer.parseInt(value[1]))) {
                    return i;
                }
            }
        }
        return -1;
    }

    private SDK_RESOLUTION_INFO indexToResolution(String text){
        String[] value;
        if (bF6){
            value = text.split("\\*");
        }else {
            value = text.split("\\(")[1].split("\\)")[0].split("\\*");
        }
        SDK_RESOLUTION_INFO infor = new SDK_RESOLUTION_INFO();
        infor.snWidth = (short)Integer.parseInt(value[0]);
        infor.snHight = (short)Integer.parseInt(value[1]);
        return infor;
    }

    private int getCustomizedDate()
    {
        return mCustomer;
    }
    private int buildFpsData(boolean isMainStream){
        fps_data_list.clear();
        int maxFps = 0;
        CFG_VIDEOENC_OPT[]  streamTpye;
        NET_STREAM_CFG_CAPS[] streamCFG;
        if (isMainStream) {
            streamTpye = mEncInfo.stuMainStream;
            streamCFG = mEncodeCfgCaps.stuMainFormatCaps;
        }else {
            streamTpye = mEncInfo.stuExtraStream;
            streamCFG = mEncodeCfgCaps.stuExtraFormatCaps;
        }
        if (streamCFG[0].nFPSMax!=0){
            maxFps = streamCFG[0].nFPSMax;
        }else {
            SDK_RESOLUTION_INFO infor = new SDK_RESOLUTION_INFO();
            infor.snWidth = (short)streamTpye[0].stuVideoFormat.nWidth;
            infor.snHight = (short)streamTpye[0].stuVideoFormat.nHeight;
            int index = resolutionToIndex(infor,resolve_data_list);
            if (index != -1) {
                maxFps = streamCFG[0].nResolutionFPSMax[index];
            }
        }

        if (0==maxFps){
            for (int i=0;i<25;i++){
                fps_data_list.add(""+(i+1));
            }
        }else {
            for (int i=0;i<maxFps;i++){
                fps_data_list.add(""+(i+1));
            }
        }
        int selectedPos = 0;
        if ((int)streamTpye[0].stuVideoFormat.nFrameRate<=fps_data_list.size()){
            selectedPos = ((int)streamTpye[0].stuVideoFormat.nFrameRate)-1;
        }else {
            if (0!=fps_data_list.size()){
                selectedPos = fps_data_list.size()-1;
                streamTpye[0].stuVideoFormat.nFrameRate = fps_data_list.size();
            }
        }
        fpsSize = fps_data_list.size();
        return selectedPos;
    }
    int fpsSize;

    private int buildBitRateData(boolean isMainStream){
        Integer min = new Integer(0);
        Integer max = new Integer(0);
        CFG_VIDEOENC_OPT[]  streamTpye;
        NET_STREAM_CFG_CAPS[] streamCFG;
        if (isMainStream) {
            streamTpye = mEncInfo.stuMainStream;
            streamCFG = mEncodeCfgCaps.stuMainFormatCaps;
        }else {
            streamTpye = mEncInfo.stuExtraStream;
            streamCFG = mEncodeCfgCaps.stuExtraFormatCaps;
        }
        bitrate_data_list.clear();
        if ((0 == streamCFG[0].nMinBitRateOptions)
                && (0==streamCFG[0].nMaxBitRateOptions)){
            int fps;
            if ((int)streamTpye[0].stuVideoFormat.nFrameRate<=fpsSize){
                fps = (int)streamTpye[0].stuVideoFormat.nFrameRate;
            }else {
                fps = fpsSize;
            }

            int[] nTmp = new int[]{0,0};
            getBitRateScope(fps,2*fps,streamTpye[0].stuVideoFormat.nWidth,
                    streamTpye[0].stuVideoFormat.nHeight,
                    streamTpye[0].stuVideoFormat.emCompression,nTmp);
            min = nTmp[0];
            max = nTmp[1];
        }else {
            min = streamCFG[0].nMinBitRateOptions;
            max = streamCFG[0].nMaxBitRateOptions;
        }

        for (int i=0;i<strBitrate.size();i++){
            if((Integer.parseInt(strBitrate.get(i))>=min.intValue())
                    && (Integer.parseInt(strBitrate.get(i))<=max.intValue())){
                bitrate_data_list.add(strBitrate.get(i));
            }
        }
        for (int i=0;i<bitrate_data_list.size();i++){
            if (bitrate_data_list.get(i).equals(String.valueOf(streamTpye[0].stuVideoFormat.nBitRate))){
                return i;
            }
        }

        //Save Customized data
        mCustomer = streamTpye[0].stuVideoFormat.nBitRate;
        return  -1;
    }

    private void getBitRateScope(int fps,int iframes,int width,int height,int encode,int[] nTmp){
        int gop = (iframes>149)?50:iframes;
        double scalar = width*height/(352.0*288)/gop;
        double minRaw = 0;
        if (encode == 5){
            minRaw = (gop+IFRAME_PFRAME_QUOTIENT-1)*fps*7*3*scalar;
        }else {
            minRaw = (gop+IFRAME_PFRAME_QUOTIENT-1)*fps*MIN_CIF_PFRAME_SIZE*scalar;
        }
        nTmp[0] = roundToFactor((int)minRaw,(1<<(int)log2(minRaw))/4);
        double maxRaw = (gop+IFRAME_PFRAME_QUOTIENT-1)*fps*MAX_CIF_PFRAME_SIZE*scalar;
        nTmp[1] = roundToFactor((int)maxRaw,(1<<(int)log2(maxRaw))/4);
    }
    private int roundToFactor(int n,int f){
        if (f==0)
            return n;
        return f*round(n/(float)f);
    }
    private double log2(double val){
        return Math.log(val)/Math.log((double)2);
    }
    private int round(float val){
        return (int)(val+0.5);
    }
    final int MIN_CIF_PFRAME_SIZE = 7;
    final int MAX_CIF_PFRAME_SIZE = 40;
    final int IFRAME_PFRAME_QUOTIENT = 3;
    final int ENCODE_BUFFER_SIZE = 1024*10;

    public void updateMode(int channel,final String mode, boolean isMainStream){
        Log.d(TAG,"in Param mode:"+mode);
        CFG_VIDEOENC_OPT[]  streamTpye;
        if (isMainStream) {
            streamTpye = mEncInfo.stuMainStream;
        }else {
            streamTpye = mEncInfo.stuExtraStream;
        }
        if (strMode.contains(mode)){
            Log.d(TAG,"mode:"+mode);
            streamTpye[0].stuVideoFormat.emCompression = strMode.indexOf(mode);
            Log.d(TAG,"emCompression:"+strMode.indexOf(mode));

        }
        if (strModeProfile.contains(mode)){
            Log.d(TAG," profile  mode:"+mode);
            streamTpye[0].stuVideoFormat.emCompression = CFG_VIDEO_COMPRESSION.VIDEO_FORMAT_H264;
            streamTpye[0].stuVideoFormat.abProfile = true;
            streamTpye[0].stuVideoFormat.emProfile = strModeProfile.indexOf(mode)+1;
            Log.d(TAG,"emProfile:"+strModeProfile.indexOf(mode)+1);
        }

        final EncodeRelationTask task = new EncodeRelationTask();
        task.execute(new Integer(channel), new Boolean(isMainStream));
    }

    public void updateResolve(int channel, String value, boolean isMainStream){
        CFG_VIDEOENC_OPT[]  streamTpye;
        if (isMainStream) {
            streamTpye = mEncInfo.stuMainStream;
        }else {
            streamTpye = mEncInfo.stuExtraStream;
        }
        SDK_RESOLUTION_INFO stuResolutionInfo = indexToResolution(value);
        streamTpye[0].stuVideoFormat.nWidth = stuResolutionInfo.snWidth;
        streamTpye[0].stuVideoFormat.nHeight = stuResolutionInfo.snHight;

        final EncodeRelationTask task = new EncodeRelationTask();
        task.execute(new Integer(channel), new Boolean(isMainStream));
    }

    public void updateFps(int channel,int pos, boolean isMainStream){
        CFG_VIDEOENC_OPT[]  streamTpye;
        if (isMainStream) {
            streamTpye = mEncInfo.stuMainStream;
        }else {
            streamTpye = mEncInfo.stuExtraStream;
        }

        // 帧率是从1开始的， pos是帧率数组下标，需要 +1
        streamTpye[0].stuVideoFormat.nFrameRate = pos+1;

        final EncodeRelationTask task = new EncodeRelationTask();
        task.execute(new Integer(channel), new Boolean(isMainStream));
    }
    public void updateBitRate(String bit , boolean isMainStream){
        CFG_VIDEOENC_OPT[]  streamTpye;
        if (isMainStream) {
            streamTpye = mEncInfo.stuMainStream;
        }else {
            streamTpye = mEncInfo.stuExtraStream;
        }
        streamTpye[0].stuVideoFormat.nBitRate = Integer.parseInt(bit);
    }

    public void updateAudioEncodeMode(int pos, boolean isMainStream){ // change audio rate at same time
        CFG_VIDEOENC_OPT  stuStream;
        if (isMainStream) {
            stuStream = mEncInfo.stuMainStream[0];
        }else {
            stuStream = mEncInfo.stuExtraStream[0];
        }

        String encodeMode = audio_encode_mode_list.get(pos);
        int nNewMode = getAudioEncodeRelation(encodeMode);
        if (nNewMode == -1) {
            return;
        }

        ToolKits.writeLog("nNewMode " + nNewMode);
        if (stuStream.stuAudioFormat.emCompression != nNewMode) {
            stuStream.stuAudioFormat.emCompression = nNewMode;
            audio_rate_list.clear();
            audio_rate_list.addAll(audioEncodeMap.get(nNewMode));
            int nOldRate = stuStream.stuAudioFormat.nFrequency;

            nAudioEncodeModeSelected = pos;
            nAudioRateSelected = -1;
            for (int i = 0; i < audio_rate_list.size(); ++i) {
                if (Integer.valueOf(audio_rate_list.get(i)) == nOldRate) {
                    nAudioRateSelected = i;
                    break;
                }
            }

            if (nAudioRateSelected == -1) {
                nAudioRateSelected = 0;
                stuStream.stuAudioFormat.nFrequency = Integer.valueOf(audio_rate_list.get(0));
            }
        }
    }

    public void updateAudioRate(int pos, boolean isMainStream){
        CFG_VIDEOENC_OPT  stuStream;
        if (isMainStream) {
            stuStream = mEncInfo.stuMainStream[0];
        }else {
            stuStream = mEncInfo.stuExtraStream[0];
        }
        nAudioRateSelected = pos;
        stuStream.stuAudioFormat.nFrequency = Integer.parseInt(audio_rate_list.get(pos));
    }

    public int getAudioEncodeModePos() {
        return nAudioEncodeModeSelected;
    }

    public int getAudioRatePos() {
        return nAudioRateSelected;
    }

    public boolean setEncodeConfig(int channel){
        return  (ToolKits.SetDevConfig(FinalVar.CFG_CMD_ENCODE,mEncInfo,sdkApp.getLoginHandle(),channel,ENCODE_BUFFER_SIZE));
    }

    public interface SpinnerDataCallback{
        void onSetSpinner(Bundle data, DialogProgress dialog);
    }

    public interface SpinnerDataUpdateCallback{
        void onUpdateSetSpinner(Bundle data, DialogProgress dialog);
    }

    private DialogProgress dialog = null;
    public final String MODE = "mode";
    public final String FPS = "fps";
    public final String BITRATE = "bitrate";
    public final String RESOLUTION = "resolve";
    public final String MODE_POS = "mode_pos";
    public final String FPS_POS = "fps_pos";
    public final String BITRATE_POS = "bitrate_pos";
    public final String RESOLUTION_POS = "resolve_pos";
    public final String BITRATE_POS_CUSTOMIZED = "bitrate_pos_customized";
    public final String AUDIO_ENCODE_MODE = "audio_encode_mode";
    public final String AUDIO_RATE = "audio_rate";

    /**
     * EncodeTask
     */
    private class EncodeTask extends AsyncTask<Object,Object,Integer[]> {

        @Override
        protected void onPreExecute(){
            super.onPreExecute();
            if (dialog == null){
                dialog = new DialogProgress(mContext);
            }
            dialog.setMessage(res.getString(R.string.waiting));
            dialog.setSpinnerType(DialogProgress.FADED_ROUND_SPINNER);
            dialog.setCancelable(false);
            dialog.show();
        }
        @Override
        protected Integer[] doInBackground(Object... params) {
            Integer channel = (Integer)params[0];
            Boolean isMainStream = (Boolean)params[1];

            initEncodeData(channel, isMainStream);
            bAudio = buildAudioEncode(isMainStream);
            int customized = 0;
            int selectedModePos = buildModeData(isMainStream);
            int selectedFpsPos = buildFpsData(isMainStream);
            int selectedBRPos = buildBitRateData(isMainStream);
            int selectedResPos = buildResolveData(isMainStream);
            if (selectedBRPos == -1) {
                customized = getCustomizedDate();
            }

            Integer[] result = new Integer[5];
            result[0] = selectedModePos;
            result[1] = selectedFpsPos;
            result[2] = selectedBRPos;
            result[3] = selectedResPos;
            result[4] = customized;

            if (mode_data_list.size() == 0 || resolve_data_list.size() == 0 ||
                    fps_data_list.size() == 0 || bitrate_data_list.size() == 0)
            {
                ToolKits.writeLog(mode_data_list.size() + " " + resolve_data_list.size() + " " + fps_data_list.size() + " " + bitrate_data_list.size() );
                bVideo = false;
            }

            return result;
        }
        @Override
        protected void onPostExecute(Integer[] result){
            super.onPostExecute(result);
            Bundle bundle = null;

            if (bVideo || bAudio) {
                bundle = new Bundle();

                bundle.putInt(MODE_POS,result[0]);
                bundle.putInt(FPS_POS,result[1]);
                bundle.putInt(BITRATE_POS, result[2]);
                bundle.putInt(RESOLUTION_POS, result[3]);
                bundle.putInt(BITRATE_POS_CUSTOMIZED, result[4]);

                bundle.putStringArrayList(MODE,mode_data_list);
                bundle.putStringArrayList(FPS,fps_data_list);
                bundle.putStringArrayList(BITRATE,bitrate_data_list);
                bundle.putStringArrayList(RESOLUTION,resolve_data_list);
                bundle.putStringArrayList(AUDIO_ENCODE_MODE, audio_encode_mode_list);
                bundle.putStringArrayList(AUDIO_RATE, audio_rate_list);
            }

            ToolKits.writeLog("" + bundle);
            getCallback().onSetSpinner(bundle,dialog);
        }
    }

    public boolean hasVideoCaps() { return bVideo;}
    public boolean hasAudioCaps() { return bAudio;}

    /**
     * Encode ralation updata
     */
    private class EncodeRelationTask extends AsyncTask<Object,Object,Integer[]> {

        @Override
        protected void onPreExecute(){
            super.onPreExecute();
            if (dialog == null){
                dialog = new DialogProgress(mContext);
            }
            dialog.setMessage(res.getString(R.string.waiting));
            dialog.setSpinnerType(DialogProgress.FADED_ROUND_SPINNER);
            dialog.setCancelable(false);
            dialog.show();
        }        @Override

        protected Integer[] doInBackground(Object... params) {
            Integer channel = (Integer)params[0];
            Boolean isMainStream = (Boolean)params[1];

            //// encode cfg caps update
            boolean r = isSupportF6(channel, mEncInfo, mEncodeCfgCaps, getStream(isMainStream));
            //boolean r = initEncodeData(channel, isMainStream);

            int selectedModePos = buildModeData(isMainStream);
            int selectedFpsPos = buildFpsData(isMainStream);
            buildBitRateData(isMainStream);

            int selectedBRPos = 0;
            if (bitrate_data_list.size() >= 2)
            {
                selectedBRPos = bitrate_data_list.size() - 2;
            }
            int selectedResPos = buildResolveData(isMainStream);

            Integer[] result = new Integer[5];
            result[0] = selectedModePos;
            result[1] = selectedFpsPos;
            result[2] = selectedBRPos;
            result[3] = selectedResPos;
            if (isMainStream) {
                mEncInfo.stuMainStream[0].stuVideoFormat.nBitRate = Integer.parseInt(bitrate_data_list.get(selectedBRPos));
            }
            else {
                mEncInfo.stuExtraStream[0].stuVideoFormat.nBitRate = Integer.parseInt(bitrate_data_list.get(selectedBRPos));
            }
            if (mode_data_list.size() == 0 || resolve_data_list.size() == 0 ||
                    fps_data_list.size() == 0 || bitrate_data_list.size() == 0)
            {
                result[4] =0;
            }
            else
            {
                result[4] = r ? 1:0;
            }

            ToolKits.writeLog("EncodeRalationTask：doInBackground");
            return result;
        }
        @Override
        protected void onPostExecute(Integer[] result){
            super.onPostExecute(result);
            Bundle bundle = new Bundle();

            if (result[4] == 0){
                bundle = null;
            } else {
                bundle.putInt(MODE_POS,result[0]);
                bundle.putInt(FPS_POS,result[1]);
                bundle.putInt(BITRATE_POS, result[2]);
                bundle.putInt(RESOLUTION_POS, result[3]);
                bundle.putStringArrayList(MODE,mode_data_list);
                bundle.putStringArrayList(FPS,fps_data_list);
                bundle.putStringArrayList(BITRATE,bitrate_data_list);
                bundle.putStringArrayList(RESOLUTION,resolve_data_list);
            }

            ToolKits.writeLog("EncodeRalationTask：onPostExecute");
            getUpdateCallback().onUpdateSetSpinner(bundle, dialog);
        }
    }

    private int getStream(boolean isMain){
        if (isMain)
            return SDK_RealPlayType.SDK_RType_Realplay;
        else
            return SDK_RealPlayType.SDK_RType_Realplay_1;
    }

    ///from char[] to byte[]
    ///char数组转为byte数组
    private byte[] getBytes(char[] chars){
        Charset charset = Charset.forName("UTF-8");
        CharBuffer cb = CharBuffer.allocate(chars.length);
        cb.put(chars);
        cb.flip();
        ByteBuffer bb = charset.encode(cb);
        return bb.array();
    }
}
