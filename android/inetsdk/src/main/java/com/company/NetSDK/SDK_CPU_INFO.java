package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * CPU info
 * \else
 * CPU信息
 * \endif
 */
public class SDK_CPU_INFO implements Serializable {
    /**
     *
     */
    private static final long       serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * CPU usage
     * \else
     * CPU利用率
     * \endif
     */
    public int                      nUsage;
}
