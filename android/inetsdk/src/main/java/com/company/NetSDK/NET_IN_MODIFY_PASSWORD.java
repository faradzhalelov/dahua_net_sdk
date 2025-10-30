package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#NASFileModifyPassword} input parameter
 * \else
 *  接口 {@link INetSDK#NASFileModifyPassword} 接口输入参数
 * \endif
 */
public class NET_IN_MODIFY_PASSWORD implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Old password
     * \else
     * 旧密码
     * \endif
     */
    public byte[]			szOldPassword = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * New password
     * \else
     * 新密码
     * \endif
     */
    public byte[]			szNewPassword = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * Password hint
     * \else
     * 密码提示问题
     * \endif
     */
    public byte[]			szPasswordHint = new byte[FinalVar.SDK_COMMON_STRING_128];
}
