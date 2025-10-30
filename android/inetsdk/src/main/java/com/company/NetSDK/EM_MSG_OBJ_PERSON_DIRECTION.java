package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief intrusion direction
 * \else
 * @brief 入侵方向
 * \endif
 */
public class EM_MSG_OBJ_PERSON_DIRECTION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown direction
     * \else
     *  未知方向
     * \endif
     */
    public static final int					EM_MSG_OBJ_PERSON_DIRECTION_UNKOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  from left to right
     * \else
     *  从左向右
     * \endif
     */
    public static final int					EM_MSG_OBJ_PERSON_DIRECTION_LEFT_TO_RIGHT = 1;

    /**
     * \if ENGLISH_LANG
     *  from right ro left
     * \else
     *  从右向左
     * \endif
     */
    public static final int					EM_MSG_OBJ_PERSON_DIRECTION_RIGHT_TO_LEFT = 2;

}
