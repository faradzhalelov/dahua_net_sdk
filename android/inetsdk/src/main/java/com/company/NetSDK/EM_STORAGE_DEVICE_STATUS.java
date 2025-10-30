package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 
 * \else
 * @brief  存储设备状态
 * \endif
 */
public class EM_STORAGE_DEVICE_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_STORAGE_DEVICE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Get device failed
     * \else
     *  获取设备失败
     * \endif
     */
    public static final int					EM_STORAGE_DEVICE_ERROR = 1;

    /**
     * \if ENGLISH_LANG
     *  device initializing
     * \else
     *  正在读取设备
     * \endif
     */
    public static final int					EM_STORAGE_DEVICE_INITIALIZING = 2;

    /**
     * \if ENGLISH_LANG
     *  Get device successfully
     * \else
     *  获取设备成功
     * \endif
     */
    public static final int					EM_STORAGE_DEVICE_SUCCESS = 3;

}
