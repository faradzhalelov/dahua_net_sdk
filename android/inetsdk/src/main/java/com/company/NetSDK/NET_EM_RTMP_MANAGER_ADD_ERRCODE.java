package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Add Indicates the error code
 * \else
 * Add 表示错误码
 * \endif
 */
public class NET_EM_RTMP_MANAGER_ADD_ERRCODE implements Serializable {
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
    public static final int					NET_EM_RTMP_MANAGER_ADD_ERRCODE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  no error
     * \else
     *  无错误
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_ADD_ERRCODE_NOERROR = 0;

    /**
     * \if ENGLISH_LANG
     *  Real time channel not online
     * \else
     *  实时流通道不在线
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_ADD_ERRCODE_LIVECHANNEL_NOT_ONLINE = 1;

    /**
     * \if ENGLISH_LANG
     *  Playback stream video not found
     * \else
     *  回放流录像查不到
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_ADD_ERRCODE_RECORDVIDEO_NOT_FOUND = 2;

    /**
     * \if ENGLISH_LANG
     *  Maximum real-time streaming channel limit exceeded
     * \else
     *  超过最大实时流推流通道限制
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_ADD_ERRCODE_EXCEED_MAX_LIVECHANNEL = 3;

    /**
     * \if ENGLISH_LANG
     *  Maximum playback stream push channel limit exceeded
     * \else
     *  超过最大回放流推流通道限制
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_ADD_ERRCODE_EXCEED_MAX_RECORDCHANNEL = 4;

    /**
     * \if ENGLISH_LANG
     *  other error
     * \else
     *  其他错误
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_ADD_ERRCODE_OTHER_ERRORS = 5;

}
