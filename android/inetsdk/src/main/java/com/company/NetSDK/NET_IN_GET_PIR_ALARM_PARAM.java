package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input parameter of interface {@link INetSDK#GetPirAlarmParam}
 * \else
 * 接口 {@link INetSDK#GetPirAlarmParam} 入参
 * \endif
 */
public class NET_IN_GET_PIR_ALARM_PARAM implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel
     * \else
     * 视频通道号
     * \endif
     */
    public int					nChannel;
}
