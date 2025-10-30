package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief arm type
 * \else
 * @brief 布撤防类型
 * \endif
 */
public class EM_ARM_TYPE implements Serializable {
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
    public static final int EM_ARM_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Total arming
     * \else
     * Total布防
     * \endif
     */
    public static final int EM_ARM_TYPE_TOTAL_ARMING = 1;

    /**
     * \if ENGLISH_LANG
     * partial1 arming
     * \else
     * partial1布防
     * \endif
     */
    public static final int EM_ARM_TYPE_PARTIAL1_ARMING = 2;

    /**
     * \if ENGLISH_LANG
     * partial2 arming
     * \else
     * partial2布防
     * \endif
     */
    public static final int EM_ARM_TYPE_PARTIAL2_ARMING = 3;

    /**
     * \if ENGLISH_LANG
     * partial1+2 arming
     * \else
     * partial1+2布防
     * \endif
     */
    public static final int EM_ARM_TYPE_PARTIAL_ARMING = 4;

    /**
     * \if ENGLISH_LANG
     * Force arming
     * \else
     * 强制布防
     * \endif
     */
    public static final int EM_ARM_TYPE_DENFENCE_ARMING = 5;

    /**
     * \if ENGLISH_LANG
     * disarming
     * \else
     * 撤防
     * \endif
     */
    public static final int EM_ARM_TYPE_DISARMING = 6;

}