package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * thermal imaging auto gain setup
 * \else
 * 热成像自动增益设置
 * \endif
 */
public class CFG_THERMO_AUTO_GAIN implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * when temperature exceeds this set value, auto switch to Abnormal temperature mode
     * \else
     * 温度超过此设定值时，自动切换到温度异常模式
     * \endif
     */
    public int nLowToHigh;

    /**
     * \if ENGLISH_LANG
     * ROI percentage 0~100 when switch from low to Abnormal temperature
     * \else
     * 由温度异常切换到温度异常时的ROI 百分比0~100
     * \endif
     */
    public int nLHROI;

    /**
     * \if ENGLISH_LANG
     * when temperature lower to this set value, auto switch to Abnormal temperature mode
     * \else
     * 温度下降到此设定值时，自动切换到温度异常模式
     * \endif
     */
    public int nHighToLow;

    /**
     * \if ENGLISH_LANG
     * ROI percentage 0~100 when switch from high to Abnormal temperature
     * \else
     * 由温度异常切换到温度异常时的ROI 百分比0~100
     * \endif
     */
    public int nHLROI;
}
