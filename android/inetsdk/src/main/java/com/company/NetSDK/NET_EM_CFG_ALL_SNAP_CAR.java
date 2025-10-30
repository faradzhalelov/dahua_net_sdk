package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief All snap car class
 * \else
 * @brief 所有车开闸种类
 * \endif
 */
public class NET_EM_CFG_ALL_SNAP_CAR implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知开闸种类
     * \endif
     */
    public static final int					NET_EM_CFG_ALL_SNAP_CAR_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Plate
     * \else
     *  所有有牌车车辆
     * \endif
     */
    public static final int					NET_EM_CFG_ALL_SNAP_CAR_PLATE = 1;

    /**
     * \if ENGLISH_LANG
     *  No plate
     * \else
     *  所有无牌车车辆
     * \endif
     */
    public static final int					NET_EM_CFG_ALL_SNAP_CAR_NOPLATE = 2;

}