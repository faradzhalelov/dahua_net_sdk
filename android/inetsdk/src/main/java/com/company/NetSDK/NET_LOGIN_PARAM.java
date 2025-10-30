package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#LoginEx3} input parameter
 * \else
 * 接口 {@link INetSDK#LoginEx3} 入参
 * \endif
 */
public class NET_LOGIN_PARAM implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * device ip
     * \else
     * 设备ip地址
     * \endif
     */
    public byte[]		szDVRIP = new byte[FinalVar.MAX_ADDRESS_LENGTH];

    /**
     * \if ENGLISH_LANG
     * device port
     * \else
     * 设备端口号
     * \endif
     */
    public int		wDVRPort;

    /**
     * \if ENGLISH_LANG
     * user name
     * \else
     * 用户名
     * \endif
     */
    public byte[]		szUserName = new byte[FinalVar.MAX_USERNAME_LENGTH];

    /**
     * \if ENGLISH_LANG
     * password
     * \else
     * 用户密码
     * \endif
     */
    public byte[] 		szPassword = new byte[FinalVar.MAX_PASSWORD_LENGTH];

    /**
     * \if ENGLISH_LANG
     * login type, refer to {@link EM_LOGIN_SPAC_CAP_TYPE}
     * \else
     * 登陆类型, 取值参考 {@link EM_LOGIN_SPAC_CAP_TYPE}
     * \endif
     */
    public int 		emSpecCap;

    /**
     * \if ENGLISH_LANG
     * TLS policy, refer to {@link EM_TLS_ENCRYPTION_POLICY}
     * \else
     * TLS加密策略, 取值参考 {@link EM_TLS_ENCRYPTION_POLICY}
     * \endif
     */
    public int       	emTlsPolicy;
}
