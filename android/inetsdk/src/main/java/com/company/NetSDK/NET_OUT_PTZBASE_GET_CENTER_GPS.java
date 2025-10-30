package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_QueryDevInfo NET_QUERY_PTZBASE_GET_CENTER_GPS Type interface output parameters
 * \else
 * @brief CLIENT_QueryDevInfo NET_QUERY_PTZBASE_GET_CENTER_GPS 类型接口输出参数
 * \endif
 */
public class NET_OUT_PTZBASE_GET_CENTER_GPS implements Serializable {
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
