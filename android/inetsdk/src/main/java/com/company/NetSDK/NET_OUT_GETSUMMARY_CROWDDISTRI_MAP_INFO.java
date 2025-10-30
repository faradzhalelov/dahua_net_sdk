package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Output param of interface CLIENT_GetSummaryCrowdDistriMap
 * \else
 * @brief CLIENT_GetSummaryCrowdDistriMap 接口输出参数
 * \endif
 */
public class NET_OUT_GETSUMMARY_CROWDDISTRI_MAP_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of detection areas
     * \else
     *  检测区个数
     * \endif
     */
    public int					nCrowdStatNum;

    /**
     * \if ENGLISH_LANG
     *  Detection area information
     * \else
     *  检测区信息
     * \endif
     */
    public NET_GETSUMMARY_CROWD_STAT_DATA					stuCrowdStatData[] = new NET_GETSUMMARY_CROWD_STAT_DATA[8];

    public NET_OUT_GETSUMMARY_CROWDDISTRI_MAP_INFO() {
        for(int i = 0; i < 8; i ++){
            this.stuCrowdStatData[i] = new NET_GETSUMMARY_CROWD_STAT_DATA();
        }
    }
}