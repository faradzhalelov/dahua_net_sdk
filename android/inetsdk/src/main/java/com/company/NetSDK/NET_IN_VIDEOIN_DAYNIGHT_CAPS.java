package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input paramer, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_VIDEOIN_BACKLIGHT_CAPS}
 * \else
 * 入参, 对应接口 {@link INetSDK#GetDevCaps}, 对应命令{@link FinalVar#NET_VIDEOIN_BACKLIGHT_CAPS}
 * \endif
 */
public class NET_IN_VIDEOIN_DAYNIGHT_CAPS implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel ID
     * \else
     * 通道号
     * \endif
     */
    public int 				nChannel;
}
