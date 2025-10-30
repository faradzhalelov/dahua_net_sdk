package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * multi faces detect info
 * \else
 * 多目标检测信息
 * \endif
 */
public class NET_FACE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * object id
     * \else
     * 物体ID,每个ID表示一个唯一的物体
     * \endif
     */
    public int                 nObjectID;

    /**
     * \if ENGLISH_LANG
     * object type
     * \else
     * 物体类型
     * \endif
     */
    public byte[]              szObjectType = new byte[128];

    /**
     * \if ENGLISH_LANG
     * same with the source picture id
     * \else
     * 这张目标抠图所属的大图的ID
     * \endif
     */
    public int                 nRelativeID;

    /**
     * \if ENGLISH_LANG
     * bounding box
     * \else
     * 包围盒
     * \endif
     */
    public SDK_RECT            BoundingBox = new SDK_RECT();

    /**
     * \if ENGLISH_LANG
     * object center
     * \else
     * 物体型心
     * \endif
     */
    public SDK_POINT            Center = new SDK_POINT();
}
