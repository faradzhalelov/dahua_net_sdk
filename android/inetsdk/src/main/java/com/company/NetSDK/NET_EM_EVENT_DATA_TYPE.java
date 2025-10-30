package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The data type of Event
 * \else
 * 事件数据类型
 * \endif
 */
public class NET_EM_EVENT_DATA_TYPE implements Serializable {

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
    public static final int NET_EN_EVENT_DATA_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Real data
     * \else
     * 实时数据
     * \endif
     */
    public static final int NET_EN_EVENT_DATA_TYPE_REAL = 1;

    /**
     * \if ENGLISH_LANG
     * Alarm data
     * \else
     * 报警数据
     * \endif
     */
    public static final int NET_EN_EVENT_DATA_TYPE_ALARM = 2;


}
