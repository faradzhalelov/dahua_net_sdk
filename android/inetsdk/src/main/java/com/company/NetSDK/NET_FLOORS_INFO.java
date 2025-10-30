package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  Floor number（elevator control requirement）
 * \else
 *  楼层号（梯控需求）
 * \endif
 */
public class NET_FLOORS_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The number of effective floors expanded again
     * \else
     * 有效的楼层数量再次扩展
     * \endif
     */
    public int     nFloorNumEx2;

    /**
     * \if ENGLISH_LANG
     *  Floor numbers (elevator control requirements) no more than 256, floor numbers no more than 999
     * \else
     * 楼层号(梯控需求)最多不超过256个，楼层号不超过999
     * \endif
     */
    public byte     szFloorEx[][] = new byte[256][8];
}
