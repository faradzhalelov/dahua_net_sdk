package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * driving direction(relate to lane)
 * \else
 * 车辆行驶方向（相对车道方向）
 * \endif
 */
public class EM_VEHICLE_DRIVING_DIRECTION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_VEHICLE_DRIVING_DIRECTION_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * obverse
     * \else
     * 正向
     * \endif
     */
    public static final int EM_VEHICLE_DRIVING_DIRECTION_OBVERSE = 1;

    /**
     * \if ENGLISH_LANG
     * reverse
     * \else
     * 反向
     * \endif
     */
    public static final int EM_VEHICLE_DRIVING_DIRECTION_REVERSE = 2;

}
