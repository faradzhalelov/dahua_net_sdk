package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Relay state
 * \else
 * 继电器状态
 * \endif
 */
public class EM_RELAY_STATE_TYPE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknow
     * \else
     * 未知
     * \endif
     */
    public static final int    EM_RELAY_STATE_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * close
     * \else
     * 关
     * \endif
     */
    public static final int    EM_RELAY_STATE_TYPE_CLOSE = 0;

    /**
     * \if ENGLISH_LANG
     * open
     * \else
     * 开
     * \endif
     */
    public static final int    EM_RELAY_STATE_TYPE_OPEN = 1;
}
