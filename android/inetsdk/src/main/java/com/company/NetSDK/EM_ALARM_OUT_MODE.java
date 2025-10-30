package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Out Mode
 * \else
 * 报警输出模式
 * \endif
 */
public class EM_ALARM_OUT_MODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int EM_ALARM_OUT_MODE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * Auto Alarm
     * \else
     * 自动
     * \endif
     */
    public static final int EM_ALARM_OUT_MODE_AUTO = 0;

    /**
     * \if ENGLISH_LANG
     * Forced Alarm
     * \else
     * 强制报警
     * \endif
     */
    public static final int EM_ALARM_OUT_MODE_FORCED = 1;

    /**
     * \if ENGLISH_LANG
     * Close Alarm
     * \else
     * 关闭报警
     * \endif
     */
    public static final int EM_ALARM_OUT_MODE_CLOSE = 2;
}
