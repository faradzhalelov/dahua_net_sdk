package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * mobile subcribe all cfg info
 * \else
 * 手机订阅全部推送信息
 * \endif
 */
public class NET_MOBILE_SUBSCRIBE_ALL_CFG_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * MaxMobileSubscribeNum
     * \else
     * 用户分配最大接收查询配置消息个数
     * \endif
     */
    public int nMaxMobileSubscribeNum;

    /**
     * \if ENGLISH_LANG
     * Event count
     * \else
     * 实际返回接收查询配置消息个数
     * \endif
     */
    public int nRetMobileSubscribeNum;

    /**
     * \if ENGLISH_LANG
     * subcribe mobile push notification info
     * \else
     * 订阅配置
     * \endif
     */
    public NET_MOBILE_PUSH_NOTIFICATION_GENERAL_INFO[] pstuMobileSubscribe;


    public NET_MOBILE_SUBSCRIBE_ALL_CFG_INFO(int nMaxMobileSubscribeNum, int nSubScribeMax) {
        this.nMaxMobileSubscribeNum = nMaxMobileSubscribeNum;
        pstuMobileSubscribe = new NET_MOBILE_PUSH_NOTIFICATION_GENERAL_INFO[nMaxMobileSubscribeNum];
        for(int i=0; i< nMaxMobileSubscribeNum; ++i) {
            pstuMobileSubscribe[i] = new NET_MOBILE_PUSH_NOTIFICATION_GENERAL_INFO(nSubScribeMax);
        }
    }

}
