package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Custom title information
 * \else
 * @brief 自定义的标题信息
 * \endif
 */
public class NET_USER_DEF_TITLE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Title Content
     * \else
     *  标题内容
     * \endif
     */
    public byte					szText[] = new byte[FinalVar.CUSTOM_TITLE_LEN];

    /**
     * \if ENGLISH_LANG
     *  Overlay to main stream video coding
     * \else
     *  是加叠加到编码视频使能
     * \endif
     */
    public boolean					bEncodeBlend;

    /**
     * \if ENGLISH_LANG
     *  Whether to Overlay to Preview Display
     * \else
     *  叠加到预览视频使能
     * \endif
     */
    public boolean					bPreviewBlend;

    /**
     * \if ENGLISH_LANG
     *  Region
     * \else
     *  区域, 坐标取值[0~8191], 仅使用left和top值, 点(left,top)应和(right,bottom)设置成同样的点
     * \endif
     */
    public NET_RECT					stuRect = new NET_RECT();

    /**
     * \if ENGLISH_LANG
     *  Foreground color
     * \else
     *  前景色
     * \endif
     */
    public NET_COLOR_RGBA					stuFrontColor = new NET_COLOR_RGBA();

    /**
     * \if ENGLISH_LANG
     *  Background color
     * \else
     *  背景色
     * \endif
     */
    public NET_COLOR_RGBA					stuBackColor = new NET_COLOR_RGBA();

    /**
     * \if ENGLISH_LANG
     *  The type of text align,{@link EM_TITLE_TEXT_ALIGNTYPE}
     * \else
     *  文本对齐方式,{@link EM_TITLE_TEXT_ALIGNTYPE}
     * \endif
     */
    public int					emTextAlign;

    /**
     * \if ENGLISH_LANG
     *  Is the custom title configured with a separate font size
     * \else
     *  自定义标题是否为单独配置字体大小
     * \endif
     */
    public boolean					bFontAloneEnable;

    /**
     * \if ENGLISH_LANG
     *  Custom font size for title, 0 for adaptive, -1 for unknown and don't send, in px
     * \else
     *  自定义标题的字体大小, 0为自适应，-1为未知且不下发，单位px
     * \endif
     */
    public int					nFontSize;

}