package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Error code
 * \else
 * 错误码
 * \endif
 */
public class NET_EM_RTMP_MANAGER_ERRCODE implements Serializable {
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
    public static final int					NET_EM_RTMP_MANAGER_ERRCODE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  No error
     * \else
     *  无错误
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_ERRCODE_NOERROR = 1;

    /**
     * \if ENGLISH_LANG
     *  Push ID not exist
     * \else
     *  推流ID不存在
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_ERRCODE_STREAMID_NOT_EXIST = 2;

    /**
     * \if ENGLISH_LANG
     *  Other error
     * \else
     *  其他错误
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_ERRCODE_OTHER_ERRORS = 3;

}
