package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Umbrella state
 * \else
 * @brief 是否打伞
 * \endif
 */
public class EM_HAS_UMBRELLA implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  No such field
     * \else
     *  无该字段
     * \endif
     */
    public static final int					EM_HAS_UMBRELLA_NOT_EXIST = -1;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_HAS_UMBRELLA_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  no umbrella
     * \else
     *  未打伞
     * \endif
     */
    public static final int					EM_HAS_UMBRELLA_NO = 1;

    /**
     * \if ENGLISH_LANG
     *  has umbrella
     * \else
     *  打伞
     * \endif
     */
    public static final int					EM_HAS_UMBRELLA_YES = 2;

}