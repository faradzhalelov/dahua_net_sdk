package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Coaxial Control IO Status
 * \else
 * 同轴IO操作类型状态
 * \endif
 */
public class EM_COAXIAL_CONTROL_IO_STATUS implements Serializable {
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
    public static final int EM_COAXIAL_CONTROL_IO_STATUS_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * On
     * \else
     * 开
     * \endif
     */
    public static final int EM_COAXIAL_CONTROL_IO_STATUS_ON = 1;

    /**
     * \if ENGLISH_LANG
     * Off
     * \else
     * 关闭
     * \endif
     */
    public static final int EM_COAXIAL_CONTROL_IO_STATUS_OFF = 2;
}
