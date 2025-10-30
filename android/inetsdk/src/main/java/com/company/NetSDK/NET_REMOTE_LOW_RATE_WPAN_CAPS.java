package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device Caps
 * \else
 *  设备能力
 * \endif
 */
public class NET_REMOTE_LOW_RATE_WPAN_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Is Device Support GetWay
     * \else
     * 设备是否支持无线网关
     * \endif
     */
    public boolean								bSupportWirelessGateway;
}
