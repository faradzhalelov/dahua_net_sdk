package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief temperature unit
 * \else
 * @brief 温度单位
 * \endif
 */
public class NET_TEMPERATURE_UNIT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *    NET_TEMPERATURE_UNIT_UNKNOWN,
     * \else
     * NET_TEMPERATURE_UNIT_UNKNOWN,
     * \endif
     */
    public static final int					NET_TEMPERATURE_UNIT_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Centigrade
     * \else
     *  摄氏度
     * \endif
     */
    public static final int					NET_TEMPERATURE_UNIT_CENTIGRADE = 1;

    /**
     * \if ENGLISH_LANG
     *  Fahrenheit
     * \else
     *  华氏度
     * \endif
     */
    public static final int					NET_TEMPERATURE_UNIT_FAHRENHEIT = 2;

}
