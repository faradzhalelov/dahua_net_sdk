package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief bandwidth information
 * \else
 * @brief 视频通道接入带宽
 * \endif
 */
public class NET_VIDEO_INPUT_BANDWIDTH_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  bandwidth limit. unit:Mbps
     * \else
     *  总带宽，单位:Mbps
     * \endif
     */
    public double					dbBandWidthLimit;

    /**
     * \if ENGLISH_LANG
     *  bandwidth left. unit:Mbps
     * \else
     *  带宽剩余，单位:Mbps
     * \endif
     */
    public double					dbBandWidthLeft;

}
