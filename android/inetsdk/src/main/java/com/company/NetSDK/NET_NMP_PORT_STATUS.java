package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NMP device port status information
 * \else
 *  NMP 设备端口状态信息
 * \endif
 */
public class NET_NMP_PORT_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Port number
     * \else
     * 端口号
     * \endif
     */
    public int                nLocalPortId;

    /**
     * \if ENGLISH_LANG
     * Port connection status,refer to {@link EM_PORT_STATUS}
     * \else
     * 端口连接状态,参考{@link EM_PORT_STATUS}
     * \endif
     */
    public int      emPortStatus;


}
