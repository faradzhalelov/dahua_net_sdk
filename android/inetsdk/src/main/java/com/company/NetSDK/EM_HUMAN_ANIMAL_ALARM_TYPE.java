package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Human Animal Alarm Type
 * \else
 * @brief 人和动物检测事件报警类型
 * \endif
 */
public class EM_HUMAN_ANIMAL_ALARM_TYPE implements Serializable {
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
    public static final int					EM_HUMAN_ANIMAL_ALARM_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  From normal to abnormal
     * \else
     *  从人数正常到人数异常
     * \endif
     */
    public static final int					EM_HUMAN_ANIMAL_ALARM_TYPE_NORMAL_TO_ABNORMAL = 1;

    /**
     * \if ENGLISH_LANG
     *  From abnormal to normal
     * \else
     *  从人数异常到人数正常
     * \endif
     */
    public static final int					EM_HUMAN_ANIMAL_ALARM_TYPE_ABNORMAL_TO_NORMAL = 2;

}