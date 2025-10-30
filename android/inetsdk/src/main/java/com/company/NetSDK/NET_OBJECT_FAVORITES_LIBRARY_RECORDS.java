package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Collection of queried records
 * \else
 * @brief 查询到的记录集合
 * \endif
 */
public class NET_OBJECT_FAVORITES_LIBRARY_RECORDS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unique identifier for recording favorites
     * \else
     *  记录收藏的唯一标识
     * \endif
     */
    public int					nID;

    /**
     * \if ENGLISH_LANG
     *  Channel number
     * \else
     *  通道号
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Collection time
     * \else
     *  收藏时间
     * \endif
     */
    public NET_TIME					stuCollectTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  Target type
     * \else
     *  目标类型
     * \endif
     */
    public int					nObjectType;

    /**
     * \if ENGLISH_LANG
     *  UID
     * \else
     *  UID
     * \endif
     */
    public int					nUID;

    /**
     * \if ENGLISH_LANG
     *  Favorite data sources: 0: facial image search, 1: QuickPick image search, 2: AcuPick image search, 3: IVS query search,
     * \else
     *  收藏的数据来源, 0: 人脸以图搜图, 1: QuickPick以图搜图, 2: AcuPick以图搜图, 3: IVS查询搜索, 
     * \endif
     */
    public int					nSearchType;

    /**
     * \if ENGLISH_LANG
     *  Favorite target event data
     * \else
     *  收藏的目标事件数据
     * \endif
     */
    public NET_OBJECT_FAVORITES_LIBRARY_COLLECT_DATA					stuCollectData = new NET_OBJECT_FAVORITES_LIBRARY_COLLECT_DATA();

}