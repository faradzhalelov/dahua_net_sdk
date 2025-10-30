package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Event Gps Info
 * \else
 * @brief 触发事件时物体的GPS信息
 * \endif
 */
public class NET_EVENT_GPS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  longitude,[-180, 180],unit:degree,negative:west longitude
     * \else
     *  经度，单位：度,正为东经，负为西经，取值范围[-180,180]
     * \endif
     */
    public double					dLongitude;

    /**
     * \if ENGLISH_LANG
     *  latitude,[-90, 90],unit:degree,negative:south latitude
     * \else
     *  纬度，单位：度,正为北纬，负为南纬，取值范围[-90,90]
     * \endif
     */
    public double					dLatitude;

}