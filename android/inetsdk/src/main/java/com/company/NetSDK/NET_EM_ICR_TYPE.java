package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ICR switch type
 * \else
 * ICR切换类型
 * \endif
 */
public class NET_EM_ICR_TYPE implements Serializable {
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
    public static final int NET_EM_ICR_UNKONOW = 0;

    /**
     * \if ENGLISH_LANG
     * electronics
     * \else
     * 电子
     * \endif
     */
    public static final int NET_EM_ICR_ELECTRON = 1;

    /**
     * \if ENGLISH_LANG
     * mechanics
     * \else
     * 机械
     * \endif
     */
    public static final int NET_EM_ICR_MECHANISM = 2;
}
