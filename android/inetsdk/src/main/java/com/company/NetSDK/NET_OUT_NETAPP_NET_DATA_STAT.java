package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * statistics for protocol stack output param
 * \else
 * 获取协议栈统计数据输出结构体
 * \endif
 */
public class NET_OUT_NETAPP_NET_DATA_STAT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Receive relevant statistics,same meaning with the ifconfig
     * \else
     * 接收相关统计数据,意义与ifconfig同
     * \endif
     */
    public NET_NETAPP_RECEIVE_STAT stuReceiveStat = new NET_NETAPP_RECEIVE_STAT();

    /**
     * \if ENGLISH_LANG
     * Transport statistics,same meaning with the ifconfig
     * \else
     * 传输相关统计数据,意义与ifconfig同
     * \endif
     */
    public NET_NETAPP_TRANSMIT_STAT stuTransmitStat = new NET_NETAPP_TRANSMIT_STAT();

    /**
     * \if ENGLISH_LANG
     * Network speed, unit is Mbps
     * \else
     * 网卡速度,单位Mbps
     * \endif
     */
    public int nSpeed;
}
