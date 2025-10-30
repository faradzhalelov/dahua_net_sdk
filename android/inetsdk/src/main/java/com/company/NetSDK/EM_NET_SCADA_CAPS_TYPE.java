package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SCADA capacity type
 * \else
 * SCADA能力类型
 * \endif
 */
public class EM_NET_SCADA_CAPS_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknow
     * \else
     * 未知
     * \endif
     */
    public static final int EM_NET_SCADA_CAPS_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * all type
     * \else
     * 所有类型
     * \endif
     */
    public static final int EM_NET_SCADA_CAPS_TYPE_ALL = 1;

    /**
     * \if ENGLISH_LANG
     * DevInfo
     * \else
     * DevInfo
     * \endif
     */
    public static final int EM_NET_SCADA_CAPS_TYPE_DEV = 2;
}
