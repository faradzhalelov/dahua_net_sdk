package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of zone open, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_ZONEOPEN}
 * \else
 * 防区打开事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_ZONEOPEN}
 * \endif
 */
public class ALARM_ZONEOPEN_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Event action 1:Start 2:Stop
     * \else
     * 事件动作1:Start 2:Stop
     * \endif
     */
    public int                       nAction;

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
     * Area number
     * \else
     * 区域个数
     * \endif
     */
    public int                       nAreaNum;

    /**
     * \if ENGLISH_LANG
     * Area ID
     * \else
     * 区域号
     * \endif
     */
    public int                       arrAreas[] = new int[FinalVar.MAX_AREA_NUMBER];

    /**
     * \if ENGLISH_LANG
     * Channel ID
     * \else
     * 防区号
     * \endif
     */
    public int                       nChannelID;
}
