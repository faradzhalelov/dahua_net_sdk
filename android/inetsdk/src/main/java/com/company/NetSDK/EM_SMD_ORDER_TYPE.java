package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief SMD Order type
 * \else
 * @brief 查询排序方式
 * \endif
 */
public class EM_SMD_ORDER_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_SMD_ORDER_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Ascorder
     * \else
     *  升序
     * \endif
     */
    public static final int					EM_SMD_ORDER_TYPE_ASCORDER = 1;

    /**
     * \if ENGLISH_LANG
     *  Desorder
     * \else
     *  降序
     * \endif
     */
    public static final int					EM_SMD_ORDER_TYPE_DESORDER = 2;

}
