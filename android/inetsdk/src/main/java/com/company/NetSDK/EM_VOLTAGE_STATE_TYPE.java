package com.company.NetSDK;

import java.io.Serializable;

public class EM_VOLTAGE_STATE_TYPE implements Serializable {
    /**
     *
     */
    private static final long               serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int                 EM_VOLTAGE_STATE_UNKNOWN = 0;
    /**
     * \if ENGLISH_LANG
     * over
     * \else
     * 过压
     * \endif
     */
    public static final int                 EM_VOLTAGE_STATE_OVER = 1;
    /**
     * \if ENGLISH_LANG
     * normal
     * \else
     * 正常
     * \endif
     */
    public static final int                 EM_VOLTAGE_STATE_NORMAL = 2;
    /**
     * \if ENGLISH_LANG
     * under
     * \else
     * 欠压
     * \endif
     */
    public static final int                 EM_VOLTAGE_STATE_UNDER = 3;


}
