package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Information of the external trajectory
 * \else
 * 外部轨迹的信息
 * \endif
 */
public class NET_VIDEO_ANALYSE_TRACK_PROC implements Serializable {
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
    public int					nChannelId;

    /**
     * \if ENGLISH_LANG
     *  Video target information
     * \else
     *  视频目标信息
     * \endif
     */
    public NET_VIDEO_TRACK_OBJECT_INFO					stuTrackObject[] = new NET_VIDEO_TRACK_OBJECT_INFO[128];

    /**
     * \if ENGLISH_LANG
     *  Number of video targets
     * \else
     *  视频目标个数
     * \endif
     */
    public int					nTrackObjectNum;

    public NET_VIDEO_ANALYSE_TRACK_PROC() {

        for(int i = 0; i < 128; i ++){
            this.stuTrackObject[i] = new NET_VIDEO_TRACK_OBJECT_INFO();
        }
    }

    public NET_VIDEO_ANALYSE_TRACK_PROC(int nTrackObjectNum) {

        this.nTrackObjectNum = nTrackObjectNum;
        for(int i = 0; i < this.nTrackObjectNum; i ++){
            this.stuTrackObject[i] = new NET_VIDEO_TRACK_OBJECT_INFO();
        }
    }
}
