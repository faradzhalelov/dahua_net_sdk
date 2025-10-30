package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * PTZ positioning information alarm
 * \else
 * 云台定位信息报警
 * \endif
 */
public class SDK_PTZ_LOCATION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Channel number
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  Horizontal movement of the head position, effective range: [0,3600]
     * \else
     *  云台水平运动位置,有效范围：[0,3600]
     * \endif
     */
    public int					nPTZPan;

    /**
     * \if ENGLISH_LANG
     *  PTZ vertical position, the effective range: [-1800,1800]
     * \else
     *  云台垂直运动位置,有效范围：[-1800,1800]
     * \endif
     */
    public int					nPTZTilt;

    /**
     * \if ENGLISH_LANG
     *  PTZ iris position changes, effective range: [0,128]
     * \else
     *  云台光圈变动位置,有效范围：[0,128]
     * \endif
     */
    public int					nPTZZoom;

    /**
     * \if ENGLISH_LANG
     *  PTZ motion, 0 - Unknown 1 - Movement 2 - Idle
     * \else
     *  云台运动状态, 0-未知 1-运动 2-空闲
     * \endif
     */
    public byte					bState;

    /**
     * \if ENGLISH_LANG
     *  PTZ movement, 255- unknown,0 - preset ,1 - line scan, 2 - Cruise, 3 - patrol track, 4 - horizontal rotation,5 -GeneralMove,6-PatternRecord,7-WideViewScan
     * \else
     *  云台动作,255-未知,0-预置点,1-线扫,2-巡航,3-巡迹,4-水平旋转,5-普通移动,6-巡迹录制,7-全景云台扫描,8-热度图
     * \endif
     */
    public byte					bAction;

    /**
     * \if ENGLISH_LANG
     *  PTZ focus state, 0 - unknown 1 - state of motion 2 - Idle
     * \else
     *  云台聚焦状态, 0-未知, 1-运动状态, 2-空闲
     * \endif
     */
    public byte					bFocusState;

    /**
     * \if ENGLISH_LANG
     * In the period of validity of the preset state
     * \else
     *  在时间段内预置点状态是否有效
     * \endif
     */
    public byte					bEffectiveInTimeSection;

    /**
     * \if ENGLISH_LANG
     *  Cruise ID number
     * \else
     *  巡航ID号
     * \endif
     */
    public int					nPtzActionID;

    /**
     * \if ENGLISH_LANG
     *  PTZ preset number where
     * \else
     *  云台所在预置点编号
     * \endif
     */
    public int					dwPresetID;

    /**
     * \if ENGLISH_LANG
     *  Focus position
     * \else
     *  聚焦位置
     * \endif
     */
    public float					fFocusPosition;

    /**
     * \if ENGLISH_LANG
     *  ZOOM PTZ status, 0 - Unknown,1-ZOOM, 2 - Idle
     * \else
     *  云台ZOOM状态,0-未知,1-ZOOM,2-空闲
     * \endif
     */
    public byte					bZoomState;

    /**
     * \if ENGLISH_LANG
     *  Packet sequence number, used to verify whether the loss
     * \else
     *  包序号,用于校验是否丢包
     * \endif
     */
    public int					dwSequence;

    /**
     * \if ENGLISH_LANG
     *  Corresponding UTC (1970-1-1 00:00:00) seconds.
     * \else
     *  对应的UTC(1970-1-1 00:00:00)秒数。
     * \endif
     */
    public int					dwUTC;

    /**
     * \if ENGLISH_LANG
     *  preset status
     * \else
     *  预置点位置
     * \endif
     */
    public int					emPresetStatus;

    /**
     * \if ENGLISH_LANG
     *  real zoom value ,expanded 100 times
     * \else
     *  真实变倍值 当前倍率（扩大100倍表示）
     * \endif
     */
    public int					nZoomValue;

    /**
     * \if ENGLISH_LANG
     *  Ptz abs position
     * \else
     *  云台方向与放大倍数（扩大100倍表示）
     * \endif
     */
    public NET_PTZSPACE_UNNORMALIZED					stuAbsPosition = new NET_PTZSPACE_UNNORMALIZED();

    /**
     * \if ENGLISH_LANG
     *  Focus map value
     * \else
     *  聚焦映射值
     * \endif
     */
    public int					nFocusMapValue;

    /**
     * \if ENGLISH_LANG
     *  Variable magnification mapping value
     * \else
     *  变倍映射值
     * \endif
     */
    public int					nZoomMapValue;

    /**
     * \if ENGLISH_LANG
     *  P/T movement status of gimbal
     * \else
     * 云台P/T运动状态
     * \endif
     */
    public int					emPanTiltStatus;

    /**
     * \if ENGLISH_LANG
     *  Event public extension field structure
     * \else
     *  事件公共扩展字段结构体
     * \endif
     */
    public NET_EVENT_INFO_EXTEND					stuEventInfoEx = new NET_EVENT_INFO_EXTEND();

}
