package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * channel info of vsp gavi
 * \else
 * 通道信息
 * \endif
 */
public class NET_VSP_GAVI_CHANNEL_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * channel encode
     * \else
     * 通道编码
     * \endif
     */
    public byte							szChannelEncode[] = new byte[24];

    /**
     * \if ENGLISH_LANG
     * notify object
     * \else
     * 上报设备信息
     * \endif
     */
    public NET_VSP_GAVI_NOTIFY_OBJECT		stuNotifyObject = new NET_VSP_GAVI_NOTIFY_OBJECT();
}
