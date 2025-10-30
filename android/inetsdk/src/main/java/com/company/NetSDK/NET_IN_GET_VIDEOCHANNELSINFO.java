package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#QueryDevInfo} port input parameter,{@link NET_VIDEO_CHANNEL_TYPE}
 * \else
 * {@link INetSDK#QueryDevInfo} 接口输入参数,{@link NET_VIDEO_CHANNEL_TYPE}
 * \endif
 */
public class NET_IN_GET_VIDEOCHANNELSINFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * video channel type to query,refer to {@link NET_VIDEO_CHANNEL_TYPE}
     * \else
     * 需要获取的通道类型,参考{@link NET_VIDEO_CHANNEL_TYPE}
     * \endif
     */
    public int emType;
}
