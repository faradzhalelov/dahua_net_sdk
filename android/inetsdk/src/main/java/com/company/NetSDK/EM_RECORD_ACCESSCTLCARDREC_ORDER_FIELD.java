package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Order field of entrance guard access records
 * \else
 * 门禁出入记录排序字段
 * \endif
 */
public class EM_RECORD_ACCESSCTLCARDREC_ORDER_FIELD implements Serializable{

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
    public static final int EM_RECORD_ACCESSCTLCARDREC_ORDER_FIELD_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Record No
     * \else
     * 记录集编号
     * \endif
     */
    public static final int EM_RECORD_ACCESSCTLCARDREC_ORDER_FIELD_RECNO = 1;

    /**
     * \if ENGLISH_LANG
     * Create time
     * \else
     * 创建时间
     * \endif
     */
    public static final int EM_RECORD_ACCESSCTLCARDREC_ORDER_FIELD_CREATETIME = 2;
}
