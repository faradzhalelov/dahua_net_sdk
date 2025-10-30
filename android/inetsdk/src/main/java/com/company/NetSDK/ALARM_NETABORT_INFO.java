package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Network Fault Event
 * \else
 * @brief 网络故障事件
 * \endif
 */
public class ALARM_NETABORT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  0=Start 1=Stop
     * \else
     * 0:开始 1:停止
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  Event Type,{@link EM_NETABORT_EVENT_TYPE}
     * \else
     * 事件类型,{@link EM_NETABORT_EVENT_TYPE}
     * \endif
     */
    public int					emNetAbortType;

    /**
     * \if ENGLISH_LANG
     *  Event Triggering Time
     * \else
     * 事件触发时间
     * \endif
     */
    public NET_TIME					stuTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  Conflict network card name
     * \else
     *冲突网卡名
     * \endif
     */
    public byte					szInterface[] = new byte[FinalVar.SDK_MAX_ETH_NAME];

}