package com.company.NetSDK;

import static com.company.NetSDK.EM_RECORD_SNAP_FLAG_TYPE.FLAG_TYPE_MAX;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief In-Vehicle Trigger Mode Query Results ( CLIENT_FindNextFileEx + SDK_FILE_QUERY_VEHICLE_TRIGGER_MODE )
 * \else
 * @brief 车载触发模式查询结果 ( CLIENT_FindNextFileEx + SDK_FILE_QUERY_VEHICLE_TRIGGER_MODE )
 * \endif
 */
public class NET_MEDIA_VEHICLE_TRIGGER_MODE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * The channel number
     * \else
     * 通道号
     * \endif
     */
    public int nChannelID;

    /**
     * \if ENGLISH_LANG
     * Start Time
     * \else
     * 起始时间
     * \endif
     */
    public NET_TIME stuStartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * End Time
     * \else
     * 结束时间
     * \endif
     */
    public NET_TIME stuEndTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * File Path
     * \else
     * 文件路径
     * \endif
     */
    public byte szFilePath[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Number of file types, 0 represents querying any type
     * \else
     * 文件类型个数, 为0表示查询任意类型
     * \endif
     */
    public int nFileTypeNum;

    /**
     * \if ENGLISH_LANG
     * file types,{@link EM_FINDFILE_TYPE}
     * \else
     * 文件类型,{@link EM_FINDFILE_TYPE}
     * \endif
     */
    public int[] emFileType = new int[8];

    /**
     * \if ENGLISH_LANG
     * File length, this field is obsolete, use nFileLengthEx
     * \else
     * 文件长度，该字段废弃，使用nFileLengthEx
     * \endif
     */
    public int nFileLength;

    /**
     * \if ENGLISH_LANG
     * cluster number
     * \else
     * 簇号
     * \endif
     */
    public int nCluster;

    /**
     * \if ENGLISH_LANG
     * File Location Index
     * \else
     * 文件定位索引
     * \endif
     */
    public int nHint;

    /**
     * \if ENGLISH_LANG
     * disk number
     * \else
     * 磁盘号
     * \endif
     */
    public int nDriveNo;

    /**
     * \if ENGLISH_LANG
     * Video stream 0- Unknown 1- Main stream 2- Extra stream 1 3- Extra stream 2 4- Extra stream 3
     * \else
     * 视频码流 0-未知 1-主码流 2-辅码流1 3-辅码流2 4-辅码流3
     * \endif
     */
    public int nVideoStream;

    /**
     * \if ENGLISH_LANG
     * List of event types, see Intelligent Analysis Event Types
     * \else
     * 事件类型列表,参见智能分析事件类型
     * \endif
     */
    public int nEventLists[] = new int[FinalVar.MAX_IVS_EVENT_NUM];

    /**
     * \if ENGLISH_LANG
     * Total number of events
     * \else
     * 事件总数
     * \endif
     */
    public int nEventCount;

    /**
     * \if ENGLISH_LANG
     * Flag for recording or capturing files, with no flag set to query all files
     * \else
     * 录像或抓图文件标志, 不设置标志表示查询所有文件
     * \endif
     */
    public int emFalgLists[] = new int[FLAG_TYPE_MAX];

    /**
     * \if ENGLISH_LANG
     * Total number of flags
     * \else
     * 标志总数
     * \endif
     */
    public int nFalgCount;

    /**
     * \if ENGLISH_LANG
     * Basic data of police vehicles
     * \else
     * 警车基础数据
     * \endif
     */
    public NET_POLICE_VEHICLE_DATA stuPoliceVehicleData = new NET_POLICE_VEHICLE_DATA();

    /**
     * \if ENGLISH_LANG
     * File length extension, supporting file lengths greater than 4G in bytes
     * \else
     * 文件长度扩展，支持文件长度大于4G，单位字节
     * \endif
     */
    public long nFileLengthEx;

    /**
     * \if ENGLISH_LANG
     * TRUE means only stuStartTimeRealUTC and stuEndTimeRealUTC are valid (only stuStartTimeRealUTC and stuEndTimeRealUTC are used), FALSE means only stuStartTime and stuEndTime are valid (only stuStartTime and stuEndTime are used)
     * \else
     * 为TRUE表示仅stuStartTimeRealUTC和stuEndTimeRealUTC有效(仅使用stuStartTimeRealUTC和stuEndTimeRealUTC), 为FALSE表示仅stuStartTime和stuEndTime有效(仅使用stuStartTime和stuEndTime)
     * \endif
     */
    public boolean bRealUTC;

    /**
     * \if ENGLISH_LANG
     * UTC start time (standard UTC time), paired with stuEndTimeRealUTC
     * \else
     * UTC开始时间(标准UTC时间), 与stuEndTimeRealUTC配对使用
     * \endif
     */
    public NET_TIME stuStartTimeRealUTC = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * UTC end time (standard UTC time), paired with stuStartTimeRealUTC
     * \else
     * UTC结束时间(标准UTC时间), 与stuStartTimeRealUTC配对使用
     * \endif
     */
    public NET_TIME stuEndTimeRealUTC = new NET_TIME();

}