package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Standard bold source abnormal alarm event info
 * \else
 * 标准黑体源异常报警事件信息
 * \endif
 */
public class ALARM_REGULATOR_ABNORMAL_INFO  implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel ID
     * \else
     * 通道号
     * \endif
     */
    public int                 nChannelID;

    /**
     * \if ENGLISH_LANG
     * Action,0:pulse 1:Start 2:Stop
     * \else
     * 0:脉冲 1:开始 2:停止
     * \endif
     */
    public int                 nAction;

    /**
     * \if ENGLISH_LANG
     * Event name
     * \else
     * 事件名称
     * \endif
     */
    public byte               szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * timestamp,Unit:ms
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double                 PTS;

    /**
     * \if ENGLISH_LANG
     * event occur time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX          UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * event ID
     * \else
     * 事件ID
     * \endif
     */
    public int                 nEventID;

    /**
     * \if ENGLISH_LANG
     * Exception type
     * \else
     * 异常类型
     * \endif
     */
    public byte               szTypes[] = new byte[FinalVar.MAX_COMMON_STRING_32];

}
