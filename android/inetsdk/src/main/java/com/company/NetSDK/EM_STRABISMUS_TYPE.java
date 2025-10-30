package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Strabismus type
 * \else
 * 斜视状态
 * \endif
 */
public class EM_STRABISMUS_TYPE implements Serializable {
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
    public static final int EM_STRABISMUS_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Normal
     * \else
     * 正常
     * \endif
     */
    public static final int EM_STRABISMUS_NORMAL = 1;

    /**
     * \if ENGLISH_LANG
     * Strabismus
     * \else
     * 斜视
     * \endif
     */
    public static final int EM_STRABISMUS_YES = 2;
}
