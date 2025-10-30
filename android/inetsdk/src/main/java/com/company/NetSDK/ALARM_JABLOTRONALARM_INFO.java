package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Jablotron alarm info, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_JABLOTRON_ALARM}
 * \else
 * 客户报警产品信息, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_JABLOTRON_ALARM}
 * \endif
 */
public class ALARM_JABLOTRONALARM_INFO implements Serializable {
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
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     * Event operation. 0=pulse event.1=continues event begin. 2=continuous event stop
     * \else
     * 事件动作,1表示持续性事件开始, 2表示持续性事件结束;
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     * Event name
     * \else
     * 事件名称
     * \endif
     */
    public byte[]				szName = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Event type of Jablotron alarm, refer to {@link EM_JABLOTRON_ALARM_TYPE}
     * \else
     * Jablotron报警事件类型, 参考 {@link EM_JABLOTRON_ALARM_TYPE}
     * \endif
     */
    public int          		emAlarmType;

    /**
     * \if ENGLISH_LANG
     * DefenceZone number,1~15
     * \else
     * 防区号,1~15
     * \endif
     */
    public int				    nDefenceZone;

    /**
     * \if ENGLISH_LANG
     * JablotronTimestamp
     * \else
     * Jablotron报警时其本身的时间值
     * \endif
     */
    public HMS_TIME			    stuTime = new HMS_TIME();
}
