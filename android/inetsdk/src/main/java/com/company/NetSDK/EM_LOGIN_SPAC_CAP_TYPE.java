package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Login type
 * \else
 * 登陆类型
 * \endif
 */
public class EM_LOGIN_SPAC_CAP_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * TCP login, default
     * \else
     * TCP登陆, 默认方式
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_TCP = 0;

    /**
     * \if ENGLISH_LANG
     * No criteria login
     * \else
     * 无条件登陆
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_ANY = 1;

    /**
     * \if ENGLISH_LANG
     * auto sign up login
     * \else
     * 主动注册的登入
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_SERVER_CONN = 2;

    /**
     * \if ENGLISH_LANG
     * multicast login, default
     * \else
     * 组播登陆
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_MULTICAST = 3;

    /**
     * \if ENGLISH_LANG
     * UDP method login
     * \else
     * UDP方式下的登入
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_UDP = 4;

    /**
     * \if ENGLISH_LANG
     * only main connection login
     * \else
     * 只建主连接下的登入
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_MAIN_CONN_ONLY = 6;

    /**
     * \if ENGLISH_LANG
     * SSL encryption login
     * \else
     * SSL加密方式登陆
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_SSL = 7;

    /**
     * \if ENGLISH_LANG
     * login IVS box remote device
     * \else
     * 登录智能盒远程设备
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_INTELLIGENT_BOX = 9;

    /**
     * \if ENGLISH_LANG
     * login device do not config
     * \else
     * 登录设备后不做取配置操作
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_NO_CONFIG = 10;

    /**
     * \if ENGLISH_LANG
     * USB key device login
     * \else
     * 用U盾设备的登入
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_U_LOGIN = 11;

    /**
     * \if ENGLISH_LANG
     * LDAP login
     * \else
     * LDAP方式登录
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_LDAP = 12;

    /**
     * \if ENGLISH_LANG
     * AD, ActiveDirectory,  login
     * \else
     * AD（ActiveDirectory）登录方式
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_AD = 13;

    /**
     * \if ENGLISH_LANG
     * Radius  login
     * \else
     * Radius 登录方式
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_RADIUS = 14;

    /**
     * \if ENGLISH_LANG
     * Socks5 login
     * \else
     * Socks5登陆方式
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_SOCKET_5 = 15;

    /**
     * \if ENGLISH_LANG
     * cloud login
     * \else
     * 云登陆方式
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_CLOUD = 16;

    /**
     * \if ENGLISH_LANG
     * dual authentication loin
     * \else
     * 二次鉴权登陆方式
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_AUTH_TWICE = 17;

    /**
     * \if ENGLISH_LANG
     * TS stream client login
     * \else
     * TS码流客户端登陆方式
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_TS = 18;

    /**
     * \if ENGLISH_LANG
     * web private login
     * \else
     * 为P2P登陆方式
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_P2P = 19;

    /**
     * \if ENGLISH_LANG
     * mobile client login
     * \else
     * 手机客户端登陆
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_MOBILE = 20;

    /**
     * \if ENGLISH_LANG
     * adapter tls login
     * \else
     * 自适应tls加密
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_TLS_ADAPTER = 21;

    /**
     * \if ENGLISH_LANG
     * compel tls login
     * \else
     * 强制tls加密
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_TLS_COMPEL = 22;

    /**
     * \if ENGLISH_LANG
     * Partial TLS encryption
     * \else
     * 部分tls加密
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_TLS_MAIN_ONLY = 23;

    /**
     * \if ENGLISH_LANG
     * invalid login
     * \else
     * 无效的登陆方式
     * \endif
     */
    public static final int EM_LOGIN_SPEC_CAP_INVALID = 24;

}
