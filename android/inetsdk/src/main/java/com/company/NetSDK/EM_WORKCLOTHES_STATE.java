package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief The state of work clothes
 * \else
 * @brief 工作服穿戴状态
 * \endif
 */
public class EM_WORKCLOTHES_STATE implements Serializable {
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
    public static final int					EM_WORKCLOTHES_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  No work clothes
     * \else
     *  无工作服
     * \endif
     */
    public static final int					EM_WORKCLOTHES_STATE_NOTWEAR = 1;

    /**
     * \if ENGLISH_LANG
     *  Wear work clothes
     * \else
     *  有工作服
     * \endif
     */
    public static final int					EM_WORKCLOTHES_STATE_WEAR = 2;

}