package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#GetRemoteCollectDevInfo} input parameter
 * \else
 * 获取设备远程采集信息输入参数
 * \endif
 */
public class NET_IN_GET_REMOTE_COLLECT_DEV_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel No.
     * \else
     * 通道号
     * \endif
     */
    public int                  nChannel;
}
