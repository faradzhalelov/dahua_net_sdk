package com.company.netsdk.common;

import com.company.NetSDK.CB_fMessageCallBack;
import com.company.NetSDK.FinalVar;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.*;
import com.company.netsdk.activity.NetSDKApplication;

/**
 * Created by 32940 on 2019/3/11.
 */
public class SCADA {
    /**
     * 欠压报警
     */
    public static void startListen() {
        INetSDK.StopListen(NetSDKApplication.getInstance().getLoginHandle());    // 取消订阅

        INetSDK.SetDVRMessCallBack(new CB_fMessageCallBack() {
            @Override
            public boolean invoke(int lCommand, long lLoginID, Object obj,
                                    String pchDVRIP, int nDVRPort) {
                // 欠压报警
                if(lCommand == FinalVar.SDK_ALARM_SCADA_DEV_ALARM) {
                    ALARM_SCADA_DEV_INFO stInfo = (ALARM_SCADA_DEV_INFO)obj;

                    ToolKits.writeLog(stInfo.toString());
                }

                return true;
            }
        });
        INetSDK.StartListenEx(NetSDKApplication.getInstance().getLoginHandle());    // 订阅报警
    }

    public static void stopListen() {
        INetSDK.StopListen(NetSDKApplication.getInstance().getLoginHandle());    // 取消订阅
    }



    /**
     * 获取站点实时数据
     */
    public static void getScadaInfoByID() {
        // 设备返回的点位信息最大个数，用户自己定义
        int nMaxCount = 32;

        NET_SCADA_INFO_BY_ID msg = new NET_SCADA_INFO_BY_ID(nMaxCount);
        // 探测器ID
        String sensorID = "01001010111";
        System.arraycopy(sensorID.getBytes(), 0, msg.szSensorID, 0, sensorID.getBytes().length);

        // 返回数据是否经过处理
        msg.bIsHandle = false;

        // 有效点位个数，最大128个
        msg.nIDs = 1;

        // 点位信息
        String id = "01001010111";
        System.arraycopy(id.getBytes(), 0, msg.szIDs[0], 0, id.getBytes().length);

        if(INetSDK.QueryDevState(NetSDKApplication.getInstance().getLoginHandle(),
                            FinalVar.SDK_DEVSTATE_SCADA_INFO_BY_ID, msg, 5000)) {
            for(int i = 0; i < msg.nRetCount; i++) {
                ToolKits.writeLog(msg.pstuInfo[i].toString());
            }
        } else {
            ToolKits.writeErrorLog("获取站点实时数据失败!");
        }
    }



    /**
     * 获取当前所接入控制器设备列表和状态
     */
    public static void getSCADADeviceStatus() {
        /**
         * 入参
         */
        NET_IN_GET_SCADA_STATUS stIn = new NET_IN_GET_SCADA_STATUS();

        /**
         * 出参
         */
        NET_OUT_GET_SCADA_STATUS stOut = new NET_OUT_GET_SCADA_STATUS();

        if(INetSDK.GetSCADADeviceStatus(NetSDKApplication.getInstance().getLoginHandle(), stIn, stOut, 5000)) {
            for(int i = 0; i < stOut.nDevStatusNum; i++) {
                ToolKits.writeLog("设备类型：" + stOut.stuStatusInfo[i].emDevType);

                for(int j = 0; j < stOut.stuStatusInfo[i].nDevInfoNum; j++) {
                    ToolKits.writeLog("设备ID：" + new String(stOut.stuStatusInfo[i].stuDevInfo[j].szDeviceID).trim());
                    ToolKits.writeLog("设备名称：" + new String(stOut.stuStatusInfo[i].stuDevInfo[j].szDeviceName).trim());
                    ToolKits.writeLog("设备状态：" + stOut.stuStatusInfo[i].stuDevInfo[j].emDevStatus);
                }
            }
        } else {
            ToolKits.writeErrorLog("获取当前所接入控制器设备列表和状态失败!");
        }
    }



