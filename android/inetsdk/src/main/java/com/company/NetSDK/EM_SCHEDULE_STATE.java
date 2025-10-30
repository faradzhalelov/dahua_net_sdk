package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief schedule state
 * \else
 * @brief 排班状态
 * \endif
 */
public class EM_SCHEDULE_STATE implements Serializable {
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
    public static final int					EM_SCHEDULE_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  schedule
     * \else
     *  已排班
     * \endif
     */
    public static final int					EM_SCHEDULE_STATE_SCHEDULED = 1;

    /**
     * \if ENGLISH_LANG
     *  not schedule
     * \else
     *  未排班
     * \endif
     */
    public static final int					EM_SCHEDULE_STATE_NOT_SCHEDULE = 2;

}
