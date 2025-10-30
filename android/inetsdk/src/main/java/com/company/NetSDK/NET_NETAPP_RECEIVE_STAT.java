package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Receive relevant statistics, same meaning with the ifconfig
 * \else
 * 接收相关统计数据,意义与ifconfig同
 * \endif
 */
public class NET_NETAPP_RECEIVE_STAT implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public int        dwPackets;

    public int        dwBytes;

    public int        dwErrors;

    public int        dwOverruns;

    public int        dwFrame;

    /**
     * \if ENGLISH_LANG
     * Downflow speed
     * \else
     * 下行流量速度
     * \endif
     */
    public int        dwSpeed;
}
