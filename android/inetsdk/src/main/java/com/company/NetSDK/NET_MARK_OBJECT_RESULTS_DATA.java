package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Collection of Favorite Results
 * \else
 * @brief 收藏结果集合
 * \endif
 */
public class NET_MARK_OBJECT_RESULTS_DATA implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The unique identifier for successful collection, if the value is -1, it indicates collection failure
     * \else
     *  收藏成功的唯一标识，若值为-1表示收藏失败
     * \endif
     */
    public int					nID;

}