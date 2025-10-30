package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief initiator
 * \else
 * @brief 发起方
 * \endif
 */
public class NET_EVENT_VIDEO_TALK_FROM implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Device Class
     * \else
     *  设备大类
     * \endif
     */
    public byte					szDeviceClass[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Equipment serial number
     * \else
     *  设备序列号
     * \endif
     */
    public byte					szSN[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     *  Short Number
     * \else
     *  发起方的短号
     * \endif
     */
    public byte					szShortNumber[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Long Number
     * \else
     *  发起方的长号
     * \endif
     */
    public byte					szLongNumber[] = new byte[32];

}