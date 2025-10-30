package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetDevCaps} NET_WLAN_CAPS output parameter
 * \else
 * {@link INetSDK#GetDevCaps} NET_WLAN_CAPS接口输出参数
 * \endif
 */
public class NET_OUT_WLAN_CAPS_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Whether support INetSDK.SetWlanConfigInfo interface or not
     * \else
     * 是否支持INetSDK.SetWlanConfigInfo 接口
     * \endif
     */
    public boolean       bIgnoreNetCardToConn;

    /**
     * \if ENGLISH_LANG
     * WiFi capabilities, refer to {@link EM_WIFI_CAPS_TYPE}
     * \else
     * Wifi功能,取值参考 {@link EM_WIFI_CAPS_TYPE}
     * \endif
     */
    public int       emWifiCaps[] = new int[8];

    /**
     * \if ENGLISH_LANG
     * Number of WiFi capabilities returned by the device
     * \else
     * 设备返回Wifi能力个数
     * \endif
     */
    public int       nRetWifiCapsNum;
}
