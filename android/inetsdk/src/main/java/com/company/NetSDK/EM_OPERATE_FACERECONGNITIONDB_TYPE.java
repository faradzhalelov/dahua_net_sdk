package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Type of Target recognition database operations
 * \else
 * 目标识别数据库操作类型
 * \endif
 */
public class EM_OPERATE_FACERECONGNITIONDB_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknow
     * \else
     * 未知
     * \endif
     */
    public static final int NET_FACERECONGNITIONDB_UNKOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Add personnel information and target samples, if researchers already exists, image data and the original data
     * \else
     * 添加人员信息和目标样本,如果人员已经存在,图片数据和原来的数据合并
     * \endif
     */
    public static final int NET_FACERECONGNITIONDB_ADD = 1;

    /**
     * \if ENGLISH_LANG
     * Delete the personnel information and target samples
     * \else
     * 删除人员信息和目标样本
     * \endif
     */
    public static final int NET_FACERECONGNITIONDB_DELETE = 2;

    /**
     * \if ENGLISH_LANG
     * Modify person info and human target sample, must input person UID
     * \else
     * 修改人员信息和目标样本,人员的UID标识必填
     * \endif
     */
    public static final int NET_FACERECONGNITIONDB_MODIFY = 3;

    /**
     * \if ENGLISH_LANG
     * Delete person info and human target via UID
     * \else
     * 通过UID删除人员信息和目标样本
     * \endif
     */
    public static final int NET_FACERECONGNITIONDB_DELETE_BY_UID = 4;
}
