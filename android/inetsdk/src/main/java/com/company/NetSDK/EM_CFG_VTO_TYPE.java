package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * VTO type
 * \else
 * 门口机类型
 * \endif
 */
public class EM_CFG_VTO_TYPE implements Serializable {
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
    public static final int EM_CFG_VTO_TYPE_UNKNOW = 0;

    /**
     * \if ENGLISH_LANG
     * unit VTO
     * \else
     * 单元门口机
     * \endif
     */
    public static final int EM_CFG_VTO_TYPE_VTO = 1;

    /**
     * \if ENGLISH_LANG
     * fence station
     * \else
     * 围墙机
     * \endif
     */
    public static final int EM_CFG_VTO_TYPE_WALL = 2;

    public static final int EM_CFG_VTO_TYPE_MAX = 3;
}
