package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * NET_EM_RTMP_MANAGER_STATUS
 * \else
 * NET_EM_RTMP_MANAGER_STATUS
 * \endif
 */
public class NET_EM_RTMP_MANAGER_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_STATUS_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  Streaming is not enabled
     * \else
     *  未开启推流
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_STATUS_NOT_ENABLED = 0;

    /**
     * \if ENGLISH_LANG
     *  Push flow
     * \else
     *  推流中
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_STATUS_PUSH_FLOW = 1;

    /**
     * \if ENGLISH_LANG
     *  The push flow ends normally
     * \else
     *  推流正常结束
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_STATUS_PUSH_FLOW_END_NORMALLY = 2;

    /**
     * \if ENGLISH_LANG
     *  Streaming failed
     * \else
     *  推流失败
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_STATUS_FAILED = 3;

    /**
     * \if ENGLISH_LANG
     *  Streaming stop
     * \else
     *  推流暂停
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_STATUS_STOP = 4;

}
