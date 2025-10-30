package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Calibration source information
 * \else
 * 校准源信息
 * \endif
 */
public class NET_REGULATOR_INFO implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Calibration source distance, CM
     * \else
     * 校准源距离, 单位cm
     * \endif
     */
    public int 						nDistance;

    /**
     * \if ENGLISH_LANG
     * Calibration source temperature, accuracy 0.1, magnification 10 times
     * \else
     * 校准源温度, 精度0.1, 放大10倍
     * \endif
     */
    public int 						nTemperature;

    /**
     * \if ENGLISH_LANG
     * 校准源矩形位置取值0-8191
     * \else
     * 预置点编号, 对于无预置点设备为0
     * \endif
     */
    public NET_RECT 						stRect = new NET_RECT();

    /**
     * \if ENGLISH_LANG
     * Height of calibration source in CM
     * \else
     * 校准源高度, 单位cm
     * \endif
     */
    public int 						nHeight;

    /**
     * \if ENGLISH_LANG
     * Temperature deviation value, accuracy 0.01, magnification 100 times
     * \else
     * 温度偏差值, 精度0.01, 放大100倍
     * \endif
     */
    public int 						nDiffTemperature;

    /**
     * \if ENGLISH_LANG
     * emissivity, accuracy 0.01, magnification 100 times,50 ~ 100
     * \else
     *  黑体辐射率，精度0.01，放大100倍，范围50-100
     * \endif
     */
    public int 						nEmissivity;

}
