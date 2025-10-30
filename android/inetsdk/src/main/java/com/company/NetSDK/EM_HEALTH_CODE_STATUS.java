package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief health code status
 * \else
 * @brief 健康码状态
 * \endif
 */
public class EM_HEALTH_CODE_STATUS implements Serializable {
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
    public static final int					EM_HEALTH_CODE_STATUS_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  red
     * \else
     *  红码
     * \endif
     */
    public static final int					EM_HEALTH_CODE_STATUS_RED = 1;

    /**
     * \if ENGLISH_LANG
     *  green
     * \else
     *  绿码
     * \endif
     */
    public static final int					EM_HEALTH_CODE_STATUS_GREEN = 2;

    /**
     * \if ENGLISH_LANG
     *  yellow
     * \else
     *  黄码
     * \endif
     */
    public static final int					EM_HEALTH_CODE_STATUS_YELLOW = 3;

    /**
     * \if ENGLISH_LANG
     *  invalid
     * \else
     *  无效	
     * \endif
     */
    public static final int					EM_HEALTH_CODE_STATUS_INVALID = 4;

}
