package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Battery Information
 * \else
 * 电池信息
 * \endif
 */
public class SDK_BATTERY_INFO implements Serializable {
    /**
     *
     */
    private static final long       serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Battery Capacity Percentage
     * \else
     * 电池容量百分比
     * \endif
     */
    public int                      nPercent;
    /**
     * \if ENGLISH_LANG
     * Whether real charging
     * \else
     * 是否正在充电
     * \endif
     */
    public boolean                  bCharging;
    /**
     * \if ENGLISH_LANG
     * battery in-place status, refer to {@link EM_BATTERY_EXIST_STATE}
     * \else
     * 电池在位状态, 参考 {@link EM_BATTERY_EXIST_STATE}
     * \endif
     */
    public int                      emExistState;
    /**
     * \if ENGLISH_LANG
     * battery power status, refer to {@link EM_BATTERY_STATE}
     * \else
     * 电池电量状态, 参考 {@link EM_BATTERY_STATE}
     * \endif
     */
    public int                      emState;
    /**
     * \if ENGLISH_LANG
     * battery voltage
     * \else
     * 电池电压
     * \endif
     */
    public float                    fVoltage;

}
