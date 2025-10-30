package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_DoFindObjectFavoritesLibrary output parameters
 * \else
 * @brief CLIENT_DoFindObjectFavoritesLibrary 接口输出参数
 * \endif
 */
public class NET_OUT_DO_FIND_OBJECT_FAVORITES_LIBRARY implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Total number of queries
     * \else
     *  查询到的总条数
     * \endif
     */
    public int					nFound;

    /**
     * \if ENGLISH_LANG
     *  Record the number of sets
     * \else
     *  记录集合个数
     * \endif
     */
    public int					nRetCount;

    /**
     * \if ENGLISH_LANG
     *  The maximum number of requests for pstuRecords
     * \else
     *  pstuRecords申请的最大个数
     * \endif
     */
    public int					nMaxCount;

    /**
     * \if ENGLISH_LANG
     *  Collection of queried records, Memory is released by user request, with a size of sizeof(NET_OBJECT_FAVORITES_LIBRARY_RECORDS)*nMaxCount
     * \else
     *  查询到的记录集合, 内存由用户申请释放, 大小为sizeof(NET_OBJECT_FAVORITES_LIBRARY_RECORDS)*nMaxCount
     * \endif
     */
    public NET_OBJECT_FAVORITES_LIBRARY_RECORDS[]					pstuRecords;

    public NET_OUT_DO_FIND_OBJECT_FAVORITES_LIBRARY(int nMaxCount) {
        this.nMaxCount = nMaxCount;
        this.pstuRecords = new NET_OBJECT_FAVORITES_LIBRARY_RECORDS[nMaxCount];
        for(int i = 0; i < nMaxCount; i ++){
            this.pstuRecords[i] = new NET_OBJECT_FAVORITES_LIBRARY_RECORDS();
        }
    }
}