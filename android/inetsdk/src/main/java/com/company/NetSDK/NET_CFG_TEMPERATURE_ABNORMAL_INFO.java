package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Configuration information related to temperature anomaly alarm
 * \else
 * @brief 温度异常报警相关配置信息
 * \endif
 */
public class NET_CFG_TEMPERATURE_ABNORMAL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Temperature abnormal alarm enable
     * \else
     *  温度异常报警使能
     * \endif
     */
    public boolean					bEnabled;

    /**
     * \if ENGLISH_LANG
     *  Temperature alarm threshold, in degrees Celsius
     * \else
     *  温度报警阈值，单位摄氏度
     * \endif
     */
    public int					nMaxTemperature;

    /**
     * \if ENGLISH_LANG
     *  Repeated alarm time
     * \else
     *  重复报警时间
     * \endif
     */
    public int					nReportInterval;

    /**
     * \if ENGLISH_LANG
     *  Temperature calibration value in degrees Celsius
     * \else
     *  温度校准值，单位摄氏度
     * \endif
     */
    public int					nTemperatureCalibration;

}