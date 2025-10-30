package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * System type
 * \else
 * 系统类型
 * \endif
 */
public class EM_CFG_BUILDING_SYSTEM_TYPE implements Serializable {
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
    public static final int EM_CFG_BUILDING_SYSTEM_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Digital system
     * \else
     * 数字系统
     * \endif
     */
    public static final int EM_CFG_BUILDING_SYSTEM_TYPE_DIGITAL = 1;

    /**
     * \if ENGLISH_LANG
     * Analog system
     * \else
     * 模拟系统
     * \endif
     */
    public static final int EM_CFG_BUILDING_SYSTEM_TYPE_ANALOG = 2;
}
