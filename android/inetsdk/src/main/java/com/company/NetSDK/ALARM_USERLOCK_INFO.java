package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Corresponding to SDK_ALARM_USERLOCK
 * \else
 * @brief 用户锁定报警事件,对应 SDK_ALARM_USERLOCK
 * \endif
 */
public class ALARM_USERLOCK_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Time stamp (Unit is ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double					dbPTS;

    /**
     * \if ENGLISH_LANG
     *  Event occurrence time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX					stuTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  Event ID    
     * \else
     * 事件ID
     * \endif
     */
    public int					nEventID;

    /**
     * \if ENGLISH_LANG
     *  Username
     * \else
     * 用户名
     * \endif
     */
    public byte					szUserName[] = new byte[FinalVar.MAX_USER_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     *  Group
     * \else
     * 组名
     * \endif
     */
    public byte					szGroup[] = new byte[FinalVar.MAX_GROUP_LEN];

    /**
     * \if ENGLISH_LANG
     *  Illegal login IP
     * \else
     * 非法登录的IP
     * \endif
     */
    public byte					szIllegalLoginIP[] = new byte[FinalVar.MAX_ILLEGAL_LOGIN_IP_LEN];

    /**
     * \if ENGLISH_LANG
     *  Event public extension field structure
     * \else
     * 事件公共扩展字段结构体
     * \endif
     */
    public NET_EVENT_INFO_EXTEND					stuEventInfoEx = new NET_EVENT_INFO_EXTEND();

}