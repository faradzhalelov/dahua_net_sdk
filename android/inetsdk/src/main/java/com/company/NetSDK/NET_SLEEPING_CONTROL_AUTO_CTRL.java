package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Automatic control information
 * \else
 * @brief 自动控制信息
 * \endif
 */
public class NET_SLEEPING_CONTROL_AUTO_CTRL implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Low power sleep switch
     * \else
     *  低电休眠开关
     * \endif
     */
    public boolean					bPowerSaveEnable;

    /**
     * \if ENGLISH_LANG
     *  The threshold for the percentage of battery that automatically enters sleep mode, with a value range of [1100]
     * \else
     *  自动进入休眠模式的电量百分比阈值，取值范围[1,100]
     * \endif
     */
    public int					nSleepElectricity;

}