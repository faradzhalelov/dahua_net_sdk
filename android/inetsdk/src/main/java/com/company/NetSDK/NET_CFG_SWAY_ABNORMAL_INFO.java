package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Configuration information related to shake detection
 * \else
 * @brief 晃动检测相关配置信息
 * \endif
 */
public class NET_CFG_SWAY_ABNORMAL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Shake detection enable item
     * \else
     *  晃动检测使能项
     * \endif
     */
    public boolean					bEnabled;

    /**
     * \if ENGLISH_LANG
     *  sensitivity
     * \else
     *  灵敏度
     * \endif
     */
    public int					nSensitivity;

    /**
     * \if ENGLISH_LANG
     *  Left and right shake detection threshold, unit m/s ^ 2
     * \else
     *  左右晃动检测阈值,单位m/s^2
     * \endif
     */
    public double					dbLeftAndRightThreshold;

    /**
     * \if ENGLISH_LANG
     *  Front and rear shake detection threshold, in m/s ^ 2
     * \else
     *  前后晃动检测阈值,单位m/s^2
     * \endif
     */
    public double					dbFrontAndBackThreshold;

    /**
     * \if ENGLISH_LANG
     *  Left upper and lower shake detection threshold, unit: m/s ^ 2
     * \else
     *  左上下晃动检测阈值,单位m/s^2
     * \endif
     */
    public double					dbUpAndDownThreshold;

}