package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface input param, corresponding to interface {@link INetSDK#GetIFrameDataFromStorageVideo}
 * \else
 * 接口输入参数 ，对应接口 {@link INetSDK#GetIFrameDataFromStorageVideo}
 * \endif
 */
public class NET_IN_GET_I_FRAME_DATA_FROM_STORAGE_VIDEO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel
     * \else
     * 通道号
     * \endif
     */
    public int                             nChannel;

    /**
     * \if ENGLISH_LANG
     * time
     * \else
     * 时间
     * \endif
     */
    public NET_TIME                             stuTime = new NET_TIME();

}
