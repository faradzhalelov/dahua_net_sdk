package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Intelli Module Offline Event(corresponding to SDK_ALARM_INTELLI_MODULE_OFFLINE)
 * \else
 * @brief 智能模块断线事件(对应 SDK_ALARM_INTELLI_MODULE_OFFLINE)
 * \endif
 */
public class NET_ALARM_INTELLI_MODULE_OFFLINE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Channel ID
     * \else
     * 通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  Event Type 0: Pulse, 1: Start, 2: Stop
     * \else
     * 事件类型 0:脉冲,1:开始, 2:停止
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  Time of event
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX					stuUTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  It consists of module type and chip ID. The module chip ID is the slot number.
     * \else
     * 由模块类型和芯片ID组成，模块芯片ID即槽位号
     * \endif
     */
    public byte					szChip[] = new byte[16];

}