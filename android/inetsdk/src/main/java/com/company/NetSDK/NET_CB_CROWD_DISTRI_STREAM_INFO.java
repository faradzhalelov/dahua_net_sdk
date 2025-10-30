package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief  call back info of attach crowd distri map
 * \else
 * @brief  订阅人群分布图实时统回调信息
 * \endif
 */
public class NET_CB_CROWD_DISTRI_STREAM_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  count of  detection area
     * \else
     *  检测区个数
     * \endif
     */
    public int					nCrowStatNum;

    /**
     * \if ENGLISH_LANG
     *  into of detection area
     * \else
     *  检测区统计信息
     * \endif
     */
    public NET_CROWD_STAT_DATA					stuCrowdStatData[] = new NET_CROWD_STAT_DATA[8];

    public NET_CB_CROWD_DISTRI_STREAM_INFO() {
        for(int i = 0; i < 8; i ++){
            this.stuCrowdStatData[i] = new NET_CROWD_STAT_DATA();
        }
    }
}