package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Abnormal object type
 * \else
 * @brief 目标类型
 * \endif
 */
public class EM_ABNORMAL_OBJECT_TYPE implements Serializable {
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
    public static final int					ABNORMAL_OBJECT_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Pig
     * \else
     *  猪
     * \endif
     */
    public static final int					ABNORMAL_OBJECT_TYPE_PIG = 1;

}