package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output paramer, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_VIDEO_DETECT_CAPS}
 * \else
 * 出参, 对应接口 {@link INetSDK#GetDevCaps},对应命令 {@link FinalVar#NET_VIDEO_DETECT_CAPS}
 * \endif
 */
public class NET_OUT_VIDEO_DETECT_CAPS implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Is support BlindScreen detect, TRUE:yes, FALSE:no
     * \else
     * 是否支持黑屏检测
     * \endif
     */
    public boolean                        bSupportBlind;

    /**
     * \if ENGLISH_LANG
     * Is support VideoLoss detect, TRUE:yes, FALSE:no
     * \else
     * 是否支持视频丢失检测
     * \endif
     */
    public boolean                        bSupportLoss;

    /**
     * \if ENGLISH_LANG
     * Is support VideoMotion detect, TRUE:yes, FALSE:no
     * \else
     * 是否支持动态检测
     * \endif
     */
    public boolean                        bSupportMotion;

    /**
     * \if ENGLISH_LANG
     * Is support to get motion detect result in every region
     * \else
     * 是否能够得到每块区域的检测结果
     * \endif
     */
    public boolean                        bMotionResult;

    /**
     * \if ENGLISH_LANG
     * Columns of motion detect detect region
     * \else
     * 动态检测区域划分的列数
     * \endif
     */
    public int                       nMotionColumns;

    /**
     * \if ENGLISH_LANG
     * Rows of motion detect detect region
     * \else
     * 动态检测区域划分的行数
     * \endif
     */
    public int                       nMotionRows;

    /**
     * \if ENGLISH_LANG
     * Video windows of motion detect
     * \else
     * 动检支持的视频窗口数
     * \endif
     */
    public int                       nMotionDetectWindow;

    /**
     * \if ENGLISH_LANG
     * Columns of video blind detect region
     * \else
     * 视频遮挡检测区域划分的列数
     * \endif
     */
    public int                       nBlindColumns;

    /**
     * \if ENGLISH_LANG
     * Rows of video blind detect region
     * \else
     * 视频遮挡检测区域划分的行数
     * \endif
     */
    public int                       nBlindRows;

    /**
     * \if ENGLISH_LANG
     * Video windows of video blind detect
     * \else
     * 视频遮挡支持的窗口数
     * \endif
     */
    public int                       nBlindDetectWindow;

    /**
     * \if ENGLISH_LANG
     * Is support motion position detect
     * \else
     * 是否支持移动位置侦测
     * \endif
     */
    public boolean                        bPositionDetect;

    /**
     * \if ENGLISH_LANG
     * Number of supported motion detect versions
     * \else
     * 支持的动检方案数
     * \endif
     */
    public int                       nDetectVersionNum;

    /**
     * \if ENGLISH_LANG
     * Supported motion detect versions info,refer to{@link EM_DETECT_VERSION_TYPE}
     * \else
     * 支持的动检方案信息，参考{@link EM_DETECT_VERSION_TYPE}
     * \endif
     */
    public int      emDetectVersions[] = new int[FinalVar.MAX_DETECT_VERSION_NUM];

    /**
     * \if ENGLISH_LANG
     * Number of supported video blind detect versions
     * \else
     * 支持的视频遮挡检测版本数
     * \endif
     */
    public int                       nBlindDetectVersionNum;

    /**
     * \if ENGLISH_LANG
     * Supported video blind detect versions info,refer to{@link EM_BLIND_DETECT_VERSION_TYPE}
     * \else
     * 支持的视频遮挡检测版本信息,参考{@link EM_BLIND_DETECT_VERSION_TYPE}
     * \endif
     */
    public int emBlindDetectVersions[] = new int[FinalVar.MAX_BLIND_DETECT_VERSION_NUM];

    /**
     * \if ENGLISH_LANG
     * Is support motion detect linked ptz preset, TRUE:yes, FALSE:no
     * \else
     * 动检是否支持联动云台预置点
     * \endif
     */
    public boolean                        bMotionLinkPtzPreset;

    /**
     * \if ENGLISH_LANG
     * Is support motion detect linked ptz tour, TRUE:yes, FALSE:no
     * \else
     * 动检是否支持联动云台巡航
     * \endif
     */
    public boolean                        bMotionLinkPtzTour;

    /**
     * \if ENGLISH_LANG
     * Is support motion detect linked ptz pattern, TRUE:yes, FALSE:no
     * \else
     * 动检是否支持联动云台巡迹
     * \endif
     */
    public boolean                        bMotionLinkPtzPattern;

    /**
     * \if ENGLISH_LANG
     * Is support unfocus detect, TRUE:yes, FALSE:no
     * \else
     * 是否支持虚焦检测
     * \endif
     */
    public boolean                        bUnFocusDetect;

    /**
     * \if ENGLISH_LANG
     * Is support detect and trigger alarm when motion detect is working, TRUE:yes, FALSE:no
     * \else
     * 是否支持动检同时检测报警并触发
     * \endif
     */
    public boolean                        bAlarmDetect;

    /**
     * \if ENGLISH_LANG
     * Is support Moved detect, TRUE:yes, FALSE:no
     * \else
     * 是否支持场景变更检测
     * \endif
     */
    public boolean						bSupportMoveDetect;

    /**
     * \if ENGLISH_LANG
     * smart motion detection caps
     * \else
     * 智能动检能力信息
     * \endif
     */
    public NET_SMART_MOTION_CAPS		stuSmartMotionCaps = new NET_SMART_MOTION_CAPS();

}
