package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input param, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_THERMO_GRAPHY_CAPS}
 * \else
 * 入参, 对应接口{@link INetSDK#GetDevCaps},对应命令 {@link FinalVar#NET_THERMO_GRAPHY_CAPS}
 * \endif
 */
public class NET_IN_THERMO_GETCAPS implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel number
     * \else
     * 通道号
     * \endif
     */
    public int  nChannel;
}
