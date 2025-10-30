package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief bus repair state
 * \else
 * @brief 车修理状态
 * \endif
 */
public class EM_BUS_REPAIR_STATE implements Serializable {
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
    public static final int					EM_BUS_REPAIR_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  not repair
     * \else
     *  未修理
     * \endif
     */
    public static final int					EM_BUS_REPAIR_STATE_NOT_REPAIR = 1;

    /**
     * \if ENGLISH_LANG
     *  repairing
     * \else
     *  修理中
     * \endif
     */
    public static final int					EM_BUS_REPAIR_STATE_REPAIRING = 2;

}
