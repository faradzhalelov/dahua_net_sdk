package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input param of reset web account
 * \else
 * 重置WEB密码入参结构体
 * \endif
 */
public class NET_IN_REST_WEB_PWD implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * web user
     * \else
     * web用户名
     * \endif
     */
    public byte[]					szWebUser = new byte[FinalVar.MAX_USER_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * web password
     * \else
     * 重置后的web密码
     * \endif
     */
    public byte[]					szWebPwd = new byte[FinalVar.MAX_PWD_LEN];
}

