package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Input param of interface CLIENT_GetSummaryCrowdDistriMap
 * \else
 * @brief CLIENT_GetSummaryCrowdDistriMap 接口输入参数
 * \endif
 */
public class NET_IN_GETSUMMARY_CROWDDISTRI_MAP_INFO implements Serializable {
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

}