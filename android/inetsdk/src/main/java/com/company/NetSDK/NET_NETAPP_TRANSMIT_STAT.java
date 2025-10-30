package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Transport statistics,same meaning with the ifconfig
 * \else
 * 传输相关统计数据,意义与ifconfig同
 * \endif
 */
public class NET_NETAPP_TRANSMIT_STAT implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public int        dwPackets;

    public int        dwBytes;

    public int        dwErrors;

    public int        dwDroped;

    public int        dwOverruns;

    public int        dwCarrier;

    public int        dwCollisions;

    public int        dwTxQueue;

    /**
     * \if ENGLISH_LANG
     * Upstream flow speed
     * \else
     * 上行流量速度
     * \endif
     */
    public int        dwSpeed;
}
