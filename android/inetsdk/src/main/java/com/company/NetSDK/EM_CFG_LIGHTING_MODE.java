package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The light pattern
 * \else
 * 灯光模式
 * \endif
 */
public class EM_CFG_LIGHTING_MODE implements Serializable {
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
    public static final int EM_CFG_LIGHTING_MODE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Manual
     * \else
     * 手动
     * \endif
     */
    public static final int EM_CFG_LIGHTING_MODE_MANUAL = 1;

    /**
     * \if ENGLISH_LANG
     * Zoom ratio is preferred
     * \else
     * 倍率优先
     * \endif
     */
    public static final int EM_CFG_LIGHTING_MODE_ZOOMPRIO = 2;

    /**
     * \if ENGLISH_LANG
     * Timing
     * \else
     * 定时模式
     * \endif
     */
    public static final int EM_CFG_LIGHTING_MODE_TIMING = 3;

    /**
     * \if ENGLISH_LANG
     * Auto
     * \else
     * 自动
     * \endif
     */
    public static final int EM_CFG_LIGHTING_MODE_AUTO = 4;

    /**
     * \if ENGLISH_LANG
     * Off
     * \else
     * 关闭模式
     * \endif
     */
    public static final int EM_CFG_LIGHTING_MODE_OFF = 5;

    /**
     * \if ENGLISH_LANG
     * SmartLight
     * \else
     * 智能灯光模式(球机使用)
     * \endif
     */
    public static final int EM_CFG_LIGHTING_MODE_SMARTLIGHT = 6;

    /**
     * \if ENGLISH_LANG
     * ExclusiveManual
     * \else
     * 支持多种灯光
     * \endif
     */
    public static final int EM_CFG_LIGHTING_MODE_EXCLUSIVEMANUAL = 7;

    /**
     * \if ENGLISH_LANG
     * ForceOn
     * \else
     * 强制打开灯光
     * \endif
     */
    public static final int EM_CFG_LIGHTING_MODE_FORCEON = 8;
}
