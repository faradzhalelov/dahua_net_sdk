package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input of Set QRCode decode info
 * \else
 * 设置二维码的解码信息入参
 * \endif
 */
public class NET_IN_SET_QRCODE_DECODE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * cipher, refer to {@link NET_ENUM_QRCODE_CIPHER}
     * \else
     * 加密方式. 参考 {@link NET_ENUM_QRCODE_CIPHER}
     * \endif
     */
    public int                             emCipher;

    /**
     * \if ENGLISH_LANG
     * key
     * \else
     * 秘钥
     * \endif
     */
    public byte[]                        szKey = new byte[33];
}
