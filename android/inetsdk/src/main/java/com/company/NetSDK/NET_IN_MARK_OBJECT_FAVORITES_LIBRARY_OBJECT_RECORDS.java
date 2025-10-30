package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_MarkObjectFavoritesLibraryObjectRecords input parameters
 * \else
 * @brief CLIENT_MarkObjectFavoritesLibraryObjectRecords 接口输入参数
 * \endif
 */
public class NET_IN_MARK_OBJECT_FAVORITES_LIBRARY_OBJECT_RECORDS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Favorite data sources: 0: facial image search, 1: QuickPick image search, 2: AcuPick image search, 3: IVS query search
     * \else
     *  收藏的数据来源, 0: 人脸以图搜图, 1: QuickPick以图搜图, 2: AcuPick以图搜图, 3: IVS查询搜索
     * \endif
     */
    public int					nSearchType;

    /**
     * \if ENGLISH_LANG
     *  Favorite target event data, Memory is released by user request, with a size of sizeof(NET_OBJECT_FAVORITES_LIBRARY_COLLECT_DATA)*nCollectDatasNum
     * \else
     *  收藏的目标事件数据, 内存由用户申请释放, 大小为sizeof(NET_OBJECT_FAVORITES_LIBRARY_COLLECT_DATA)*nCollectDatasNum
     * \endif
     */
    public NET_OBJECT_FAVORITES_LIBRARY_COLLECT_DATA[]					pstuCollectDatas;

    /**
     * \if ENGLISH_LANG
     *  Number of target event data collected
     * \else
     *  收藏的目标事件数据个数
     * \endif
     */
    public int					nCollectDatasNum;

    public NET_IN_MARK_OBJECT_FAVORITES_LIBRARY_OBJECT_RECORDS(int nCollectDatasNum) {
        this.nCollectDatasNum = nCollectDatasNum;
        this.pstuCollectDatas = new NET_OBJECT_FAVORITES_LIBRARY_COLLECT_DATA[nCollectDatasNum];
        for(int i = 0; i < nCollectDatasNum; i ++) {
            this.pstuCollectDatas[i] = new NET_OBJECT_FAVORITES_LIBRARY_COLLECT_DATA();
        }
    }
}