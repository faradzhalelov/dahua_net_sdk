package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of zone module lost, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_ZONEMODULELOST}
 * \else
 * 防区模块掉线事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_ZONEMODULELOST}
 * \endif
 */
public class ALARM_ZONEMODULE_LOST_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * lost module type {@link EM_LOSTMODULE_TYPE}
     * \else
     * 掉线模块类型 {@link EM_LOSTMODULE_TYPE}
     * \endif
     */
    public int        emType;

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
     * zone number
     * \else
     * 属于此模块的防区个数
     * \endif
     */
    public int                       nZones;

    /**
     * \if ENGLISH_LANG
     * zones
     * \else
     * 属于此某块的防区号
     * \endif
     */
    public int                       arrZones[] = new int[FinalVar.MAX_ZONE_NUMBER];

    /**
     * \if ENGLISH_LANG
     * Net state,false:offline true:online
     * \else
     * 在线状态,false:不在线 true:在线
     * \endif
     */
    public boolean                      bOnLine;
}
