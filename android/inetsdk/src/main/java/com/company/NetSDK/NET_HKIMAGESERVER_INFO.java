package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * key of Hik image server info
 * \else
 * Hik视图云存储服务器鉴权密钥
 * \endif
 */
public class NET_HKIMAGESERVER_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * access code，max size is 128 byte
     * \else
     * 接入码,最长支持128个字节
     * \endif
     */
    public byte						szAccessKey[] = new byte[136];

    /**
     * \if ENGLISH_LANG
     * secret key，max size is 128 byte
     * \else
     * 鉴权密钥,最长支持128个字节
     * \endif
     */
    public byte						szSecretKey[] = new byte[136];
}
