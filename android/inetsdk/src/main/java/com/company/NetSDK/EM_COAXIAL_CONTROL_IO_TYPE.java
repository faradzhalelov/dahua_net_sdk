package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * coaxial IO control type
 * \else
 * 同轴IO控制类型
 * \endif
 */
public class EM_COAXIAL_CONTROL_IO_TYPE implements Serializable {
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
    public static final int EM_COAXIAL_CONTROL_IO_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * white light
     * \else
     * 白光灯
     * \endif
     */
    public static final int EM_COAXIAL_CONTROL_IO_TYPE_LIGHT = 1;

    /**
     * \if ENGLISH_LANG
     * speak audio
     * \else
     * speak音频
     * \endif
     */
    public static final int EM_COAXIAL_CONTROL_IO_TYPE_SPEAKER  =2;
}
