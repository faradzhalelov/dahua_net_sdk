package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Onvif User Group
 * \else
 * @brief Onvif 用户所在组
 * \endif
 */
public class EM_GROUP_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  UnKnown
     * \else
     *  UnKnown	
     * \endif
     */
    public static final int					EM_GROUP_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  admin
     * \else
     *  admin
     * \endif
     */
    public static final int					EM_GROUP_TYPE_ADMIN = 1;

    /**
     * \if ENGLISH_LANG
     *  operator
     * \else
     *  operator
     * \endif
     */
    public static final int					EM_GROUP_TYPE_OPERATOR = 2;

    /**
     * \if ENGLISH_LANG
     *  user
     * \else
     *  user
     * \endif
     */
    public static final int					EM_GROUP_TYPE_USER = 3;

    /**
     * \if ENGLISH_LANG
     *  anonymous
     * \else
     *  anonymous
     * \endif
     */
    public static final int					EM_GROUP_TYPE_ANONYMOUS = 4;

}