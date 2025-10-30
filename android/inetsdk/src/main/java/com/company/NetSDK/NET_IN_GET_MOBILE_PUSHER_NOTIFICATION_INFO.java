package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetMobilePusherNotificationCfg} input param
 * \else
 * {@link INetSDK#GetMobilePusherNotificationCfg} 输入参数
 * \endif
 */
public class NET_IN_GET_MOBILE_PUSHER_NOTIFICATION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * Query mode{@link EM_MOBILE_PUSHER_NOTIFICATION_TYPE}
     * \else
     * 查询模式{@link EM_MOBILE_PUSHER_NOTIFICATION_TYPE}
     * \endif
     */
    public int                  emFindMode;

    /**
     * \if ENGLISH_LANG
     * App registration ID
     * \else
     * App注册ID
     * \endif
     */
    public byte                 szRegisterID[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     * App ID
     * \else
     * App ID
     * \endif
     */
    public byte                 szAppID[] = new byte[256];
}
