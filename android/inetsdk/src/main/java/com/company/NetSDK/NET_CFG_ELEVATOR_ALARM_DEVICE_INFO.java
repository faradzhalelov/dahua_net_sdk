package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Elevator floor alarm related configuration, corresponding to NET_EM_CFG_ELEVATOR_ALARM_CONFIG
 * \else
 * @brief 电梯楼层报警相关配置, 对应枚举 NET_EM_CFG_ELEVATOR_ALARM_CONFIG
 * \endif
 */
public class NET_CFG_ELEVATOR_ALARM_DEVICE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Configuration related to temperature abnormal alarm
     * \else
     *  温度异常报警相关配置
     * \endif
     */
    public NET_CFG_TEMPERATURE_ABNORMAL_INFO					stuTemperatureAbnormal = new NET_CFG_TEMPERATURE_ABNORMAL_INFO();

    /**
     * \if ENGLISH_LANG
     *  Configuration related to overspeed alarm
     * \else
     *  超速报警相关配置
     * \endif
     */
    public NET_CFG_OVER_SPEED_INFO					stuOverSpeed = new NET_CFG_OVER_SPEED_INFO();

    /**
     * \if ENGLISH_LANG
     *  Configuration related to shake detection
     * \else
     *  晃动检测相关配置
     * \endif
     */
    public NET_CFG_SWAY_ABNORMAL_INFO					stuSwayAbnormal = new NET_CFG_SWAY_ABNORMAL_INFO();

    /**
     * \if ENGLISH_LANG
     *  Top flushing alarm enable
     * \else
     *  冲顶报警使能
     * \endif
     */
    public boolean					bMoveOverTopEnabled;

    /**
     * \if ENGLISH_LANG
     *  Squatting alarm enable
     * \else
     *  蹲底报警使能
     * \endif
     */
    public boolean					bMoveUnderBottomEnabled;

    /**
     * \if ENGLISH_LANG
     *  Non level elevator stop alarm enable
     * \else
     *  非平层停梯报警使能
     * \endif
     */
    public boolean					bStopBetweenFloorsEnabled;

    /**
     * \if ENGLISH_LANG
     *  Door opening and elevator alarm enable
     * \else
     *  开门走梯报警使能
     * \endif
     */
    public boolean					bOpenDoorMoveEnabled;

}