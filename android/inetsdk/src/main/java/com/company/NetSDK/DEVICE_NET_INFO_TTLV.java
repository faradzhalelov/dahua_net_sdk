package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Corresponding to interface {@link INetSDK#StartSearchDevicesEx}
 * \else
 * 对应接口 {@link INetSDK#StartSearchDevicesEx}
 * \endif
 */
public class DEVICE_NET_INFO_TTLV implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * local ip
     * \else
     * 搜索到设备的本地IP地址
     * \endif
     */
    public byte[]                szMac = new byte[32];

    /**
     * \if ENGLISH_LANG
     *
     * \else
     *
     * \endif
     */
    public NET_PG4_DEVICE_INFO	  stBaseInfo = new NET_PG4_DEVICE_INFO();

}
