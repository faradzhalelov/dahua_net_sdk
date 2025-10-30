package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event title content structure
 * \else
 * 事件标题内容结构体
 * \endif
 */
public class NET_CFG_EVENT_TITLE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public byte[]               szText = new byte[FinalVar.CFG_MAX_CHANNELNAME_LEN];

    /**
     * \if ENGLISH_LANG
     * the upper left corner of the title, use 0-8191 relative coordinate system
     * \else
     * 标题左上角坐标, 采用0-8191相对坐标系
     * \endif
     */
    public SDK_POINT            stuPoint = new SDK_POINT();

    /**
     * \if ENGLISH_LANG
     * The width and height of the title,use 0-8191 relative coordinate system,one or two of them are 0 in accordance with the font adaptive width and height
     * \else
     * 标题的宽度和高度,采用0-8191相对坐标系，某项或者两项为0表示按照字体自适应宽高
     * \endif
     */
    public SDK_SIZE             stuSize = new SDK_SIZE();

    /**
     * \if ENGLISH_LANG
     * Foreground color
     * \else
     * 前景颜色
     * \endif
     */
    public NET_COLOR_RGBA       stuFrontColor = new NET_COLOR_RGBA();

    /**
     * \if ENGLISH_LANG
     * Background color
     * \else
     * 背景颜色
     * \endif
     */
    public NET_COLOR_RGBA       stuBackColor = new NET_COLOR_RGBA();
}
