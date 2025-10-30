package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  input, {@link INetSDK#ControlDeviceEx} port {@link CtrlType#SDK_CTRL_START_REMOTELOWRATEWPAN_ALARMBELL} command parameter
 * \else
 * 开启无线警号命令, 入参, {@link INetSDK#ControlDeviceEx}接口的 {@link CtrlType#SDK_CTRL_START_REMOTELOWRATEWPAN_ALARMBELL}命令参数
 * \endif
 */
public class NET_IN_START_REMOTELOWRATEWPAN_ALARMBELL implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel
     * \else
     * 通道号
     * \endif
     */
    public int								nChannelID;
}
