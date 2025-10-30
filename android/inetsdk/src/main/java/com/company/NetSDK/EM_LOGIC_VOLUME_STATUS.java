package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Logic volume status
 * \else
 * 分区状态
 * \endif
 */
public class EM_LOGIC_VOLUME_STATUS implements Serializable {
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
    public static final int EM_LOGIC_VOLUME_STATUS_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * LV not need to repair
     * \else
     * 没有分区需要修复
     * \endif
     */
    public static final int EM_LOGIC_VOLUME_STATUS_NOT_NEED_REPAIR = 0;

    /**
     * \if ENGLISH_LANG
     * LV need to repair
     * \else
     * 有分区需要修复
     * \endif
     */
    public static final int EM_LOGIC_VOLUME_STATUS_LV_NEED_REPAIR = 1;

    /**
     * \if ENGLISH_LANG
     * LV repairing
     * \else
     * 分区正在修复
     * \endif
     */
    public static final int EM_LOGIC_VOLUME_STATUS_LV_REPAIRING = 2;

    /**
     * \if ENGLISH_LANG
     * LV repair completely
     * \else
     * 分区已经修复完成
     * \endif
     */
    public static final int EM_LOGIC_VOLUME_STATUS_LV_REPAIR_COMPLETE = 3;
}
