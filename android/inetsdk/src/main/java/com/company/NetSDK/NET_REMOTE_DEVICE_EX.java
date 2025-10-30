package com.company.NetSDK;


import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * info of remote device extend
 * \else
 * 远程设备信息扩展
 * \endif
 */
public class NET_REMOTE_DEVICE_EX implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * password
     * \else
     * 密码
     * \endif
     */
    public byte                szPwdEx2[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * use szPwdEx2 password or not
     * \else
     * 是否使用szPwdEx2密码
     * \endif
     */
    public boolean                bUsePwdEx2;

    /**
     * \if ENGLISH_LANG
     *  IP
     * \else
     *  IP
     * \endif
     */
    public byte					szIpEx[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  use szIpEx IP
     * \else
     *  是否使用szIpEx IP
     * \endif
     */
    public boolean					bUseIpEx;
}
