package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Proactively register server information
 * \else
 * @brief 主动注册服务器信息
 * \endif
 */
public class NET_AUTO_REGISTER_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Proactively register server IP
     * \else
     *  主动注册服务器IP
     * \endif
     */
    public byte					szIP[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Proactively register server ports
     * \else
     *  主动注册服务器端口
     * \endif
     */
    public int					nPort;

    /**
     * \if ENGLISH_LANG
     *  The status of the device and platform indicates whether the platform has successfully logged in to the device
     * \else
     *  设备和平台的状态，表示平台是否已经登录设备成功
     * \endif
     */
    public boolean					bIsOnline;

}