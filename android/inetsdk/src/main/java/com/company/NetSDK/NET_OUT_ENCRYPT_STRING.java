package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#EncryptString} ouput parameter
 * \else
 * {@link INetSDK#EncryptString} 接口出参
 * \endif
 */
public class NET_OUT_ENCRYPT_STRING implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Encrypted string
     * \else
     * 加密后字符串
     * \endif
     */
    public byte[]						szEncryptString = new byte[1024];
}
