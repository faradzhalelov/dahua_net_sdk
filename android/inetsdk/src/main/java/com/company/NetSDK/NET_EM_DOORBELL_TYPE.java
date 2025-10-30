package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Door Bell Type
 * \else
 * 门铃类型
 * \endif
 */
public class NET_EM_DOORBELL_TYPE implements Serializable {

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
    public static final int NET_EM_DOORBELL_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * Unconnected
     * \else
     * 未接
     * \endif
     */
    public static final int NET_EM_DOORBELL_UNCONNECTED = 0;

    /**
     * \if ENGLISH_LANG
     * Mechanical
     * \else
     * 机械
     * \endif
     */
    public static final int NET_EM_DOORBELL_MECHANICAL = 1;

    /**
     * \if ENGLISH_LANG
     * Electronic
     * \else
     * 电子
     * \endif
     */
    public static final int NET_EM_DOORBELL_ELECTRONIC = 2;
}
