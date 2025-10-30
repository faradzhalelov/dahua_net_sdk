package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * vehicle head direction
 * \else
 * 车头方向
 * \endif
 */
public class EM_VEHICLE_HEAD_DIRECTION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_VEHICLE_HEAD_DIRECTION_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * left
     * \else
     * 左
     * \endif
     */
    public static final int EM_VEHICLE_HEAD_DIRECTION_LEFT = 1;

    /**
     * \if ENGLISH_LANG
     * middle
     * \else
     * 中
     * \endif
     */
    public static final int EM_VEHICLE_HEAD_DIRECTION_MIDDLE = 2;

    /**
     * \if ENGLISH_LANG
     * right
     * \else
     * 右
     * \endif
     */
    public static final int EM_VEHICLE_HEAD_DIRECTION_RIGHT = 3;

}
