package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief parking space data information
 * \else
 * @brief 停车位数据信息
 * \endif
 */
public class EVENT_MANUALSNAP_PARKING_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Channel number, starting from 0. -1 indicates an unknown channel
     * \else
     *  通道号，从0开始, -1表示未知通道
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Whether there is a car in the parking space: 0: unknown 1: there is a car 2: no car
     * \else
     *  车位是否有车标记：0：未知 1：有车 2：无车
     * \endif
     */
    public int					nStatus;

    /**
     * \if ENGLISH_LANG
     *  plate number
     * \else
     *  车牌号码
     * \endif
     */
    public byte					szPlateNumber[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  plate number
     * \else
     *  车牌号码
     * \endif
     */
    public byte					szParkingNo[] = new byte[32];

}