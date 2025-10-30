package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  wireless device type
 * \else
 *  无限设备类型
 * \endif
 */
public class EM_WIRELESS_DEV_TYPE implements Serializable{
    private static final long serialVersionUID = -6310695615494008127L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public  final static int EM_WIRELESS_DEV_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  station
     * \else
     *  Station：站点
     * \endif
     */
    public final static int  EM_WIRELESS_DEV_TYPE_STATION  = 1;

    /**
     * \if ENGLISH_LANG
     *  AccessPoint
     * \else
     *  “AccessPoint” 无限接入点
     * \endif
     */
    public final static int  EM_WIRELESS_DEV_TYPE_AP = 2;

}
