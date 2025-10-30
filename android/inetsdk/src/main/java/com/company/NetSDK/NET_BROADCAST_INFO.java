package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Broadcast information
 * \else
 * 播报信息
 * \endif
 */
public class NET_BROADCAST_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Voice text
     * \else
     *  语音文本
     * \endif
     */
    public byte					szText[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     *  Text type
     * \else
     *  文本类型
     * \endif
     */
    public int					emTextType;

}
