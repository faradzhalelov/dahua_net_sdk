package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_CheckObjectFavoritesLibraryMarkStatus input parameters
 * \else
 * @brief CLIENT_CheckObjectFavoritesLibraryMarkStatus 接口输入参数
 * \endif
 */
public class NET_IN_CHECK_OBJECT_FAVORITES_LIBRARY_MARK_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Record the number of collection conditions for favorites
     * \else
     *  记录收藏条件集合个数
     * \endif
     */
    public int					nConditionsCount;

    /**
     * \if ENGLISH_LANG
     *  Record Collection of Favorite Conditions, Memory is released by user request, with a size of sizeof(NET_CHECK_MARK_STATUS_CONDITIONS)*nConditionsCount
     * \else
     *  记录收藏条件集合, 内存由用户申请释放, 大小为sizeof(NET_OBJECT_FAVORITES_LIBRARY_MARK_STATUS_RESULTS)*nConditionsCount
     * \endif
     */
    public NET_CHECK_MARK_STATUS_CONDITIONS[]					pstuConditions;

    public NET_IN_CHECK_OBJECT_FAVORITES_LIBRARY_MARK_STATUS(int nConditionsCount) {
        this.nConditionsCount = nConditionsCount;
        this.pstuConditions = new NET_CHECK_MARK_STATUS_CONDITIONS[nConditionsCount];
        for(int i = 0; i < nConditionsCount; i ++){
            this.pstuConditions[i] = new NET_CHECK_MARK_STATUS_CONDITIONS();
        }
    }
}