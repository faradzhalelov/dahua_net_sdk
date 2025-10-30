package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief 记录收藏条件集合
 * \else
 * @brief 记录收藏条件集合
 * \endif
 */
public class NET_CHECK_MARK_STATUS_CONDITIONS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

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
     *  Target type: 0 faces, 1 human body, 2 motor vehicles, 3 non motor vehicles, 4 animals
     * \else
     *  目标类型, 0 人脸, 1 人体, 2 机动车, 3 非机动车, 4 动物
     * \endif
     */
    public int					nObjectType;

    /**
     * \if ENGLISH_LANG
     *  Original target record number Object ID
     * \else
     *  原目标记录编号ObjectID
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

}