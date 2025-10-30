package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief audio talk status
 * \else
 * @brief 语音对讲状态
 * \endif
 */
public class EM_REGISTER_USER_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown 
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_REGISTER_USER_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  initial status 
     * \else
     *  初始状态
     * \endif
     */
    public static final int					EM_REGISTER_USER_STATE_IDLE = 1;

    /**
     * \if ENGLISH_LANG
     *  call status , no response, 
     * \else
     *  呼叫状态（对方未回应）
     * \endif
     */
    public static final int					EM_REGISTER_USER_STATE_CALLING = 2;

    /**
     * \if ENGLISH_LANG
     *  ring status , opposite response, but no response, 
     * \else
     *  回铃状态（对方回应,但没有接听）
     * \endif
     */
    public static final int					EM_REGISTER_USER_STATE_RINGING = 3;

    /**
     * \if ENGLISH_LANG
     *  previewing
     * \else
     *  正在预览
     * \endif
     */
    public static final int					EM_REGISTER_USER_STATE_PREVIEWING = 4;

    /**
     * \if ENGLISH_LANG
     *  messaging
     * \else
     *  正在留言
     * \endif
     */
    public static final int					EM_REGISTER_USER_STATE_LEAVINGMESSAGE = 5;

    /**
     * \if ENGLISH_LANG
     *  talking
     * \else
     *  通话中
     * \endif
     */
    public static final int					EM_REGISTER_USER_STATE_TALKING = 6;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public static final int					EM_REGISTER_USER_STATE_MAX = 7;

}