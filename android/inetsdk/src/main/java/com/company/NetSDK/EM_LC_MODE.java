package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Supported normal event
 * \else
 * 支持的模式
 * \endif
 */
public class EM_LC_MODE implements Serializable {
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
    public static final int EM_LC_MODE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Manual
     * \else
     * 手动
     * \endif
     */
    public static final int EM_LC_MODE_MANUAL = 1;

    /**
     * \if ENGLISH_LANG
     * Zoom prio
     * \else
     * 倍率优先
     * \endif
     */
    public static final int EM_LC_MODE_ZOOMPRIO = 2;

    /**
     * \if ENGLISH_LANG
     * Timing
     * \else
     * 定时
     * \endif
     */
    public static final int EM_LC_MODE_TIMING = 3;

    /**
     * \if ENGLISH_LANG
     * Auto
     * \else
     * 自动
     * \endif
     */
    public static final int EM_LC_MODE_AUTO = 4;

    /**
     * \if ENGLISH_LANG
     * Off
     * \else
     * 关闭灯光
     * \endif
     */
    public static final int EM_LC_MODE_OFF = 5;

    /**
     * \if ENGLISH_LANG
     * Exclusive manual
     * \else
     * 支持多种灯光
     * \endif
     */
    public static final int EM_LC_MODE_EXCLUSIVEMANUAL = 6;

    /**
     * \if ENGLISH_LANG
     * Smart
     * \else
     * 智能灯光
     * \endif
     */
    public static final int EM_LC_MODE_SMARTLIGHT = 7;

    /**
     * \if ENGLISH_LANG
     * Linking
     * \else
     * 事件联动
     * \endif
     */
    public static final int EM_LC_MODE_LINKING = 8;

    /**
     * \if ENGLISH_LANG
     * Dusk to down
     * \else
     * 光敏
     * \endif
     */
    public static final int EM_LC_MODE_DUSKTODAWN = 9;

}
