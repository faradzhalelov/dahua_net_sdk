package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * Alarm Box channel alarm, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_BOX_ALARM}
 * \else
 * 报警盒通道的触发报警事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_BOX_ALARM}
 * \endif
 */
public class ALARM_BOX_ALARM_INFO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * event action, 1 - start, 2 - stop
     * \else
     * 事件动作,1表示持续性事件开始,2表示持续性事件结束;
     * \endif
     */
    public int                             nAction;

    /**
     * \if ENGLISH_LANG
     * alarm channel
     * \else
     * 通道号
     * \endif
     */
    public int                             nChannelID;

    /**
     * \if ENGLISH_LANG
     * timestamp
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double                         dbPTS;

    /**
     * \if ENGLISH_LANG
     * event time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX                     stuTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * event id
     * \else
     * 事件ID
     * \endif
     */
    public int                             nEventID;

    /**
     * \if ENGLISH_LANG
     * Alarm Name
     * \else
     * 报警名称
     * \endif
     */
    public byte                            szAlarmChannelName[] = new byte[FinalVar.SDK_COMMON_STRING_64];

    @Override
    public String toString() {
        return "ALARM_BOX_ALARM_INFO{" +
                "nAction=" + nAction +
                ", nChannelID=" + nChannelID +
                ", dbPTS=" + dbPTS +
                ", stuTime=" + stuTime +
                ", nEventID=" + nEventID +
                ", szAlarmChannelName=" + Arrays.toString(szAlarmChannelName) +
                '}';
    }
}
