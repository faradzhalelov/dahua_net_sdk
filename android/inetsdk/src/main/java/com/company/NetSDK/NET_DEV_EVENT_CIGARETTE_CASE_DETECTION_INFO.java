package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Description of the data block corresponding to the event EVENT_IVS_CIGARETTE_CASE_DETECTION (Cigarette case detection event)
 * \else
 * @brief 事件类型 EVENT_IVS_CIGARETTE_CASE_DETECTION (烟盒检测事件)对应的数据块描述信息
 * \endif
 */
public class NET_DEV_EVENT_CIGARETTE_CASE_DETECTION_INFO implements Serializable {
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
     *  Event action, 0: Pulse, 1: Start, 2: Stop
     * \else
     *  0:脉冲,1:开始, 2:停止
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  Event public extension field structure
     * \else
     *  扩展协议字段
     * \endif
     */
    public NET_EVENT_INFO_EXTEND					stuEventInfoEx = new NET_EVENT_INFO_EXTEND();

    /**
     * \if ENGLISH_LANG
     *  Time for the event occurred
     * \else
     *  事件发生的时间
     * \endif
     */
    public NET_TIME_EX					stuUTC = new NET_TIME_EX();

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
     *  Timestamp (in milliseconds)
     * \else
     *  时间戳(单位是毫秒)
     * \endif
     */
    public double					PTS;

    /**
     * \if ENGLISH_LANG
     *  Event class
     * \else
     *  智能事件所属大类
     * \endif
     */
    public int					emClassType;

    /**
     * \if ENGLISH_LANG
     *  Time of occurrence in milliseconds
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
     *  group ID, which is the same in the process of capturing the same object
     * \else
     *  事件组ID，一次检测的多个nGroupID相同
     * \endif
     */
    public int					nGroupID;

    /**
     * \if ENGLISH_LANG
     *  CountInGroup Number of snapshots in an event group
     * \else
     *  一个事件组内的抓拍张数,一次检测的多个nCountInGroup相同
     * \endif
     */
    public int					nCountInGroup;

    /**
     * \if ENGLISH_LANG
     *  IndexInGroup Capture sequence number in an event group,Start with 1
     * \else
     *  一个事件组内的抓拍序号，从1开始
     * \endif
     */
    public int					nIndexInGroup;

    /**
     * \if ENGLISH_LANG
     *  Number of Cigarette Case
     * \else
     *  销售香烟信息数量
     * \endif
     */
    public int					nCigaretteCaseNum;

    /**
     * \if ENGLISH_LANG
     *  Cigarette Case Information
     * \else
     *  销售香烟信息
     * \endif
     */
    public NET_CIGARETTE_CASE_INFO					stuCigaretteCaseInfo[] = new NET_CIGARETTE_CASE_INFO[50];

    public NET_DEV_EVENT_CIGARETTE_CASE_DETECTION_INFO() {
        for(int i = 0; i < 50; i ++){
            stuCigaretteCaseInfo[i] = new NET_CIGARETTE_CASE_INFO();
        }
    }
}