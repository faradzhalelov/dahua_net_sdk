package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * protocol function of serial protocol
 * \else
 * 串口协议下的具体协议功能
 * \endif
 */
public class CFG_EM_SERIAL_PROTOCOL_TYPE implements Serializable {
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
    public static final int CFG_EM_SERIAL_PROTOCOL_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * Unused
     * \else
     * 未使用
     * \endif
     */
    public static final int  CFG_EM_SERIAL_PROTOCOL_TYPE_UNUSED = 0;
    /**
     * \if ENGLISH_LANG
     * Access 485
     * \else
     * 门禁485
     * \endif
     */
    public static final int CFG_EM_SERIAL_PROTOCOL_TYPE_DAHUA_ACCESS_485 = 1;
    /**
     * \if ENGLISH_LANG
     * Ladder control
     * \else
     * 梯控
     * \endif
     */
    public static final int CFG_EM_SERIAL_PROTOCOL_TYPE_LADDER_CONTROL = 2;
    /**
     * \if ENGLISH_LANG
     * Remote read head
     * \else
     * 远距离读头
     * \endif
     */
    public static final int CFG_EM_SERIAL_PROTOCOL_TYPE_REMOTE_READ_HEAD = 3;
}
