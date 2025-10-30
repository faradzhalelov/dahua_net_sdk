package com.company.NetSDK;

import java.io.Serializable;

public class EM_BATTERY_STATE implements Serializable {
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
    public static final int                 EM_BATTERY_STATE_UNKNOWN = 0;
    /**
     * \if ENGLISH_LANG
     * normal power
     * \else
     * 电量正常
     * \endif
     */
    public static final int                 EM_BATTERY_STATE_NORMAL = 1;
    /**
     * \if ENGLISH_LANG
     * low power
     * \else
     * 电量低
     * \endif
     */
    public static final int                 EM_BATTERY_STATE_LOW = 2;
}
