package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Access protocol
 * \else
 * 门禁协议
 * \endif
 */
public class CFG_EM_ACCESS_PROTOCOL implements Serializable {
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
    public static final int CFG_EM_ACCESS_PROTOCOL_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Local switch control
     * \else
     * 本机开关量控制
     * \endif
     */
    public static final int  CFG_EM_ACCESS_PROTOCOL_LOCAL = 1;
    /**
     * \if ENGLISH_LANG
     * Serial protocol
     * \else
     * 串口协议
     * \endif
     */
    public static final int CFG_EM_ACCESS_PROTOCOL_SERIAL = 2;
    /**
     * \if ENGLISH_LANG
     * Remote udp lock
     * \else
     * 门禁udp开锁
     * \endif
     */
    public static final int CFG_EM_ACCESS_PROTOCOL_REMOTE = 3;

}
