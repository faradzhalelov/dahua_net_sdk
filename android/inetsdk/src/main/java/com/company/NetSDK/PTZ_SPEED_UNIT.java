package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PTZ control coordinate unit
 * \else
 * 云台控制坐标单元
 * \endif
 */
public class PTZ_SPEED_UNIT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * PTZ horizontal speed, normalized to 0~1
     * \else
     * 云台水平方向速率,归一化到0~1
     * \endif
     */
    public float	                 fPositionX;

    /**
     * \if ENGLISH_LANG
     * PTZ vertical speed, normalized to 0~1
     * \else
     * 云台垂直方向速率,归一化到0~1
     * \endif
     */
    public float					fPositionY;

    /**
     * \if ENGLISH_LANG
     * PTZ aperture magnification, normalized to 0~1
     * \else
     * 云台光圈放大倍率,归一化到 0~1
     * \endif
     */
    public float					fZoom;

}
