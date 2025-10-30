package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Push configuration name used by the device
 * \else
 * 设备使用的推送配置名称
 * \endif
 */
public class EM_MOBILE_PUSHER_NAME_TYPE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_MOBILE_PUSHER_NAME_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * All
     * \else
     * 通知
     * \endif
     */
    public static final int EM_MOBILE_PUSHER_NAME_TYPE_NOTIFICATION = 1;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 通知配置
     * \endif
     */
    public static final int EM_MOBILE_PUSHER_NAME_TYPE_NOTIFICATIONCFG = 2;

}
