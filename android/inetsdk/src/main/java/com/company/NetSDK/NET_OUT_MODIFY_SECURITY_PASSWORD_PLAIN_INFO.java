package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_ModifySecurityPasswordPlain 接口出参
 * \else
 * @brief CLIENT_ModifySecurityPasswordPlain 接口出参
 * \endif
 */
public class NET_OUT_MODIFY_SECURITY_PASSWORD_PLAIN_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  error code
     * \else
     *  错误码
     * \endif
     */
    public int					nCode;

    /**
     * \if ENGLISH_LANG
     *  Error code description
     * \else
     *  错误码描述
     * \endif
     */
    public byte					szMessage[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  When changing a password, if the old password is entered incorrectly, the remaining number of attempts can be made. If this field is not present, it indicates an infinite number of attempts
     * \else
     *  修改密码时，旧密码输错剩余可尝试的输入次数,无该字段表示无限次
     * \endif
     */
    public int					nRemainModifyTimes;

    /**
     * \if ENGLISH_LANG
     *  Lock the remaining time for password modification operation, in seconds. If there is no such field, it means it is not locked
     * \else
     *  锁定修改密码操作剩余时间，单位秒,无该字段表示不锁定
     * \endif
     */
    public int					nRemainLockSeconds;

}