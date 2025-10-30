package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User
 * \else
 * 区域防区操作用户
 * \endif
 */
public class EM_AREAARM_USER implements Serializable{
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
    public static final int EM_AREAARM_USER_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Supervisor
     * \else
     * Supervisor
     * \endif
     */
    public static final int EM_AREAARM_USER_SUPERVISOR = 1;

    /**
     * \if ENGLISH_LANG
     * Manager
     * \else
     * 管理用户
     * \endif
     */
    public static final int EM_AREAARM_USER_MANAGER = 2;

    /**
     * \if ENGLISH_LANG
     * Main
     * \else
     * 主用户
     * \endif
     */
    public static final int EM_AREAARM_USER_MASTER = 3;

    /**
     * \if ENGLISH_LANG
     * User
     * \else
     * 普通用户
     * \endif
     */
    public static final int EM_AREAARM_USER_USER = 4;

    /**
     * \if ENGLISH_LANG
     * Temporary
     * \else
     * 临时用户
     * \endif
     */
    public static final int EM_AREAARM_USER_TEMPORARY = 5;

    /**
     * \if ENGLISH_LANG
     * Duress
     * \else
     * 胁迫用户
     * \endif
     */
    public static final int EM_AREAARM_USER_DURESS = 6;

    /**
     * \if ENGLISH_LANG
     * Patrol
     * \else
     * 巡逻用户
     * \endif
     */
    public static final int EM_AREAARM_USER_PATROL = 7;
}
