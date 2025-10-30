package com.company.NetSDK;

import java.io.Serializable;



/**
 * \if ENGLISH_LANG
 * Get PTZ capability set information, the corresponding interface {@link INetSDK#QueryNewSystemInfo},,the corresponding command {@link FinalVar#CFG_CAP_CMD_PTZ}
 * \else
 * 获取云台能力集信息, 对应接口 {@link INetSDK#QueryNewSystemInfo},对应命令 {@link FinalVar#CFG_CAP_CMD_PTZ}
 * \endif
 */
public class CFG_PTZ_PROTOCOL_CAPS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Whether or not support the wipers
     * \else
     * 是否支持雨刷
     * \endif
     */
    public boolean                    bWiper;

    /**
     * \if ENGLISH_LANG
     * Whether to support accessibility
     * \else
     * 是否支持辅助功能
     * \endif
     */
    public boolean                    bAux;                       // 是否支持辅助功能

    /**
     * \if ENGLISH_LANG
     * PTZ auxiliary function names list
     * \else
     * 云台辅助功能名称列表
     * \endif
     */
    public byte                       szAuxs[][] = new byte[FinalVar.CFG_COMMON_STRING_32][FinalVar.CFG_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * Whether to support PTZ horizontal swing
     * \else
     * 是否支持云台水平摆动
     * \endif
     */
    public boolean                     bPan;

    /**
     * \if ENGLISH_LANG
     * Whether to support PTZ vertical swinging
     * \else
     * 是否支持云台垂直摆动
     * \endif
     */
    public boolean                     bTile;

    /**
     * \if ENGLISH_LANG
     * Whether to support PTZ changed times
     * \else
     * 是否支持云台变倍
     * \endif
     */
    public boolean                     bZoom;

    /**
     * \if ENGLISH_LANG
     * Whether to support PTZ aperture adjustment
     * \else
     * 是否支持云台光圈调节
     * \endif
     */
    public boolean                     bIris;

    /**
     * \if ENGLISH_LANG
     * Whether to support the preset point
     * \else
     * 是否支持预置点
     * \endif
     */
    public boolean                     bPreset;

    /**
     * \if ENGLISH_LANG
     * Whether to support removal of preset point
     * \else
     * 是否支持清除预置点
     * \endif
     */
    public boolean                     bRemovePreset;

    /**
     * \if ENGLISH_LANG
     * Number of rotation directions not supported by the gimbal
     * \else
     * 云台不支持的转动方向个数
     * \endif
     */
    public int                          nUnSupportDirections;

    /**
     * \if ENGLISH_LANG
     * UnSupport Directions,具体参考{@link EM_PTZ_UNSUPPORT_DIRECTION}
     * \else
     * 云台不支持的转动方向,具体参考{@link EM_PTZ_UNSUPPORT_DIRECTION}
     * \endif
     */
    public int                          emUnSupportDirections[] = new int[10];
}
