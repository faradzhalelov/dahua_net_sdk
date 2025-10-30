package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 
 * \else
 * Add 表示错误码
 * \endif
 */
public class NET_EM_ADD_ERRCODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  未知
     * \endif
     */
    public static final int					NET_EM_ADD_ERRCODE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  无错误
     * \endif
     */
    public static final int					NET_EM_ADD_ERRCODE_NOERROR = 0;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  实时流通道不在线
     * \endif
     */
    public static final int					NET_EM_ADD_ERRCODE_LIVECHANNEL_NOT_ONLINE = 1;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  回放流录像查不到
     * \endif
     */
    public static final int					NET_EM_ADD_ERRCODE_RECORDVIDEO_NOT_FOUND = 2;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  超过最大实时流推流通道限制
     * \endif
     */
    public static final int					NET_EM_ADD_ERRCODE_EXCEED_MAX_LIVECHANNEL = 3;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  超过最大回放流推流通道限制
     * \endif
     */
    public static final int					NET_EM_ADD_ERRCODE_EXCEED_MAX_RECORDCHANNEL = 4;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  其他错误
     * \endif
     */
    public static final int					NET_EM_ADD_ERRCODE_OTHER_ERRORS = 5;

}
