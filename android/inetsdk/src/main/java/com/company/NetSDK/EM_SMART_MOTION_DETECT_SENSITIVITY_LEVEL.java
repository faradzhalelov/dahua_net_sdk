package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Sensitivity level of intelligent dynamic inspection
 * \else
 * 智能动检敏感等级
 * \endif
 */
public class EM_SMART_MOTION_DETECT_SENSITIVITY_LEVEL implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_SMART_MOTION_DETECT_SENSITIVITY_LEVEL_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Low
     * \else
     * 低
     * \endif
     */
    public static final int EM_SMART_MOTION_DETECT_SENSITIVITY_LEVEL_LOW = 1;

    /**
     * \if ENGLISH_LANG
     * Middle
     * \else
     * 中
     * \endif
     */
    public static final int EM_SMART_MOTION_DETECT_SENSITIVITY_LEVEL_MIDDLE = 2;

    /**
     * \if ENGLISH_LANG
     * High
     * \else
     * 高
     * \endif
     */
    public static final int EM_SMART_MOTION_DETECT_SENSITIVITY_LEVEL_HIGH = 3;
}
