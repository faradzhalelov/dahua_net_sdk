package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_GetHeatMapsDirectly input parameter
 * \else
 * @brief CLIENT_GetHeatMapsDirectly 入参
 * \endif
 */
public class NET_IN_GET_HEATMAPS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Channel id
     * \else
     *  通道号
     * \endif
     */
    public int					nChannel;

}