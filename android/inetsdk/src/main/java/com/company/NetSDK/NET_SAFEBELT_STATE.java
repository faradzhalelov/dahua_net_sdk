package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * safe belt state
 * \else
 * 安全带状态
 * \endif
 */
public class NET_SAFEBELT_STATE implements  Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknow
     * \else
     * 未知
     * \endif
     */
    public static  final int SS_NUKNOW   = 0;

    /**
     * \if ENGLISH_LANG
     * WithSafeBelt
     * \else
     * 已系安全带
     * \endif
     */
    public static  final int SS_WITH_SAFE_BELT = 1;

    /**
     * \if ENGLISH_LANG
     * WithoutSafeBelt
     * \else
     * 未系安全带
     * \endif
     */
    public static  final int SS_WITHOUT_SAFE_BELT = 2;
}
