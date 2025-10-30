package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#ModifyRemoteDevicePassword} input parameter
 * \else
 *  接口 {@link INetSDK#ModifyRemoteDevicePassword} 接口输入参数
 * \endif
 */
public class NET_IN_MODIFY_REMOTEDEVICE_PASSWORD implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel
     * \else
     * 通道号
     * \endif
     */
    public int              nChannel;
    /**
     * \if ENGLISH_LANG
     * User name
     * \else
     * 用户名
     * \endif
     */
    public byte			szUserName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * New password
     * \else
     * 新密码
     * \endif
     */
    public byte			szNewPassword[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Old password
     * \else
     * 旧密码
     * \endif
     */
    public byte			szOldPassword[] = new byte[128];
}
