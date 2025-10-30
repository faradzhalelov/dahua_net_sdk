package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Gesture information
 * \else
 * 手势信息
 * \endif
 */
public class NET_GESTURE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Gesture type
     * \else
     *  手势类型
     * \endif
     */
    public byte					szType[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Alarm trigger times
     * \else
     *  报警触发次数
     * \endif
     */
    public int					nCount;

}
