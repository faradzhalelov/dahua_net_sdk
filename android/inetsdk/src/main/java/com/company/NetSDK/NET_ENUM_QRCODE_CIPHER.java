package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * QRCode cipher
 * \else
 * 使用的加密算法
 * \endif
 */
public class NET_ENUM_QRCODE_CIPHER implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknow
     * \else
     * 未知
     * \endif
     */
    public static final int NET_ENUM_QRCODE_CIPHER_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * AES-256
     * \else
     * AES-256
     * \endif
     */
    public static final int NET_ENUM_QRCODE_CIPHER_AES256= 1;
}
