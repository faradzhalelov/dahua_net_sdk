package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * send search type
 * \else
 * 下发搜索类型
 * \endif
 */
public class EM_SEND_SEARCH_TYPE implements Serializable {
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
    public static final int EM_SEND_SEARCH_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * multicast search
     * \else
     * 组播搜索
     * \endif
     */
    public static final int EM_SEND_SEARCH_TYPE_MULTICAST = 1;

    /**
     * \if ENGLISH_LANG
     * broadcast search
     * \else
     * 广播搜索
     * \endif
     */
    public static final int EM_SEND_SEARCH_TYPE_BROADCAST = 2;
}
