package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Legal status of work clothes
 * \else
 * @brief 工作服合法状态
 * \endif
 */
public class EM_CLOTHES_LEGAL_STATE implements Serializable {
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
    public static final int					EM_CLOTHES_LEGAL_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Wrongful
     * \else
     *  不合法
     * \endif
     */
    public static final int					EM_CLOTHES_LEGAL_STATE_WRONGFUL = 1;

    /**
     * \if ENGLISH_LANG
     *  Legal
     * \else
     *  合法
     * \endif
     */
    public static final int					EM_CLOTHES_LEGAL_STATE_LEGAL = 2;

}