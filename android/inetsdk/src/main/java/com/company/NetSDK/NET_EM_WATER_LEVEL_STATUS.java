package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Water level status
 * \else
 * 水位状态
 * \endif
 */
public class NET_EM_WATER_LEVEL_STATUS implements Serializable {

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
    public static final int NET_EM_WATER_LEVEL_STATUS_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Normal water level
     * \else
     * 水位正常
     * \endif
     */
    public static final int NET_EM_WATER_LEVEL_STATUS_NORMAL = 1;

    /**
     * \if ENGLISH_LANG
     * Higher than alarm threshold
     * \else
     * 水位高于上限阈值
     * \endif
     */
    public static final int NET_EM_WATER_LEVEL_STATUS_HIGH = 2;

    /**
     * \if ENGLISH_LANG
     * lower than alarm threshold
     * \else
     * 水位低于上限阈值
     * \endif
     */
    public static final int NET_EM_WATER_LEVEL_STATUS_LOW = 3;


}
