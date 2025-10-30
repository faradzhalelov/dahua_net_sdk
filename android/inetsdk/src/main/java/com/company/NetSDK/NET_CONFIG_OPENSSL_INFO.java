package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief OpenSSL library information configuration
 * \else
 * @brief openssl库信息配置
 * \endif
 */
public class NET_CONFIG_OPENSSL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * openssl Protocol library 
     * \else
     * openssl协议库 
     * \endif
     */
    public byte					szSsleay[] = new byte[FinalVar.MAX_PATH];

    /**
     * \if ENGLISH_LANG
     * openssl Encryption library
     * \else
     * openssl加密库
     * \endif
     */
    public byte					szLibeay[] = new byte[FinalVar.MAX_PATH];

}