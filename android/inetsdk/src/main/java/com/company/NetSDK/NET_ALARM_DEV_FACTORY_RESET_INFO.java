package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Event type SDK_ALARM_DEV_FACTORY_RESET (Device factory reset event)Indicates data block description
 * \else
 * @brief 事件类型 SDK_ALARM_DEV_FACTORY_RESET (设备恢复出厂设置事件)对应的数据块描述信息
 * \endif
 */
public class NET_ALARM_DEV_FACTORY_RESET_INFO implements Serializable {
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
     *  0: pulse,1: start, 2: stop
     * \else
     *  0:脉冲,1:开始, 2:停止
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  Extend the protocol field
     * \else
     *  事件公共扩展字段结构体
     * \endif
     */
    public NET_EVENT_INFO_EXTEND					stuEventInfoEx = new NET_EVENT_INFO_EXTEND();

    /**
     * \if ENGLISH_LANG
     *  Time when the event occurred
     * \else
     *  事件发生的时间
     * \endif
     */
    public NET_TIME_EX					stuUTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  Restore factory type, 0: unknown, 1: hard recovery, 2: soft recovery, 3: reset system without deleting user data
     * \else
     *  恢复出厂类型，0:未知, 1:硬恢复, 2:软恢复, 3: 重置系统, 但不删除用户数据
     * \endif
     */
    public int					nType;

}