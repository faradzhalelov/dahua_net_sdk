package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * time type
 * \else
 * 时间类型
 * \endif
 */
public class EM_TIME_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * absolute time
     * \else
     * 绝对时间
     * \endif
     */
    public static final int NET_TIME_TYPE_ABSLUTE = 0;


    /**
     * \if ENGLISH_LANG
     * Relative time, relative to the video file header frame as the time basis points, the first frame corresponding to the UTC (0000-00-00 00:00:00)
     * \else
     * 相对时间,相对于视频文件头帧为时间基点,头帧对应于UTC(0000-00-00 00:00:00)
     * \endif
     */
    public static final int NET_TIME_TYPE_RELATIVE = 1;
}
