package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_GetVideoInputInfo in param
 * \else
 * @brief CLIENT_GetVideoInputInfo 接口输入参数
 * \endif
 */
public class NET_IN_GET_VIDEO_INPUT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  type of get video input information,{@link EM_GET_VIDEO_INPUT_TYPE}
     * \else
     *  获取的状态信息类型,{@link EM_GET_VIDEO_INPUT_TYPE}
     * \endif
     */
    public int					emType;

}
