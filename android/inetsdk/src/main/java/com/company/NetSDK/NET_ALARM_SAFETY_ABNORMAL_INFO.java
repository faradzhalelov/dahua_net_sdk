package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 
 * \else
 * @brief 安全报警事件(对应 SDK_ALARM_SAFETY_ABNORMAL)
 * \endif
 */
public class NET_ALARM_SAFETY_ABNORMAL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  事件动作, 0: 脉冲
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  事件发生的时间
     * \endif
     */
    public NET_TIME_EX					stuUTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG,{@link EM_EXCEPTION_TYPE}
     * 
     * \else
     *  异常事件类型,{@link EM_EXCEPTION_TYPE}
     * \endif
     */
    public int					emExceptionType;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  来源IP地址
     * \endif
     */
    public byte					szAddress[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  发生异常时间
     * \endif
     */
    public NET_TIME					stuAbnormalTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  发生的用户名
     * \endif
     */
    public byte					szUser[] = new byte[128];

}
