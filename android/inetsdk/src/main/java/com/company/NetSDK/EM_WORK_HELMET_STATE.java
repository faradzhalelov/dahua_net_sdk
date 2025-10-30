package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief The state of helmet
 * \else
 * @brief 安全帽佩戴状态
 * \endif
 */
public class EM_WORK_HELMET_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_HELMET_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  No helmet
     * \else
     *  不带安全帽
     * \endif
     */
    public static final int					EM_HELMET_STATE_NOTWEAR = 1;

    /**
     * \if ENGLISH_LANG
     *  Wear helmet
     * \else
     *  有带安全帽
     * \endif
     */
    public static final int					EM_HELMET_STATE_WEAR = 2;

    /**
     * \if ENGLISH_LANG
     *  There is no helmet of the specified color
     * \else
     *  不存在指定颜色的安全帽
     * \endif
     */
    public static final int					EM_HELMET_STATE_INCONFORMITY_COLOR = 3;

}