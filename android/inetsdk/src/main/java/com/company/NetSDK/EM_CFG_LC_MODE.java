package com.company.NetSDK;

import java.io.Serializable;



/**
 * \if ENGLISH_LANG
 * light type
 * \else
 * 灯类型
 * \endif
 */
public class EM_CFG_LC_MODE implements Serializable {
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
    public static final int EM_CFG_LC_MODE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Manual
     * \else
     * 手动
     * \endif
     */
    public static final int EM_CFG_LC_MODE_MANUAL = 1;

    /**
     * \if ENGLISH_LANG
     * Zoom prio
     * \else
     * 倍率优先
     * \endif
     */
    public static final int EM_CFG_LC_MODE_ZOOMPRIO = 2;

    /**
     * \if ENGLISH_LANG
     * Timing(Abandoned)
     * \else
     * 定时（废弃）
     * \endif
     */
    public static final int EM_CFG_LC_MODE_TIMING = 3;

    /**
     * \if ENGLISH_LANG
     * Auto
     * \else
     * 自动
     * \endif
     */
    public static final int EM_CFG_LC_MODE_AUTO = 4;

    /**
     * \if ENGLISH_LANG
     * Off
     * \else
     * 关闭灯光
     * \endif
     */
    public static final int EM_CFG_LC_MODE_OFF = 5;

    /**
     * \if ENGLISH_LANG
     * Exclusive manual(Abandoned)
     * \else
     * 支持多种灯光
     * \endif
     */
    public static final int EM_CFG_LC_MODE_EXCLUSIVEMANUAL = 6;

    /**
     * \if ENGLISH_LANG
     * Smart(Abandoned)
     * \else
     * 智能灯光
     * \endif
     */
    public static final int EM_CFG_LC_MODE_SMARTLIGHT = 7;

    /**
     * \if ENGLISH_LANG
     * Linking(Abandoned)
     * \else
     * 事件联动
     * \endif
     */
    public static final int EM_CFG_LC_MODE_LINKING = 8;

    /**
     * \if ENGLISH_LANG
     * DuskToDawn
     * \else
     * 光敏
     * \endif
     */
    public static final int EM_CFG_LC_MODE_DUSKTODAWN = 9;

    /**
     * \if ENGLISH_LANG
     * ForceOn
     * \else
     * 强制打开灯光
     * \endif
     */
    public static final int EM_CFG_LC_MODE_FORCEON = 10;



}
