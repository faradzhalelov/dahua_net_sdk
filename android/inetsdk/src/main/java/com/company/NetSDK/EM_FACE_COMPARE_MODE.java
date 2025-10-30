package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Target contrast pattern
 * \else
 * 目标对比模式
 * \endif
 */
public class EM_FACE_COMPARE_MODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknow
     * \else
     * 未知
     * \endif
     */
    public static final int NET_FACE_COMPARE_MODE_UNKOWN = 0;

    /**
     * \if ENGLISH_LANG
     * normal
     * \else
     * 正常
     * \endif
     */
    public static final int NET_FACE_COMPARE_MODE_NORMAL = 1;

    /**
     * \if ENGLISH_LANG
     * Specify the face region combination area
     * \else
     * 指定目标区域组合区域
     * \endif
     */
    public static final int NET_FACE_COMPARE_MODE_AREA = 2;

    /**
     * \if ENGLISH_LANG
     * Intelligent model, the algorithm according to the situation of facial regions automatically select combination
     * \else
     * 智能模式,算法根据目标各个区域情况自动选取组合
     * \endif
     */
    public static final int NET_FACE_COMPARE_MODE_AUTO = 3;
}
