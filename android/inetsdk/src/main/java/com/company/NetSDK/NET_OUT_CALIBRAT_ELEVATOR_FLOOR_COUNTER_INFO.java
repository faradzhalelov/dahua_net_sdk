package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_CalibratElevatorFloorCounter output parameter
 * \else
 * @brief CLIENT_CalibratElevatorFloorCounter接口出参
 * \endif
 */
public class NET_OUT_CALIBRAT_ELEVATOR_FLOOR_COUNTER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Distance from the last calibrated floor to the current floor
     * \else
     *  上一次标定的楼层到当前楼层的距离，单位m
     * \endif
     */
    public double					dbHeight;

    /**
     * \if ENGLISH_LANG
     *  The last calibrated floor, if it has never been calibrated before, returns to the current floor
     * \else
     *  上一次校准的楼层，若之前从未校准过，则返回当前楼层
     * \endif
     */
    public int					nLastFloor;

}