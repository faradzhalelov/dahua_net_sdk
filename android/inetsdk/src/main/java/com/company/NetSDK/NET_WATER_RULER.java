package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Water ruler information
 * \else
 * 水位尺
 * \endif
 */
public class NET_WATER_RULER implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * The color of water ruler
     * \else
     * 水位尺颜色
     * \endif
     */
    public NET_EM_WATER_RULER_COLOR					emRulerColor;

    /**
     * \if ENGLISH_LANG
     * The ID of water ruler
     * \else
     * 水位尺编号
     * \endif
     */
    public char[]					szRulerNum = new char[128];

    /**
     * \if ENGLISH_LANG
     * Water level(if there has splice ruler, it equal to base value plus current value, Unit：m)
     * \else
     * 水位值（对于有拼接的情况，该值为标定的基准值加上当前刻度值，单位：米）
     * \endif
     */
    public float					fWaterLevel;

}
