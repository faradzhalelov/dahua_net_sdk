package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_MarkObjectFavoritesLibraryObjectRecords output parameters
 * \else
 * @brief CLIENT_MarkObjectFavoritesLibraryObjectRecords 接口输出参数
 * \endif
 */
public class NET_OUT_MARK_OBJECT_FAVORITES_LIBRARY_OBJECT_RECORDS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Collection result code, 0: Collection successful 1: Collection failed 2: Collection full
     * \else
     *  收藏结果码, 0: 收藏成功 1: 收藏失败 2: 收藏夹已满
     * \endif
     */
    public int					nResultCode;

    /**
     * \if ENGLISH_LANG
     *  Collection of Favorite Results, Memory is released by user request, with a size of sizeof(NET_MARK_OBJECT_RESULTS_DATA)*nMaxCount
     * \else
     *  收藏结果集合, 内存由用户申请释放, 大小为sizeof(NET_MARK_OBJECT_RESULTS_DATA)*nMaxCount
     * \endif
     */
    public NET_MARK_OBJECT_RESULTS_DATA[]					pstuResultData;

    /**
     * \if ENGLISH_LANG
     *  The maximum number of favorite result sets
     * \else
     *  收藏结果集合最个数
     * \endif
     */
    public int					nMaxCount;

    /**
     * \if ENGLISH_LANG
     *  Number of Collection Results
     * \else
     *  收藏结果集合个数
     * \endif
     */
    public int					nRetCount;

    public NET_OUT_MARK_OBJECT_FAVORITES_LIBRARY_OBJECT_RECORDS(int nMaxCount) {
        this.nMaxCount = nMaxCount;
        this.pstuResultData = new NET_MARK_OBJECT_RESULTS_DATA[nMaxCount];
        for(int i = 0; i < nMaxCount; i ++){
            this.pstuResultData[i] = new NET_MARK_OBJECT_RESULTS_DATA();
        }
    }
}