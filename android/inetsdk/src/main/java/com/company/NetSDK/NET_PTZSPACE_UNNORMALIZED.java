package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Non-normalized coordinates and zoom in gimbal positioning
 * \else
 * 云台定位中非归一化坐标和变倍
 * \endif
 */
public class NET_PTZSPACE_UNNORMALIZED implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * x
     * \else
     * x坐标
     * \endif
     */
    public int nPosX;

    /**
     * \if ENGLISH_LANG
     * y
     * \else
     * y坐标
     * \endif
     */
    public int nPosY;

    /**
     * \if ENGLISH_LANG
     * Zoom
     * \else
     * 放大倍率
     * \endif
     */
    public int nZoom;

}
