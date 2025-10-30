package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief weight info
 * \else
 * @brief 称重信息
 * \endif
 */
public class EVENT_CUSTOM_WEIGHT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Rough Weight,unit:KG
     * \else
     *  毛重,车辆满载货物重量。单位KG
     * \endif
     */
    public int					dwRoughWeight;

    /**
     * \if ENGLISH_LANG
     *  Tare Weight,unit:KG
     * \else
     *  皮重,空车重量。单位KG
     * \endif
     */
    public int					dwTareWeight;

    /**
     * \if ENGLISH_LANG
     *  Net Weight,unit:KG
     * \else
     *  净重,载货重量。单位KG
     * \endif
     */
    public int					dwNetWeight;

}
