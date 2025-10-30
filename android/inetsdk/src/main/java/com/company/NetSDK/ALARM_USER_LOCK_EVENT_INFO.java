package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief event type SDK_ALARM_USER_LOCK_EVENT (User Lock Alarm Event)data description
 * \else
 * @brief 事件类型 SDK_ALARM_USER_LOCK_EVENT (用户锁定报警事件)对应的数据描述信息
 * \endif
 */
public class ALARM_USER_LOCK_EVENT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  user  name
     * \else
     * 用户名
     * \endif
     */
    public byte					szUser[] = new byte[FinalVar.SDK_NEW_USER_NAME_LENGTH];

    /**
     * \if ENGLISH_LANG
     *  group name
     * \else
     * 组名
     * \endif
     */
    public byte					szGroup[] = new byte[FinalVar.SDK_NEW_USER_NAME_LENGTH];

    /**
     * \if ENGLISH_LANG
     *  device IP
     * \else
     * 设备IP
     * \endif
     */
    public byte					szIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN_EX];

    /**
     * \if ENGLISH_LANG
     *  reserved 
     * \else
     * 预留 
     * \endif
     */
    public byte					reserved[] = new byte[512];

}