package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief login failed event
 * \else
 * @brief 登陆失败事件
 * \endif
 */
public class ALARM_LOGIN_FAILIUR_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  0:start 1:stop
     * \else
     *  0:开始 1:停止
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  no.
     * \else
     *  序号
     * \endif
     */
    public int					nSequence;

    /**
     * \if ENGLISH_LANG
     *  event name, fill in user name
     * \else
     *  事件名,填用户名称
     * \endif
     */
    public byte					szName[] = new byte[FinalVar.SDK_EVENT_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     *  login type
     * \else
     *  登录类型
     * \endif
     */
    public byte					szType[] = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     *  source IP address
     * \else
     *  来源IP地址
     * \endif
     */
    public byte					szAddr[] = new byte[FinalVar.SDK_MAX_IPADDR_EX_LEN];

    /**
     * \if ENGLISH_LANG
     *  user login failed error code
     * \else
     *  用户登陆失败错误码
     * \endif
     */
    public int					nError;

}
