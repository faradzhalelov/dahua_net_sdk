package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief into of detection area
 * \else
 * @brief 检测区统计信息
 * \endif
 */
public class NET_CROWD_STAT_DATA implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  channel ID
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  total people number in detection area
     * \else
     *  检测区内总人数
     * \endif
     */
    public int					nGloabalPeopleNum;

    /**
     * \if ENGLISH_LANG
     *  count of regions in detection area
     * \else
     *  检测区内区域个数
     * \endif
     */
    public int					nRegionNum;

    /**
     * \if ENGLISH_LANG
     *  info of regions in detection area
     * \else
     *  检测区内区域人数统计信息
     * \endif
     */
    public NET_REGION_PEOPLE_STAT_INFO					stuRegionPeople[] = new NET_REGION_PEOPLE_STAT_INFO[8];

    public NET_CROWD_STAT_DATA() {
        for(int i = 0; i < 8; i ++){
            this.stuRegionPeople[i] = new NET_REGION_PEOPLE_STAT_INFO();
        }
    }
}