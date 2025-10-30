package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Object info
 * \else
 * @brief 检测目标信息
 * \endif
 */
public class NET_OBJECT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Target bounding box (8192 coordinate system)
     * \else
     *  目标包围盒(8192坐标系)
     * \endif
     */
    public NET_RECT					stuBoundingBox = new NET_RECT();

}