package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Wireless Device Signal Info
 * \else
 * 无线设备信号信息
 * \endif
 */
public class NET_WIRELESSDEVSIGNAL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Device SN
     * \else
     * 设备序列号
     * \endif
     */
    public byte[]                      szDevSN = new byte[32];

    /**
     * \if ENGLISH_LANG
     * Wireless Signal Strength percent
     * \else
     * 无线信号强度百分比
     * \endif
     */
    public int                        unSignal;
}
