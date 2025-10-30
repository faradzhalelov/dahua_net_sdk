package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Onvif New user information
 * \else
 * @brief Onvif 新用户信息
 * \endif
 */
public class NET_ONVIF_USER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  User name
     * \else
     *  用户名
     * \endif
     */
    public byte					szName[] = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     *  password
     * \else
     *  密码
     * \endif
     */
    public byte					szPassword[] = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     *  Recently modified password time
     * \else
     *  最近修改密码的时间
     * \endif
     */
    public NET_TIME					stuPasswordModifiedTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  User Group
     * \else
     *  用户所在的组
     * \endif
     */
    public int					emGroupType;

}