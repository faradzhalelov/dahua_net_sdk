package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Access control status event, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_ACCESS_CTL_STATUS }
 * \else
 * 门禁状态事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_ACCESS_CTL_STATUS }
 * \endif
 */
public class ALARM_ACCESS_CTL_STATUS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Door channel no.
     * \else
     * 门通道号
     * \endif
     */
    public int nDoor;

    /**
     * \if ENGLISH_LANG
     * Event time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME stuTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * Access control status.refer to NET_ACCESS_CTL_STATUS_TYPE
     * \else
     * 门禁状态,参考 NET_ACCESS_CTL_STATUS_TYPE
     * \endif
     */
    public int emStatus;

    /**
     * \if ENGLISH_LANG
     * wireless device serial number(Intelligent lock)
     * \else
     * 无线设备序列号(智能锁)
     * \endif
     */
    public byte[]     szSerialNumber = new byte[256];



}
