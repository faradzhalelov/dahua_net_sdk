package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * DEVICE_MODIFY_IP_TTLV
 * \else
 * DEVICE_MODIFY_IP_TTLV
 * \endif
 */
public class DEVICE_MODIFY_IP_TTLV implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  设备信息结构体						
     * \else
     *  设备信息结构体						
     * \endif
     */
    public NET_PG4_NET_INFO					stuDevInfo = new NET_PG4_NET_INFO();

    /**
     * \if ENGLISH_LANG
     *  搜索到设备的本地IP地址
     * \else
     *  搜索到设备的本地IP地址
     * \endif
     */
    public byte					szLocalIP[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  用户名
     * \else
     *  用户名
     * \endif
     */
    public byte					szUserName[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * 	密码
     * \else
     * 	密码
     * \endif
     */
    public byte					szPassWord[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  MAC地址
     * \else
     *  MAC地址
     * \endif
     */
    public byte					szMac[] = new byte[40];

}