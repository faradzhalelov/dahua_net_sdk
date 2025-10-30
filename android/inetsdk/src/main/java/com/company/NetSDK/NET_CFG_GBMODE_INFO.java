package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Video OSD GB mode configuration, corresponding to the enumeration NET_EM_CFG_GBMODE
 * \else
 * @brief 视频OSD国标模式配置, 对应枚举NET_EM_CFG_GBMODE
 * \endif
 */
public class NET_CFG_GBMODE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether to overlay on the main stream video encoding
     * \else
     *  是否叠加到主码流视频编码
     * \endif
     */
    public boolean					bEncodeBlend;

    /**
     * \if ENGLISH_LANG
     *  Whether to overlay on preview display
     * \else
     *  是否叠加到预览显示
     * \endif
     */
    public boolean					bPreviewBlend;

    /**
     * \if ENGLISH_LANG
     *  Foreground color
     * \else
     *  前景颜色
     * \endif
     */
    public int					nFrontColor[] = new int[4];

    /**
     * \if ENGLISH_LANG
     *  Background color
     * \else
     *  背景颜色
     * \endif
     */
    public int					nBackColor[] = new int[4];

    /**
     * \if ENGLISH_LANG
     *  Distance from the video edge, in characters
     * \else
     *  距离视频边缘距离，单位：字符
     * \endif
     */
    public int					nMargin;

    /**
     * \if ENGLISH_LANG
     *  Row spacing of OSDs in the same area, such as the row spacing between 5 OSDs in the bottom right corner, in characters
     * \else
     *  同一区域OSD行间距，如右下角5行OSD之间的行间距，单位：字符。
     * \endif
     */
    public int					nRowSpacing;

    /**
     * \if ENGLISH_LANG
     *  Time title, fixed in the top right corner and only allows time title, consistent with the original function
     * \else
     *  时间标题，固定在右上角，且右上角仅允许有时间标题，和原来功能一致
     * \endif
     */
    public NET_GBMODE_TIMETITLE_INFO					stuTimeTitle = new NET_GBMODE_TIMETITLE_INFO();

    /**
     * \if ENGLISH_LANG
     *  Customize the number of valid title information in the top left, bottom left, and bottom right corners
     * \else
     *  自定义左上角、左下角及右下角标题信息有效个数
     * \endif
     */
    public int					nCustomTitleNum;

    /**
     * \if ENGLISH_LANG
     *  Custom title information in the top left, bottom left and bottom right corners
     * \else
     *  自定义左上角、左下角及右下角标题信息
     * \endif
     */
    public NET_GBMODE_CUSTOMTITLE_INFO					stuCustomTitle[] = new NET_GBMODE_CUSTOMTITLE_INFO[8];

    /**
     * \if ENGLISH_LANG
     *  Channel title
     * \else
     *  通道标题
     * \endif
     */
    public NET_GBMODE_CHANNELTITLE_INFO					stuChannelTitle = new NET_GBMODE_CHANNELTITLE_INFO();
    
    public NET_CFG_GBMODE_INFO() {
    	for (int i = 0; i < stuCustomTitle.length; i++) {
    		stuCustomTitle[i] = new NET_GBMODE_CUSTOMTITLE_INFO();
		}
    	
    }

}