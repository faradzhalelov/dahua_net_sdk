package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * RTMP Streaming operation type
 * \else
 * RTMP推流操作类型
 * \endif
 */
public class NET_OUT_RTMP_MANAGER_GETCAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Maximum number of real-time streaming channels
     * \else
     *  最大实时流推流通道数
     * \endif
     */
    public int					nMaxLive;

    /**
     * \if ENGLISH_LANG
     *  Maximum number of video streaming channels
     * \else
     *  最大录像流推流通道数
     * \endif
     */
    public int					nMaxRecord;

}
