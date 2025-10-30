package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Screen text roll mode
 * \else
 * 屏幕文本滚动模式
 * \endif
 */
public class EM_SCREEN_TEXT_ROLL_MODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_SCREEN_TEXT_ROLL_MODE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  No scrolling
     * \else
     *  不滚动
     * \endif
     */
    public static final int					EM_SCREEN_TEXT_ROLL_MODE_NO = 0;

    /**
     * \if ENGLISH_LANG
     *  Scroll left and right
     * \else
     *  左右滚动
     * \endif
     */
    public static final int					EM_SCREEN_TEXT_ROLL_MODE_LEFT_RIGHT = 1;

    /**
     * \if ENGLISH_LANG
     *  Page up and down
     * \else
     *  上下翻页滚动
     * \endif
     */
    public static final int					EM_SCREEN_TEXT_ROLL_MODE_UP_DOWN = 2;

}
