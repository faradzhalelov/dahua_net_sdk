package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Card Status
 * \else
 * 卡状态
 * \endif
 */
public class NET_ACCESSCTLCARD_STATE implements Serializable {
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
    public static final int NET_ACCESSCTLCARD_STATE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * Normal
     * \else
     * 正常
     * \endif
     */
    public static final int NET_ACCESSCTLCARD_STATE_NORMAL = 0;

    /**
     * \if ENGLISH_LANG
     * Lose
     * \else
     * 挂失
     * \endif
     */
    public static final int NET_ACCESSCTLCARD_STATE_LOSE = 0x01;

    /**
     * \if ENGLISH_LANG
     * Logoff
     * \else
     * 注销
     * \endif
     */
    public static final int NET_ACCESSCTLCARD_STATE_LOGOFF = 0x02;

    /**
     * \if ENGLISH_LANG
     * Freeze
     * \else
     * 冻结
     * \endif
     */
    public static final int NET_ACCESSCTLCARD_STATE_FREEZE = 0x04;

    /**
     * \if ENGLISH_LANG
     * Arrears
     * \else
     * 欠费
     * \endif
     */
    public static final int NET_ACCESSCTLCARD_STATE_ARREARAGE = 0x08;

    /**
     * \if ENGLISH_LANG
     * Overdue
     * \else
     * 逾期
     * \endif
     */
    public static final int NET_ACCESSCTLCARD_STATE_OVERDUE = 0x10;

    /**
     * \if ENGLISH_LANG
     * Pre-Arrears(still can open the door)
     * \else
     * 预欠费(还是可以开门,但有语音提示)
     * \endif
     */
    public static final int NET_ACCESSCTLCARD_STATE_PREARREARAGE = 0x20;
}
