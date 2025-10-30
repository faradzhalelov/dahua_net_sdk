package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Get all onvif user information, CLIENT_GetOnvifUserInfoAll Output parameter
 * \else
 * @brief 获取所有 Onvif 用户信息， CLIENT_GetOnvifUserInfoAll 出参
 * \endif
 */
public class NET_OUT_GETONVIF_USERINFO_ALL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The number of this query
     * \else
     *  本次已查询到的个数
     * \endif
     */
    public int					nRetUserInfoNumber;

    /**
     * \if ENGLISH_LANG
     *  User information list(unable to get password information)
     * \else
     *  用户信息列表(无法获取到密码信息)
     * \endif
     */
    public NET_ONVIF_USER_INFO					stuUserInfo[] = new NET_ONVIF_USER_INFO[FinalVar.MAX_ONVIF_USER_NUM];

    public NET_OUT_GETONVIF_USERINFO_ALL_INFO() {
        for(int i = 0; i < FinalVar.MAX_ONVIF_USER_NUM; i ++) {
            this.stuUserInfo[i] = new NET_ONVIF_USER_INFO();
        }
    }
}