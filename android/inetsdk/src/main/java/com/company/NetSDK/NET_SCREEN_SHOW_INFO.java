package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Screen information
 * \else
 * 屏幕信息
 * \endif
 */
public class NET_SCREEN_SHOW_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Screen no
     * \else
     *  屏幕编号
     * \endif
     */
    public int					nScreenNo;

    /**
     * \if ENGLISH_LANG
     *  Display text (time format for text type EM_SCREEN_TEXT_TYPE_LOCAL_TIME,
     * \else
     *  显示文本(文本类型为EM_SCREEN_TEXT_TYPE_LOCAL_TIME时的时间格式,
     * \endif
     */
    public byte					szText[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     * 	Text type
     * \else
     * 	文本类型
     * \endif
     */
    public int					emTextType;

    /**
     * \if ENGLISH_LANG
     * 	Text color
     * \else
     * 	文本颜色
     * \endif
     */
    public int					emTextColor;

    /**
     * \if ENGLISH_LANG
     * 	Text roll mode
     * \else
     * 	文本滚动模式
     * \endif
     */
    public int					emTextRollMode;

    /**
     * \if ENGLISH_LANG
     * 	Text scrolling speed is divided into 1 ~ 5 from slow to fast
     * \else
     * 	文本滚动速度由慢到快分为1~5
     * \endif
     */
    public int					nRollSpeed;

}
