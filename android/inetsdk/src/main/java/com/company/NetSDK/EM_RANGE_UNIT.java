package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Distance unit
 * \else
 * 距离单位
 * \endif
 */
public class EM_RANGE_UNIT implements Serializable{
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
    public static final int EM_RANGE_UNIT_UNKOWN  		  = -1;

    /**
     * \if ENGLISH_LANG
     * Meter
     * \else
     * 米
     * \endif
     */
    public static final int EM_RANGE_UNIT_METER  		  = 0;

    /**
     * \if ENGLISH_LANG
     * Foot
     * \else
     * 英尺
     * \endif
     */
    public static final int EM_RANGE_UNIT_FOOT  		  = 1;
}
