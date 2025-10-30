package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * face data type
 * \else
 * 目标数据类型
 * \endif
 */
public class EM_FACE_DB_TYPE implements Serializable {
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
    public static final int NET_FACE_DB_TYPE_UNKOWN = 0;

    /**
     * \if ENGLISH_LANG
     * History database, storage is to detect the human face information, usually does not contain face corresponding personnel information
     * \else
     * 历史数据库 = ;存放的是检测出的目标信息 = ;一般没有包含目标对应人员信息
     * \endif
     */
    public static final int NET_FACE_DB_TYPE_HISTORY = 1;

    /**
     * \if ENGLISH_LANG
     * The block list database
     * \else
     * 禁止名单数据库
     * \endif
     */
    public static final int NET_FACE_DB_TYPE_BLACKLIST = 2;

    /**
     * \if ENGLISH_LANG
     * The Allow list database
     * \else
     * 允许名单数据库 = ;废弃
     * \endif
     */
    public static final int NET_FACE_DB_TYPE_WHITELIST = 3;

    /**
     * \if ENGLISH_LANG
     * Alarm library
     * \else
     * 报警库
     * \endif
     */
    public static final int NET_FACE_DB_TYPE_ALARM   = 4;
}
