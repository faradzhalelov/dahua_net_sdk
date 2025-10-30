package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * RainBrush voltage enable mode type
 * \else
 * 雨刷使能电平模式
 * \endif
 */
public class EM_CFG_RAINBRUSHMODE_ENABLEMODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_CFG_RAINBRUSHMODE_ENABLEMODE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * low voltage is valid(close always)
     * \else
     * 低电平有效（常闭）
     * \endif
     */
    public static final int EM_CFG_RAINBRUSHMODE_ENABLEMODE_LOW = 1;

    /**
     * \if ENGLISH_LANG
     * high voltage is valid(open always)
     * \else
     * 高电平有效（常开）
     * \endif
     */
    public static final int EM_CFG_RAINBRUSHMODE_ENABLEMODE_HIGH = 2;
}
