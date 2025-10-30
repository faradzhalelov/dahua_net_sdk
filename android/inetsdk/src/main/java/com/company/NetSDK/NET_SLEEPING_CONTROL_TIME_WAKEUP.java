package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Information about timed wake-up function for low power devices
 * \else
 * @brief 低功耗设备定时唤醒功能信息
 * \endif
 */
public class NET_SLEEPING_CONTROL_TIME_WAKEUP implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Enable timed wake-up
     * \else
     *  定时唤醒使能
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  The mode of timed wake-up,{@link EM_TIME_WAKEUP_MODE}
     * \else
     *  定时唤醒的方式,{@link EM_TIME_WAKEUP_MODE}
     * \endif
     */
    public int					emMode;

    /**
     * \if ENGLISH_LANG
     *  Information about sleep in time section. Only effective when Mode is TimeSection
     * \else
     *  按时间段休眠信息, 仅当Mode为TimeSection时生效
     * \endif
     */
    public NET_TIME_WAKEUP_TIME_SECTION					stuTimeSection = new NET_TIME_WAKEUP_TIME_SECTION();

    /**
     * \if ENGLISH_LANG
     *  Reserved bytes
     * \else
     *  保留字节
     * \endif
     */
    public byte					szResvered[] = new byte[128];

}