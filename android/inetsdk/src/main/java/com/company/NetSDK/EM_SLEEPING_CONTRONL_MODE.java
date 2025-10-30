package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief SleepControl mode
 * \else
 * @brief 休眠策略配置的低功耗模式
 * \endif
 */
public class EM_SLEEPING_CONTRONL_MODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  unknown
     * \endif
     */
    public static final int					NET_EM_SLEEPING_CONTRONL_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Timing
     * \else
     *  Timing: 定时休眠
     * \endif
     */
    public static final int					NET_EM_SLEEPING_CONTRONL_TIMING = 1;

    /**
     * \if ENGLISH_LANG
     *  ShortMessage
     * \else
     *  ShortMessage:短信休眠、唤醒模式
     * \endif
     */
    public static final int					NET_EM_SLEEPING_CONTRONL_SHORTMESSAGE = 2;

    /**
     * \if ENGLISH_LANG
     *  TimePeriod
     * \else
     *  TimePeriod:按时间段休眠
     * \endif
     */
    public static final int					NET_EM_SLEEPING_CONTRONL_TIMEPERIOD = 3;

    /**
     * \if ENGLISH_LANG
     *  MoveCtrl
     * \else
     *  MoveCtrl:运动控制模式    
     * \endif
     */
    public static final int					NET_EM_SLEEPING_CONTRONL_MOVECTRL = 4;

    /**
     * \if ENGLISH_LANG
     *  AutoCtrl
     * \else
     *  AutoCtrl:常供电模式
     * \endif
     */
    public static final int					NET_EM_SLEEPING_CONTRONL_AUTOCTRL = 5;

    /**
     * \if ENGLISH_LANG
     *  DormancyTimiWkUp
     * \else
     *  DormancyTimiWkUp":休眠、定时唤醒模式
     * \endif
     */
    public static final int					NET_EM_SLEEPING_CONTRONL_DORMANCYTIMIWKUP = 6;

    /**
     * \if ENGLISH_LANG
     *  LowPowerLive
     * \else
     *  LowPowerLive:低功耗在线模式，仅调整部分参数以降低功耗
     * \endif
     */
    public static final int					NET_EM_SLEEPING_CONTRONL_LOWPOWERLIVE = 7;

}