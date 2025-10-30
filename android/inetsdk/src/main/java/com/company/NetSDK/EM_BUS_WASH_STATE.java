package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief bus wash state
 * \else
 * @brief 洗车状态
 * \endif
 */
public class EM_BUS_WASH_STATE implements Serializable {
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
    public static final int					EM_BUS_WASH_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  washed
     * \else
     *  已洗车
     * \endif
     */
    public static final int					EM_BUS_WASH_STATE_WASHED = 1;

    /**
     * \if ENGLISH_LANG
     *  not wash
     * \else
     *  未洗车
     * \endif
     */
    public static final int					EM_BUS_WASH_STATE_NOT_WASH = 2;

}
