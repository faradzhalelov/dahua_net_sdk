package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#UpdateVK} port input parameter
 * \else
 * {@link INetSDK#UpdateVK} 接口输入参数
 * \endif
 */
public class NET_IN_UPDATE_VKINFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel ID
     * \else
     * 通道ID
     * \endif
     */
    public int                     nChannelID;
}
