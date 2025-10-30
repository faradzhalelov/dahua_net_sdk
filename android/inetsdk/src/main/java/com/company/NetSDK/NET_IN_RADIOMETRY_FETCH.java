package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_RadiometryFetch input parameter
 * \else
 * @brief CLIENT_RadiometryFetch 入参
 * \endif
 */
public class NET_IN_RADIOMETRY_FETCH implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  channel number, channel number needs to be in accordance with subscription, -1 excluded
     * \else
     *  通道号, 通道号要与订阅时一致, -1除外
     * \endif
     */
    public int					nChannel;

}