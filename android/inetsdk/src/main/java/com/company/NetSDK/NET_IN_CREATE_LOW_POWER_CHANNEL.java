package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_CreateLowPowerChannel input parameters
 * \else
 * @brief CLIENT_CreateLowPowerChannel 接口输入参数
 * \endif
 */
public class NET_IN_CREATE_LOW_POWER_CHANNEL implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Disconnect callback function
     * \else
     *  连接断线回调
     * \endif
     */
    public CB_fSubBizDisConnectCallBack					cbDisConnectCallBack;

    /**
     * \if ENGLISH_LANG
     *  User data
     * \else
     *  用户数据
     * \endif
     */
    public long					dwUserData;

}