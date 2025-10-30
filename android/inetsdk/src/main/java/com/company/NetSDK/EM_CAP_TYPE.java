package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Cap type
 * \else
 * 帽子类型
 * \endif
 */
public class EM_CAP_TYPE implements Serializable {
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
    public static final int EM_CAP_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * ordinary
     * \else
     * 普通帽子
     * \endif
     */
    public static final int EM_CAP_ORDINARY = 1;

    /**
     * \if ENGLISH_LANG
     * helmet
     * \else
     * 头盔
     * \endif
     */
    public static final int EM_CAP_HELMET = 2;

    /**
     * \if ENGLISH_LANG
     * safe hat
     * \else
     * 安全帽
     * \endif
     */
    public static final int EM_CAP_SAFE = 3;

}
