package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Calibrating area type
 * \else
 * 标定区域类型
 * \endif
 */
public class EM_CALIBRATEAREA_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknow
     * \else
     * 未知
     * \endif
     */
    public static final int EM_CALIBRATEAREA_TYPE_ERR = 0;

    /**
     * \if ENGLISH_LANG
     * "Groud" : Require: N vertical segment(s) + M horizontal segment(s)((N=3,M=1);(N=2,M=2);with further development)
     * \else
     * "Groud" : 地面，需要N条竖直线段+M条水平线段（（N=3，M=1）；（N=2，M=2）；今后扩展）。
     * \endif
     */
    public static final int EM_CALIBRATEAREA_TYPE_GROUD = 1;

    /**
     * \if ENGLISH_LANG
     * "Horizontal"  : Require the projection and stright segment between a point on plane to the point on ground
     * \else
     * "Horizontal"  : 水平面，需要水平面上一点到地面点的投影垂直线段。
     * \endif
     */
    public static final int EM_CALIBRATEAREA_TYPE_HORIZONTAL = 2;

    /**
     * \if ENGLISH_LANG
     * "Vertical" : Require the intersecting line of vertical side and the ground
     * \else
     * "Vertical" : 垂直面，需要垂直面与地面的交线。
     * \endif
     */
    public static final int EM_CALIBRATEAREA_TYPE_VERTICAL = 3;

    /**
     * \if ENGLISH_LANG
     * "Any" plane. N vertical segment with length (N=3,with further development)
     * \else
     * "Any" 任意平面，N条竖直线段，及每条长度（N=3，及今后扩展）。
     * \endif
     */
    public static final int EM_CALIBRATEAREA_TYPE_ANY = 4;
}
