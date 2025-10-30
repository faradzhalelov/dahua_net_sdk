package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Trigger type
 * \else
 * @brief 触发类型
 * \endif
 */
public class EM_TRIGGER_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知类型
     * \endif
     */
    public static final int					EM_TRIGGER_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  Car inspection device
     * \else
     *  车检器
     * \endif
     */
    public static final int					EM_TRIGGER_TYPE_CAR_INSPECTION_DEV = 0;

    /**
     * \if ENGLISH_LANG
     *  Dadar
     * \else
     *  雷达
     * \endif
     */
    public static final int					EM_TRIGGER_TYPE_DADAR = 1;

    /**
     * \if ENGLISH_LANG
     *  Video
     * \else
     *  视频
     * \endif
     */
    public static final int					EM_TRIGGER_TYPE_VIDEO = 2;

}
