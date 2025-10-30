package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Sleep information by time period
 * \else
 * @brief 按时间段休眠信息
 * \endif
 */
public class NET_TIME_WAKEUP_TIME_SECTION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  7 days per week, 6 time periods per day
     * \else
     *  每周7天，每天6个时间段
     * \endif
     */
    public NET_TSECT					stuAwakeSection[][] = new NET_TSECT[7][6];

    /**
     * \if ENGLISH_LANG
     *  When in sleep mode by time section, it supports scheduled sleep within the waking time period. 
     * \else
     *  处于按时间段休眠方式下时，可以支持唤醒时间段内的定时休眠。此字段表示定时休眠的时间间隔。单位为分钟。仅当Mode为" TimeSection "时生效
     * \endif
     */
    public int					nWakeUpInterval;

    /**
     * \if ENGLISH_LANG
     *  Reserved bytes
     * \else
     *  保留字节
     * \endif
     */
    public byte					szResvered[] = new byte[1020];

    public NET_TIME_WAKEUP_TIME_SECTION() {
        for(int i = 0; i < 7; i ++){
            for(int j = 0; j < 6; j ++){
                this.stuAwakeSection[i][j] = new NET_TSECT();
            }
        }
    }
}