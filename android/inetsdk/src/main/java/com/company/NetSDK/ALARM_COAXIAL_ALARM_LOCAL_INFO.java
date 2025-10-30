package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of coaxial alarm local ，the corresponding interface {@link INetSDK#StartListenEx},the corresponding {@link FinalVar#SDK_ALARM_COAXIAL_ALARM_LOCAL}
 * \else
 *  同轴开关报警事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_COAXIAL_ALARM_LOCAL}
 * \endif
 */
public class ALARM_COAXIAL_ALARM_LOCAL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * 0:start 1:stop
     * \else
     * 0:开始 1:停止
     * \endif
     */
    public int                 nAction;

    /**
     * \if ENGLISH_LANG
     * Event occurred time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX         UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * alarm input channel
     * \else
     * 报警输入通道号
     * \endif
     */
    public int                 nAlarmChannel;

    /**
     * \if ENGLISH_LANG
     * Sensor Type, refer to {@link NET_SENSE_METHOD}
     * \else
     * 传感器类型, 取值参考 {@link NET_SENSE_METHOD}
     * \endif
     */
    public int                 emSenseType;

    /**
     * \if ENGLISH_LANG
     * alarm name
     * \else
     * 报警名称
     * \endif
     */
    public char			szName[] = new char[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * channel id
     * \else
     * 视频通道号
     * \endif
     */
    public int                 nChannelID;

    /**
     * \if ENGLISH_LANG
     * Reserved byte
     * \else
     * 保留字节
     * \endif
     */
    public byte[]					byReserved = new byte[1020];
}
