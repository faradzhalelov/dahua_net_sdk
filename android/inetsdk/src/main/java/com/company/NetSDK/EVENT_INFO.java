package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event info
 * \else
 * 事件信息
 * \endif
 */
public class EVENT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Event type
     * \else
     * 事件类型,参见智能事件类型
     * \endif
     */
    public int                 nEvent;

    /**
     * \if ENGLISH_LANG
     * Object type, {@link EM_OBJECT_TYPE},now support EM_OBJECT_TYPE_HUMAN, EM_OBJECT_TYPE_VECHILE, EM_OBJECT_TYPE_NOMOTOR, EM_OBJECT_TYPE_ALL
     * \else
     * 支持的物体类型，对应 {@link EM_OBJECT_TYPE}，当前支持 EM_OBJECT_TYPE_HUMAN, EM_OBJECT_TYPE_VECHILE, EM_OBJECT_TYPE_NOMOTOR, EM_OBJECT_TYPE_ALL
     * \endif
     */
    public int[]      arrayObejctType = new int[16];

    /**
     * \if ENGLISH_LANG
     * arrayObejctType num
     * \else
     * arrayObejctType数量
     * \endif
     */
    public int                 nObjectCount;

}

