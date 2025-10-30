package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Canopy (umbrella) type
 * \else
 * @brief 雨棚（伞）类型
 * \endif
 */
public class EM_RAIN_SHED_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  none
     * \else
     *  无
     * \endif
     */
    public static final int					EM_RAIN_SHED_TYPE_NONE = -1;

    /**
     * \if ENGLISH_LANG
     *  no umbrella
     * \else
     *  不撑伞
     * \endif
     */
    public static final int					EM_RAIN_SHED_TYPE_NO_UMBRELLA = 0;

    /**
     * \if ENGLISH_LANG
     *  People don't hold umbrellas
     * \else
     *  人非手撑伞
     * \endif
     */
    public static final int					EM_RAIN_SHED_TYPE_NOT_PEOPLE_HOLD = 1;

    /**
     * \if ENGLISH_LANG
     *  unknow
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_RAIN_SHED_TYPE_UNKOWN = 2;

    /**
     * \if ENGLISH_LANG
     *  Non motor vehicle loading umbrella
     * \else
     *  非机动车装载雨伞
     * \endif
     */
    public static final int					EM_RAIN_SHED_TYPE_NO_MOTOR_UMBRELLA = 3;

    /**
     * \if ENGLISH_LANG
     *  Non motor vehicle loading canopy
     * \else
     *  非机动车装载雨棚
     * \endif
     */
    public static final int					EM_RAIN_SHED_TYPE_NO_MOTOR_CANOPY = 4;

}
