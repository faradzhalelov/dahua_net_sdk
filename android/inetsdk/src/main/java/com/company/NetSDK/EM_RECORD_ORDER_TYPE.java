package com.company.NetSDK;
import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Order field of entrance guard access records
 * \else
 * 门禁出入记录排序字段
 * \endif
 */
public class EM_RECORD_ORDER_TYPE implements Serializable{

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
    public static final int                        EM_RECORD_ORDER_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Ascent
     * \else
     * 升序
     * \endif
     */
    public static final int                        EM_RECORD_ORDER_TYPE_ASCENT = 1;

    /**
     * \if ENGLISH_LANG
     * Descent
     * \else
     * 降序
     * \endif
     */
    public static final int                        EM_RECORD_ORDER_TYPE_DESCENT = 2;

}
