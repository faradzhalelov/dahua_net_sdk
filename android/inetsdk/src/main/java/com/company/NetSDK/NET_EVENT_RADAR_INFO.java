package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Radar Info
 * \else
 * @brief 物体在雷达坐标系中的信息
 * \endif
 */
public class NET_EVENT_RADAR_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  X, unit: metre
     * \else
     *  X轴坐标(横向距离)，单位：米
     * \endif
     */
    public float					fCoordinateX;

    /**
     * \if ENGLISH_LANG
     *  Y, unit: metre
     * \else
     *  Y轴坐标（纵向距离），单位：米
     * \endif
     */
    public float					fCoordinateY;

    /**
     * \if ENGLISH_LANG
     *  Radar target transverse acceleration ax, The unit is m/s2
     * \else
     *  雷达目标横向加速度ax, 横向指设备视角的右手方向; 数据为正表示车辆加速, 数据为负表示车辆减速; 单位为m/s2
     * \endif
     */
    public float					fAccelerationX;

    /**
     * \if ENGLISH_LANG
     *  Radar target longitudinal acceleration ay, The unit is m/s2
     * \else
     *  雷达目标纵向加速度ay，纵向指设备视角的正前方向；数据为正表示车辆加速，数据为负表示车辆减速；单位为m/s2
     * \endif
     */
    public float					fAccelerationY;

}