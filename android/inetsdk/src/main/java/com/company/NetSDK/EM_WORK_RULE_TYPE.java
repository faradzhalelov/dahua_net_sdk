package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * current work rule type
 * \else
 * 当前作业规则类型
 * \endif
 */
public class EM_WORK_RULE_TYPE implements Serializable {
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
    public static final int EM_WORK_RULE_TYPE_UNKNOWN = 0;
    /**
     * \if ENGLISH_LANG
     * NO WORKER
     * \else
     * 脱岗检测
     * \endif
     */
    public static final int EM_WORK_RULE_TYPE_NOWORKER = 1;
    /**
     * \if ENGLISH_LANG
     * SINGLE WORKER
     * \else
     * 单人作业
     * \endif
     */
    public static final int EM_WORK_RULE_TYPE_SINGLEWORKER = 2;
}
