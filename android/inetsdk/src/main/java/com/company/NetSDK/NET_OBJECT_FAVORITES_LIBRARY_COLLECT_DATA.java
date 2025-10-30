package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Favorite target event data
 * \else
 * @brief 目标信息
 * \endif
 */
public class NET_OBJECT_FAVORITES_LIBRARY_COLLECT_DATA implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Which database does the candidate come from,{@link EM_PEOPLE_GROUP_TYPE}
     * \else
     *  候选人来自哪个数据库,{@link EM_PEOPLE_GROUP_TYPE}
     * \endif
     */
    public int					emRange;

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
     *  Target event time
     * \else
     *  目标事件时间
     * \endif
     */
    public NET_TIME					stuTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  Panoramic wide-angle view
     * \else
     *  全景广角图
     * \endif
     */
    public SCENE_IMAGE_INFO_EX					stuSceneImage = new SCENE_IMAGE_INFO_EX();

    /**
     * \if ENGLISH_LANG
     *  target information 
     * \else
     *  目标信息
     * \endif
     */
    public NET_OBJECT_FAVORITES_LIBRARY_COLLECT_DATA_OBJECT					stuObject = new NET_OBJECT_FAVORITES_LIBRARY_COLLECT_DATA_OBJECT();

    /**
     * \if ENGLISH_LANG
     *  Human body information
     * \else
     *  人体信息
     * \endif
     */
    public NET_HISTORY_HUMAN_INFO					stuHuman = new NET_HISTORY_HUMAN_INFO();

    /**
     * \if ENGLISH_LANG
     *  Motor vehicle information, motor vehicle attributes returned during image search
     * \else
     *  机动车信息, 机动车以图搜图时返回的机动车属性
     * \endif
     */
    public NET_HISTORY_TRAFFIC_CAR_INFO					stuTrafficCar = new NET_HISTORY_TRAFFIC_CAR_INFO();

}