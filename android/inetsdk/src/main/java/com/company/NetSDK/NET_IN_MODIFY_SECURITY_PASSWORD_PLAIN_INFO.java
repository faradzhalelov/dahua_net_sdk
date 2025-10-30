package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_ModifySecurityPasswordPlain input parameter
 * \else
 * @brief CLIENT_ModifySecurityPasswordPlain 接口入参
 * \endif
 */
public class NET_IN_MODIFY_SECURITY_PASSWORD_PLAIN_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Modified User Name
     * \else
     *  修改的用户名称
     * \endif
     */
    public byte					szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  New password
     * \else
     *  新密码
     * \endif
     */
    public byte					szPwd[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Old password
     * \else
     *  旧密码
     * \endif
     */
    public byte					szPwdOld[] = new byte[128];

}