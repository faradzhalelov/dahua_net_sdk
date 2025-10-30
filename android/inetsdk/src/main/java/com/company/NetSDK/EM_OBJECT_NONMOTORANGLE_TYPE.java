package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Non Motor vehicle angle
 * \else
 * @brief 非机动车的角度
 * \endif
 */
public class EM_OBJECT_NONMOTORANGLE_TYPE implements Serializable {
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
    public static final int					EM_OBJECT_NONMOTORANGLE_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  front
     * \else
     *  正面
     * \endif
     */
    public static final int					EM_OBJECT_NONMOTORANGLE_TYPE_FRONT = 1;

    /**
     * \if ENGLISH_LANG
     *  side
     * \else
     *  侧面
     * \endif
     */
    public static final int					EM_OBJECT_NONMOTORANGLE_TYPE_SIDE = 2;

    /**
     * \if ENGLISH_LANG
     *  behind
     * \else
     *  后面
     * \endif
     */
    public static final int					EM_OBJECT_NONMOTORANGLE_TYPE_BEHIND = 3;

}
