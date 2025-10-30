package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief open door direction
 * \else
 * @brief 开门方向
 * \endif
 */
public class EM_OPEN_DOOR_DIRECTION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown, device control
     * \else
     *  未知，设备自行决定
     * \endif
     */
    public static final int					EM_OPEN_DOOR_DIRECTION_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  open from enter direction
     * \else
     *  朝进门方向开门
     * \endif
     */
    public static final int					EM_OPEN_DOOR_DIRECTION_FROM_ENTER = 1;

    /**
     * \if ENGLISH_LANG
     *  open from enter direction
     * \else
     *  朝出门方向开门
     * \endif
     */
    public static final int					EM_OPEN_DOOR_DIRECTION_FROM_LEAVE = 2;

}