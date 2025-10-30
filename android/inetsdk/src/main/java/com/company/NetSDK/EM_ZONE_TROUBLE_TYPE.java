package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * zone trouble type
 * \else
 * 防区故障类型
 * \endif
 */
public class EM_ZONE_TROUBLE_TYPE implements Serializable{
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
    public static final int EM_ZONE_TROUBLE_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * tamper
     * \else
     * 通道防拆
     * \endif
     */
    public static final int EM_ZONE_TROUBLE_TYPE_TAMPER = 1;

    /**
     * \if ENGLISH_LANG
     * mask
     * \else
     * 通道遮挡
     * \endif
     */
    public static final int EM_ZONE_TROUBLE_TYPE_MASK = 2;

    /**
     * \if ENGLISH_LANG
     * short
     * \else
     * 通道防短
     * \endif
     */
    public static final int EM_ZONE_TROUBLE_TYPE_SHORT = 3;
}
