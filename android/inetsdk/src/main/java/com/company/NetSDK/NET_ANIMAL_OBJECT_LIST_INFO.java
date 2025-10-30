package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief list of targets in the area
 * \else
 * @brief 区域内目标列表
 * \endif
 */
public class NET_ANIMAL_OBJECT_LIST_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Target bounding box, 8192 coordinate system
     * \else
     *  目标包围盒,8192坐标系
     * \endif
     */
    public NET_RECT					stuBoundingBox = new NET_RECT();

    /**
     * \if ENGLISH_LANG
     *  Target center point
     * \else
     *  目标中心点
     * \endif
     */
    public NET_POINT					stuPoint = new NET_POINT();

    /**
     * \if ENGLISH_LANG
     *  Target id
     * \else
     *  目标ID
     * \endif
     */
    public int					nObjectID;

    /**
     * \if ENGLISH_LANG
     *  Target number
     * \else
     *  目标编号
     * \endif
     */
    public int					nObjectNumber;

    @java.lang.Override
    public java.lang.String toString() {
        return "NET_ANIMAL_OBJECT_LIST_INFO{" +
                "stuBoundingBox=" + stuBoundingBox.toString() +
                ", stuPoint=" + stuPoint.toString() +
                ", nObjectID=" + nObjectID +
                ", nObjectNumber=" + nObjectNumber +
                '}';
    }
}