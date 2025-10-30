package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Video target information
 * \else
 * 视频目标信息
 * \endif
 */
public class NET_VIDEO_TRACK_OBJECT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * target uuid
     * \else
     * 目标uuid
     * \endif
     */
    public byte szObjectUUID[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * target type,refer to EM_TRACK_OBJECT_TYPE
     * \else
     * 目标类型,参考 EM_TRACK_OBJECT_TYPE
     * \endif
     */
    public int emObjectType[] = new int[32];

    /**
     * \if ENGLISH_LANG
     * Number of target types
     * \else
     * 目标类型的个数
     * \endif
     */
    public int nObjectTypeNum;

    /**
     * \if ENGLISH_LANG
     * bounding box
     * \else
     * 包围盒
     * \endif
     */
    public NET_RECT stuBoundingBox = new NET_RECT();

}
