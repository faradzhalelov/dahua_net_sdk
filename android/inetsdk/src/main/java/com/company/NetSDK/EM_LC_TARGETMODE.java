package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Supported target modes for anti fill light overexposure
 * \else
 * @brief 支持防补光过曝的目标类型
 * \endif
 */
public class EM_LC_TARGETMODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * UNKNOWN
     * \else
     * 未知
     * \endif
     */
    public static final int					EM_LC_TARGETMODE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * OFF
     * \else
     * 关闭
     * \endif
     */
    public static final int					EM_LC_TARGETMODE_OFF = 1;

    /**
     * \if ENGLISH_LANG
     * PLATE
     * \else
     * 车牌
     * \endif
     */
    public static final int					EM_LC_TARGETMODE_PLATE = 2;

    /**
     * \if ENGLISH_LANG
     * FACE
     * \else
     * 人脸
     * \endif
     */
    public static final int					EM_LC_TARGETMODE_FACE = 3;

    /**
     * \if ENGLISH_LANG
     * GENERAL
     * \else
     * 通用
     * \endif
     */
    public static final int					EM_LC_TARGETMODE_GENERAL = 4;

}