package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Temperature information of the Temperature Monitoring area
 * \else
 * @brief 随机测温区域的温度信息
 * \endif
 */
public class NET_RADIOMETRY_REGION_TEMP_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Temperature Unit,{@link EM_TEMPERATURE_UNIT}
     * \else
     *  温度单位,{@link EM_TEMPERATURE_UNIT}
     * \endif
     */
    public int					emTemperatureUnit;

    /**
     * \if ENGLISH_LANG
     *  The average temperature of the Temperature Monitoring area, the accuracy is 0.01, and the expansion is 100 times
     * \else
     *  获取测温区域平均温度的参数值,精度为0.01,扩大100倍
     * \endif
     */
    public int					nTemperAver;

    /**
     * \if ENGLISH_LANG
     *  The maximum temperature in the Temperature Monitoring area, with an accuracy of 0.01, which is enlarged by 100 times
     * \else
     *  获取测温区域最高的温度的参数值,精度为0.01,扩大100倍
     * \endif
     */
    public int					nTemperMax;

    /**
     * \if ENGLISH_LANG
     *  The minimum temperature in the Temperature Monitoring area, with an accuracy of 0.01, which is expanded by 100 times
     * \else
     *  获取测温区域最低的温度的参数值,精度为0.01,扩大100倍
     * \endif
     */
    public int					nTemperMin;

    /**
     * \if ENGLISH_LANG
     *  The coordinates of the point of maximum temperature in the area, 8192 coordinate system
     * \else
     *  随机区域内最高的温度的点的坐标,8192坐标系
     * \endif
     */
    public NET_POINT					stuTemperMaxPoint = new NET_POINT();

    /**
     * \if ENGLISH_LANG
     *  The coordinates of the point with the lowest temperature in the area, 8192 coordinate system
     * \else
     *  随机区域内最低的温度的点的坐标,8192坐标系
     * \endif
     */
    public NET_POINT					stuTemperMinPoint = new NET_POINT();

}