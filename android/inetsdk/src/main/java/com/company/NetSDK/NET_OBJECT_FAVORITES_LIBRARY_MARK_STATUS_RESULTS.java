package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Favorite result status list
 * \else
 * @brief 收藏结果状态列表
 * \endif
 */
public class NET_OBJECT_FAVORITES_LIBRARY_MARK_STATUS_RESULTS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  True indicates bookmarked, false indicates not bookmarked
     * \else
     *  true表示已收藏，false表示未收藏
     * \endif
     */
    public boolean					bStatus;

    /**
     * \if ENGLISH_LANG
     *  The unique identifier that has been collected is valid when the status is true
     * \else
     *  已收藏的唯一标识，status为true时，该字段有效
     * \endif
     */
    public int					nID;

}