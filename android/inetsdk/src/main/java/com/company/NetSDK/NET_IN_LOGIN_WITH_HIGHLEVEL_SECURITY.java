package com.company.NetSDK;

import java.io.Serializable;

/**
 * Created by 29875 on 2019/8/28.
 */
public class NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * IP
     * \else
     * IP
     * \endif
     */
    public byte             szIP[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * port
     * \else
     * 端口
     * \endif
     */
    public int				 nPort;

    /**
     * \if ENGLISH_LANG
     * user name
     * \else
     * 用户名
     * \endif
     */
    public byte             szUserName[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * passwd
     * \else
     * 密码
     * \endif
     */
    public byte             szPassword[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * login mode,refer to {@link EM_LOGIN_SPAC_CAP_TYPE}
     * \else
     * 登录模式,取值参考 {@link EM_LOGIN_SPAC_CAP_TYPE}
     * \endif
     */
    public int 		emSpecCap;
	public byte             szLocalIP[] = new byte[64];
}
