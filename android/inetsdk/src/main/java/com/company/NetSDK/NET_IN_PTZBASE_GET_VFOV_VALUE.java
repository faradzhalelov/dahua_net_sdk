package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_QueryDevInfo NET_QUERY_PTZBASE_GET_VFOV_VALUE Type interface input parameters
 * \else
 * @brief CLIENT_QueryDevInfo NET_QUERY_PTZBASE_GET_VFOV_VALUE 类型接口输入参数
 * \endif
 */
public class NET_IN_PTZBASE_GET_VFOV_VALUE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The channel number starts from 0
     * \else
     *  通道号从0开始
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Lens zoom value, normalized to 0~1
     * \else
     *  镜头变倍值,归一化到0~1
     * \endif
     */
    public float					fZoom;

}
