package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Callback function of external track recall function, lAttachHandle is AttachVideoAnalyseTrackProc return value
 * \else
 * 订阅外部轨迹回调函数原型,lAttachHandle是 AttachVideoAnalyseTrackProc 的返回值
 * \endif
 */
public interface CB_fVideoAnalyseTrackProc {

    /**
     * \if ENGLISH_LANG
     * Callback prototype of external track
     * @param lAttachHandle return from{@link INetSDK#AttachVideoAnalyseTrackProc}
     * @param pAnalyseTrackProc {@link NET_VIDEO_ANALYSE_TRACK_PROC}
     * \else
     * 外部轨迹的回调函数
     * @param lAttachHandle {@link INetSDK#AttachVideoAnalyseTrackProc}返回值
     * @param pAnalyseTrackProc {@link NET_VIDEO_ANALYSE_TRACK_PROC}
     * \endif
     */
    public void invoke(long lAttachHandle, NET_VIDEO_ANALYSE_TRACK_PROC pAnalyseTrackProc);
}
