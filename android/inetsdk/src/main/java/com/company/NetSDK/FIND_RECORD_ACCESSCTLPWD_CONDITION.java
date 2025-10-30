package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Access password record query conditions
 * \else
 * 门禁密码记录查询条件
 * \endif
 */
public class FIND_RECORD_ACCESSCTLPWD_CONDITION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * User ID
     * \else
     * 用户ID
     * \endif
     */
    public byte[]                      szUserID = new byte[FinalVar.SDK_MAX_USERID_LEN];
}
