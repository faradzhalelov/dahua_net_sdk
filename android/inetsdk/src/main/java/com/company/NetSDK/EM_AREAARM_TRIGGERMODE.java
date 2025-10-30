package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User
 * \else
 * 区域防区操作方式
 * \endif
 */
public class EM_AREAARM_TRIGGERMODE implements Serializable{
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
    public static final int EM_AREAARM_TRIGGERMODE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Keypad
     * \else
     * 键盘
     * \endif
     */
    public static final int EM_AREAARM_TRIGGERMODE_KEYPAD = 1;

    /**
     * \if ENGLISH_LANG
     * Remote control
     * \else
     * 遥控器
     * \endif
     */
    public static final int EM_AREAARM_TRIGGERMODE_REMOTECONTROL = 2;

    /**
     * \if ENGLISH_LANG
     * User
     * \else
     * 用户操作
     * \endif
     */
    public static final int EM_AREAARM_TRIGGERMODE_USER = 3;

    /**
     * \if ENGLISH_LANG
     * local
     * \else
     * 本地
     * \endif
     */
    public static final int EM_AREAARM_TRIGGERMODE_LOCAL = 4;
}
