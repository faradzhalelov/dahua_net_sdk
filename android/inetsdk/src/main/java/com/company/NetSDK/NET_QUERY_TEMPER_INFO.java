package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief temper info
 * \else
 * @brief 温度信息
 * \endif
 */
public class NET_QUERY_TEMPER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  average temper
     * \else
     *  平均温度
     * \endif
     */
    public float					fTemperAve;

    /**
     * \if ENGLISH_LANG
     *  max temper 
     * \else
     *  最高的温度
     * \endif
     */
    public float					fTemperMax;

    /**
     * \if ENGLISH_LANG
     *  min temper
     * \else
     *  最低的温度
     * \endif
     */
    public float					fTemperMin;

}