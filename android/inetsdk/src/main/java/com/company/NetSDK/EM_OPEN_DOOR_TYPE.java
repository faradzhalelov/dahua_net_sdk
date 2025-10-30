package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Access controller -- Open door type
 * \else
 * @brief 门禁控制--开门方式
 * \endif
 */
public class EM_OPEN_DOOR_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * EM_OPEN_DOOR_TYPE_UNKNOWN = 0,
     * \else
     * EM_OPEN_DOOR_TYPE_UNKNOWN = 0,
     * \endif
     */
    public static final int					EM_OPEN_DOOR_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Remote
     * \else
     *  远程开门
     * \endif
     */
    public static final int					EM_OPEN_DOOR_TYPE_REMOTE = 1;

    /**
     * \if ENGLISH_LANG
     *  Local_Password
     * \else
     *  本地密码开门
     * \endif
     */
    public static final int					EM_OPEN_DOOR_TYPE_LOCAL_PASSWORD = 2;

    /**
     * \if ENGLISH_LANG
     *  Local_Card
     * \else
     *  本地刷卡开门
     * \endif
     */
    public static final int					EM_OPEN_DOOR_TYPE_LOCAL_CARD = 3;

    /**
     * \if ENGLISH_LANG
     *  Local_Button
     * \else
     *  本地按钮开门
     * \endif
     */
    public static final int					EM_OPEN_DOOR_TYPE_LOCAL_BUTTON = 4;

}