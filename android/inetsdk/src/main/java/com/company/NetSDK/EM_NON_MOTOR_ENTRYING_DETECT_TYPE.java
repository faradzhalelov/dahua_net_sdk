package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Detection type of non motor vehicle entering elevator
 * \else
 * @brief 非机动车进电梯检测类型
 * \endif
 */
public class EM_NON_MOTOR_ENTRYING_DETECT_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知非机动车类型
     * \endif
     */
    public static final int					EM_NON_MOTOR_ENTRYING_DETECT_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Bicycle
     * \else
     *  自行车
     * \endif
     */
    public static final int					EM_NON_MOTOR_ENTRYING_DETECT_TYPE_BICYCLE = 1;

    /**
     * \if ENGLISH_LANG
     *  Tricycle
     * \else
     *  三轮车
     * \endif
     */
    public static final int					EM_NON_MOTOR_ENTRYING_DETECT_TYPE_TRICYCLE = 2;

    /**
     * \if ENGLISH_LANG
     *  Motorcycle
     * \else
     *  摩托车(包含电动车,二轮摩托车)
     * \endif
     */
    public static final int					EM_NON_MOTOR_ENTRYING_DETECT_TYPE_MOTORCYCLE = 3;

}