package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Disconnect callback info of sub link
 * \else
 * @brief 分压连接断线回调信息
 * \endif
 */
public class NET_SUBBIZ_DISCONNECT_CALLBACK implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Network info of device
     * \else
     *  设备网络信息
     * \endif
     */
    public NET_DEV_NETWORK_INFO					stuDevNetInfo = new NET_DEV_NETWORK_INFO();

    /**
     * \if ENGLISH_LANG
     *  User data
     * \else
     *  用户数据
     * \endif
     */
    public long					dwUserData;

}