    /**
     * 查询控制器历史统计数据
     */
    private static long lFindHandle = 0;
    public static void findScadaData() {
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        /**
         * StartFindSCADA 接口入参
         */
        NET_IN_SCADA_START_FIND inStart = new NET_IN_SCADA_START_FIND();
        //开始时间，必填
        inStart.stuStartTime.setTime(2019, 3, 26, 0, 0, 0);

        // 是否限制结束时间
        inStart.bEndTime = true;

        // 结束时间
        inStart.stuEndTime.setTime(2019, 3, 28, 10, 10, 10);

        // IPC可以不需要填写下面两个字段
        // 设备ID, 必填
        ToolKits.StringToByteArray("6c:b3:50:05:6b:b9", inStart.szDeviceID);

        // 监测点位ID, 必填
        ToolKits.StringToByteArray("6c:b3:50:05:6b:b9", inStart.szID);

        inStart.nIDsNum = 7;
        ToolKits.StringToByteArray("20121001", inStart.szIDs[0]);
        ToolKits.StringToByteArray("20122001", inStart.szIDs[1]);
        ToolKits.StringToByteArray("20123001", inStart.szIDs[2]);
        ToolKits.StringToByteArray("20107001", inStart.szIDs[3]);
        ToolKits.StringToByteArray("20134001", inStart.szIDs[4]);
        ToolKits.StringToByteArray("20135001", inStart.szIDs[5]);
        ToolKits.StringToByteArray("20136001", inStart.szIDs[6]);

        /**
         * StartFindSCADA 接口出参
         */
        NET_OUT_SCADA_START_FIND outStart = new NET_OUT_SCADA_START_FIND();
        lFindHandle = INetSDK.StartFindSCADA(NetSDKApplication.getInstance().getLoginHandle(), inStart, outStart, 5000);
        if(lFindHandle != 0) {
            ToolKits.writeLog("符合查询条件的总数:" + outStart.dwTotalCount);
        } else {
            ToolKits.writeErrorLog("StartFindSCADA Failed!");
            return;
        }



        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        /**
         * DoFindSCADA 接口入参
         */
        NET_IN_SCADA_DO_FIND inDoFind = new NET_IN_SCADA_DO_FIND();
        ///// 如果根据 StartFindSCADA 查到的数据很多，可以根据改变 起始序号nStartNo 来循环查询，
        ///// 调用 StartFindSCADA 后，循环调用 DoFindSCADA

        // 起始序号,
        inDoFind.nStartNo = 0;

        // 本次欲获得结果的个数
        inDoFind.nCount = 20;

        /**
         * DoFindSCADA 接口出参
         */
        int nMaxNum = 20; // 查询到的结果最大值，用户自己申请， 与 inDoFind.nCount 一样即可
        NET_OUT_SCADA_DO_FIND outDoFind = new NET_OUT_SCADA_DO_FIND(nMaxNum);

        if(INetSDK.DoFindSCADA(lFindHandle, inDoFind, outDoFind, 5000)) {
            int nCount = outDoFind.nRetNum > outDoFind.nMaxNum? outDoFind.nMaxNum:outDoFind.nRetNum;
            for(int i = 0; i < nCount; i++) {
                ToolKits.writeLog(outDoFind.pstuInfo[i].toString());
            }
        } else {
            ToolKits.writeErrorLog("DoFindSCADA Failed!");
        }



        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        /**
         * 查询结束，关闭查询
         */
        INetSDK.StopFindSCADA(lFindHandle);
        lFindHandle = 0;
    }



    /**
     * 控制器配置信息
     */
    public static void controllerSiteConfig() {
        int emCfgOpType = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_SCADA_CONTROLLER_SITE;
        int nChannelID = -1;

        NET_CFG_SCADA_CONTROLLER_SITE_INFO msg = new NET_CFG_SCADA_CONTROLLER_SITE_INFO();

        // 获取
        if(INetSDK.GetConfig(NetSDKApplication.getInstance().getLoginHandle(), emCfgOpType, nChannelID, msg, 10000, null)) {
            for(int i = 0; i < msg.nControllerNum; i++) {
                ToolKits.writeLog(msg.stuControllerInfo[i].toString());
            }

            // 设置
            if(INetSDK.SetConfig(NetSDKApplication.getInstance().getLoginHandle(), emCfgOpType, nChannelID, msg, 10000, null, null)) {
                ToolKits.writeLog("设置控制器配置信息成功!");
            } else {
                ToolKits.writeErrorLog("设置控制器配置信息失败!");
            }
        } else {
            ToolKits.writeErrorLog("获取控制器配置信息失败!");
        }
    }

}
