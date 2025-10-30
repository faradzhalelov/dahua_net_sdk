package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief bus oil state
 * \else
 * @brief 车加油状态
 * \endif
 */
public class EM_BUS_OIL_STATE implements Serializable {
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
    public static final int					EM_BUS_OIL_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  refueled
     * \else
     *  已加油
     * \endif
     */
    public static final int					EM_BUS_OIL_STATE_REFUELED = 1;

    /**
     * \if ENGLISH_LANG
     *  not refuel
     * \else
     *  未加油
     * \endif
     */
    public static final int					EM_BUS_OIL_STATE_NOT_REFUEL = 2;

}
