package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief IP Clash Event
 * \else
 * @brief IP冲突事件
 * \endif
 */
public class ALARM_IP_CONFLICT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  0=Start 1=Stop
     * \else
     * 0:开始 1:停止
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  Event Triggering Time)
     * \else
     * 事件触发时间
     * \endif
     */
    public NET_TIME					stuTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  IP conflict network card name
     * \else
     * IP冲突网卡名
     * \endif
     */
    public byte					szInterface[] = new byte[8];

    /**
     * \if ENGLISH_LANG
     *  Number of host Mac addresses
     * \else
     * 主机Mac地址个数
     * \endif
     */
    public int					nMacNum;

    /**
     * \if ENGLISH_LANG
     *  List of host Mac addresses that conflict with the IP address of the Interface network card
     * \else
     * 与Interface网卡IP地址冲突的主机Mac地址列表
     * \endif
     */
    public byte					szMac[][] = new byte[8][18];

}