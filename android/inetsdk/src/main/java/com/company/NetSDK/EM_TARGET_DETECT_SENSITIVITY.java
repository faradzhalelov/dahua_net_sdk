package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  Target detection sensitivity
 * \else
 * 目标检测敏感度
 * \endif
 */
public class EM_TARGET_DETECT_SENSITIVITY  implements Serializable {
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
    public static final int EM_TARGET_DETECT_SENSITIVITY_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * Off
     * \else
     * 关
     * \endif
     */
    public static final int EM_TARGET_DETECT_SENSITIVITY_OFF = 0;

    /**
     * \if ENGLISH_LANG
     * Low
     * \else
     * 低
     * \endif
     */
    public static final int EM_TARGET_DETECT_SENSITIVITY_LOW = 1;

    /**
     * \if ENGLISH_LANG
     * Medium
     * \else
     * 中
     * \endif
     */
    public static final int EM_TARGET_DETECT_SENSITIVITY_MEDIUM = 2;

    /**
     * \if ENGLISH_LANG
     * High
     * \else
     * 高
     * \endif
     */
    public static final int EM_TARGET_DETECT_SENSITIVITY_HIGH = 3;
}
