package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Target Event List
 * \else
 * @brief 目标事件列表
 * \endif
 */
public class NET_OBJECT_EVENTS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Record unique number
     * \else
     *  记录唯一编号
     * \endif
     */
    public int					nRecNo;

    /**
     * \if ENGLISH_LANG
     *  Channel number, starting from 0
     * \else
     *  通道号，从0开始
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Target trajectory ID
     * \else
     *  目标轨迹ID
     * \endif
     */
    public int					nObjectID;

    /**
     * \if ENGLISH_LANG
     *  Target type, 0 unknown, 1 Human, 2 Vehicle, 3 NonMotor, 4 Animal
     * \else
     *  目标类型
     * \endif
     */
    public int					nObjectType;

    /**
     * \if ENGLISH_LANG
     *  The intelligent class value associated with the target trajectory
     * \else
     *  目标轨迹所关联的智能大类值
     * \endif
     */
    public byte					szSchemaID[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Target Event Mini Map
     * \else
     *  目标事件小图
     * \endif
     */
    public byte					szObjectUrl[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     *  Local system UTC time (0 time zone), in seconds
     * \else
     *  本地系统utc时间（0时区），单位：秒
     * \endif
     */
    public long					nUTCSystemTime;

    /**
     * \if ENGLISH_LANG
     *  Event triggered UTC time (0 time zone), in seconds
     * \else
     *  事件触发utc时间（0时区），单位：秒
     * \endif
     */
    public long					nUTCEventTime;

    /**
     * \if ENGLISH_LANG
     *  The time when the object enters the screen
     * \else
     *  物体进入画面时间
     * \endif
     */
    public NET_TIME					stuEnterTimeRealUTC = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  The time when the object leaves the screen
     * \else
     *  物体离开画面时间
     * \endif
     */
    public NET_TIME					stuLeaveTimeRealUTC = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  Associated record number
     * \else
     *  关联记录编号
     * \endif
     */
    public int					nLinkID;

}