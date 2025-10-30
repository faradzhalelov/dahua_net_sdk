package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * area alarm trigger type
 * \else
 * 区域报警触发类型
 * \endif
 */
public class EM_AREAALARM_TRIGGER_TYPE implements Serializable {
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
    public static final int EM_AREAALARM_TRIGGER_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Open
     * \else
     * 通道打开
     * \endif
     */
    public static final int EM_AREAALARM_TRIGGER_TYPE_ALARM = 1;

    /**
     * \if ENGLISH_LANG
     * tamper
     * \else
     * 通道防拆
     * \endif
     */
    public static final int EM_AREAALARM_TRIGGER_TYPE_TAMPER = 2;

    /**
     * \if ENGLISH_LANG
     * mask
     * \else
     * 通道遮挡
     * \endif
     */
    public static final int EM_AREAALARM_TRIGGER_TYPE_MASK = 3;

    /**
     * \if ENGLISH_LANG
     * short
     * \else
     * 通道防短
     * \endif
     */
    public static final int EM_AREAALARM_TRIGGER_TYPE_SHORT = 4;
}
