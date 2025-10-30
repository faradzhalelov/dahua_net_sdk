package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Network offline statistics data information
 * \else
 * @brief 断网统计数据信息
 * \endif
 */
public class NET_NET_OFFLINE_STATISTIC_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Query channel, starting from 0
     * \else
     *  查询通道，从0开始
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Total number of offline data
     * \else
     *  断网数据总量
     * \endif
     */
    public int					nOfflineCount;

    /**
     * \if ENGLISH_LANG
     *  Total number of face snapshots
     * \else
     *  人L抓拍总量
     * \endif
     */
    public int					nFaceSnapshotCount;

    /**
     * \if ENGLISH_LANG
     *  Total number of successful uploads
     * \else
     *  上传成功总量
     * \endif
     */
    public int					nTotalSuccCount;

}