package com.company.NetSDK;

import java.io.Serializable;



/**
 * \if ENGLISH_LANG
 * Remote collect type
 * \else
 * 远程采集类型
 * \endif
 */
public class NET_EM_REMOTE_COLLECT_TYPE implements Serializable {

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
    public static final int NET_EM_REMOTE_COLLECT_TYPE_UNKNOWN = 0;


    /**
     * \if ENGLISH_LANG
     * Capture
     * \else
     * 抓包
     * \endif
     */
    public static final int NET_EM_REMOTE_COLLECT_TYPE_CAPTURE = 1;


    /**
     * \if ENGLISH_LANG
     * Log
     * \else
     * 日志
     * \endif
     */
    public static final int NET_EM_REMOTE_COLLECT_TYPE_LOG = 2;

}
