package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief lighting mode
 * \else
 * @brief lighting mode
 * \endif
 */
public class EM_TATGET_MODE implements Serializable {
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
    public static final int					EM_TATGET_MODE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  OFF
     * \else
     *  关闭
     * \endif
     */
    public static final int					EM_TATGET_MODE_OFF = 1;

    /**
     * \if ENGLISH_LANG
     *  License Plate Priority
     * \else
     *  车牌优先
     * \endif
     */
    public static final int					EM_TATGET_MODE_PLATE = 2;

    /**
     * \if ENGLISH_LANG
     *  Face Priority
     * \else
     *  人脸优先
     * \endif
     */
    public static final int					EM_TATGET_MODE_FACE = 3;

    /**
     * \if ENGLISH_LANG
     *  General
     * \else
     *  通用配置
     * \endif
     */
    public static final int					EM_TATGET_MODE_GENERAL = 4;

}