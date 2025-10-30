package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief the other side
 * \else
 * @brief 对方
 * \endif
 */
public class NET_EVENT_VIDEO_TALK_TO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Short Number
     * \else
     *  对方的短号
     * \endif
     */
    public byte					szShortNumber[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Long Number
     * \else
     *  对方的长号
     * \endif
     */
    public byte					szLongNumber[] = new byte[32];

}