package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_ SetSDKLocalCfg/CLIENT_ Getsdklocalcfg interface configuration local parameter type
 * \else
 * @brief CLIENT_SetSDKLocalCfg/CLIENT_GetSDKLocalCfg 接口配置本地参数类型
 * \endif
 */
public class NET_EM_SDK_LOCAL_CFG_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * OpenSSL library information configuration, corresponding to the structure of NET_CONFIG_OPENSSL_INFO
     * \else
     *  openssl库信息配置，对应结构体 NET_CONFIG_OPENSSL_INFO
     * \endif
     */
    public static final int					NET_SDK_LOCAL_CFG_TYPE_OPENSSL = 0;

    /**
     * \if ENGLISH_LANG
     * StreamConvertor transcoding library information configuration corresponding to the structure of NET_CONFIG_STREAMCONVERTOR_INFO
     * \else
     *  StreamConvertor转码库信息配置，对应结构体 NET_CONFIG_STREAMCONVERTOR_INFO
     * \endif
     */
    public static final int					NET_SDK_LOCAL_CFG_TYPE_STREAMCONVERTOR = 1;

    /**
     * \if ENGLISH_LANG
     *  avnetsdk library information configuration corresponding to the structure of NET_CONFIG_AVNETSDK_INFO
     * \else
     *  avnetsdk库信息配置，对应结构体 NET_CONFIG_AVNETSDK_INFO
     * \endif
     */
    public static final int					NET_SDK_LOCAL_CFG_TYPE_AVNETSDK = 2;

    /**
     * \if ENGLISH_LANG
     *  Configure the TLS certificate path for national security, corresponding to the structure NET_CONFIG_NTLS_VERIFY_INFO
     * \else
     *  国密TLS证书路径配置，对应结构体 NET_CONFIG_NTLS_VERIFY_INFO
     * \endif
     */
    public static final int					NET_SDK_LOCAL_CFG_TYPE_NTLS_VERIFY = 3;

    /**
     * \if ENGLISH_LANG
     *  Hardware encryption engine library path configuration, corresponding to the structure NET_CONFIG_HARD_ENGINE_INFO
     * \else
     *  硬件加密引擎库路径配置，对应结构体 NET_CONFIG_HARD_ENGINE_INFO
     * \endif
     */
    public static final int					NET_SDK_LOCAL_CFG_TYPE_HARD_ENGINE = 4;

}