package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the type of the car
 * \else
 * 车辆类型
 * \endif
 */
public class EM_CAR_TYPE implements Serializable{
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
    public static final int EM_CAR_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * bus
     * \else
     * 客车
     * \endif
     */
    public static final int EM_CAR_BUS = 1;

    /**
     * \if ENGLISH_LANG
     * big truck
     * \else
     * 大货车
     * \endif
     */
    public static final int EM_CAR_BIG_TRUCK = 2;

    /**
     * \if ENGLISH_LANG
     * medium truck
     * \else
     * 中货车
     * \endif
     */
    public static final int EM_CAR_MEDIUM_TRUCK = 3;

    /**
     * \if ENGLISH_LANG
     * car
     * \else
     * 轿车
     * \endif
     */
    public static final int EM_CAR_CAR = 4;

    /**
     * \if ENGLISH_LANG
     * van
     * \else
     * 面包车
     * \endif
     */
    public static final int EM_CAR_VAN = 5;

    /**
     * \if ENGLISH_LANG
     * small truck
     * \else
     * 小货车
     * \endif
     */
    public static final int EM_CAR_SMALL_TRUCK = 6;

    /**
     * \if ENGLISH_LANG
     * tricycle
     * \else
     * 三轮车
     * \endif
     */
    public static final int EM_CAR_TRICYCLE = 7;

    /**
     * \if ENGLISH_LANG
     * motocycle
     * \else
     * 摩托车
     * \endif
     */
    public static final int EM_CAR_MOTORCYCLE = 8;

    /**
     * \if ENGLISH_LANG
     * pedestrian
     * \else
     * 行人
     * \endif
     */
    public static final int EM_CAR_PEDESTRIAN = 9;

    /**
     * \if ENGLISH_LANG
     * SUV-MPV
     * \else
     * SUV-MPV
     * \endif
     */
    public static final int EM_CAR_SUVMPV = 10;

    /**
     * \if ENGLISH_LANG
     * medium bus
     * \else
     * 中客车
     * \endif
     */
    public static final int EM_CAR_MEDIUM_BUS = 11;

    /**
     * \if ENGLISH_LANG
     * hazardous chemical vehicles
     * \else
     * 危化品车辆
     * \endif
     */
    public static final int EM_CAR_DANGE_VEHICLE = 12;
}
