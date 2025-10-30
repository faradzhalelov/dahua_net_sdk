package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_CalibratElevatorFloorCounter input parameter
 * \else
 * @brief CLIENT_CalibratElevatorFloorCounter 接口入参
 * \endif
 */
public class NET_IN_CALIBRAT_ELEVATOR_FLOOR_COUNTER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Channel value
     * \else
     *  视频通道号
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Loors used for calibration
     * \else
     *  用于校准的楼层
     * \endif
     */
    public byte					szFloorNum[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Set the current status as the baseline floor enable
     * \else
     *  是否设置当前状态为基准楼层
     * \endif
     */
    public boolean					bBenchmark;

}