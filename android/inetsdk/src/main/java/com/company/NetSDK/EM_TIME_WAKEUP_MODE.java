package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Timed wake-up method
 * \else
 * @brief 定时唤醒的方式
 * \endif
 */
public class EM_TIME_WAKEUP_MODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					NET_EM_TIME_WAKEUP_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Wake up by time period
     * \else
     *  按时间段唤醒
     * \endif
     */
    public static final int					NET_EM_TIME_WAKEUP_SEACTION = 1;

    /**
     * \if ENGLISH_LANG
     *  Wake up at time intervals
     * \else
     *  按时间间隔唤醒
     * \endif
     */
    public static final int					NET_EM_TIME_WAKEUP_INTERVAL = 2;

    /**
     * \if ENGLISH_LANG
     *  Wake up according to time points
     * \else
     *  按照时间点唤醒
     * \endif
     */
    public static final int					NET_EM_TIME_WAKEUP_POINT = 3;

}