package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief PTZ preset point structure
 * \else
 * @brief 云台控制预置点结构
 * \endif
 */
public class PTZ_PRESET implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether the preset points to take effect 
     * \else
     *  该预置点是否生效
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  Preset Point Name
     * \else
     *  预置点名称
     * \endif
     */
    public byte					szName[] = new byte[FinalVar.MAX_PTZ_PRESET_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     *  Coordinates and magnification preset points
     * \else
     *  预置点的坐标和放大倍数
     * \endif
     */
    public CFG_PTZ_SPACE_UNIT					stPosition = new CFG_PTZ_SPACE_UNIT();

}