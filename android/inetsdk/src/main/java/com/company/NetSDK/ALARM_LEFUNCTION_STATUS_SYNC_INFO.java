package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * The app interface displays some specific state change events of the device (corresponding to SDK_ALARM_LEFUNCTION_STATUS_SYNC)
 * \else
 * App界面显示设备某些特定的状态变化事件 (对应 SDK_ALARM_LEFUNCTION_STATUS_SYNC)
 * \endif
 */
public class ALARM_LEFUNCTION_STATUS_SYNC_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * 0: pulse
     * \else
     * 事件动作 0:脉冲
     * \endif
     */
    public int nAction;

    /**
     * \if ENGLISH_LANG
     * Channel ID
     * \else
     * 通道号
     * \endif
     */
    public int nChannel;

    /**
     * \if ENGLISH_LANG
     * Event name
     * \else
     * 事件名称
     * \endif
     */
    public byte szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Time of event
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX stuUTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Function field description, EM_FUNCTION_TYPE
     * \else
     * 功能字段描述, EM_FUNCTION_TYPE
     * \endif
     */
    public int emFunction;

    /**
     * \if ENGLISH_LANG
     * Whether the function is turned on. True means the function is on. False means the function is off
     * \else
     * 功能是否打开 true表示功能开 false表示功能关
     * \endif
     */
    public boolean bStatus;

}
