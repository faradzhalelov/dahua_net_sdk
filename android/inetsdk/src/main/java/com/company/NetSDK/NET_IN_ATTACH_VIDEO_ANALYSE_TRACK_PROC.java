package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * CLIENT_AttachVideoAnalyseTrackProc input parameters
 * \else
 * CLIENT_AttachVideoAnalyseTrackProc 输入参数
 * \endif
 */
public class NET_IN_ATTACH_VIDEO_ANALYSE_TRACK_PROC implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel number
     * \else
     * 通道号
     * \endif
     */
    public int nChannelId;

    /**
     * \if ENGLISH_LANG
     * callback function
     * \else
     * 回调函数
     * \endif
     */
    public CB_fVideoAnalyseTrackProc cbVideoAnalyseTrackProc;

}
