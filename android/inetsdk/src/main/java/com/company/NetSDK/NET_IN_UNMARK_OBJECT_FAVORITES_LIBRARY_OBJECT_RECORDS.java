package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_UnmarkObjectFavoritesLibraryObjectRecords input parameters
 * \else
 * @brief CLIENT_UnmarkObjectFavoritesLibraryObjectRecords 接口输入参数
 * \endif
 */
public class NET_IN_UNMARK_OBJECT_FAVORITES_LIBRARY_OBJECT_RECORDS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Record the number of unique identification sets in the collection
     * \else
     *  记录收藏唯一标识集合个数
     * \endif
     */
    public int					nIDCount;

    /**
     * \if ENGLISH_LANG
     *  Record Collection Unique Identification Collection
     * \else
     *  记录收藏唯一标识集合
     * \endif
     */
    public int					nIDs[] = new int[1000];

}