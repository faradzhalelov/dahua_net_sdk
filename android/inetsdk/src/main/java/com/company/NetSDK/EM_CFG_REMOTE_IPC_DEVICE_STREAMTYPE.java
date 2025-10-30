package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * media stream type
 * \else
 * 媒体流类型
 * \endif
 */
public class EM_CFG_REMOTE_IPC_DEVICE_STREAMTYPE implements Serializable {
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
    public static final int EM_CFG_REMOTE_IPC_DEVICE_STREAM_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * main stream
     * \else
     * 主码流
     * \endif
     */
    public static final int EM_CFG_REMOTE_IPC_DEVICE_STREAM_TYPE_MAIN = 1;

    /**
     * \if ENGLISH_LANG
     * extra stream
     * \else
     * 辅码流
     * \endif
     */
    public static final int EM_CFG_REMOTE_IPC_DEVICE_STREAM_TYPE_EXTRA1 = 2;
}
