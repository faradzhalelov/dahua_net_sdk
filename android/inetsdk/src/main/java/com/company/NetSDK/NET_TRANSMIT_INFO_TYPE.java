package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Transmit Type
 * \else
 * 透传类型
 * \endif
 */
public class NET_TRANSMIT_INFO_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * default
     * \else
     * 默认类型
     * \endif
     */
    public static final int NET_TRANSMIT_INFO_TYPE_DEFAULT = 0;

    /**
     * \if ENGLISH_LANG
     * F6
     * \else
     * F6纯透传
     * \endif
     */
    public static final int NET_TRANSMIT_INFO_TYPE_F6 = 1;

}
