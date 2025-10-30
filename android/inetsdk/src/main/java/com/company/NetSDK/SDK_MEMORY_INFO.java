package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Memory info
 * \else
 * 内存信息
 * \endif
 */
public class SDK_MEMORY_INFO implements Serializable {
    /**
     *
     */
    private static final long       serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * Total memory, M
     * \else
     * 总内存, M
     * \endif
     */
    public int                      dwTotal;
    /**
     * \if ENGLISH_LANG
     * Free memory, M
     * \else
     * 剩余内存, M
     * \endif
     */
    public int                      dwFree;
}
