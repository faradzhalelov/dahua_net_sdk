package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief people info in the region
 * \else
 * @brief 检测区区域人数统计信息
 * \endif
 */
public class NET_REGION_PEOPLE_STAT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  region ID
     * \else
     *  区域ID
     * \endif
     */
    public int					nRegionID;

    /**
     * \if ENGLISH_LANG
     *  region name
     * \else
     *  区域名称
     * \endif
     */
    public byte					szRegionName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  points count of the region
     * \else
     *  区域顶点个数
     * \endif
     */
    public int					nRegionPointNum;

    /**
     * \if ENGLISH_LANG
     *  points of region
     * \else
     *  区域顶点坐标
     * \endif
     */
    public NET_POINT					stuRegionPoint[] = new NET_POINT[20];

    /**
     * \if ENGLISH_LANG
     *  people number in the region
     * \else
     *  区域内人数
     * \endif
     */
    public int					nPeopleNum;

    public NET_REGION_PEOPLE_STAT_INFO() {
        for(int i = 0; i < 20; i ++){
            this.stuRegionPoint[i] = new NET_POINT();
        }
    }
}