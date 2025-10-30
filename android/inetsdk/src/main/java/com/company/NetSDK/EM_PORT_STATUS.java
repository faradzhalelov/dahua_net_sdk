package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * port connection status
 * \else
 * 端口连接状态
 * \endif
 */
public class EM_PORT_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_PORT_STATUS_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * Down
     * \else
     * 未连接
     * \endif
     */
    public static final int EM_PORT_STATUS_DOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Up
     * \else
     * 连接
     * \endif
     */
    public static final int EM_PORT_STATUS_UP = 1;
}
