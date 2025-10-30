package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Remote collect status
 * \else
 * 当前采集状态
 * \endif
 */
public class NET_EM_REMOTE_COLLECT_STATUS implements Serializable {

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
    public static final int NET_EM_REMOTE_COLLECT_STATUS_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * idle
     * \else
     * 空闲
     * \endif
     */
    public static final int NET_EM_REMOTE_COLLECT_STATUS_IDLE = 1;

    /**
     * \if ENGLISH_LANG
     * collecting
     * \else
     * 正在采集
     * \endif
     */
    public static final int NET_EM_REMOTE_COLLECT_STATUS_COLLECTING = 2;
}

