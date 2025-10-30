package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#NASFileAuthenticate} input parameter
 * \else
 *  接口 {@link INetSDK#NASFileAuthenticate} 接口输入参数
 * \endif
 */
public class NET_IN_AUTHENTICATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Verify password
     * \else
     * 验证密码
     * \endif
     */
    public byte[]			szPassword = new byte[FinalVar.SDK_COMMON_STRING_128];
}
