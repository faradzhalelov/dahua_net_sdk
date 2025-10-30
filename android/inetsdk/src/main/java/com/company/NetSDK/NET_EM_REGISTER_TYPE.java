package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 注册类型
 * \else
 *  Register Type
 * \endif
 */
public class NET_EM_REGISTER_TYPE implements Serializable {

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
    public static final int NET_EM_REGISTER_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * domestic:lecheng
     * \else
     * 国内:lecheng
     * \endif
     */
    public static final int NET_EM_REGISTER_TYPE_LECHENG = 1;

    /**
     * \if ENGLISH_LANG
     * abroad:easy4ip
     * \else
     * 国外:easy4ip
     * \endif
     */
    public static final int NET_EM_REGISTER_TYPE_EASY4IP = 2;

    /**
     * \if ENGLISH_LANG
     * private-v1
     * \else
     * 一机一密
     * \endif
     */
    public static final int NET_EM_REGISTER_TYPE_PRIVATE_V1 = 3;

    /**
     * \if ENGLISH_LANG
     * private-v2
     * \else
     * 一类一密
     * \endif
     */
    public static final int NET_EM_REGISTER_TYPE_PRIVATE_V2 = 4;


}
