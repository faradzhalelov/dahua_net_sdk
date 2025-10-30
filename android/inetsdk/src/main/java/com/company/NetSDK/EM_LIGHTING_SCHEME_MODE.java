package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Lighting scheme mode
 * \else
 * 补光灯方案
 * \endif
 */
public class EM_LIGHTING_SCHEME_MODE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知类型
     * \endif
     */
    public static final int EM_LIGHTING_SCHEME_MODE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Mix
     * \else
     * 混光方案
     * \endif
     */
    public static final int EM_LIGHTING_SCHEME_MODE_MIX = 1;

    /**
     * \if ENGLISH_LANG
     * White
     * \else
     * 白光方案
     * \endif
     */
    public static final int EM_LIGHTING_SCHEME_MODE_WHITE = 2;

    /**
     * \if ENGLISH_LANG
     * Normal
     * \else
     * 不支持柔光双色方案
     * \endif
     */
    public static final int EM_LIGHTING_SCHEME_MODE_NORMAL = 3;

    /**
     * \if ENGLISH_LANG
     * Infrared
     * \else
     * 红外补光方案
     * \endif
     */
    public static final int EM_LIGHTING_SCHEME_MODE_INFRARED = 4;

    /**
     * \if ENGLISH_LANG
     * Aimode
     * \else
     * 智能补光方案
     * \endif
     */
    public static final int EM_LIGHTING_SCHEME_MODE_AIMODE = 5;


    /**
     * \if ENGLISH_LANG
     * Off
     * \else
     * 关闭夜视补光方案
     * \endif
     */
    public static final int EM_LIGHTING_SCHEME_MODE_OFF = 6;

}
