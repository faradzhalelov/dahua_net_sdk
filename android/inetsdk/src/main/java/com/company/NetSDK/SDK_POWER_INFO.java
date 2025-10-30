package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Power info
 * \else
 * 电源信息
 * \endif
 */
public class SDK_POWER_INFO implements Serializable {
    /**
     *
     */
    private static final long       serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * Power is on or not
     * \else
     * 电源状态, 0-关闭, 1-打开, 2-打开但有故障
     * \endif
     */
    public boolean                  bPowerOn;
    /**
     * \if ENGLISH_LANG
     * power current status, refer to {@link EM_CURRENT_STATE_TYPE}
     * \else
     * 电源电流状态, 参考 {@link EM_CURRENT_STATE_TYPE}
     * \endif
     */
    public int                      emCurrentState;
    /**
     * \if ENGLISH_LANG
     * power voltage status, refer to {@link EM_VOLTAGE_STATE_TYPE}
     * \else
     * 电源电压状态, 参考 {@link EM_VOLTAGE_STATE_TYPE}
     * \endif
     */
    public int                      emVoltageState;

}
