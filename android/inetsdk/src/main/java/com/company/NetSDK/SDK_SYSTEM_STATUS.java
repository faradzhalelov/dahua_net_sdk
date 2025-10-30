package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * System status, {@link INetSDK#QuerySystemStatus} input parameter
 * \else
 * 系统状态, {@link INetSDK#QuerySystemStatus} 入参
 * \endif
 * */

public class SDK_SYSTEM_STATUS implements Serializable {

    private static final long           serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * CPU status
     * \else
     * CPU状态
     * \endif
     */
    public SDK_CPU_STATUS               pstuCPU = new SDK_CPU_STATUS();
    /**
     * \if ENGLISH_LANG
     * Memory status
     * \else
     * 内存状态
     * \endif
     */
    public SDK_MEMORY_STATUS            pstuMemory = new SDK_MEMORY_STATUS();
    /**
     * \if ENGLISH_LANG
     * Fan status
     * \else
     * 风扇状态
     * \endif
     */
    public SDK_FAN_STATUS               pstuFan = new SDK_FAN_STATUS();
    /**
     * \if ENGLISH_LANG
     * Power status
     * \else
     * 电源状态
     * \endif
     */
    public SDK_POWER_STATUS             pstuPower = new SDK_POWER_STATUS();
    /**
     * \if ENGLISH_LANG
     * Temperature  status
     * \else
     * 温度状态
     * \endif
     */
    public SDK_TEMPERATURE_STATUS       pstuTemp = new SDK_TEMPERATURE_STATUS();



}
