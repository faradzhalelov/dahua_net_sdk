package com.company.NetSDK;

import static com.company.NetSDK.EM_RECORD_SNAP_FLAG_TYPE.FLAG_TYPE_MAX;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief In-Vehicle Trigger Mode Query ( CLIENT_FindFileEx + SDK_FILE_QUERY_VEHICLE_TRIGGER_MODE )
 * \else
 * @brief 车载触发模式查询 ( CLIENT_FindFileEx + SDK_FILE_QUERY_VEHICLE_TRIGGER_MODE )
 * \endif
 */
public class NET_MEDIAFILE_VEHICLE_TRIGGER_MODE_PARAM implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The channel number
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  Start Time
     * \else
     *  起始时间
     * \endif
     */
    public NET_TIME					stuStartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  End Time
     * \else
     *  结束时间
     * \endif
     */
    public NET_TIME					stuEndTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  File type, 0: Any type, 1: jpg image, 2: dav file    
     * \else
     *  文件类型,0:任意类型, 1:jpg图片, 2:dav文件    
     * \endif
     */
    public int					nMediaType;

    /**
     * \if ENGLISH_LANG
     *  Video stream 0- Unknown 1- Main stream 2- Extra stream 1 3- Extra stream 2 4- Extra stream 3
     * \else
     *  视频码流 0-未知 1-主码流 2-辅码流1 3-辅码流2 4-辅码流3 
     * \endif
     */
    public int					nVideoStream;

    /**
     * \if ENGLISH_LANG
     *  List of event types, see Intelligent Analysis Event Types
     * \else
     *  事件类型列表,参见智能分析事件类型
     * \endif
     */
    public int					nEventLists[] = new int[FinalVar.MAX_IVS_EVENT_NUM];

    /**
     * \if ENGLISH_LANG
     *  Total number of events
     * \else
     *  事件总数
     * \endif
     */
    public int					nEventCount;

    /**
     * \if ENGLISH_LANG
     *  Flag for recording or capturing files, with no flag set to query all files
     * \else
     *  录像或抓图文件标志, 不设置标志表示查询所有文件
     * \endif
     */
    public int					emFalgLists[] = new int[FLAG_TYPE_MAX];

    /**
     * \if ENGLISH_LANG
     *  Total number of flags
     * \else
     *  标志总数
     * \endif
     */
    public int					nFalgCount;

    /**
     * \if ENGLISH_LANG
     *  Basic data of police vehicles
     * \else
     *  警车基础数据
     * \endif
     */
    public NET_POLICE_VEHICLE_DATA					stuPoliceVehicleData = new NET_POLICE_VEHICLE_DATA();

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  为TRUE表示仅下发stuStartTimeRealUTC和stuEndTimeRealUTC(不下发stuStartTime, stuEndTime), 为FALSE表示仅下发stuStartTime, stuEndTime(不下发stuStartTimeRealUTC和stuEndTimeRealUTC)
     * \endif
     */
    public boolean					bOnlySupportRealUTC;

    /**
     * \if ENGLISH_LANG
     *  UTC start time (standard UTC time), paired with stuEndTimeRealUTC
     * \else
     *  UTC开始时间(标准UTC时间), 与stuEndTimeRealUTC配对使用，与(stuStartTime, stuEndTime)互斥
     * \endif
     */
    public NET_TIME					stuStartTimeRealUTC = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  UTC end time (standard UTC time), paired with stuStartTimeRealUTC
     * \else
     *  UTC结束时间(标准UTC时间), 与stuStartTimeRealUTC配对使用，与(stuStartTime, stuEndTime)互斥
     * \endif
     */
    public NET_TIME					stuEndTimeRealUTC = new NET_TIME();

}