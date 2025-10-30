package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Corresponding to data block description of event type EVENT_IVS_TRAFFIC_NONMOTOR_OVERLOAD (Non-motor overload)
 * \else
 * 事件类型 EVENT_IVS_TRAFFIC_NONMOTOR_OVERLOAD (非机动车超载事件) 对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_TRAFFIC_NONMOTOR_OVERLOAD_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Channel ID
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  Evnet name
     * \else
     *  事件名称
     * \endif
     */
    public byte					szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Event action, 0: Pulse, 1: Start, 2: Stop
     * \else
     *  0:脉冲 1:开始 2:停止
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  Timestamp (in milliseconds)
     * \else
     *  时间戳(单位是毫秒)
     * \endif
     */
    public double					PTS;

    /**
     * \if ENGLISH_LANG
     *  Time for the event occurred
     * \else
     *  事件发生的时间
     * \endif
     */
    public NET_TIME_EX					UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  Event ID
     * \else
     *  事件ID
     * \endif
     */
    public int					nEventID;

    /**
     * \if ENGLISH_LANG
     *  Event corresponding to file information
     * \else
     *  事件对应文件信息
     * \endif
     */
    public SDK_EVENT_FILE_INFO					stuFileInfo = new SDK_EVENT_FILE_INFO();

    /**
     * \if ENGLISH_LANG
     *  Intelli comm info 
     * \else
     *  智能事件公共信息 
     * \endif
     */
    public EVENT_INTELLI_COMM_INFO					stuIntelliCommInfo = new EVENT_INTELLI_COMM_INFO();

    /**
     * \if ENGLISH_LANG
     *  snapshot mark (by bit), see NET_RESERVED_COMMON   
     * \else
     *  抓图标志(按位),具体见NET_RESERVED_COMMON    
     * \endif
     */
    public int					dwSnapFlagMask;

    /**
     * \if ENGLISH_LANG
     *  picture resolution
     * \else
     *  对应图片的分辨率
     * \endif
     */
    public SDK_RESOLUTION_INFO					stuResolution = new SDK_RESOLUTION_INFO();

    /**
     * \if ENGLISH_LANG
     *  NonMotor information
     * \else
     *  非机动车信息
     * \endif
     */
    public VA_OBJECT_NONMOTOR					stuNonMotor = new VA_OBJECT_NONMOTOR();

    /**
     * \if ENGLISH_LANG
     *  Line number
     * \else
     *  车道号
     * \endif
     */
    public int					nLane;

    /**
     * \if ENGLISH_LANG
     *  Snap index,such as 3,2,1/0.  1 means the last one,0 means there has some exception and snap stop
     * \else
     *  抓拍序号，如3-2-1/0，1表示抓拍正常结束，0表示抓拍异常结束
     * \endif
     */
    public int					nSequence;

    /**
     * \if ENGLISH_LANG
     *  common information
     * \else
     *  公共信息
     * \endif
     */
    public EVENT_COMM_INFO					stuCommInfo = new EVENT_COMM_INFO();

    /**
     * \if ENGLISH_LANG
     *  Traffic car info
     * \else
     *  交通车辆信息
     * \endif
     */
    public DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO					stTrafficCar = new DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO();

}
