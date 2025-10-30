package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * target type
 * \else
 * 目标类型
 * \endif
 */
public class EM_TRACK_OBJECT_TYPE implements Serializable {
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
    public static final int					EM_TRACK_OBJECT_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  face
     * \else
     *  目标
     * \endif
     */
    public static final int					EM_TRACK_OBJECT_TYPE_FACE = 0;

    /**
     * \if ENGLISH_LANG
     *  human body
     * \else
     *  人体
     * \endif
     */
    public static final int					EM_TRACK_OBJECT_TYPE_HUMAN = 1;

    /**
     * \if ENGLISH_LANG
     *  Motor vehicle
     * \else
     *  机动车
     * \endif
     */
    public static final int					EM_TRACK_OBJECT_TYPE_VECHILE = 2;

    /**
     * \if ENGLISH_LANG
     *  Non-motorized vehicles
     * \else
     *  非机动车
     * \endif
     */
    public static final int					EM_TRACK_OBJECT_TYPE_NOMOTOR = 3;

}
