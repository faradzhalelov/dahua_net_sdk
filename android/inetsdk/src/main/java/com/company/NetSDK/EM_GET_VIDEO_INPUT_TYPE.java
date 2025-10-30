package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief get video input information type
 * \else
 * @brief 获取设备接入通道状态类型
 * \endif
 */
public class EM_GET_VIDEO_INPUT_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_GET_VIDEO_INPUT_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  bandwidth info, Corresponding to NET_VIDEO_INPUT_BANDWIDTH_INFO
     * \else
     *  设备带宽，对应 NET_VIDEO_INPUT_BANDWIDTH_INFO
     * \endif
     */
    public static final int					EM_GET_VIDEO_INPUT_TYPE_BANDWIDTH = 1;

}
