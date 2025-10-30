package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Packet cutting information
 * \else
 * @brief 切包信息
 * \endif
 */
public class NET_XRAY_CUT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * The local timestamp of the device for packet switching, in milliseconds starting from 00:00:00 on January 1st, 1970
     * \else
     * 切包的设备本地时间戳，从1970-1-1 00:00:00开始的毫秒数
     * \endif
     */
    public long					nTimeMS;

}