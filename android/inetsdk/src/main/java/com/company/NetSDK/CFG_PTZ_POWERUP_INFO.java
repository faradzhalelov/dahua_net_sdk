package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ptz power up action config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_PTZ_POWERUP}
 * \else
 * 云台开机动作配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_PTZ_POWERUP}
 * \endif
 */
public class CFG_PTZ_POWERUP_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * whether or not enable power-up action
     * \else
     * 开机动作开关标志
     * \endif
     */
    public boolean                    bEnable;

    /**
     * \if ENGLISH_LANG
     * power-up function, -1: continue the action before power down, for other valid values, see {@link EM_PTZ_ACTION}
     * \else
     * 开机功能，-1 表示继续断电前的动作，其他可取值见 {@link EM_PTZ_ACTION}
     * \endif
     */
    public int                     nFunction;

    /**
     * \if ENGLISH_LANG
     * Scan Id
     * \else
     * 自动线扫编号
     * \endif
     */
    public int                     nScanId;

    /**
     * \if ENGLISH_LANG
     * Preset Id
     * \else
     * 预置点编号
     * \endif
     */
    public int                     nPresetId;

    /**
     * \if ENGLISH_LANG
     * Pattern Id
     * \else
     * 自动巡迹编号
     * \endif
     */
    public int                     nPatternId;

    /**
     * \if ENGLISH_LANG
     * Tour Id
     * \else
     * 巡航编号
     * \endif
     */
    public int                     nTourId;
}
