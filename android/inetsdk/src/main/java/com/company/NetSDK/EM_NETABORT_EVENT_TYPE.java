package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief the Type of Network Fault Event)
 * \else
 * @brief 网络故障事件类型
 * \endif
 */
public class EM_NETABORT_EVENT_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Wired Network Fault Event 
     * \else
     * 有线网络故障事件
     * \endif
     */
    public static final int					EM_NETABORT_EVENT_TYPE_WIRE = 0;

    /**
     * \if ENGLISH_LANG
     *  Wireless Network Fault Event 
     * \else
     * 无线网络故障事件
     * \endif
     */
    public static final int					EM_NETABORT_EVENT_TYPE_WIRELESS = 1;

    /**
     * \if ENGLISH_LANG
     *  3G Network Fault Event
     * \else
     * 3G网络故障事件
     * \endif
     */
    public static final int					EM_NETABORT_EVENT_TYPE_3G = 2;

}