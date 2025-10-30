package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * device type
 * \else
 * 设备类型
 * \endif
 */
public class NET_CFG_VTO_TYPE implements Serializable {
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
    public static final int NET_CFG_VTO_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * villa
     * \else
     * 别墅机
     * \endif
     */
    public static final int NET_CFG_VTO_TYPE_VILLA = 1;

    /**
     * \if ENGLISH_LANG
     * VTO
     * \else
     * 门口机
     * \endif
     */
    public static final int NET_CFG_VTO_TYPE_DOOR = 2;

    /**
     * \if ENGLISH_LANG
     * ladder
     * \else
     * 梯控机
     * \endif
     */
    public static final int NET_CFG_VTO_TYPE_LADDER = 3;

    /**
     * \if ENGLISH_LANG
     * Small Apartment
     * \else
     * 模块化门口机
     * \endif
     */
    public static final int NET_CFG_VTO_TYPE_APART = 4;

    /**
     * \if ENGLISH_LANG
     * second Confirmation
     * \else
     * 二次确认机
     * \endif
     */
    public static final int NET_CFG_VTO_TYPE_SECOND = 5;

    /**
     * \if ENGLISH_LANG
     * Target Input Device
     * \else
     * 目标录入机
     * \endif
     */
    public static final int NET_CFG_VTO_TYPE_FACE = 6;

    /**
     * \if ENGLISH_LANG
     * Controller
     * \else
     * 控制器
     * \endif
     */
    public static final int NET_CFG_VTO_TYPE_CONTROLLER = 7;

    public static final int NET_CFG_VTO_TYPE_MAX = 8;
}
