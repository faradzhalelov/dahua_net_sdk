package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * day or night type
 * \else
 * 日夜切换模式
 * \endif
 */
public class NET_EM_DAYNIGHT_TYPE implements Serializable {

    /**
     *
     */
    private static final long               serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * always color
     * \else
     * 总是彩色
     * \endif
     */
    public static final int                 NET_EM_DAYNIGHT_COLOR = 0;

    /**
     * \if ENGLISH_LANG
     * according to the brightness auromatically switches
     * \else
     * 根据亮度自动切换
     * \endif
     */
    public static final int                 NET_EM_DAYNIGHT_AUTO = 1;

    /**
     * \if ENGLISH_LANG
     * always black and white
     * \else
     * 总是黑白
     * \endif
     */
    public static final int                 NET_EM_DAYNIGHT_WHITEBLACK = 2;

}
