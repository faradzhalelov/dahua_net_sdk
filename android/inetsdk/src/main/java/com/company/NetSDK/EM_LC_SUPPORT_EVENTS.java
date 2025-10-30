package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Supported normal event
 * \else
 * 支持灯光联动的非智能事件
 * \endif
 */
public class EM_LC_SUPPORT_EVENTS implements Serializable{

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
    public static final int EM_LC_SUPPORT_EVENTS_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * motion detect
     * \else
     * 动态检测
     * \endif
     */
    public static final int EM_LC_SUPPORT_EVENTS_MOTIONDETECT = 1;

    /**
     * \if ENGLISH_LANG
     * mask
     * \else
     * 遮挡
     * \endif
     */
    public static final int EM_LC_SUPPORT_EVENTS_MASK = 2;

    /**
     * \if ENGLISH_LANG
     * alarm
     * \else
     * 报警
     * \endif
     */
    public static final int EM_LC_SUPPORT_EVENTS_ALARM = 3;

    /**
     * \if ENGLISH_LANG
     * all
     * \else
     * 所有事件
     * \endif
     */
    public static final int EM_LC_SUPPORT_EVENTS_ALL = 4;
}
