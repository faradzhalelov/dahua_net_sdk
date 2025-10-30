package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Fan info
 * \else
 * 风扇信息
 * \endif
 */
public class SDK_FAN_INFO implements Serializable {
    /**
     *
     */
    private static final long       serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * Name
     * \else
     * 名称
     * \endif
     */
    public byte[]                   szName = new byte[64];
    /**
     * \if ENGLISH_LANG
     * Speed
     * \else
     * 速度
     * \endif
     */
    public int                      nSpeed;
}
