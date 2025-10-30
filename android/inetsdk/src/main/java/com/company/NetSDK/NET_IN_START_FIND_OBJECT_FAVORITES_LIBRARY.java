package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_StartFindObjectFavoritesLibrary input parameters
 * \else
 * @brief CLIENT_StartFindObjectFavoritesLibrary 接口输入参数
 * \endif
 */
public class NET_IN_START_FIND_OBJECT_FAVORITES_LIBRARY implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The start time of the collection
     * \else
     *  收藏的开始时间点
     * \endif
     */
    public NET_TIME					stuCollectBegin = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  The end time of the collection
     * \else
     *  收藏的结束时间点
     * \endif
     */
    public NET_TIME					stuCollectEnd = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  Number of target type lists
     * \else
     *  目标类型列表个数
     * \endif
     */
    public int					nObjectTypesCount;

    /**
     * \if ENGLISH_LANG
     *  Target type list, 0 faces, 1 human body, 2 motor vehicles, 3 non motor vehicles, 4 animals
     * \else
     *  目标类型列表, 0 人脸, 1 人体, 2 机动车, 3 非机动车, 4 动物
     * \endif
     */
    public int					nObjectTypes[] = new int[32];

    /**
     * \if ENGLISH_LANG
     *  Sorting method, 0: unknown, 1: ascending by favorite time, 2: descending by favorite time
     * \else
     *  排序方式, 0:未知, 1:按收藏时间升序, 2:按收藏时间降序
     * \endif
     */
    public int					nOrderBy;

}