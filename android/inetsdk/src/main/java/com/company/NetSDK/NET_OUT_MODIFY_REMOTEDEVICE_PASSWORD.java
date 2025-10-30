package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#ModifyRemoteDevicePassword} output parameter
 * \else
 *  接口 {@link INetSDK#ModifyRemoteDevicePassword} 接口输出参数
 * \endif
 */
public class NET_OUT_MODIFY_REMOTEDEVICE_PASSWORD implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * error code, only valid when an error is returned, 0 means no error,0x46e:invalid password
     * \else
     *  错误码, 只在返回错误的时候有意义, 0表示无错误, 0x46e表示密码无效
     * \endif
     */
    public int					     nErrorCode;

    /**
     * \if ENGLISH_LANG
     * when changing the password, if the old password is wrong, the number of remaining attempts can be entered, -1 means unlimited(use when error code is valid)
     * \else
     * 修改密码时，旧密码输错剩余可尝试的输入次数, -1表示无限次(在有错误码有效的时候使用)
     * \endif
     */
    public int					     nRemainModifyTimes;

    /**
     * \if ENGLISH_LANG
     * lock the time remaining to modify the password operation, -1 means not locked(use when error code is valid)
     * \else
     * 锁定修改密码操作剩余时间，-1表示不锁定(在有错误码有效的时候使用)
     * \endif
     */
    public int					     nRemainLockSeconds;
}
