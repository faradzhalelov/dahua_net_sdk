package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * light link type
 * \else
 * 灯光联动方式
 * \endif
 */
public class EM_PIR_LIGHT_LINK_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_PIR_LIGHT_LINK_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * filcker
     * \else
     * 闪烁
     * \endif
     */
    public static final int EM_PIR_LIGHT_LINK_TYPE_FILCKER = 1;

    /**
     * \if ENGLISH_LANG
     * keep lighting
     * \else
     * 常亮
     * \endif
     */
    public static final int EM_PIR_LIGHT_LINK_TYPE_KEEPLIGHTING = 2;
}
