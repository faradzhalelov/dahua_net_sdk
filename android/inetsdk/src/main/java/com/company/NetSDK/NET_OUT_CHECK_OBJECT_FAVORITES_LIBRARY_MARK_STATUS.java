package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_CheckObjectFavoritesLibraryMarkStatus input parameters
 * \else
 * @brief CLIENT_CheckObjectFavoritesLibraryMarkStatus 接口输出参数
 * \endif
 */
public class NET_OUT_CHECK_OBJECT_FAVORITES_LIBRARY_MARK_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Maximum number of pstuResults
     * \else
     *  pstuResults最大个数
     * \endif
     */
    public int					nMaxCount;

    /**
     * \if ENGLISH_LANG
     *  Favorite result status list, Memory is released by user request, with a size of sizeof(NET_OBJECT_FAVORITES_LIBRARY_MARK_STATUS_RESULTS)*nMaxCount
     * \else
     *  收藏结果状态列表, 内存由用户申请释放, 大小为sizeof(NET_OBJECT_FAVORITES_LIBRARY_MARK_STATUS_RESULTS)*nMaxCount
     * \endif
     */
    public NET_OBJECT_FAVORITES_LIBRARY_MARK_STATUS_RESULTS[]					pstuResults;

    /**
     * \if ENGLISH_LANG
     *  Actual number of returns
     * \else
     *  实际返回的个数
     * \endif
     */
    public int					nRetCount;

    public NET_OUT_CHECK_OBJECT_FAVORITES_LIBRARY_MARK_STATUS(int nMaxCount) {
        this.nMaxCount = nMaxCount;
        this.pstuResults = new NET_OBJECT_FAVORITES_LIBRARY_MARK_STATUS_RESULTS[nMaxCount];
        for(int i = 0; i < nMaxCount; i ++){
            this.pstuResults[i] = new NET_OBJECT_FAVORITES_LIBRARY_MARK_STATUS_RESULTS();
        }
    }

}