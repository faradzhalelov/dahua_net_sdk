package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief The time title information.
 * \else
 * @brief 时间标题信息
 * \endif
 */
public class NET_GBMODE_TIMETITLE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether to enable the time title
     * \else
     *  是否开启时间标题
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  Whether to display the week
     * \else
     *  是否显示星期
     * \endif
     */
    public boolean					bShowWeek;

    /**
     * \if ENGLISH_LANG
     *  OSD display position
     * \else
     *  OSD显示位置
     * \endif
     */
    public int					emPositon;

    /**
     * \if ENGLISH_LANG
     *  Text alignment: 0x0000 left align, 0x0001 align in X coordinate, 0x0010 align in Y coordinate, 0x0011 center
     * \else
     *  文本对齐方式: 0x0000 左对齐 0x0001 X坐标中对齐 0x0010 Y坐标中对齐 0x0011 居中
     * \endif
     */
    public int					nTextAlign;

}