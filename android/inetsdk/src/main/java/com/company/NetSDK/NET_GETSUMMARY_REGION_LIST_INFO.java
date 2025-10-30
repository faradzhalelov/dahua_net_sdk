package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Alarm area list
 * \else
 * @brief 报警区域列表
 * \endif
 */
public class NET_GETSUMMARY_REGION_LIST_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Region ID
     * \else
     *  区域ID
     * \endif
     */
    public int					nRegionID;

    /**
     * \if ENGLISH_LANG
     *  Statistics of the number of people in the region
     * \else
     *  区域内人数统计值
     * \endif
     */
    public int					nPeopleNum;

    /**
     * \if ENGLISH_LANG
     *  Region Point number
     * \else
     *  区域坐标个数
     * \endif
     */
    public int					nRegionPointNum;

    /**
     * \if ENGLISH_LANG
     *  Region Point
     * \else
     *  区域坐标
     * \endif
     */
    public NET_POINT					stuRegionPoint[] = new NET_POINT[20];

    public NET_GETSUMMARY_REGION_LIST_INFO() {
        for(int i = 0; i < 20; i ++){
            this.stuRegionPoint[i] = new NET_POINT();
        }
    }
}