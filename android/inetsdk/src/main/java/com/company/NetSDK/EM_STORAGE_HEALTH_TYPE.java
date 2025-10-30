package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 
 * \else
 * @brief  健康状态标识
 * \endif
 */
public class EM_STORAGE_HEALTH_TYPE implements Serializable {
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
    public static final int					EM_STORAGE_HEALTH_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  device not support Storage health detection
     * \else
     *  设备不支持健康检测功能
     * \endif
     */
    public static final int					EM_STORAGE_HEALTH_UNSUPPORT = 0;

    /**
     * \if ENGLISH_LANG
     * device support Storage health detection and success
     * \else
     *  支持健康检测功能且获取数据成功
     * \endif
     */
    public static final int					EM_STORAGE_HEALTH_SUPPORT_AND_SUCCESS = 1;

    /**
     * \if ENGLISH_LANG
     * device support Storage health detection but failed
     * \else
     *  支持健康检测功能但获取数据失败
     * \endif
     */
    public static final int					EM_STORAGE_HEALTH_SUPPORT_AND_FAIL = 2;

}
