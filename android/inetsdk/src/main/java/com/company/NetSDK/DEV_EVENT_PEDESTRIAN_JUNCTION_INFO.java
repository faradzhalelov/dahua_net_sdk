package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief EVENT_IVS_PEDESTRIAN_JUNCTION (pedestrian junction Event) corresponding data block description info
 * \else
 * @brief 事件类型 EVENT_IVS_PEDESTRIAN_JUNCTION (行人卡口事件) 对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_PEDESTRIAN_JUNCTION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  channel ID
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  evnet name 
     * \else
     *  事件名称 
     * \endif
     */
    public byte					szName[] = new byte[FinalVar.SDK_EVENT_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     *  nGroupID event group ID. The nGroupID is the same for the snap process of the same object 
     * \else
     *  事件组ID, 同一个人抓拍过程内nGroupID相同
     * \endif
     */
    public int					nGroupID;

    /**
     * \if ENGLISH_LANG
     *  nCountInGroup snap amount of one event group 
     * \else
     *  一个事件组内的抓拍张数
     * \endif
     */
    public int					nCountInGroup;

    /**
     * \if ENGLISH_LANG
     *  capture Index of an event group,starting from 1
     * \else
     *  一个事件组内的抓拍序号，从1开始
     * \endif
     */
    public int					nIndexInGroup;

    /**
     * \if ENGLISH_LANG
     *  Time stamp(ms)
     * \else
     *  事件戳(单位是毫秒)
     * \endif
     */
    public double					PTS;

    /**
     * \if ENGLISH_LANG
     *  Event occurred time
     * \else
     *  事件发生的时间
     * \endif
     */
    public NET_TIME_EX					UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  Millisecond
     * \else
     *  UTC时间对应的毫秒数
     * \endif
     */
    public int					UTCMS;

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
     *  face information
     * \else
     *  目标信息
     * \endif
     */
    public SDK_MSG_OBJECT					stuObject = new SDK_MSG_OBJECT();

    /**
     * \if ENGLISH_LANG
     *  Sidewalk number	
     * \else
     *  人行道号
     * \endif
     */
    public int					nLane;

    /**
     * \if ENGLISH_LANG
     *  snap index,such as 3,2,1,1 means the last one,0 means there has some exception and snap stop
     * \else
     *  表示抓拍序号,如3/2/1,1表示抓拍结束,0表示异常结束
     * \endif
     */
    public int					nSequence;

    /**
     * \if ENGLISH_LANG
     *  Non-motorized vehicle information
     * \else
     *  非机动车信息
     * \endif
     */
    public VA_OBJECT_NONMOTOR					stuNonMotor = new VA_OBJECT_NONMOTOR();

    /**
     * \if ENGLISH_LANG
     *  Whether the stuNonMotor field is valid
     * \else
     *  stuNonMotor 字段是否有效
     * \endif
     */
    public boolean					bHasNonMotor;

    /**
     * \if ENGLISH_LANG
     *  Pedestrian information
     * \else
     *  行人信息
     * \endif
     */
    public SDK_MSG_OBJECT					stuVehicle = new SDK_MSG_OBJECT();

}