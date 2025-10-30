package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_RadiometryGetRandomRegionTemper output parameter
 * \else
 * @brief CLIENT_RadiometryGetRandomRegionTemper 出参
 * \endif
 */
public class NET_OUT_RADIOMETRY_RANDOM_REGION_TEMPER implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Temperature information of the Temperature Monitoring area
     * \else
     *  随机测温区域的温度信息
     * \endif
     */
    public NET_RADIOMETRY_REGION_TEMP_INFO stuRegionTempInfo = new NET_RADIOMETRY_REGION_TEMP_INFO();

}