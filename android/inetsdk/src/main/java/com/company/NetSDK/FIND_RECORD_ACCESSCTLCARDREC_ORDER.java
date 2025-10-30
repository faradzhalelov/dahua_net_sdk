package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Order rule of entrance guard access records
 * \else
 * 门禁出入记录排序规则详情
 * \endif
 */
public class FIND_RECORD_ACCESSCTLCARDREC_ORDER implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Order field, refer to {@Link EM_RECORD_ACCESSCTLCARDREC_ORDER_FIELD}
     * \else
     * 排序字段,参考 EM_RECORD_ACCESSCTLCARDREC_ORDER_FIELD
     * \endif
     */
    public int                      emField;

    /**
     * \if ENGLISH_LANG
     * Order type， refer to {@Link EM_RECORD_ORDER_TYPE}
     * \else
     * 排序类型, 参考 EM_RECORD_ORDER_TYPE
     * \endif
     */
    public int                      emOrderType;
}
