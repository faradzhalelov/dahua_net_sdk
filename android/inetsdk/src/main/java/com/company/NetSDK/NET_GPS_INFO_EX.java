package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief GPS info
 * \else
 * @brief GPS信息
 * \endif
 */
public class NET_GPS_INFO_EX implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Longitude(Unit: one millionth of a degree)
     * \else
     *  经度(单位是百万分之一度)
     * \endif
     */
    public int					nLongitude;

    /**
     * \if ENGLISH_LANG
     *  Latidude(Unit: one millionth of a degree)
     * \else
     *  纬度(单位是百万分之一度)
     * \endif
     */
    public int					nLatidude;

    /**
     * \if ENGLISH_LANG
     *  Altitude, unit : meters
     * \else
     *  高度,单位为米
     * \endif
     */
    public double					nAltitude;

}
