package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * extention module alarm channel info
 * \else
 * 扩展模块报警通道信息
 * \endif
 */
public class NET_EXALARMCHANNELS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * extension alarm box channel no.
     * \else
     * 扩展报警盒通道号
     * \endif
     */
    public int             nExAlarmBoxNum;

    /**
     * \if ENGLISH_LANG
     * ths channelno. On alarm box
     * \else
     * 该通道在扩展报警盒上的通道号
     * \endif
     */
    public int             nChannelNum;

    /**
     * \if ENGLISH_LANG
     * alarm channel name
     * \else
     * 报警通道名称
     * \endif
     */
    public byte[]          szChannelName = new byte[FinalVar.SDK_MAX_EXALARMCHANNEL_NAME_LEN];
}
