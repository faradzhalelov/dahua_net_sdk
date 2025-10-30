package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Measure temper
 * \else
 * @brief 测温信息
 * \endif
 */
public class NET_CUSTOM_MEASURE_TEMPER implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The temperature of the left side of the vehicle
     * \else
     *  车辆左侧温度值
     * \endif
     */
    public float					fLeft;

    /**
     * \if ENGLISH_LANG
     *  The temperature of the right side of the vehicle
     * \else
     *  车辆右侧温度值
     * \endif
     */
    public float					fRight;

    /**
     * \if ENGLISH_LANG
     *  Vehicle engine position temperature value
     * \else
     *  车辆发动机位置温度值 (车头)
     * \endif
     */
    public float					fHead;

    /**
     * \if ENGLISH_LANG
     *  Temperature unit
     * \else
     *  温度单位
     * \endif
     */
    public int					emUnit;

}
