package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief PTZ control coordinate unit
 * \else
 * @brief 云台控制坐标单元
 * \endif
 */
public class PTZ_SPACE_UNIT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * PTZ horizontal motion position, effective range:[0,3600]
     * \else
     * 云台水平运动位置,有效范围：[0,3600]
     * \endif
     */
    public int					nPositionX;

    /**
     * \if ENGLISH_LANG
     * PTZ vertical motion position, effective range:[-1800,1800]
     * \else
     * 云台垂直运动位置,有效范围：[-1800,1800]
     * \endif
     */
    public int					nPositionY;

    /**
     * \if ENGLISH_LANG
     * PTZ aperture change position, the effective range:[0,128]
     * \else
     * 云台光圈变动位置,有效范围：[0,128]
     * \endif
     */
    public int					nZoom;

}
