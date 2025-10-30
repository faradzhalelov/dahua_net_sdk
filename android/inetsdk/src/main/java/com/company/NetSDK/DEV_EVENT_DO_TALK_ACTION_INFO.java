package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of {@link FinalVar#EVENT_IVS_DO_TALK_ACTION}'s data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_DO_TALK_ACTION} (对讲动作事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_DO_TALK_ACTION_INFO implements Serializable {
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
    public int									nAction;

    /**
     * \if ENGLISH_LANG
     * Channel id
     * \else
     * 通道号
     * \endif
     */
    public int									nChannelID;

    /**
     * \if ENGLISH_LANG
     * Event name
     * \else
     * 事件名称
     * \endif
     */
    public byte								szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * PTS,unit:ms
     * \else
     * 时间戳（单位：毫秒）
     * \endif
     */
    public double								PTS;

    /**
     * \if ENGLISH_LANG
     * Event occur time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX							UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Event id
     * \else
     * 事件ID
     * \endif
     */
    public int									nEventID;

    /**
     * \if ENGLISH_LANG
     * Call id
     * \else
     * 呼叫ID
     * \endif
     */
    public byte								szCallID[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * Talk action,refer to {@link EM_TALK_ACTION_TYPE}
     * \else
     * 对讲动作类型,参考{@link EM_TALK_ACTION_TYPE}
     * \endif
     */
    public int					emTalkAction;

    /**
     * \if ENGLISH_LANG
     * Call source，refer to {@link EM_CALL_SOURCE_TYPE}
     * \else
     * 呼叫源类型，参考{@link EM_CALL_SOURCE_TYPE}
     * \endif
     */
    public int					emCallSource;

    /**
     * \if ENGLISH_LANG
     * Hangup reason, refer to {@link EM_HANGUP_REASON},valid when emTalkAction is EM_TALK_ACTION_TYPE.EM_TALK_ACTION_TYPE_HANGUP
     * \else
     * 挂断原因,参考{@link EM_HANGUP_REASON},当emTalkAction 为EM_TALK_ACTION_TYPE.EM_TALK_ACTION_TYPE_HANGUP 时有效
     * \endif
     */
    public int					emHangupReason;
}
