package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#ManualSnap} The input parameters
 * \else
 * {@link INetSDK#ManualSnap} 输入参数
 * \endif
 */
public class NET_IN_MANUAL_SNAP implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Capture channel number
     * \else
     * 抓图通道号
     * \endif
     */
    public int			nChannel;
    /**
     * \if ENGLISH_LANG
     * Serial number
     * \else
     * 请求序列号
     * \endif
     */
    public int			nCmdSerial;
    /**
     * \if ENGLISH_LANG
     * Capture save path
     * \else
     * 抓图保存路径
     * \endif
     */
    public byte[]			szFilePath = new byte[260];
}
