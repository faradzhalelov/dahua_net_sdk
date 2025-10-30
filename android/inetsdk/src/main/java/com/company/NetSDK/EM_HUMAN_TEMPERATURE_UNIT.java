package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Temperature unit of human temperature detection
 * \else
 * 人体测温温度单位
 * \endif
 */
public class EM_HUMAN_TEMPERATURE_UNIT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknow
     * \else
     * 未知模式
     * \endif
     */
    public static final int EM_HUMAN_TEMPERATURE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * Centigrade
     * \else
     * 摄氏度
     * \endif
     */
    public static final int EM_HUMAN_TEMPERATURE_CENTIGRADE = 0;

    /**
     * \if ENGLISH_LANG
     * Fahrenheit
     * \else
     * 华氏度
     * \endif
     */
    public static final int EM_HUMAN_TEMPERATURE_FAHRENHEIT = 1;

    /**
     * \if ENGLISH_LANG
     * Kelvin
     * \else
     * 开尔文
     * \endif
     */
    public static final int EM_HUMAN_TEMPERATURE_KELVIN = 2;
}
