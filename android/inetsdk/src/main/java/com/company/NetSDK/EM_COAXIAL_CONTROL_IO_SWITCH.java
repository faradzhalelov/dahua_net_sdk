package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * coaxial IO control switch
 * \else
 * 同轴IO控制开关
 * \endif
 */
public class EM_COAXIAL_CONTROL_IO_SWITCH implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknow
     * \else
     * 未知
     * \endif
     */
    public static final int EM_COAXIAL_CONTROL_IO_SWITCH_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * open
     * \else
     * 开
     * \endif
     */
    public static final int EM_COAXIAL_CONTROL_IO_SWITCH_OPEN = 1;

    /**
     * \if ENGLISH_LANG
     * close
     * \else
     * 关
     * \endif
     */
    public static final int EM_COAXIAL_CONTROL_IO_SWITCH_CLOSE = 2;
}
