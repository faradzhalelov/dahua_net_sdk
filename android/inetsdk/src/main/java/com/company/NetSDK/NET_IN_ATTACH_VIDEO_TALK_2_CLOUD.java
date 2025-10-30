package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_AttachVideoTalk2Cloud input parameters
 * \else
 * @brief CLIENT_AttachVideoTalk2Cloud 输入参数
 * \endif
 */
public class NET_IN_ATTACH_VIDEO_TALK_2_CLOUD implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of channel number lists
     * \else
     *  通道号列表个数
     * \endif
     */
    public int					nChannalCount;

    /**
     * \if ENGLISH_LANG
     *  The channel number list starts from 0, with -1 indicating all
     * \else
     *  通道号列表 从0开始, -1 表示全部
     * \endif
     */
    public int					nChannels[] = new int[1024];

    /**
     * \if ENGLISH_LANG
     *  callback function
     * \else
     *  回调函数
     * \endif
     */
    public fNotifyEventVideoTalk					cbNotify;

    /**
     * \if ENGLISH_LANG
     *  User information
     * \else
     *  用户信息
     * \endif
     */
    public long					dwUser;

}