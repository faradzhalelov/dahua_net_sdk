package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The filter type of port when capture
 * \else
 * 抓包端口过滤方式
 * \endif
 */
public class NET_EM_PROT_FILTER_TYPE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * no-user
     * \else
     * 不使用
     * \endif
     */
    public static final int NET_EM_PROT_FILTER_TYPE_NOUSE = 0;

    /**
     * \if ENGLISH_LANG
     * include
     * \else
     * 包含
     * \endif
     */
    public static final int NET_EM_PROT_FILTER_TYPE_INCLUDE = 1;

    /**
     * \if ENGLISH_LANG
     * exclude
     * \else
     * 排除
     * \endif
     */
    public static final int NET_EM_PROT_FILTER_TYPE_EXCLUDE = 2;
}

