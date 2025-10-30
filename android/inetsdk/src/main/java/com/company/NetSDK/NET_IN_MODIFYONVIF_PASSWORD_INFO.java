package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Modify the Onvif user password, CLIENT_ModifyOnvifUserPassword Enter parameter
 * \else
 * 修改 Onvif 用户密码， CLIENT_ModifyOnvifUserPassword 入参
 * \endif
 */
public class NET_IN_MODIFYONVIF_PASSWORD_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  User name
     * \else
     *  用户名称
     * \endif
     */
    public byte					szName[] = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     *  User password
     * \else
     *  用户密码
     * \endif
     */
    public byte					szPwd[] = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     *  old password
     * \else
     *  旧密码
     * \endif
     */
    public byte					szPwdOld[] = new byte[FinalVar.SDK_COMMON_STRING_128];

}
