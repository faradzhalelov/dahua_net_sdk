package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * No hard disk alarm, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_NO_DISK}
 * \else
 * 无硬盘报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_NO_DISK}
 * \endif
 */
public class ALARM_NO_DISK_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Time
     * \else
     * 时间
     * \endif
     */
    public NET_TIME            stuTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * event action, 0:Start, 1:Stop
     * \else
     * 事件动作, 0:Start, 1:Stop
     * \endif
     */
    public int               dwAction;
}
