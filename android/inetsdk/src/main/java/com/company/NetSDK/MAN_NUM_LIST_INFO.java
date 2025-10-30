package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * list of petsons within the region(man num)
 * \else
 * 立体视觉区域内人数统计事件区域人员列表
 * \endif
 */
public class MAN_NUM_LIST_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * personnel bounding box, 8192 coordinate system
     * \else
     * 人员包围盒,8192坐标系
     * \endif
     */
    public SDK_RECT				stuBoudingBox = new SDK_RECT();

    /**
     * \if ENGLISH_LANG
     * persoonel  height, unit cm
     * \else
     * 人员身高，单位cm
     * \endif
     */
    public int					nStature;

}
