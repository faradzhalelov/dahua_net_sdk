package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief temperature unit
 * \else
 * @brief 温度单位
 * \endif
 */
public class EM_TEMPERATURE_UNIT implements Serializable {
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
    public static final int					EM_TEMPERATURE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  centigrade
     * \else
     *  摄氏度
     * \endif
     */
    public static final int					EM_TEMPERATURE_CENTIGRADE = 0;

    /**
     * \if ENGLISH_LANG
     *  fahrenheit
     * \else
     *  华氏度
     * \endif
     */
    public static final int					EM_TEMPERATURE_FAHRENHEIT = 1;

    /**
     * \if ENGLISH_LANG
     *  kelvin
     * \else
     *  开尔文
     * \endif
     */
    public static final int					EM_TEMPERATURE_KELVIN = 2;

}