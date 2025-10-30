package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Gyro data information
 * \else
 * @brief 回调的陀螺仪数据信息
 * \endif
 */
public class NET_NOTIFY_GYRO_DATA_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  X-axis angular velocity, unit: rad/s
     * \else
     *  X轴角速度，单位rad/s
     * \endif
     */
    public double					dbAngularSpeedX;

    /**
     * \if ENGLISH_LANG
     *  Y-axis angular velocity, unit: rad/s
     * \else
     *  Y轴角速度，单位rad/s
     * \endif
     */
    public double					dbAngularSpeedY;

    /**
     * \if ENGLISH_LANG
     *  Z-axis angular velocity, unit: rad/s
     * \else
     *  z轴角速度，单位rad/s
     * \endif
     */
    public double					dbAngularSpeedZ;

    /**
     * \if ENGLISH_LANG
     *  X-axis acceleration, unit: m/s^2
     * \else
     *  X轴加速度，单位m/s^2
     * \endif
     */
    public double					dbAccelX;

    /**
     * \if ENGLISH_LANG
     *  Y-axis acceleration, unit: m/s^2
     * \else
     *  Y轴加速度，单位m/s^2
     * \endif
     */
    public double					dbAccelY;

    /**
     * \if ENGLISH_LANG
     *  Z-axis acceleration, unit: m/s^2
     * \else
     *  Z轴加速度，单位m/s^2
     * \endif
     */
    public double					dbAccelZ;

    @Override
    public String toString() {
        return "NET_NOTIFY_GYRO_DATA_INFO{" +
                "dbAngularSpeedX=" + dbAngularSpeedX +
                ", dbAngularSpeedY=" + dbAngularSpeedY +
                ", dbAngularSpeedZ=" + dbAngularSpeedZ +
                ", dbAccelX=" + dbAccelX +
                ", dbAccelY=" + dbAccelY +
                ", dbAccelZ=" + dbAccelZ +
                '}';
    }
}
