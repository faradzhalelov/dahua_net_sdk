package com.company.NetSDK;

import java.io.Serializable;

/**
 * Created by 29875 on 2019/8/28.
 */
public class NET_IN_POST_LOGIN_TASK implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * device ip
     * \else
     * 设备IP
     * \endif
     */
    public String               szIp;

    /**
     * \if ENGLISH_LANG
     * device port
     * \else
     * 设备端口
     * \endif
     */
    public int				     nPort;

    /**
     * \if ENGLISH_LANG
     * device user name
     * \else
     * 设备账户
     * \endif
     */
    public String				szName;

    /**
     * \if ENGLISH_LANG
     * device password
     * \else
     * 设备密码
     * \endif
     */
    public String				szPwd;

    /**
     * \if ENGLISH_LANG
     * login type,currently only support EM_LOGIN_SPEC_CAP_TCP, refer to {@link EM_LOGIN_SPAC_CAP_TYPE}
     * \else
     * 登录方式，目前只支持 EM_LOGIN_SPEC_CAP_TCP、,取值参考 {@link EM_LOGIN_SPAC_CAP_TYPE}
     * \endif
     */
    public int 		         emSpecCap;


    // EM_LOGIN_SPEC_CAP_MAIN_CONN_ONLY and EM_LOGIN_SPEC_CAP_P2P //EM_TCP_LOGIN_CONFIG_TYPE

    /**
     * \if ENGLISH_LANG
     * configure to get when emSpecCap is EM_LOGIN_SPEC_CAP_TCP, configure relate to stream
     * EM_TCP_LOGIN_CONFIG_TYPE_UNKNOWN:stream transmits by TCP; EM_TCP_LOGIN_CONFIG_TYPE_MULTICAST:stream transmits by multicast
     * refer to {@link EM_TCP_LOGIN_CONFIG_TYPE}
     * \else
     * 当emSpecCap为EM_LOGIN_SPEC_CAP_TCP时，需要获取的配置类型,此时获取的配置和拉流相关
     * 当为EM_TCP_LOGIN_CONFIG_TYPE_UNKNOWN时，码流通过TCP传输，为EM_TCP_LOGIN_CONFIG_TYPE_MULTICAST时，码流通过组播传输
     * 取值参考 {@link EM_TCP_LOGIN_CONFIG_TYPE}
     * \endif
     */
    public int	emConfigType;

    /**
     * \if ENGLISH_LANG
     * callback
     * \else
     * 登陆结果回调
     * \endif
     */
    public CB_fPostLoginTask      cbLogin;

    /**
     * \if ENGLISH_LANG
     * high level security
     * \else
     * 是否高安全等级登陆
     * \endif
     */
    public boolean			bHighLevelSecurity;
}
