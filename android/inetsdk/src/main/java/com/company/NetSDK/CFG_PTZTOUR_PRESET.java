package com.company.NetSDK;
import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * patrol path preset
 * \else
 *  巡航路径中的预置点
 * \endif
 */
public class CFG_PTZTOUR_PRESET implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Preset ID
     * \else
     * nPresetID
     * \endif
     */
    public int             nPresetID;

    /**
     * \if ENGLISH_LANG
     * change preset duration time, unit s
     * \else
     * 在改预置点的停留时间, 单位秒
     * \endif
     */
    public int             nDuration;

    /**
     * \if ENGLISH_LANG
     * rotation speed reaching this preset, 1~10
     * \else
     * 到达该预置点的转动速度, 1~10
     * \endif
     */
    public int             nSpeed;
}
