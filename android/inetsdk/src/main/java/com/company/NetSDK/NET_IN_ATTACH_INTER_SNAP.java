package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#AttachSnap} Input param
 * \else
 * {@link INetSDK#AttachSnap} 输入参数
 * \endif
 */
public class NET_IN_ATTACH_INTER_SNAP implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Capture channel number
     * \else
     *  抓图通道号
     * \endif
     */
    public int					nChannel;
    /**
     * \if ENGLISH_LANG
     * Serial number
     * \else
     *  请求序列号
     * \endif
     */
    public int					nCmdSerial;
    /**
     * \if ENGLISH_LANG
     * Timing snap interval
     * \else
     *  定时抓图时间间隔
     * \endif
     */
    public int					nIntervalSnap;
    /**
     * \if ENGLISH_LANG
     * Callback function of attach snap
     * \else
     *  回调函数
     * \endif
     */
    public CB_fAttachSnapRev					cbAttachSnapRev;
    /**
     * \if ENGLISH_LANG
     * User data
     * \else
     *  用户数据
     * \endif
     */
    public long					dwUser;

}
