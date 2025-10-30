package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#EncryptString} input parameter
 * \else
 * {@link INetSDK#EncryptString} 接口入参
 * \endif
 */
public class NET_IN_ENCRYPT_STRING implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Card Number
     * \else
     * 卡号(需要加密的字符串)
     * \endif
     */
    public byte[]						   szCard = new byte[33];

    /**
     * \if ENGLISH_LANG
     * Secret Key
     * \else
     * 秘钥
     * \endif
     */
    public byte[]                        szKey = new byte[33];
}
