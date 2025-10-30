package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * the operate type of face info
 * \else
 * 目标信息操作类型
 * \endif
 */
public class NET_EM_ACCESS_CTL_FACE_SERVICE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  insert, pInbuf = NET_IN_ACCESS_FACE_SERVICE_INSERT , pOutBuf = NET_OUT_ACCESS_FACE_SERVICE_INSERT
     * \else
     *  添加, pInbuf = NET_IN_ACCESS_FACE_SERVICE_INSERT , pOutBuf = NET_OUT_ACCESS_FACE_SERVICE_INSERT
     * \endif
     */
    public static final int					NET_EM_ACCESS_CTL_FACE_SERVICE_INSERT = 0;

    /**
     * \if ENGLISH_LANG
     *  get, pInbuf = NET_IN_ACCESS_FACE_SERVICE_GET , pOutBuf = NET_OUT_ACCESS_FACE_SERVICE_GET
     * \else
     *  获取, pInbuf = NET_IN_ACCESS_FACE_SERVICE_GET , pOutBuf = NET_OUT_ACCESS_FACE_SERVICE_GET
     * \endif
     */
    public static final int					NET_EM_ACCESS_CTL_FACE_SERVICE_GET = 1;

    /**
     * \if ENGLISH_LANG
     *  update, pInbuf = NET_IN_ACCESS_FACE_SERVICE_UPDATE , pOutBuf = NET_OUT_ACCESS_FACE_SERVICE_UPDATE
     * \else
     *  更新, pInbuf = NET_IN_ACCESS_FACE_SERVICE_UPDATE , pOutBuf = NET_OUT_ACCESS_FACE_SERVICE_UPDATE
     * \endif
     */
    public static final int					NET_EM_ACCESS_CTL_FACE_SERVICE_UPDATE = 2;

    /**
     * \if ENGLISH_LANG
     *  remove, pInbuf = NET_IN_ACCESS_FACE_SERVICE_REMOVE , pOutBuf = NET_OUT_ACCESS_FACE_SERVICE_REMOVE
     * \else
     *  删除, pInbuf = NET_IN_ACCESS_FACE_SERVICE_REMOVE , pOutBuf = NET_OUT_ACCESS_FACE_SERVICE_REMOVE
     * \endif
     */
    public static final int					NET_EM_ACCESS_CTL_FACE_SERVICE_REMOVE = 3;

    /**
     * \if ENGLISH_LANG
     *  clear, pInbuf = NET_IN_ACCESS_FACE_SERVICE_CLEAR , pOutBuf = NET_OUT_ACCESS_FACE_SERVICE_CLEAR
     * \else
     *  清空, pInbuf = NET_IN_ACCESS_FACE_SERVICE_CLEAR , pOutBuf = NET_OUT_ACCESS_FACE_SERVICE_CLEAR
     * \endif
     */
    public static final int					NET_EM_ACCESS_CTL_FACE_SERVICE_CLEAR = 4;

}
