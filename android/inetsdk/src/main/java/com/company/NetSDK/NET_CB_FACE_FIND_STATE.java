package com.company.NetSDK;

import java.io.Serializable;

public class NET_CB_FACE_FIND_STATE implements Serializable {
    /**
     *
     */
    private static final long           serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Video synopsis task database main key ID
     * \else
     * 视频浓缩任务数据库主键ID
     * \endif
     */
    public int                          nToken;
    /**
     * \if ENGLISH_LANG
     * Normal value: 0-100. 1=Searched token does not exist (When subscribe a search that does not exist or already finished)
     * \else
     * 正常取值范围：0-100,-1,表示查询token不存在(当订阅一个不存在或结束的查询时)
     * \endif
     */
    public int                          nProgress;
    /**
     * \if ENGLISH_LANG
     * The human target amount that match current criteria
     * \else
     * 目前符合查询条件的目标数量
     * \endif
     */
    public int                          nCurrentCount;
}
