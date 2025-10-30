package com.company.netsdk.module;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

import com.company.NetSDK.CtrlType;
import com.company.NetSDK.EM_NET_RECORD_TYPE;
import com.company.NetSDK.EM_RECORD_OPERATE_TYPE;
import com.company.NetSDK.FIND_RECORD_TRAFFICREDLIST_CONDITION;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.NET_CTRL_RECORDSET_PARAM;
import com.company.NetSDK.NET_INSERT_RECORD_INFO;
import com.company.NetSDK.NET_IN_FIND_NEXT_RECORD_PARAM;
import com.company.NetSDK.NET_IN_FIND_RECORD_PARAM;
import com.company.NetSDK.NET_IN_OPERATE_TRAFFIC_LIST_RECORD;
import com.company.NetSDK.NET_OUT_FIND_NEXT_RECORD_PARAM;
import com.company.NetSDK.NET_OUT_FIND_RECORD_PARAM;
import com.company.NetSDK.NET_OUT_OPERATE_TRAFFIC_LIST_RECORD;
import com.company.NetSDK.NET_RECORDSET_ACCESS_CTL_CARDREC;
import com.company.NetSDK.NET_RECORD_TYPE;
import com.company.NetSDK.NET_REMOVE_RECORD_INFO;
import com.company.NetSDK.NET_TRAFFIC_LIST_RECORD;
import com.company.NetSDK.NET_UPDATE_RECORD_INFO;
import com.company.netsdk.activity.NetSDKApplication;
import com.company.netsdk.common.ToolKits;
import com.company.netsdk.common.TrafficAllowListInfo;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class TrafficAllowListModule {
    NetSDKApplication app;
    Context mContext;
    Long __loginHandle;
    List<TrafficAllowListInfo> trafficList;

    public TrafficAllowListModule(Context context){
        this.mContext = context;
        __loginHandle = ((NetSDKApplication)((AppCompatActivity)mContext).getApplication()).getLoginHandle();
    }

    public boolean deleteOpn(int nNo){
        NET_REMOVE_RECORD_INFO stRemoveInfo = new NET_REMOVE_RECORD_INFO();
        stRemoveInfo.nRecordNo = nNo;

        NET_IN_OPERATE_TRAFFIC_LIST_RECORD stIn = new NET_IN_OPERATE_TRAFFIC_LIST_RECORD();
        stIn.emOperateType = EM_RECORD_OPERATE_TYPE.NET_TRAFFIC_LIST_REMOVE;
        stIn.emRecordType = EM_NET_RECORD_TYPE.NET_RECORD_TRAFFICREDLIST;
        stIn.pstOpreateInfo = stRemoveInfo;
        NET_OUT_OPERATE_TRAFFIC_LIST_RECORD stOut = new NET_OUT_OPERATE_TRAFFIC_LIST_RECORD();
        if(INetSDK.OperateTrafficList(__loginHandle, stIn, stOut, 5000)){
//            Toast.makeText(app, "删除成功", Toast.LENGTH_SHORT).show();
            return true;
        } else {
//            Toast.makeText(app, "删除失败,错误码为" + ToolKits.getLastError(), Toast.LENGTH_SHORT).show();
        }
        return false;
    }

    public List<TrafficAllowListInfo> queryExOpn(String plateNum){
        trafficList = new ArrayList();
        NET_IN_FIND_RECORD_PARAM stIn = new NET_IN_FIND_RECORD_PARAM();
        stIn.emType = EM_NET_RECORD_TYPE.NET_RECORD_TRAFFICREDLIST;
        FIND_RECORD_TRAFFICREDLIST_CONDITION stuCondition = new FIND_RECORD_TRAFFICREDLIST_CONDITION();
        if(!(null == plateNum || "".equals(plateNum))){
            System.arraycopy(plateNum.getBytes(), 0, stuCondition.szPlateNumberVague, 0, plateNum.getBytes().length);
        }
        stIn.pQueryCondition = stuCondition;
        NET_OUT_FIND_RECORD_PARAM stOut = new NET_OUT_FIND_RECORD_PARAM();


        if(INetSDK.FindRecord(__loginHandle, stIn, stOut, 5000)){

            int doNextCount = 0;
            int item = 0;
            while(true) {
                int nCount = 11;
                NET_IN_FIND_NEXT_RECORD_PARAM infindNextRecord = new NET_IN_FIND_NEXT_RECORD_PARAM();
                infindNextRecord.lFindeHandle = stOut.lFindeHandle;
                infindNextRecord.nFileCount = nCount;
                infindNextRecord.emType = EM_NET_RECORD_TYPE.NET_RECORD_TRAFFICREDLIST;

                NET_TRAFFIC_LIST_RECORD[] listRecord = new NET_TRAFFIC_LIST_RECORD[nCount];   //数组大小，代表可以查询的记录信息最大值
                for(int m=0; m<nCount; m++) {
                    listRecord[m] = new NET_TRAFFIC_LIST_RECORD();
                }

                NET_OUT_FIND_NEXT_RECORD_PARAM outfindNextRecord = new NET_OUT_FIND_NEXT_RECORD_PARAM();
                outfindNextRecord.nMaxRecordNum = nCount;
                outfindNextRecord.pRecordList = listRecord;

                int retCount = INetSDK.FindNextRecord(infindNextRecord, outfindNextRecord, 5000);
                if(retCount != 0) {
                    ToolKits.writeLog("查到的个数：" + outfindNextRecord.nRetRecordNum);
                    for(int i=0; i<outfindNextRecord.nRetRecordNum; i++) {

                        item = i + doNextCount * nCount;
                        try {
                            trafficList.add(new TrafficAllowListInfo(String.valueOf(((NET_TRAFFIC_LIST_RECORD)outfindNextRecord.pRecordList[i]).nRecordNo),
                                    new String(((NET_TRAFFIC_LIST_RECORD)outfindNextRecord.pRecordList[i]).szMasterOfCar,"utf-8").trim(),
                                    new String(((NET_TRAFFIC_LIST_RECORD)outfindNextRecord.pRecordList[i]).szPlateNumber,"utf-8").trim(),
                                    ((NET_TRAFFIC_LIST_RECORD)outfindNextRecord.pRecordList[i]).stBeginTime.toMinString(),
                                    ((NET_TRAFFIC_LIST_RECORD)outfindNextRecord.pRecordList[i]).stCancelTime.toMinString(),
                                            String.valueOf(((NET_TRAFFIC_LIST_RECORD)outfindNextRecord.pRecordList[i]).stAuthrityTypes[0].bAuthorityEnable))
                                    );
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }
//                        ToolKits.writeLog("pRecordList[" + i + "].nRecordNo" + ((NET_TRAFFIC_LIST_RECORD)stOutNext.pRecordList[i]).nRecordNo);
//                        ToolKits.writeLog("pRecordList[" + i + "].stBeginTime" + ((NET_TRAFFIC_LIST_RECORD)stOutNext.pRecordList[i]).stBeginTime.toString());
//                        ToolKits.writeLog("pRecordList[" + i + "].stCancelTime" + ((NET_TRAFFIC_LIST_RECORD)stOutNext.pRecordList[i]).stCancelTime.toString());
//                        ToolKits.writeLog("pRecordList[" + i + "].nRecordNo" + new String(((NET_TRAFFIC_LIST_RECORD)stOutNext.pRecordList[i]).szMasterOfCar).trim());
//                        ToolKits.writeLog("pRecordList[" + i + "].nRecordNo" + new String(((NET_TRAFFIC_LIST_RECORD)stOutNext.pRecordList[i]).szPlateNumber).trim());

                    }

                    if(outfindNextRecord.nRetRecordNum < nCount) {
                        break;
                    } else {
                        doNextCount++;
                    }

                } else {
                    ToolKits.writeErrorLog("FindNextRecord Failed!" );
                    break;
                }
            }
            ToolKits.writeLog("查询到的总个数：" + (item + 1));

//            int recordNum = 10;
////            Toast.makeText(app, "初步查询成功", Toast.LENGTH_SHORT).show();
//            NET_IN_FIND_NEXT_RECORD_PARAM stInNext = new NET_IN_FIND_NEXT_RECORD_PARAM();
//            stInNext.lFindeHandle = stOut.lFindeHandle;
//            stInNext.nFileCount = recordNum;
//            NET_OUT_FIND_NEXT_RECORD_PARAM stOutNext = new NET_OUT_FIND_NEXT_RECORD_PARAM();
//            stOutNext.nMaxRecordNum = recordNum;
//            stOutNext.pRecordList = new NET_TRAFFIC_LIST_RECORD[recordNum];
//            if(INetSDK.FindNextRecord(stInNext,stOutNext,5000) != 0){
////                Toast.makeText(app, "录像查询成功", Toast.LENGTH_SHORT).show();
//                ToolKits.writeLog("nRetRecordNum = " + stOutNext.nRetRecordNum);
//                for(int i = 0; i < stOutNext.nRetRecordNum; i ++){
//                    ToolKits.writeLog("pRecordList[" + i + "].nRecordNo" + ((NET_TRAFFIC_LIST_RECORD)stOutNext.pRecordList[i]).nRecordNo);
//                    ToolKits.writeLog("pRecordList[" + i + "].stBeginTime" + ((NET_TRAFFIC_LIST_RECORD)stOutNext.pRecordList[i]).stBeginTime.toString());
//                    ToolKits.writeLog("pRecordList[" + i + "].stCancelTime" + ((NET_TRAFFIC_LIST_RECORD)stOutNext.pRecordList[i]).stCancelTime.toString());
//                    ToolKits.writeLog("pRecordList[" + i + "].nRecordNo" + new String(((NET_TRAFFIC_LIST_RECORD)stOutNext.pRecordList[i]).szMasterOfCar).trim());
//                    ToolKits.writeLog("pRecordList[" + i + "].nRecordNo" + new String(((NET_TRAFFIC_LIST_RECORD)stOutNext.pRecordList[i]).szPlateNumber).trim());
//                }
//                return stOutNext;
//                //todo 传输数据
//            } else {
////                Toast.makeText(app, "录像查询失败,错误码为" + ToolKits.getLastError(), Toast.LENGTH_SHORT).show();
//            }
            INetSDK.FindRecordClose(stOut.lFindeHandle);
            if(item + 1 > 0){
                return trafficList;
            }
        } else {
//            Toast.makeText(app, "初步查询失败,错误码为" + ToolKits.getLastError(), Toast.LENGTH_SHORT).show();
        }

        return null;
    }

    public boolean clearOpn(){
        NET_CTRL_RECORDSET_PARAM param = new NET_CTRL_RECORDSET_PARAM();
        param.nType = EM_NET_RECORD_TYPE.NET_RECORD_TRAFFICREDLIST;
        if(INetSDK.ControlDevice(__loginHandle, CtrlType.SDK_CTRL_RECORDSET_CLEAR, param, 5000)){
//            Toast.makeText(app, "清空成功", Toast.LENGTH_SHORT).show();
            return true;
        } else {
//            Toast.makeText(app, "清空失败,错误码为" + ToolKits.getLastError(), Toast.LENGTH_SHORT).show();
        }
        return false;
    }

    public boolean modifyOpn(NET_TRAFFIC_LIST_RECORD stRec){
        NET_UPDATE_RECORD_INFO stUpdateInfo = new NET_UPDATE_RECORD_INFO();
        stUpdateInfo.pRecordInfo = stRec;
        NET_IN_OPERATE_TRAFFIC_LIST_RECORD stIn = new NET_IN_OPERATE_TRAFFIC_LIST_RECORD();
        stIn.emOperateType = EM_RECORD_OPERATE_TYPE.NET_TRAFFIC_LIST_UPDATE;
        stIn.emRecordType = EM_NET_RECORD_TYPE.NET_RECORD_TRAFFICREDLIST;
        stIn.pstOpreateInfo = stUpdateInfo;
        NET_OUT_OPERATE_TRAFFIC_LIST_RECORD stOut = new NET_OUT_OPERATE_TRAFFIC_LIST_RECORD();
        if(INetSDK.OperateTrafficList(__loginHandle, stIn, stOut, 5000)){
//            Toast.makeText(app, "修改成功", Toast.LENGTH_SHORT).show();
            return true;
        } else {
//            Toast.makeText(app, "修改失败,错误码为" + ToolKits.getLastError(), Toast.LENGTH_SHORT).show();
        }
        return false;
    }

    public boolean createOpn(NET_TRAFFIC_LIST_RECORD stRec){
        NET_INSERT_RECORD_INFO stInsertInfo = new NET_INSERT_RECORD_INFO();
        stInsertInfo.pRecordInfo = stRec;
        NET_IN_OPERATE_TRAFFIC_LIST_RECORD stIn = new NET_IN_OPERATE_TRAFFIC_LIST_RECORD();
        stIn.emOperateType = EM_RECORD_OPERATE_TYPE.NET_TRAFFIC_LIST_INSERT;
        stIn.emRecordType = EM_NET_RECORD_TYPE.NET_RECORD_TRAFFICREDLIST;
        stIn.pstOpreateInfo = stInsertInfo;
        NET_OUT_OPERATE_TRAFFIC_LIST_RECORD stOut = new NET_OUT_OPERATE_TRAFFIC_LIST_RECORD();
        if(INetSDK.OperateTrafficList(__loginHandle, stIn, stOut, 5000)){
//            Toast.makeText(app, "修改成功", Toast.LENGTH_SHORT).show();
            return true;
        } else {
//            Toast.makeText(app, "修改失败,错误码为" + ToolKits.getLastError(), Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}
