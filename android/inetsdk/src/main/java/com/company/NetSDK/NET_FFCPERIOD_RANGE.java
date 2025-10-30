package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * automatic flat field correction period range
 * \else
 * 平场自动校正周期范围
 * \endif
 */
public class NET_FFCPERIOD_RANGE implements Serializable {

    /**
     * \if ENGLISH_LANG
     * Max value(NTSC)
     * \else
     * 最大值(NTSC制式)
     * \endif
     */
    public int nMaxN;

    /**
     * \if ENGLISH_LANG
     * Max value(PAL)
     * \else
     * 最大值(PAL制式)
     * \endif
     */
    public int nMaxP;

    /**
     * \if ENGLISH_LANG
     * Min value
     * \else
     * 最小值
     * \endif
     */
    public int nMin;

    /**
     * \if ENGLISH_LANG
     * Step
     * \else
     * 步长
     * \endif
     */
    public int nStep;

}
