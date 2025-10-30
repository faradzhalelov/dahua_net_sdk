package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Has hat
 * \else
 * 是否戴帽子
 * \endif
 */
public class EM_HAS_HAT implements Serializable {
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
    public static final int EM_HAS_HAT_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Not has hat
     * \else
     * 不戴帽子
     * \endif
     */
    public static final int EM_HAS_HAT_NO = 1;

    /**
     * \if ENGLISH_LANG
     * Has hat
     * \else
     * 戴帽子
     * \endif
     */
    public static final int EM_HAS_HAT_YES = 2;
}

