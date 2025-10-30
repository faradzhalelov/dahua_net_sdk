package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#StartFindFaceRecognition} output parameter
 * \else
 * {@link INetSDK#StartFindFaceRecognition} 接口输出参数
 * \endif
 */
public class NET_OUT_STARTFIND_FACERECONGNITION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Record number of returns that match the query criteria
     * \else
     *  返回的符合查询条件的记录个数,
     *  -1表示总条数未生成,要推迟获取, 用于以图搜图， 使用 {@link INetSDK#AttachFaceFindState}接口状态
     * \endif
     */
    public int                 nTotalCount;

    /**
     * \if ENGLISH_LANG
     * Find handle
     * \else
     * 查询句柄
     * \endif
     */
    public long               lFindHandle;

    /**
     * \if ENGLISH_LANG
     * The search token received
     * \else
     * 获取到的查询令牌
     * \endif
     */
    public int                 nToken;
}
