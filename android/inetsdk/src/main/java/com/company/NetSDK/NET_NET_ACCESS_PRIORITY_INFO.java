package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Network access priority capability
 * \else
 * @brief 网络访问优先级能力
 * \endif
 */
public class NET_NET_ACCESS_PRIORITY_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of supported network types
     * \else
     *  支持的网络类型个数
     * \endif
     */
    public int					nNetTypesCount;

    /**
     * \if ENGLISH_LANG
     *  Supported network types, "PPPoE": PPPoE method, "WIFI": wireless connection method, "3G": 3G method, "LAN": wired connection method
     * \else
     *  支持的网络类型, "PPPoE": PPPoE方式, "WIFI": 无线连接方式, "3G": 3G方式, "LAN": 有线连接方式
     * \endif
     */
    public byte					szNetTypes[][] = new byte[32][32];

}