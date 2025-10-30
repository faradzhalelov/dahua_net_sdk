package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_PTZStartTour input parameters
 * \else
 * @brief CLIENT_PTZStartTour 接口输入参数
 * \endif
 */
public class NET_IN_PTZ_START_TOUR implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Channel number, range 0~device channel number
     * \else
     *  通道号, 范围 0~设备通道数
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Tour line number
     * \else
     *  巡航线路编号
     * \endif
     */
    public int					nIndex;

}