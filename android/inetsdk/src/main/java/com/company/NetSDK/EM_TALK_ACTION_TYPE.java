package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Talk action type
 * \else
 * 对讲动作类型
 * \endif
 */
public class EM_TALK_ACTION_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_TALK_ACTION_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Invite
     * \else
     * 呼叫
     * \endif
     */
    public static final int EM_TALK_ACTION_TYPE_INVITE = 1;

    /**
     * \if ENGLISH_LANG
     * Hangup
     * \else
     * 挂断
     * \endif
     */
    public static final int EM_TALK_ACTION_TYPE_HANGUP = 2;
}
