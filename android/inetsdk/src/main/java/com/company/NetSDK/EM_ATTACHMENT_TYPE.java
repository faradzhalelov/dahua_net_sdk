package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief attachment type
 * \else
 * @brief 车内饰品类型
 * \endif
 */
public class EM_ATTACHMENT_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_ATTACHMENT_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  other
     * \else
     *  其他类型
     * \endif
     */
    public static final int					EM_ATTACHMENT_OTHER = 1;

    /**
     * \if ENGLISH_LANG
     *  furniture
     * \else
     *  摆件
     * \endif
     */
    public static final int					EM_ATTACHMENT_FURNITURE = 2;

    /**
     * \if ENGLISH_LANG
     *  pendant
     * \else
     *  挂件
     * \endif
     */
    public static final int					EM_ATTACHMENT_PENDANT = 3;

    /**
     * \if ENGLISH_LANG
     *  tissue box
     * \else
     *  纸巾盒
     * \endif
     */
    public static final int					EM_ATTACHMENT_TISSUEBOX = 4;

    /**
     * \if ENGLISH_LANG
     *  danger
     * \else
     *  危险品
     * \endif
     */
    public static final int					EM_ATTACHMENT_DANGER = 5;

    /**
     * \if ENGLISH_LANG
     *  perfume box
     * \else
     *  香水
     * \endif
     */
    public static final int					EM_ATTACHMENT_PERFUMEBOX = 6;

}