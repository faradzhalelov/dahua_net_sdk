package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief target information
 * \else
 * @brief 目标信息
 * \endif
 */
public class NET_OBJECT_FAVORITES_LIBRARY_COLLECT_DATA_OBJECT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unique record ID
     * \else
     *  唯一记录ID, 用于关联历史库
     * \endif
     */
    public int					nUID;

    /**
     * \if ENGLISH_LANG
     *  Target types: 1: Human body, 2: Motor vehicle, 3: Non motor vehicle, 4: Animal
     * \else
     *  目标类型: 1:人体, 2:机动车, 3:非机动车, 4:动物
     * \endif
     */
    public int					nObjectType;

    /**
     * \if ENGLISH_LANG
     *  Target reporting time
     * \else
     *  目标上报时间
     * \endif
     */
    public NET_TIME					stuObjectTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  Target thumbnail URL
     * \else
     *  目标缩略图URL
     * \endif
     */
    public byte					szObjectUrl[] = new byte[256];

}