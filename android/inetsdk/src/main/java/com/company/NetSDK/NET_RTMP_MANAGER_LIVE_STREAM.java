package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Bitstream type
 * \else
 * 码流类型
 * \endif
 */
public class NET_RTMP_MANAGER_LIVE_STREAM implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  channel id
     * \else
     *  通道号
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  stream type
     * \else
     *  码流类型
     * \endif
     */
    public int					emStreamType;

}
