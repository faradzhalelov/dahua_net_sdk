package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Remote collect device information caps output param, NET_REMOTE_COLLECT_DEVINFO_CAPS
 * \else
 * 远程设备信息采集能力出参,对应 NET_REMOTE_COLLECT_DEVINFO_CAPS
 * \endif
 */
public class NET_OUT_REMOTE_COLLECT_DEVINFO_CAPS implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Whether support collect capture
     * \else
     * 是否支持远程采集抓包
     * \endif
     */
    public boolean bSupportRemoteCollectSniffer;

    /**
     * \if ENGLISH_LANG
     * Whether support collect log
     * \else
     * 是否支持远程采集串口日志
     * \endif
     */
    public boolean bSupportRemoteCollectLog;
}
