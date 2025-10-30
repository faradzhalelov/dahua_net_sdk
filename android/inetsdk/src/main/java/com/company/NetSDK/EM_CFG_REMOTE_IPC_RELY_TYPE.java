package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * rely device type
 * \else
 * 依赖设备类型
 * \endif
 */
public class EM_CFG_REMOTE_IPC_RELY_TYPE implements Serializable {
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
    public static final int EM_CFG_REMOTE_IPC_RELY_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * IPC
     * \else
     * IPC
     * \endif
     */
    public static final int EM_CFG_REMOTE_IPC_RELY_TYPE_IPC = 1;

    /**
     * \if ENGLISH_LANG
     * NVR
     * \else
     * NVR
     * \endif
     */
    public static final int EM_CFG_REMOTE_IPC_RELY_TYPE_NVR = 2;
}
