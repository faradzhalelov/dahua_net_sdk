package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief status  record search criteria
 * \else
 * @brief 状态记录查询条件
 * \endif
 */
public class FIND_RECORD_REGISTER_USER_STATE_CONDITION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  userID search criteria is valid or not
     * \else
     *  用户ID查询条件是否有效
     * \endif
     */
    public boolean					bUserIDEnable;

    /**
     * \if ENGLISH_LANG
     *  user ID
     * \else
     *  用户ID
     * \endif
     */
    public byte					szUserID[] = new byte[FinalVar.SDK_MAX_USERID_LEN];

    /**
     * \if ENGLISH_LANG
     *  online search criteria is valid or not
     * \else
     *  是否在线查询条件是否有效
     * \endif
     */
    public boolean					bOnlineEnable;

    /**
     * \if ENGLISH_LANG
     *  Online
     * \else
     *  是否在线
     * \endif
     */
    public int					nOnline;

    /**
     * \if ENGLISH_LANG
     *  audio talk status  search criteria  is valid or not 
     * \else
     *  语音对讲状态查询条件是否有效
     * \endif
     */
    public boolean					bVideoTalkingEnable;

    /**
     * \if ENGLISH_LANG
     *  audio talk status ,{@link EM_REGISTER_USER_STATE}
     * \else
     *  语音对讲状态,{@link EM_REGISTER_USER_STATE}
     * \endif
     */
    public int					emVideoTalking;

}