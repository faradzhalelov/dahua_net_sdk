package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The battery camera reaches the upper limit of the streaming preview time and shutdown notification event, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_TIME_TO_POWEROFF}
 * \else
 * 电池相机达到拉流预览时间上限关机通知事件,对应 {@link INetSDK#StartListenEx}，命令为{@link FinalVar#SDK_ALARM_TIME_TO_POWEROFF}
 * \endif
 */
public class ALARM_TIME_TO_POWEROFF_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * 0:Pulse
     * \else
     * 0:脉冲
     * \endif
     */
    public int                             nAction;

    /**
     * \if ENGLISH_LANG
     * channel number
     * \else
     * 通道号
     * \endif
     */
    public int                             nChannelID;



    /**
     * \if ENGLISH_LANG
     * time-to-event
     * \else
     * 事件发生时间
     * \endif
     */
    public NET_TIME_EX                        UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Distance forced shutdown time ,Unit:second
     * \else
     * 距离强制关机时间, 单位：秒
     * \endif
     */
    public int                             nCountdown;

}
