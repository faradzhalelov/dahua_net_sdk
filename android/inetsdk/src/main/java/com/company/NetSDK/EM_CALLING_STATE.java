package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief calling state
 * \else
 * @brief 打电话状态
 * \endif
 */
public class EM_CALLING_STATE implements Serializable {
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
    public static final int					EM_CALLING_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  unidentified
     * \else
     *  未识别
     * \endif
     */
    public static final int					EM_CALLING_OTHER = 1;

    /**
     * \if ENGLISH_LANG
     *  not calling
     * \else
     *  未打电话
     * \endif
     */
    public static final int					EM_CALLING_NO = 2;

    /**
     * \if ENGLISH_LANG
     *  calling
     * \else
     *  打电话
     * \endif
     */
    public static final int					EM_CALLING_YES = 3;

}