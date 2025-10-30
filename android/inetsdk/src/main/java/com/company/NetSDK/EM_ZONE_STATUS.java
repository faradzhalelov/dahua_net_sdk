package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * zone status
 * \else
 * 防区异常状态
 * \endif
 */
public class EM_ZONE_STATUS implements Serializable{
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
    public static final int EM_ZONE_STATUS_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * open
     * \else
     * 通道打开
     * \endif
     */
    public static final int EM_ZONE_STATUS_ALARM = 1;

    /**
     * \if ENGLISH_LANG
     * tamper
     * \else
     * 通道防拆
     * \endif
     */
    public static final int EM_ZONE_STATUS_TAMPER = 2;

    /**
     * \if ENGLISH_LANG
     * mask
     * \else
     * 通道遮挡
     * \endif
     */
    public static final int EM_ZONE_STATUS_MASK = 3;

    /**
     * \if ENGLISH_LANG
     * short
     * \else
     * 通道防短
     * \endif
     */
    public static final int EM_ZONE_STATUS_SHORT = 4;
}
