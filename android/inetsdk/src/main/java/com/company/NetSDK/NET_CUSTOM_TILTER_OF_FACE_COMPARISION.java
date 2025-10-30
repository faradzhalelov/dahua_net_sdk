package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * The filter of evnet FaceComparision
 * \else
 * 目标比对事件过滤器
 * \endif
 */
public class NET_CUSTOM_TILTER_OF_FACE_COMPARISION implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * The count of register group
     * \else
     * 订阅组数量
     * \endif
     */
    public int                      nRegisterGroupCount;

    /**
     * \if ENGLISH_LANG
     * Register group
     * \else
     * 订阅组
     * \endif
     */
    public NET_REGISTER_GROUP[]     stuRegisterGroup = new NET_REGISTER_GROUP[256];

    public NET_CUSTOM_TILTER_OF_FACE_COMPARISION()
    {
        for(int i = 0; i < 256; ++i)
        {
            stuRegisterGroup[i] = new NET_REGISTER_GROUP();
        }
    }
}
