package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SIM State mode
 * \else
 * SIM卡状态类型
 * \endif
 */
public class EM_SIMSTATE_MODE implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknow
     * \else
     * 未知
     * \endif
     */
    public static final int EM_SIMSTATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * not exist
     * \else
     * 不存在
     * \endif
     */
    public static final int EM_SIMSTATE_UNEXIST = 1;

    /**
     * \if ENGLISH_LANG
     * exist
     * \else
     * 存在
     * \endif
     */
    public static final int EM_SIMSTATE_EXIST = 2;

    /**
     * \if ENGLISH_LANG
     * mobile network number not match
     * \else
     * 移动网络号码不匹配
     * \endif
     */
    public static final int EM_SIMSTATE_UNMATCH = 3;

    /**
     * \if ENGLISH_LANG
     * Pin lock
     * \else
     * Pin码锁
     * \endif
     */
    public static final int EM_SIMSTATE_PINLOCK = 4;

    /**
     * \if ENGLISH_LANG
     * Puk lock
     * \else
     * Puk码锁
     * \endif
     */
    public static final int EM_SIMSTATE_PUKLOCK = 5;
}
