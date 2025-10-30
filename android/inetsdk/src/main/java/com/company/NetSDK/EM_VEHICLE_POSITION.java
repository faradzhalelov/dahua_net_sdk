package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * vehicle position when snap picture
 * \else
 * 抓拍时车的位置
 * \endif
 */
public class EM_VEHICLE_POSITION implements Serializable {
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
    public static final int EM_VEHICLE_POSITION_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * head
     * \else
     * 头
     * \endif
     */
    public static final int EM_VEHICLE_POSITION_HEAD = 1;

    /**
     * \if ENGLISH_LANG
     * tail
     * \else
     * 尾
     * \endif
     */
    public static final int EM_VEHICLE_POSITION_TAIL = 2;

}
