package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * RainBrush working mode type
 * \else
 * 雨刷工作模式
 * \endif
 */
public class EM_CFG_RAINBRUSHMODE_MODE implements Serializable {
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
    public static final int EM_CFG_RAINBRUSHMODE_MODE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * manual
     * \else
     * 手动模式
     * \endif
     */
    public static final int EM_CFG_RAINBRUSHMODE_MODE_MANUAL = 1;

    /**
     * \if ENGLISH_LANG
     * timing
     * \else
     * 定时模式
     * \endif
     */
    public static final int EM_CFG_RAINBRUSHMODE_MODE_TIMING = 2;

    /**
     * \if ENGLISH_LANG
     * Auto
     * \else
     * 自动感应模式
     * \endif
     */
    public static final int EM_CFG_RAINBRUSHMODE_MODE_AUTO = 3;
}
