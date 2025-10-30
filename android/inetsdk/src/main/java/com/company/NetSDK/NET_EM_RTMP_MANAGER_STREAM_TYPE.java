package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Bitstream type
 * \else
 * 码流类型
 * \endif
 */
public class NET_EM_RTMP_MANAGER_STREAM_TYPE implements Serializable {
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
    public static final int					NET_EM_RTMP_MANAGER_STREAM_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  maincode stream
     * \else
     *  主码流
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_STREAM_TYPE_MAINCODE_STREAM = 0;

    /**
     * \if ENGLISH_LANG
     *  Auxiliary code stream1
     * \else
     *  辅码流1
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_STREAM_TYPE_SECONDARYCODE_STREAM1 = 1;

    /**
     * \if ENGLISH_LANG
     *  Auxiliary code stream2
     * \else
     *  辅码流2
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_STREAM_TYPE_SECONDARYCODE_STREAM2 = 2;

}
