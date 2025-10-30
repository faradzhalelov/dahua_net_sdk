package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Add Onvif User, CLIENT_AddOnvifUser Input parameter
 * \else
 * 添加Onvif用户，CLIENT_AddOnvifUser 入参
 * \endif
 */
public class NET_IN_ADD_ONVIF_USER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * UserName
     * \else
     * 用户名
     * \endif
     */
    public byte szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Password
     * \else
     * 密码
     * \endif
     */
    public byte szPassword[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * User Group
     * \else
     * 用户所在的组
     * \endif
     */
    public int emGroupType;

}
