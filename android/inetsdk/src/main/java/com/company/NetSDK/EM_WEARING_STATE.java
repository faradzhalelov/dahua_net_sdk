package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Wear state
 * \else
 * @brief 穿戴状态
 * \endif
 */
public class EM_WEARING_STATE implements Serializable {
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
    public static final int					EM_WEARING_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  not wearing
     * \else
     *  没有穿戴
     * \endif
     */
    public static final int					EM_WEARING_STATE_NOTWEAR = 1;

    /**
     * \if ENGLISH_LANG
     *  Wear
     * \else
     *  有穿戴
     * \endif
     */
    public static final int					EM_WEARING_STATE_WEAR = 2;

    /**
     * \if ENGLISH_LANG
     *  There is no hat of the specified color 
     * \else
     *  不存在指定颜色的帽子 
     * \endif
     */
    public static final int					EM_WEARING_STATE_NO_EXIT = 3;

}