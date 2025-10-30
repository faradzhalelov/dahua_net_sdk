package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Logic volume repair status
 * \else
 * 分区修复状态
 * \endif
 */
public class EM_LOGIC_VOLUME_REPAIR_STATUS implements Serializable {
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
    public static final int EM_LOGIC_VOLUME_REPAIR_STATUS_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * Repair failed
     * \else
     * 修复失败
     * \endif
     */
    public static final int EM_LOGIC_VOLUME_REPAIR_STATUS_FAILED = 0;

    /**
     * \if ENGLISH_LANG
     * Repair success
     * \else
     * 修复成功
     * \endif
     */
    public static final int EM_LOGIC_VOLUME_REPAIR_STATUS_SUCCESS = 1;
}
