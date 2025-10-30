package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Light info
 * \else
 * 灯光信息
 * \endif
 */
public class NET_LIGHT_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * percent of brightness
     * \else
     * 亮度百分比
     * \endif
     */
    public int        nLight;

    /**
     * \if ENGLISH_LANG
     * Normalization angle
     * \else
     * 激光灯角度归一化值
     * \endif
     */
    public int         nAngle;

}
