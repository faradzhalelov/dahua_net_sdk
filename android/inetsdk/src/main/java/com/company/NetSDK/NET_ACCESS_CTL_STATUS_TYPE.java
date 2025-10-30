package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Access Control Status Type
 * \else
 * 门禁状态类型
 * \endif
 */
public class NET_ACCESS_CTL_STATUS_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int NET_ACCESS_CTL_STATUS_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Open
     * \else
     * 开门
     * \endif
     */
    public static final int NET_ACCESS_CTL_STATUS_TYPE_OPEN = 1;

    /**
     * \if ENGLISH_LANG
     * Close
     * \else
     * 关门
     * \endif
     */
    public static final int NET_ACCESS_CTL_STATUS_TYPE_CLOSE = 2;

    /**
     * \if ENGLISH_LANG
     * Abnormal
     * \else
     * 异常
     * \endif
     */
    public static final int NET_ACCESS_CTL_STATUS_TYPE_ABNORMAL = 3;

    /**
     * \if ENGLISH_LANG
     * fake locked
     * \else
     * 假锁
     * \endif
     */
    public static final int NET_ACCESS_CTL_STATUS_TYPE_FAKELOCKED = 4;

    /**
     * \if ENGLISH_LANG
     * close always
     * \else
     * 常闭
     * \endif
     */
    public static final int NET_ACCESS_CTL_STATUS_TYPE_CLOSEALWAYS = 5;

    /**
     * \if ENGLISH_LANG
     * open always
     * \else
     * 常开
     * \endif
     */
    public static final int NET_ACCESS_CTL_STATUS_TYPE_OPENALWAYS = 6;

}
