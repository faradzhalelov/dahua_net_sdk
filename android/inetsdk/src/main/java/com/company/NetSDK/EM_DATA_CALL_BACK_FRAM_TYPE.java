package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Frame type
 * \else
 * @brief 帧类型
 * \endif
 */
public class EM_DATA_CALL_BACK_FRAM_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Frame type unknown
     * \else
     *  帧类型不可知
     * \endif
     */
    public static final int					EM_DATA_CALL_BACK_FRAM_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Video frame
     * \else
     *  帧类型是视频帧
     * \endif
     */
    public static final int					EM_DATA_CALL_BACK_FRAM_TYPE_VIDEO = 1;

    /**
     * \if ENGLISH_LANG
     *  Audio frame
     * \else
     *  帧类型是音频帧
     * \endif
     */
    public static final int					EM_DATA_CALL_BACK_FRAM_TYPE_AUDIO = 2;

    /**
     * \if ENGLISH_LANG
     *  Data frame
     * \else
     *  帧类型是数据帧
     * \endif
     */
    public static final int					EM_DATA_CALL_BACK_FRAM_TYPE_DATA = 3;

}