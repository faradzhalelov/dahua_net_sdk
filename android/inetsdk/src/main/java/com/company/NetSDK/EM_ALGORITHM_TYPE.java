package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Algorithm type
 * \else
 * 加密算法类型
 * \endif
 */
public class EM_ALGORITHM_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unkown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_ALGORITHM_TYPE_UNKNOWN 			= 		0 ;

    /**
     * \if ENGLISH_LANG
     * AES256-OFB
     * \else
     * AES256-OFB加密算法
     * \endif
     */
    public static final int EM_ALGORITHM_TYPE_AES256_OFB 		= 		1 ;

    /**
     * \if ENGLISH_LANG
     * SM4-OFB
     * \else
     * SM4-OFB加密算法
     * \endif
     */
    public static final int EM_ALGORITHM_TYPE_SM4_OFB           =    2;

    /**
     * \if ENGLISH_LANG
     * SM1-OFB
     * \else
     * SM1-OFB加密算法
     * \endif
     */
    public static final int EM_ALGORITHM_TYPE_SM1_OFB           =    3;

    /**
     * \if ENGLISH_LANG
     * SM4-CTR
     * \else
     * SM4-CTR加密算法
     * \endif
     */
    public static final int EM_ALGORITHM_TYPE_SM4_CTR           =    4;


}
