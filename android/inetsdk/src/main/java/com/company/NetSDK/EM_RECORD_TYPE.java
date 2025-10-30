package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Video type
 * \else
 * 录像类型
 * \endif
 */
public class EM_RECORD_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_RECORD_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Ordinary video
     * \else
     *  普通录像
     * \endif
     */
    public static final int					EM_RECORD_TYPE_COMMON = 1;

    /**
     * \if ENGLISH_LANG
     *  Alarm recording
     * \else
     *  报警录像
     * \endif
     */
    public static final int					EM_RECORD_TYPE_ALARM2 = 2;

    /**
     * \if ENGLISH_LANG
     *  Motion inspection video
     * \else
     *  动检录像
     * \endif
     */
    public static final int					EM_RECORD_TYPE_MOTIONDETECT = 3;

}
