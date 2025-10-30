package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * enable to bond Network interface
 * \else
 * 是否绑定虚拟网口
 * \endif
 */
public class CFG_THREE_STATUS_BOOL implements Serializable {
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
    public static final int CFG_BOOL_STATUS_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * false
     * \else
     * 错误
     * \endif
     */
    public static final int CFG_BOOL_STATUS_FALSE = 0;

    /**
     * \if ENGLISH_LANG
     * true
     * \else
     * 正确
     * \endif
     */
    public static final int CFG_BOOL_STATUS_TRUE = 1;
}
