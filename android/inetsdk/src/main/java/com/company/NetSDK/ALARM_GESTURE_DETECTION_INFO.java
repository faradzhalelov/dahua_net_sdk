package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Event type SDK_ALARM_GESTURE_DETECTION (Gesture detection event) corresponding data block description information
 * \else
 * 事件类型 SDK_ALARM_GESTURE_DETECTION(手势检测事件) 对应的数据块描述信息
 * \endif
 */
public class ALARM_GESTURE_DETECTION_INFO implements Serializable {
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
     *  0: pulse
     * \else
     *  0:脉冲,1:开始, 2:停止
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  Event name	
     * \else
     *  事件名称	
     * \endif
     */
    public byte					szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Category of intelligent events
     * \else
     *  智能事件所属大类
     * \endif
     */
    public byte					szClass[] = new byte[16];

    /**
     * \if ENGLISH_LANG
     *  Relative event timestamp,int:ms
     * \else
     *  相对事件时间戳,(单位是毫秒)
     * \endif
     */
    public double					dbPTS;

    /**
     * \if ENGLISH_LANG
     *  Time of occurrence
     * \else
     *  事件发生的时间
     * \endif
     */
    public NET_TIME_EX					stuUTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  Event time milliseconds
     * \else
     *  事件时间毫秒数
     * \endif
     */
    public int					nUTCMS;

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
     *  Gesture information
     * \else
     *  手势信息
     * \endif
     */
    public NET_GESTURE_INFO					stuGestureInfo = new NET_GESTURE_INFO();

    /**
     * \if ENGLISH_LANG
     *  GroupID Event group ID, which is the same in the process of capturing the same object
     * \else
     *  GroupID事件组ID，同一物体抓拍过程内GroupID相同
     * \endif
     */
    public int					nGroupID;

    /**
     * \if ENGLISH_LANG
     *  CountInGroup Number of snapshots in an event group
     * \else
     *  CountInGroup一个事件组内的抓拍张数
     * \endif
     */
    public int					nCountInGroup;

    /**
     * \if ENGLISH_LANG
     *  IndexInGroup Capture sequence number in an event group
     * \else
     *  IndexInGroup一个事件组内的抓拍序号，从1开始
     * \endif
     */
    public int					nIndexInGroup;

}
