package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * With speed rotation site PTZ control corresponding to the preset structure
 * \else
 * 带速度转动到预置位点云台控制对应结构
 * \endif
 */
public class PTZ_CONTROL_GOTOPRESET implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Preset BIT Index
     * \else
     * 预置位索引
     * \endif
     */
    public int				nPresetIndex;

    /**
     * \if ENGLISH_LANG
     * PTZ Operation Speed
     * \else
     * 云台运行速度
     * \endif
     */
    public PTZ_SPEED_UNIT   stuSpeed = new PTZ_SPEED_UNIT();
}
