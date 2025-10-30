package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Spot type
 * \else
 * 点位类型
 * \endif
 */
public class EM_NET_SCADA_POINT_TYPE implements Serializable {
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
    public static final int EM_NET_SCADA_POINT_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * all type
     * \else
     * 所有类型
     * \endif
     */
    public static final int EM_NET_SCADA_POINT_TYPE_ALL = 1;

    /**
     * \if ENGLISH_LANG
     * analog input
     * \else
     * 遥测 模拟量输入
     * \endif
     */
    public static final int EM_NET_SCADA_POINT_TYPE_YC = 2;

    /**
     * \if ENGLISH_LANG
     * switch input
     * \else
     * 遥信 开关量输入
     * \endif
     */
    public static final int EM_NET_SCADA_POINT_TYPE_YX = 3;

    /**
     * \if ENGLISH_LANG
     * analog output
     * \else
     * 遥调 模拟量输出
     * \endif
     */
    public static final int EM_NET_SCADA_POINT_TYPE_YT = 4;

    /**
     * \if ENGLISH_LANG
     * switch ouput
     * \else
     * 遥控 开关量输出
     * \endif
     */
    public static final int EM_NET_SCADA_POINT_TYPE_YK = 5;
}
