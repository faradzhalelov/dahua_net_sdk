package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetMobilePusherNotificationCfg} output param
 * \else
 * {@link INetSDK#GetMobilePusherNotificationCfg} 输出参数
 * \endif
 */
public class NET_OUT_GET_MOBILE_PUSHER_NOTIFICATION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Configuration name，{@link EM_MOBILE_PUSHER_NAME_TYPE}
     * \else
     * 配置名称{@link EM_MOBILE_PUSHER_NAME_TYPE}
     * \endif
     */
    public int emMobilePusherName;

    /**
     * \if ENGLISH_LANG
     * Maximum number of received query configuration messages allocated by user
     * \else
     * 用户分配最大接收查询配置消息个数
     * \endif
     */
    public int nMaxNotificationNum;

    /**
     * \if ENGLISH_LANG
     * The number of received query configuration messages actually returned
     * \else
     * 实际返回接收查询配置消息个数
     * \endif
     */
    public int nRetNotificationNum;

    /**
     * \if ENGLISH_LANG
     * Subscription configuration
     * \else
     * 订阅配置
     * \endif
     */
    public NET_MOBILE_PUSH_NOTIFICATION_GENERAL_INFO[]		pstuMobilePusherNotificationCfg;

    public NET_OUT_GET_MOBILE_PUSHER_NOTIFICATION_INFO(int nMaxNotificationNum, int nSubScribeMax) {
        this.nMaxNotificationNum = nMaxNotificationNum;
        pstuMobilePusherNotificationCfg = new NET_MOBILE_PUSH_NOTIFICATION_GENERAL_INFO[nMaxNotificationNum];
        for(int i=0; i< nMaxNotificationNum; ++i) {
            pstuMobilePusherNotificationCfg[i] = new NET_MOBILE_PUSH_NOTIFICATION_GENERAL_INFO(nSubScribeMax);
        }
    }
}
