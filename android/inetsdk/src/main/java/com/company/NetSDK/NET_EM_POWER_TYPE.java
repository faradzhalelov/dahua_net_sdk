package com.company.NetSDK;
import java.io.Serializable;

public class NET_EM_POWER_TYPE implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * unknow
     * \else
     * 未知
     * \endif
     */
    public static final int NET_EM_POWER_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * power adapter
     * \else
     * 电源适配器
     * \endif
     */
    public static final int NET_EM_POWER_TYPE_POWERADAPTER = 0;

    /**
     * \if ENGLISH_LANG
     * battery
     * \else
     * 电池
     * \endif
     */
    public static final int NET_EM_POWER_TYPE_BATTERY = 1;

    /**
     * \if ENGLISH_LANG
     * battery with adapter
     * \else
     * 电池+电源适配器
     * \endif
     */
    public static final int NET_EM_POWER_TYPE_BATTERY_AND_POWERADAPTER = 2;
}
