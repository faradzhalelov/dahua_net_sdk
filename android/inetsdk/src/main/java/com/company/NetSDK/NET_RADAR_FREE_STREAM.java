package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Radar free stream information
 * \else
 * @brief 雷达自由流信息
 * \endif
 */
public class NET_RADAR_FREE_STREAM implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  millisecond from 0001-01-01 00:00:00
     * \else
     *  1年1月1日0时起至今的毫秒数
     * \endif
     */
    public long					nABSTime;

    /**
     * \if ENGLISH_LANG
     *  Vehicle ID
     * \else
     *  车辆ID
     * \endif
     */
    public int					nVehicleID;

    /**
     * \if ENGLISH_LANG
     *  MAC of on board unit
     * \else
     *  OBU的MAC地址
     * \endif
     */
    public int					unOBUMAC;

}
