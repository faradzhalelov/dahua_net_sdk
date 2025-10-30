package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * talk remote time limit
 * \else
 * 对讲远程方时间限制
 * \endif
 */
public class CFG_VIDEO_TALK_TIME_LIMIT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * incoming ring max length, overtime auto handup, 1-600s
     * \else
     * 来电振铃最大时长，超时自动挂断, 1-600秒
     * \endif
     */
    public int                                 nMaxRingingTime;

    /**
     * \if ENGLISH_LANG
     * max call duration, overtime auto hang up, 1-600 min
     * \else
     * 最大通话时长，超时自动挂断, 1-600分钟
     * \endif
     */
    public int                                 nMaxConnectingTime;

    /**
     * \if ENGLISH_LANG
     * max auto message time, overtime auto hang up, 1-600s
     * \else
     * 最大自动留言时长,超时自动结束，1-600秒
     * \endif
     */
    public int                                 nMaxLeaveWordTime;

    @Override
    public String toString() {
        return "CFG_VIDEO_TALK_TIME_LIMIT{" +
                "nMaxRingingTime=" + nMaxRingingTime +
                ", nMaxConnectingTime=" + nMaxConnectingTime +
                ", nMaxLeaveWordTime=" + nMaxLeaveWordTime +
                '}';
    }
}
