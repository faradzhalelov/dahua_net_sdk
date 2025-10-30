package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#NASFileSetUserAuthInfo} input parameter
 * \else
 *  接口 {@link INetSDK#NASFileSetUserAuthInfo} 接口输入参数
 * \endif
 */
public class NET_IN_SET_USER_AUTH_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Password
     * \else
     * 密码
     * \endif
     */
    public byte[]			szPassword = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * Password hint
     * \else
     * 密码提示问题
     * \endif
     */
    public byte[]			szPasswordHint = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * Phone no,optional
     * \else
     * 手机号,可选
     * \endif
     */
    public byte[]			szPhoneNo = new byte[FinalVar.SDK_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * Email,optional
     * \else
     * 邮箱,可选
     * \endif
     */
    public byte[]			szEmail = new byte[FinalVar.SDK_COMMON_STRING_128];
}
