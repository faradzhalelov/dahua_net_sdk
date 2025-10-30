package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Configuration information related to overspeed alarm
 * \else
 * @brief 超速报警相关配置信息
 * \endif
 */
public class NET_CFG_OVER_SPEED_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Speed alarm threshold, in m/s
     * \else
     *  速度报警阈值,单位m/s
     * \endif
     */
    public double					dbSpeedLimit;

    /**
     * \if ENGLISH_LANG
     *  Acceleration alarm threshold, in m/s ^ 2
     * \else
     *  加速度报警阈值，单位m/s^2
     * \endif
     */
    public double					dbAccelerationThreshold;

    /**
     * \if ENGLISH_LANG
     *  Enable overspeed alarm
     * \else
     *  超速报警使能
     * \endif
     */
    public boolean					bEnabled;

}