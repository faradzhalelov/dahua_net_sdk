package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * operation type
 * \else
 * 人员组操作枚举
 * \endif
 */
public class EM_OPERATE_FACERECONGNITION_GROUP_TYPE implements Serializable {
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
    public static final int NET_FACERECONGNITION_GROUP_UNKOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Add face group
     * \else
     * 添加人员组信息
     * \endif
     */
    public static final int NET_FACERECONGNITION_GROUP_ADD = 1;

    /**
     * \if ENGLISH_LANG
     * Modify face group
     * \else
     * 修改人员组信息
     * \endif
     */
    public static final int NET_FACERECONGNITION_GROUP_MODIFY = 2;

    /**
     * \if ENGLISH_LANG
     * Delete face group
     * \else
     * 删除人员组信息
     * \endif
     */
    public static final int NET_FACERECONGNITION_GROUP_DELETE = 3;
}
