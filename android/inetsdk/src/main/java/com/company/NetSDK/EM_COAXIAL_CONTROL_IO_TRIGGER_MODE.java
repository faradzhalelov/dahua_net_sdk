package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * coaxial IO control tragger mode
 * \else
 * 同轴IO触发方式
 * \endif
 */
public class EM_COAXIAL_CONTROL_IO_TRIGGER_MODE implements Serializable {
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
    public static final int EM_COAXIAL_CONTROL_IO_TRIGGER_MODE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * lingage tragger
     * \else
     * 联动触发
     * \endif
     */
    public static final int EM_COAXIAL_CONTROL_IO_TRIGGER_MODE_LINKAGE_TRIGGER = 1;

    /**
     * \if ENGLISH_LANG
     * manual tragger
     * \else
     * 手动触发
     * \endif
     */
    public static final int EM_COAXIAL_CONTROL_IO_TRIGGER_MODE_MANUAL_TRIGGER = 2;
}
