package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Maximum brightness adjustment mode
 * \else
 * @brief 亮度上限调节模式
 * \endif
 */
public class EM_LC_BRIGHTNESSUPPERLIMIT_MODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * UNKNOWN
     * \else
     * 未知
     * \endif
     */
    public static final int					EM_LC_BRIGHTNESSUPPERLIMIT_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * MANUAL
     * \else
     * 手动
     * \endif
     */
    public static final int					EM_LC_BRIGHTNESSUPPERLIMIT_MANUAL = 1;

    /**
     * \if ENGLISH_LANG
     * AUTO
     * \else
     * 自动
     * \endif
     */
    public static final int					EM_LC_BRIGHTNESSUPPERLIMIT_AUTO = 2;

    /**
     * \if ENGLISH_LANG
     * OFF
     * \else
     * 关闭
     * \endif
     */
    public static final int					EM_LC_BRIGHTNESSUPPERLIMIT_OFF = 3;

}