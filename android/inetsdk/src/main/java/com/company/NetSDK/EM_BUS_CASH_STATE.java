package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief bus cash state
 * \else
 * @brief 收银状态
 * \endif
 */
public class EM_BUS_CASH_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_BUS_CASH_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  cash collected
     * \else
     *  已收银
     * \endif
     */
    public static final int					EM_BUS_CASH_STATE_COLLECTED = 1;

    /**
     * \if ENGLISH_LANG
     *  cash not collect
     * \else
     *  未收银
     * \endif
     */
    public static final int					EM_BUS_CASH_STATE_UNCOLLECT = 2;

}
