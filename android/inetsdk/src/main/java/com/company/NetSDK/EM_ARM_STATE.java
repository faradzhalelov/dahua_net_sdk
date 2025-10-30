package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Arm states
 * \else
 * 布撤防状态
 * \endif
 */
public class EM_ARM_STATE implements Serializable{
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
    public static final int EM_ARM_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Total
     * \else
     * Total布防
     * \endif
     */
    public static final int EM_ARM_STATE_TOTAL_ARMING = 1;

    /**
     * \if ENGLISH_LANG
     * partial1
     * \else
     * partial1布防
     * \endif
     */
    public static final int EM_ARM_STATE_PARTIAL1_ARMING = 2;

    /**
     * \if ENGLISH_LANG
     * partial2
     * \else
     * partial2布防
     * \endif
     */
    public static final int EM_ARM_STATE_PARTIAL2_ARMING = 3;

    /**
     * \if ENGLISH_LANG
     * partial1+2
     * \else
     * partial1+2布防
     * \endif
     */
    public static final int EM_ARM_STATE_PARTIAL1_PARTIAL2_ARMING = 4;

    /**
     * \if ENGLISH_LANG
     * force arming
     * \else
     * 强制布防
     * \endif
     */
    public static final int EM_ARM_STATE_FORCEARMING = 5;

    /**
     * \if ENGLISH_LANG
     * disarming
     * \else
     * 撤防
     * \endif
     */
    public static final int EM_ARM_STATE_DISARMING = 6;
}
