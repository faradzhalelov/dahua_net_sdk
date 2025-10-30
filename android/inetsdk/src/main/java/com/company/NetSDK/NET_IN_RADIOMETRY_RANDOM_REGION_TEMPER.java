package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_RadiometryGetRandomRegionTemper input parameter
 * \else
 * @brief CLIENT_RadiometryGetRandomRegionTemper 入参
 * \endif
 */
public class NET_IN_RADIOMETRY_RANDOM_REGION_TEMPER implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  channel number
     * \else
     *  通道号
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Point Count
     * \else
     *  有效坐标个数
     * \endif
     */
    public int					nPointNum;

    /**
     * \if ENGLISH_LANG
     *  The coordinates of the Temperature Monitoring area, 8192 coordinate system
     * \else
     *  测温区域的坐标, 8192坐标系		
     * \endif
     */
    public NET_POINT					stuPolygon[] = new NET_POINT[8];

    public NET_IN_RADIOMETRY_RANDOM_REGION_TEMPER() {
        for(int i = 0; i < 8; i ++){
            stuPolygon[i] = new NET_POINT();
        }
    }
}