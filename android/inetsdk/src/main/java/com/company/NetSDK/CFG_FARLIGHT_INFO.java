package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * High beam information
 * \else
 * 远光灯信息
 * \endif
 */
public class CFG_FARLIGHT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Whether enabled, TRUE enabled, FALSE does not enable
     * \else
     * 是否使能，TRUE使能，FALSE不使能
     * \endif
     */
    public boolean                bEnable;

    /**
     * \if ENGLISH_LANG
     * Light brightness percentage (0~100)
     * \else
     * 灯光亮度百分比值(0~100)
     * \endif
     */
    public int               dwLightPercent;

    /**
     * \if ENGLISH_LANG
     * Lighting angle in percentage (0~100)
     * \else
     * 灯光角度百分比值(0~100)
     * \endif
     */
    public int               dwAnglePercent;
}
