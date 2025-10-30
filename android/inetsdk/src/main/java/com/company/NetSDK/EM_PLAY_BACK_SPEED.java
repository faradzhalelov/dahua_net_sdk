package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief record play back speed
 * \else
 * @brief 录像回放速度
 * \endif
 */
public class EM_PLAY_BACK_SPEED implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * 1/32x slow speed
     * \else
     * 1/32倍慢放
     * \endif
     */
    public static final int EM_PLAY_BACK_SPEED_SLOW_32 = -6;

    /**
     * \if ENGLISH_LANG
     * 1/25x slow speed
     * \else
     * 1/25倍慢放
     * \endif
     */
    public static final int EM_PLAY_BACK_SPEED_SLOW_25 = -5;

    /**
     * \if ENGLISH_LANG
     * 1/16x slow speed
     * \else
     * 1/16倍慢放
     * \endif
     */
    public static final int EM_PLAY_BACK_SPEED_SLOW_16 = -4;

    /**
     * \if ENGLISH_LANG
     * 1/8x slow speed
     * \else
     * 1/8倍慢放
     * \endif
     */
    public static final int EM_PLAY_BACK_SPEED_SLOW_8 = -3;

    /**
     * \if ENGLISH_LANG
     * 1/4x slow speed
     * \else
     * 1/4倍慢放
     * \endif
     */
    public static final int EM_PLAY_BACK_SPEED_SLOW_4 = -2;

    /**
     * \if ENGLISH_LANG
     * 1/2x slow speed
     * \else
     * 1/2倍慢放
     * \endif
     */
    public static final int EM_PLAY_BACK_SPEED_SLOW_2 = -1;

    /**
     * \if ENGLISH_LANG
     * normal speed
     * \else
     * 正常速度
     * \endif
     */
    public static final int EM_PLAY_BACK_SPEED_NORMAL = 0;

    /**
     * \if ENGLISH_LANG
     * 2x fast speed
     * \else
     * 2倍快放
     * \endif
     */
    public static final int EM_PLAY_BACK_SPEED_FAST_2 = 1;

    /**
     * \if ENGLISH_LANG
     * 4x fast speed
     * \else
     * 4倍快放
     * \endif
     */
    public static final int EM_PLAY_BACK_SPEED_FAST_4 = 2;

    /**
     * \if ENGLISH_LANG
     * 8x fast speed
     * \else
     * 8倍快放
     * \endif
     */
    public static final int EM_PLAY_BACK_SPEED_FAST_8 = 3;

    /**
     * \if ENGLISH_LANG
     * 16x fast speed
     * \else
     * 16倍快放
     * \endif
     */
    public static final int EM_PLAY_BACK_SPEED_FAST_16 = 4;

    /**
     * \if ENGLISH_LANG
     * 25x fast speed
     * \else
     * 25倍快放
     * \endif
     */
    public static final int EM_PLAY_BACK_SPEED_FAST_25 = 5;

    /**
     * \if ENGLISH_LANG
     * 32x fast speed
     * \else
     * 32倍快放
     * \endif
     */
    public static final int EM_PLAY_BACK_SPEED_FAST_32 = 6;

}