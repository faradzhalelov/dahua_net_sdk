package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 
 * \else
 * @brief 事件类型EVENT_IVS_TRAFFIC_DRIVER_SMOKING (驾驶员抽烟事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_TRAFFIC_DRIVER_SMOKING implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  事件名称
     * \endif
     */
    public byte					szName[] = new byte[FinalVar.SDK_EVENT_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  TriggerType:触发类型,0车检器,1雷达,2视频
     * \endif
     */
    public int					nTriggerType;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  时间戳(单位是毫秒)
     * \endif
     */
    public int					PTS;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  事件发生的时间
     * \endif
     */
    public NET_TIME_EX					UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  事件ID
     * \endif
     */
    public int					nEventID;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  表示抓拍序号,如3,2,1,1表示抓拍结束,0表示异常结束
     * \endif
     */
    public int					nSequence;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  事件动作,0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;    BYTE                    byReserved1[2];
     * \endif
     */
    public byte					byEventAction;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
     * \endif
     */
    public byte					byImageIndex;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  事件对应文件信息
     * \endif
     */
    public SDK_EVENT_FILE_INFO					stuFileInfo = new SDK_EVENT_FILE_INFO();

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  对应车道号
     * \endif
     */
    public int					nLane;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  底层产生的触发抓拍帧标记
     * \endif
     */
    public int					nMark;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  视频分析帧序号
     * \endif
     */
    public int					nFrameSequence;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  视频分析的数据源地址
     * \endif
     */
    public int					nSource;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  检测到的物体
     * \endif
     */
    public SDK_MSG_OBJECT					stuObject = new SDK_MSG_OBJECT();

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  车身信息
     * \endif
     */
    public SDK_MSG_OBJECT					stuVehicle = new SDK_MSG_OBJECT();

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  交通车辆信息
     * \endif
     */
    public DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO					stuTrafficCar = new DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO();

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  车辆实际速度,Km/h
     * \endif
     */
    public int					nSpeed;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  抓图标志(按位),具体见NET_RESERVED_COMMON    
     * \endif
     */
    public int					dwSnapFlagMask;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  对应图片的分辨率
     * \endif
     */
    public SDK_RESOLUTION_INFO					stuResolution = new SDK_RESOLUTION_INFO();

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  公共信息    
     * \endif
     */
    public EVENT_COMM_INFO					stCommInfo = new EVENT_COMM_INFO();

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  GPS信息 车载
     * \endif
     */
    public NET_GPS_INFO					stuGPSInfo = new NET_GPS_INFO();

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  司机ID
     * \endif
     */
    public byte					szDriverID[] = new byte[32];

}
