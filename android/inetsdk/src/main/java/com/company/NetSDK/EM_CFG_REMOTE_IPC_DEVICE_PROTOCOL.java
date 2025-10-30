package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * protocol type
 * \else
 * 协议类型
 * \endif
 */
public class EM_CFG_REMOTE_IPC_DEVICE_PROTOCOL implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_CFG_REMOTE_IPC_DEVICE_PROTOCOL_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * hik
     * \else
     * Hik
     * \endif
     */
    public static final int EM_CFG_REMOTE_IPC_DEVICE_PROTOCOL_HIKVISION = 1;

    /**
     * \if ENGLISH_LANG
     * private 3rd protocol
     * \else
     * 私有三代协议
     * \endif
     */
    public static final int EM_CFG_REMOTE_IPC_DEVICE_PROTOCOL_PRIVATE3 = 2;
}
