package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * info of disposition channel
 * \else
 * 布控的视频通道信息
 * \endif
 */
public class NET_DISPOSITION_CHANNEL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel ID
     * \else
     * 视频通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     * similary, 0-100
     * \else
     * 相似度阈值, 0-100
     * \endif
     */
    public int					nSimilary;
}
