package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Outof resources type
 * \else
 * 资源不足类型
 * \endif
 */
public class EM_DEV_VARIABLE_CARS_MANAGER_OUTOF_RESOURCES_TYPE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_DEV_VARIABLE_CARS_MANAGER_OUTOF_RESOURCES_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Interllgent algorithm
     * \else
     * 智能算法
     * \endif
     */
    public static final int EM_DEV_VARIABLE_CARS_MANAGER_OUTOF_RESOURCES_TYPE_INTELLIGENT_ALGORITHM = 1;

    /**
     * \if ENGLISH_LANG
     * Interllgent decoding
     * \else
     * 智能解码
     * \endif
     */
    public static final int EM_DEV_VARIABLE_CARS_MANAGER_OUTOF_RESOURCES_TYPE_INTELLIGENT_DECODING = 2;

    /**
     * \if ENGLISH_LANG
     * The decoding ability is insufficient, and the stream type can be reduced and previewed
     * \else
     * 解码能力不足，可降预览码流类型满足
     * \endif
     */
    public static final int EM_DEV_VARIABLE_CARS_MANAGER_OUTOF_RESOURCES_TYPE_WEAK_DECODE = 3;

    /**
     * \if ENGLISH_LANG
     * Due to the lack of decoding capability, the down preview stream type can not be satisfied
     * \else
     * 解码能力不足，降预览码流类型仍无法满足
     * \endif
     */
    public static final int EM_DEV_VARIABLE_CARS_MANAGER_OUTOF_RESOURCES_TYPE_NO_DECODE = 4;

    /**
     * \if ENGLISH_LANG
     * Lack of resources (fuzzy concept)
     * \else
     * 资源不足	(模糊概念)
     * \endif
     */
    public static final int EM_DEV_VARIABLE_CARS_MANAGER_OUTOF_RESOURCES_TYPE_INSUFFICIENT_RESOURCES = 5;
}
