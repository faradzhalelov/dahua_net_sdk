package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Object abnormal type
 * \else
 * @brief 异常行为
 * \endif
 */
public class EM_OBJECT_ABNORMAL_TYPE implements Serializable {
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
    public static final int					EM_OBJECT_ABNORMAL_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Retrograde
     * \else
     *  逆向运动
     * \endif
     */
    public static final int					EM_OBJECT_ABNORMAL_TYPE_RETROGRADE = 1;

}