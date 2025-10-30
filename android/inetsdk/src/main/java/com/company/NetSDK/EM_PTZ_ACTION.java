package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Ptz action
 * \else
 * 云台动作
 * \endif
 */
public class EM_PTZ_ACTION implements Serializable {
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
    public static final int EM_PTZ_ACTION_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * scan
     * \else
     * 扫描
     * \endif
     */
    public static final int  EM_PTZ_ACTION_SCAN = 1;

    /**
     * \if ENGLISH_LANG
     * preset
     * \else
     * 预置点
     * \endif
     */
    public static final int  EM_PTZ_ACTION_PRESET = 2;

    /**
     * \if ENGLISH_LANG
     * pattern
     * \else
     * 巡迹
     * \endif
     */
    public static final int  EM_PTZ_ACTION_PATTERN = 3;

    /**
     * \if ENGLISH_LANG
     * tour
     * \else
     * 巡航
     * \endif
     */
    public static final int  EM_PTZ_ACTION_TOUR = 4;
}
