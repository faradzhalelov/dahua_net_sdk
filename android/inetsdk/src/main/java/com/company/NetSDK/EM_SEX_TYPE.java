package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * sex
 * \else
 * 性别
 * \endif
 */
public class EM_SEX_TYPE implements Serializable {

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
    public static final int EM_SEX_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * male
     * \else
     * 男性
     * \endif
     */
    public static final int EM_SEX_TYPE_MALE = 1;

    /**
     * \if ENGLISH_LANG
     * female
     * \else
     * 女性
     * \endif
     */
    public static final int EM_SEX_TYPE_FEMALE = 2;
}
