package com.company.NetSDK;

import java.io.Serializable;



/**
 * \if ENGLISH_LANG
 * input parameter of interface {@link INetSDK#GetHumanRadioCaps}
 * \else
 * 接口 {@link INetSDK#GetHumanRadioCaps} 入参
 * \endif
 */
public class NET_IN_GET_HUMAN_RADIO_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel
     * \else
     * 通道号
     * \endif
     */
    public int					nChannel;
}
