package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Monitor State
 * \else
 * @brief 预览状态
 * \endif
 */
public class NET_MONITORSTATE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  0 unmonitor (initial status)
     * \else
     *  0 未预览（初始状态）
     * \endif
     */
    public static final int					NET_MONITORSTATE_TYPE_UNMONITORED = 0;

    /**
     * \if ENGLISH_LANG
     *  1 receive monitor query 
     * \else
     *  1 收到预览请求
     * \endif
     */
    public static final int					NET_MONITORSTATE_TYPE_MONITORREQUEST = 1;

    /**
     * \if ENGLISH_LANG
     *  2 monitor status 
     * \else
     *  2 被预览状态
     * \endif
     */
    public static final int					NET_MONITORSTATE_TYPE_MONITORED = 2;

    /**
     * \if ENGLISH_LANG
     *  Unknown status 
     * \else
     *  未知状态
     * \endif
     */
    public static final int					NET_MONITORSTATE_TYPE_UNKNOWN = 3;

}