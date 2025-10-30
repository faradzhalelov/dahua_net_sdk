package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Human body ARGtemp_meas status
 * \else
 * @brief 人体测温状态
 * \endif
 */
public class EM_HUMAN_TEMPERATURE_STATUS implements Serializable {
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
    public static final int					EM_HUMAN_TEMPERATURE_STATUS_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  Low temperature
     * \else
     *  温度异常
     * \endif
     */
    public static final int					EM_HUMAN_TEMPERATURE_STATUS_LOW = 0;

    /**
     * \if ENGLISH_LANG
     *  Normal temperature
     * \else
     *  正常
     * \endif
     */
    public static final int					EM_HUMAN_TEMPERATURE_STATUS_NORMAL = 1;

    /**
     * \if ENGLISH_LANG
     *  High temperature
     * \else
     *  温度异常
     * \endif
     */
    public static final int					EM_HUMAN_TEMPERATURE_STATUS_HIGH = 2;

}
