package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NumberStat event, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_HUMAM_NUMBER_STATISTIC}
 * \else
 * 人数量/客流量统计事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_HUMAM_NUMBER_STATISTIC}
 * \endif
 */
public class ALARM_HUMAN_NUMBER_STATISTIC_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * PTS(ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double              PTS;

    /**
     * \if ENGLISH_LANG
     * event time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX         UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Envet Action, 1-start,2-stop
     * \else
     * 事件动作,0-事件持续, 1-表示事件开始, 2-表示事件结束;
     * \endif
     */
    public int                 nEventAction;

    /**
     * \if ENGLISH_LANG
     * the number of object which is in the area
     * \else
     * 区域内物体的个数
     * \endif
     */
    public int                 nNumber;

    /**
     * \if ENGLISH_LANG
     * entered object number
     * \else
     * 进入区域或者出入口内的物体个数
     * \endif
     */
    public int                 nEnteredNumber;

    /**
     * \if ENGLISH_LANG
     * exited object number
     * \else
     * 出来区域或者出入口内的物体个数
     * \endif
     */
    public int                 nExitedNumber;

    /**
     * \if ENGLISH_LANG
     * upper limit type(EnterOver, ExitOver, InsideOver),{@link EM_UPPER_LIMIT_TYPE}
     * \else
     * 人数越上限类型(EnterOver, ExitOver, InsideOver),{@link EM_UPPER_LIMIT_TYPE}
     * \endif
     */
    public int emUpperLimitType;

    /**
     * \if ENGLISH_LANG
     * Channel id
     * \else
     * 通道号
     * \endif
     */
    public int                 nChannelID;

}
