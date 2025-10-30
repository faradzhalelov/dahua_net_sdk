package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ID type
 * \else
 * 证件类型
 * \endif
 */
public class EM_CERTIFICATE_TYPE implements Serializable {
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
    public static final int CERTIFICATE_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * ID
     * \else
     * 证件
     * \endif
     */
    public static final int CERTIFICATE_TYPE_IC = 1;

    /**
     * \if ENGLISH_LANG
     * passport
     * \else
     * 护照
     * \endif
     */
    public static final int CERTIFICATE_TYPE_PASSPORT = 2;
}
