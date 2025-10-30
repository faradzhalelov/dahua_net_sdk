package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Detection area information
 * \else
 * @brief 检测区信息
 * \endif
 */
public class NET_GETSUMMARY_CROWD_STAT_DATA implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Channel ID
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  Total number of people in the testing area
     * \else
     *  检测区内总人数
     * \endif
     */
    public int					nGloabalPeopleNum;

    /**
     * \if ENGLISH_LANG
     *  Number of areas in the detection area
     * \else
     *  检测区内区域个数
     * \endif
     */
    public int					nRegionNum;

    /**
     * \if ENGLISH_LANG
     *  Regional population statistics list
     * \else
     *  区域人数统计列表
     * \endif
     */
    public NET_GETSUMMARY_REGION_PEOPLE_LIST_INFO					stuRegionPeopleList[] = new NET_GETSUMMARY_REGION_PEOPLE_LIST_INFO[16];

    /**
     * \if ENGLISH_LANG
     *  Number of global crowd alarms
     * \else
     *  全局拥挤人群报警个数
     * \endif
     */
    public int					nCrowdEventNum;

    /**
     * \if ENGLISH_LANG
     *  Crowd list
     * \else
     *  拥挤人群列表
     * \endif
     */
    public NET_GETSUMMARY_CROWD_LIST_INFO					stuCrowdList[] = new NET_GETSUMMARY_CROWD_LIST_INFO[5];

    /**
     * \if ENGLISH_LANG
     *  Number of alarm areas
     * \else
     *  报警区域个数
     * \endif
     */
    public int					nRegionEventNum;

    /**
     * \if ENGLISH_LANG
     *  Alarm area list
     * \else
     *  报警区域列表
     * \endif
     */
    public NET_GETSUMMARY_REGION_LIST_INFO					stuRegionList[] = new NET_GETSUMMARY_REGION_LIST_INFO[8];

    public NET_GETSUMMARY_CROWD_STAT_DATA() {
        for(int i = 0; i < 16; i ++){
            this.stuRegionPeopleList[i] = new NET_GETSUMMARY_REGION_PEOPLE_LIST_INFO();
        }
        for(int i = 0; i < 5; i ++){
            this.stuCrowdList[i] = new NET_GETSUMMARY_CROWD_LIST_INFO();
        }
        for(int i = 0; i < 8; i ++){
            this.stuRegionList[i] = new NET_GETSUMMARY_REGION_LIST_INFO();
        }
    }
}