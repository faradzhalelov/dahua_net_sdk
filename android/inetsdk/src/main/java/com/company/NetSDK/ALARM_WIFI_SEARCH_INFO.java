package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * search wifi device,data description, corresponding to {@link FinalVar#SDK_ALARM_WIFI_SEARCH }
 * \else
 * 搜索wifi设备对用的数据描述信息, 对应{@link FinalVar#SDK_ALARM_WIFI_SEARCH }
 * \endif
 */
public class ALARM_WIFI_SEARCH_INFO implements Serializable{
    private static final long serialVersionUID = 1432723142127848752L;

    /**
     * \if ENGLISH_LANG
     * wifi number, indicate valid object in stuWifi
     * \else
     * wifi设备数量，指示stuWifi的有效数量
     * \endif
     */
    public      int                         nWifiNum;

    /**
     * \if ENGLISH_LANG
     * wifi device info
     * \else
     *  周围wifi设备的信息
     * \endif
     */
    public      NET_WIFI_DEV_INFO[]         stuWifi          =       new NET_WIFI_DEV_INFO[1024];

    /**
     * \if ENGLISH_LANG
     * channel
     * \else
     *  通道号
     * \endif
     */
    public      int                         nChannel;

    /**
     * \if ENGLISH_LANG
     * wifi event basic info
     * \else
     *  wifi事件上报基础信息
     * \endif
     */
    public      NET_WIFI_BASIC_INFO         stuWifiBasiInfo = new NET_WIFI_BASIC_INFO();

    /**
     * \if ENGLISH_LANG
     * is include GPS info
     * \else
     *  是否包含GPS信息
     * \endif
     */
    public      boolean					 bGPSinfo;

    /**
     * \if ENGLISH_LANG
     *  GPS info
     * \else
     *  GPS信息
     * \endif
     */
    public      NET_WIFI_GPS_INFO           stuWifiGPSInfo    = new NET_WIFI_GPS_INFO();

    public ALARM_WIFI_SEARCH_INFO(){
        for (int i=0;i<1024;i++){
            stuWifi[i] = new NET_WIFI_DEV_INFO();
        }
    }
}
