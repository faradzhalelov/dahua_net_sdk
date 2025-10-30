package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of area alarm, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_AREAALARM}
 * \else
 * 区域报警事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_AREAALARM}
 * \endif
 */
public class ALARM_AREAALARM_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Area ID
     * \else
     * 区域号
     * \endif
     */
    public int                       nAreaIndex;

    /**
     * \if ENGLISH_LANG
     * Event ID
     * \else
     * 事件ID
     * \endif
     */
    public int					      nEventID;

    /**
     * \if ENGLISH_LANG
     * Event occurrence time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX			      UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Name
     * \else
     * 名称
     * \endif
     */
    public byte                      szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Defence area type {@link EM_DEFENCE_AREA_TYPE}
     * \else
     * 防区类型 {@link EM_DEFENCE_AREA_TYPE}
     * \endif
     */
    public int      emDefenceAreaType;

    /**
     * \if ENGLISH_LANG
     * Channel ID
     * \else
     * 触发的通道号
     * \endif
     */
    public int                       nIndex;

    /**
     * \if ENGLISH_LANG
     * trigger type {@link EM_AREAALARM_TRIGGER_TYPE}
     * \else
     * 触发类型 {@link EM_AREAALARM_TRIGGER_TYPE}
     * \endif
     */
    public int emTrigerType;
}
