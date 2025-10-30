package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_GetObjectFavoritesLibraryChannelsByGroup output parameters
 * \else
 * @brief CLIENT_GetObjectFavoritesLibraryChannelsByGroup 接口输出参数
 * \endif
 */
public class NET_OUT_GET_OBJECT_FAVORITES_LIBRARY_CHANNELS_BYGROUP implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of queried channel lists
     * \else
     *  查询到的通道列表个数
     * \endif
     */
    public int					nChannelsCount;

    /**
     * \if ENGLISH_LANG
     *  List of queried channels
     * \else
     *  查询到的通道列表
     * \endif
     */
    public int					nChannels[] = new int[1024];

}