package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Regional population statistics list
 * \else
 * @brief 区域人数统计列表
 * \endif
 */
public class NET_GETSUMMARY_REGION_PEOPLE_LIST_INFO implements Serializable {
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
     *  Region People number
     * \else
     *  区域人数
     * \endif
     */
    public int					nRegionPeopleNum;

    /**
     * \if ENGLISH_LANG
     *  Region point number
     * \else
     *  区域顶点个数
     * \endif
     */
    public int					nRegionPointNum;

    /**
     * \if ENGLISH_LANG
     *  Region point
     * \else
     *  区域顶点坐标
     * \endif
     */
    public NET_POINT					stuRegionPoint[] = new NET_POINT[20];

    public NET_GETSUMMARY_REGION_PEOPLE_LIST_INFO() {
        for(int i = 0; i < 20; i ++){
            this.stuRegionPoint[i] = new NET_POINT();
        }
    }
}