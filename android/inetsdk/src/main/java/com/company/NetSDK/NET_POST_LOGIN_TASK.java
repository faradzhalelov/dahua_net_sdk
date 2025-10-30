package com.company.NetSDK;

import java.io.Serializable;

/**
 * Created by 29875 on 2019/8/28.
 */
public class NET_POST_LOGIN_TASK implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * device login ID
     * \else
     * 登录句柄
     * \endif
     */
    public long     	lLoginID;

    /**
     * \if ENGLISH_LANG
     * device ip
     * \else
     * 设备IP
     * \endif
     */
    public String				pchDVRIP;

    /**
     * \if ENGLISH_LANG
     * device port
     * \else
     * 设备端口
     * \endif
     */
    public long     	nDVRPort;

    /**
     * \if ENGLISH_LANG
     * device state. bOnline:TRUE,login success; FALSE,login fail.
     * \else
     * 设备状态 bOnline为TRUE表示登录成功，为FALSE时表示登录失败。
     * \endif
     */
    public boolean      bOnline;

    /**
     * \if ENGLISH_LANG
     * Device extension info
     * \else
     * 设备信息扩展
     * \endif
     */
    public NET_DEVICEINFO_Ex			stuDeviceInfo = new NET_DEVICEINFO_Ex();

    /**
     * \if ENGLISH_LANG
     * bOnline:TRUE,login success; FALSE,login fail. When login failed, the meaning of nError relate to the error code in CLIENT_Login
     * meanwhile nError is LOGIN_TYPE_DEVICE_NOT_SUPPORT meaning the device not support the login type
     * \else
     * 当登陆失败时（bOnline为FALSE），nError 的错误码含义说明参考 CLIENT_Login 中的 error 说明，
     * 同时，当nError为 LOGIN_TYPE_DEVICE_NOT_SUPPORT 时，表示设备不支持此种登录方式
     * \endif
     */
    public int nError;

}
