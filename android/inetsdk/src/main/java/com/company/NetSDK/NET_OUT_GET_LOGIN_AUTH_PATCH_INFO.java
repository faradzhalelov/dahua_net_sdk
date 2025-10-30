package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#GetLoginAuthPatchInfo} output param
 * \else
 * 接口{@link INetSDK#GetLoginAuthPatchInfo}输出参数
 * \endif
 */
public class NET_OUT_GET_LOGIN_AUTH_PATCH_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Whether support high level security or not
     * \else
     * 是否支持高等级安全登录
     * \endif
     */
    public boolean	 bSupportHighLevelSecurity;
}
