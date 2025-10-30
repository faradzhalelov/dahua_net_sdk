package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Travel Info
 * \else
 * @brief 行程码信息
 * \endif
 */
public class NET_TRAVEL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Travel Code Color,{@link EM_TRAVEL_CODE_COLOR}
     * \else
     *  行程码状态,{@link EM_TRAVEL_CODE_COLOR}
     * \endif
     */
    public int					emTravelCodeColor;

    /**
     * \if ENGLISH_LANG
     *  Number of cities passed in the last 14 days
     * \else
     *  最近14天经过的城市个数
     * \endif
     */
    public int					nCityCount;

    /**
     * \if ENGLISH_LANG
     *  The names of the cities that have passed in the last 14 days. In chronological order, the earliest passing city is placed first
     * \else
     *  最近14天经过的城市名. 按时间顺序排列, 最早经过的城市放第一个
     * \endif
     */
    public byte					szPassingCity[][] = new byte[16][128];

}
