package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief RTMP info per channel
 * \else
 * @brief 每个通道的RTMP信息
 * \endif
 */
public class NET_CHANNEL_RTMP_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  enable
     * \else
     *  是否使能
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  channel id
     * \else
     *  通道号（URL中的Channel）
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  url
     * \else
     *  RTMP连接URL
     * \endif
     */
    public byte					szUrl[] = new byte[512];

    @java.lang.Override
    public java.lang.String toString() {
        return "NET_CHANNEL_RTMP_INFO{" +
                "bEnable=" + bEnable +
                ", nChannel=" + nChannel +
                ", szUrl=" + new String(szUrl).trim() +
                '}';
    }
}
