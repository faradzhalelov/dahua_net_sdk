package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * video frame loss event, the corresponding interface {@link INetSDK#StartListenEx},the corrseponding command {@link FinalVar#SDK_ALARM_VIDEO_FRAME_LOSS}
 * \else
 * 视频丢帧事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_VIDEO_FRAME_LOSS}
 * \endif
 */
public class ALARM_VIDEO_FRAME_LOSS_INFO implements  Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel number
     * \else
     * 通道号
     * \endif
     */
    public int                   nChannelID;

    /**
     * \if ENGLISH_LANG
     * event action, 0:Pulse,1:Start, 2: Stop
     * \else
     * 事件动作, 0:Pulse, 1:Start, 2:Stop
     * \endif
     */
    public int                   nEventAction;

    /**
     * \if ENGLISH_LANG
     * frame loss device IP
     * \else
     * 发生丢帧的设备IP
     * \endif
     */
    public byte[]                szIP = new byte[FinalVar.SDK_MAX_IPADDR_LEN_EX];

    /**
     * \if ENGLISH_LANG
     * video loss device port
     * \else
     * 发生丢帧的设备端口
     * \endif
     */
    public int                   nPort;
}
