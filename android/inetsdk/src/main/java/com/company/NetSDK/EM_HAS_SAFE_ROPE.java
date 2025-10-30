package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief SafeRope
 * \else
 * @brief 是否有安全绳
 * \endif
 */
public class EM_HAS_SAFE_ROPE implements Serializable {
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
    public static final int					EM_SAFE_ROPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  no
     * \else
     *  无
     * \endif
     */
    public static final int					EM_SAFE_ROPE_NO = 1;

    /**
     * \if ENGLISH_LANG
     *  yes
     * \else
     *  有
     * \endif
     */
    public static final int					EM_SAFE_ROPE_YES = 2;

}