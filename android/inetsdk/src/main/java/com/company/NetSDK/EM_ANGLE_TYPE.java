package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Angle
 * \else
 * @brief 角度
 * \endif
 */
public class EM_ANGLE_TYPE implements Serializable {
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
    public static final int					EM_ANGLE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  front
     * \else
     *  正面
     * \endif
     */
    public static final int					EM_ANGLE_FRONT = 1;

    /**
     * \if ENGLISH_LANG
     *  side
     * \else
     *  侧面
     * \endif
     */
    public static final int					EM_ANGLE_SIDE = 2;

    /**
     * \if ENGLISH_LANG
     *  back
     * \else
     *  背面
     * \endif
     */
    public static final int					EM_ANGLE_BACK = 3;

}