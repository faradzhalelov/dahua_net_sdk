package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Input parameters of CLIENT_SetElevatorWorkInfo interface
 * \else
 * @brief CLIENT_SetElevatorWorkInfo 接口入参
 * \endif
 */
public class NET_IN_SET_ELEVATOR_WORK_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Video channel number
     * \else
     *  视频通道号
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Calibration base floor
     * \else
     * 校准基准楼层
     * \endif
     */
    public byte					szCheckBaseFloor[] = new byte[32];

}