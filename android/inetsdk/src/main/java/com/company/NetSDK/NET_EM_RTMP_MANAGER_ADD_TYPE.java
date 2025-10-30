package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Add streaming address type
 * \else
 * 添加推流地址类型
 * \endif
 */
public class NET_EM_RTMP_MANAGER_ADD_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_ADD_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  Live Stream
     * \else
     *  实时流
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_ADD_TYPE_LIVE_STREAM = 0;

    /**
     * \if ENGLISH_LANG
     *  Record stream
     * \else
     *  回放流
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_ADD_TYPE_RECORD_STREAM = 1;

}
