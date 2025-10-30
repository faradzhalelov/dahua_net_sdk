package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Broadcast text type
 * \else
 * 播报文本类型
 * \endif
 */
public class EM_BROADCAST_TEXT_TYPE implements Serializable {
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
    public static final int					EM_BROADCAST_TEXT_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  Ordinary
     * \else
     *  普通
     * \endif
     */
    public static final int					EM_BROADCAST_TEXT_TYPE_ORDINARY = 0;

    /**
     * \if ENGLISH_LANG
     *  Plate number
     * \else
     *  车牌号
     * \endif
     */
    public static final int					EM_BROADCAST_TEXT_TYPE_PLATE_NUMBER = 1;

    /**
     * \if ENGLISH_LANG
     *  Time
     * \else
     *  时间
     * \endif
     */
    public static final int					EM_BROADCAST_TEXT_TYPE_TIME = 2;

    /**
     * \if ENGLISH_LANG
     *  Number string
     * \else
     *  数字字符串
     * \endif
     */
    public static final int					EM_BROADCAST_TEXT_TYPE_NUMBER_STRING = 3;

}
