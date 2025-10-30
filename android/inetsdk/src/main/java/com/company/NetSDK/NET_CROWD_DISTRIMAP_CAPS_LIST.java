package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Population Distribution Map Capability List
 * \else
 * @brief 人群分布图能力列表
 * \endif
 */
public class NET_CROWD_DISTRIMAP_CAPS_LIST implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Video channel number
     * \else
     *  视频通道号
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Does this video channel support crowd distribution maps
     * \else
     *  该视频通道是否支持人群分布图
     * \endif
     */
    public boolean					bSupport;

}