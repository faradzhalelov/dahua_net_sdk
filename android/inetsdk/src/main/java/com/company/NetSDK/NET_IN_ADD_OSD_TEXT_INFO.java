package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_AddOSDText Indicates the interface parameter
 * \else
 * @brief CLIENT_AddOSDText接口入参
 * \endif
 */
public class NET_IN_ADD_OSD_TEXT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The type of overlay, 0, is related to the GPS information stack
     * \else
     *  叠加的类型, 0 与GPS信息叠加强相关
     * \endif
     */
    public int					nType;

    /**
     * \if ENGLISH_LANG
     *  Indicates the actual number of delivered channels
     * \else
     *  实际下发的通道数
     * \endif
     */
    public int					nChannelNum;

    /**
     * \if ENGLISH_LANG
     *  The channel that needs to be superimposed
     * \else
     *  需要叠加的通道
     * \endif
     */
    public int					nChannel[] = new int[16];

    /**
     * \if ENGLISH_LANG
     *  Superimposed text information
     * \else
     *  叠加的文本信息
     * \endif
     */
    public byte					szText[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     *  Superposition display duration. 0 indicates the superposition until the next protocol delivery. Other digits indicate the display duration, in seconds
     * \else
     *  叠加显示时长, 0表示一直叠加至下一次协议下发, 其它数字表示显示时长, 单位秒
     * \endif
     */
    public int					nDuration;

}