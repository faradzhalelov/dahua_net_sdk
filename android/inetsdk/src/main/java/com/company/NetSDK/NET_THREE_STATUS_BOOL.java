package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * three state bool type
 * \else
 * 三态布尔类型
 * \endif
 */
public class NET_THREE_STATUS_BOOL implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static final int BOOL_STATUS_FALSE  = 0 ;

    public static final int BOOL_STATUS_TRUE = 1;

    /**
     * \if ENGLISH_LANG
     * unknow
     * \else
     * 未知
     * \endif
     */
    public static final int BOOL_STATUS_UNKNOWN = 2;
}
