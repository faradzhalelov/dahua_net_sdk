package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Error code
 * \else
 * 错误码
 * \endif
 */
public class NET_IN_RTMP_MANAGER_SET_SPEED implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Push ID
     * \else
     *  要恢复的推流ID
     * \endif
     */
    public int					nPushId;

    /**
     * \if ENGLISH_LANG
     *  Playback speed: >0:indicates forward playback, <0:indicates reverse playback,data indicates multiple
     * \else
     *  播放速度，正数表示正向播放，负数表示反向播放，数据表示倍数
     * \endif
     */
    public double					dbSpeed;

}
