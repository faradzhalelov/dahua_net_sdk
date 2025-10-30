package com.company.NetSDK;

import java.io.Serializable;



/**
 * \if ENGLISH_LANG
 * alarm of storage format, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_STORAGEFORMAT}
 * \else
 * 硬盘格式化事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_STORAGEFORMAT}
 * \endif
 */
public class ALARM_STORAGEFORMAT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Event Action 1:Start 2:Stop
     * \else
     * 事件动作1:开始 2:停止
     * \endif
     */
    public int                       nAction;

    /**
     * \if ENGLISH_LANG
     * Event occurrence time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX			      UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * device name
     * \else
     * 硬盘名称
     * \endif
     */
    public byte					      szDeviceName[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * device path
     * \else
     * 目录路径
     * \endif
     */
    public byte					      szPath[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     * 0-unknown, 1-success, 2-failed
     * \else
     * 0-未知, 1-成功, 2-失败
     * \endif
     */
    public int                       nResult;

}
