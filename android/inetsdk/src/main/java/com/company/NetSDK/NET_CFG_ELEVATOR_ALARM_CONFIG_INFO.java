package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Elevator floor alarm related configuration, corresponding to NET_EM_CFG_ELEVATOR_ALARM_CONFIG
 * \else
 * @brief 电梯楼层报警相关配置, 对应枚举 NET_EM_CFG_ELEVATOR_ALARM_CONFIG
 * \endif
 */
public class NET_CFG_ELEVATOR_ALARM_CONFIG_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Configuration of each channel
     * \else
     *  每个通道的配置
     * \endif
     */
    public NET_CFG_ELEVATOR_ALARM_DEVICE_INFO					stuElevatorAlarmDevice[] = new NET_CFG_ELEVATOR_ALARM_DEVICE_INFO[2];

    /**
     * \if ENGLISH_LANG
     *  Channel number
     * \else
     *  通道数量
     * \endif
     */
    public int					nDeviceNum;

    public NET_CFG_ELEVATOR_ALARM_CONFIG_INFO() {
        for(int i = 0; i < 2; i ++){
            stuElevatorAlarmDevice[i] = new NET_CFG_ELEVATOR_ALARM_DEVICE_INFO();
        }
    }
}