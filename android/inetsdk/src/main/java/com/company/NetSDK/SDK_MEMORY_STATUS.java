package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Memory status
 * \else
 * 内存状态
 * \endif
 */
public class SDK_MEMORY_STATUS implements Serializable {
    /**
     *
     */
    private static final long       serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * Search succeeded or not
     * \else
     * 查询是否成功
     * \endif
     */
    public boolean                  bEnable;
    /**
     * \if ENGLISH_LANG
     * Memory info
     * \else
     * 内存信息
     * \endif
     */
    public SDK_MEMORY_INFO          stuMemory = new SDK_MEMORY_INFO();
}
