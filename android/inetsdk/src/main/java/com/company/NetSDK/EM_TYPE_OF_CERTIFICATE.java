package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  type of certificate
 * \else
 *  证件类型
 * \endif
 */
public class EM_TYPE_OF_CERTIFICATE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_TYPE_OF_CERTIFICATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  ID card
     * \else
     * 证件
     * \endif
     */
    public static final int EM_TYPE_OF_CERTIFICATE_IDCARD = 1;

    /**
     * \if ENGLISH_LANG
     *  Hong Kong and Macau Residence Permit
     * \else
     * 港澳居住证
     * \endif
     */
    public static final int EM_TYPE_OF_CERTIFICATE_HKMRPERMIT = 2;

    /**
     * \if ENGLISH_LANG
     *  Chinese passport
     * \else
     * 中国护照
     * \endif
     */
    public static final int EM_TYPE_OF_CERTIFICATE_CHNPASSPORT = 3;

    /**
     * \if ENGLISH_LANG
     *  Foreign passport
     * \else
     * 国外护照
     * \endif
     */
    public static final int EM_TYPE_OF_CERTIFICATE_FORPASSPORT = 4;

    /**
     * \if ENGLISH_LANG
     *  Permanent residence permit
     * \else
     * 永久居住证
     * \endif
     */
    public static final int EM_TYPE_OF_CERTIFICATE_PERRESIDENCE_PERMI = 5;

    /**
     * \if ENGLISH_LANG
     *  Other
     * \else
     * 其他
     * \endif
     */
    public static final int EM_TYPE_OF_CERTIFICATE_OTHER = 9;
}
