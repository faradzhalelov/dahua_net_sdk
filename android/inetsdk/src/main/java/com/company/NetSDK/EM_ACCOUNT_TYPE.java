package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Account type
 * \else
 * 账户类型
 * \endif
 */
public class EM_ACCOUNT_TYPE implements Serializable {
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
    public static final int EM_ACCOUNT_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * sdk account
     * \else
     * sdk账户体系
     * \endif
     */
    public static final int EM_ACCOUNT_TYPE_SDK = 1;

    /**
     * \if ENGLISH_LANG
     * web account
     * \else
     * web账户体系
     * \endif
     */
    public static final int EM_ACCOUNT_TYPE_WEB = 2;
}
