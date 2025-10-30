package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Remote channel information
 * \else
 * 远程通道信息
 * \endif
 */
public class NET_REMOTE_UPGRADE_CHNL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Remote Channel
     * \else
     * 远程通道号
     * \endif
     */
    public int      nChannel;

    /**
     * \if ENGLISH_LANG
     * Remote device ID,value is szID of RemoteDevice config
     * \else
     * 远程设备ID, RemoteDevice配置的szID
     * \endif
     */
    public byte      szDeviceID[] = new byte[128];
}
