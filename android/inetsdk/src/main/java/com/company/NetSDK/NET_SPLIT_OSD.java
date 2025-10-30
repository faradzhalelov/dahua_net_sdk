package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * OSD channel info
 * \else
 * 分割窗口OSD信息
 * \endif
 */
public class NET_SPLIT_OSD implements Serializable {
    /**
     *
     */
    private static final long                   serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * enable
     * \else
     * 使能
     * \endif
     */
    public boolean                              bEnable;

    /**
     * \if ENGLISH_LANG
     * The foreground color
     * \else
     * 前景颜色
     * \endif
     */
    public SDK_COLOR_RGBA                       stuFrontColor = new SDK_COLOR_RGBA();

    /**
     * \if ENGLISH_LANG
     * The background color
     * \else
     * 背景颜色
     * \endif
     */
    public SDK_COLOR_RGBA                       stuBackColor = new SDK_COLOR_RGBA();

    /**
     * \if ENGLISH_LANG
     * Foreground area
     * \else
     * 前景区域
     * \endif
     */
    public SDK_RECT                             stuFrontRect = new SDK_RECT();

    /**
     * \if ENGLISH_LANG
     * Background region
     * \else
     * 背景区域
     * \endif
     */
    public SDK_RECT                             stuBackRect = new SDK_RECT();

    /**
     * \if ENGLISH_LANG
     * Whether the scroll display, applies to the text only
     * \else
     * 是否滚动显示, 只对文本有效
     * \endif
     */
    public boolean                              bRoll;

    /**
     * \if ENGLISH_LANG
     * Scroll mode, applies only to text, 0 -from left to right,1-from right to left,2-from top to bottom,3-from bottom to top
     * \else
     * 滚动模式, 只对文本有效, 0-从左往右, 1-从右往左, 2-从上往下滚动, 3-从下往上滚动
     * \endif
     */
    public byte                                 byRollMode;

    /**
     * \if ENGLISH_LANG
     * Rolling speed, applies to text  only , 0 ~ 4, the greater the value the faster the scrolling
     * \else
     * 滚动速率, 只对文本有效, 0~4, 数值越大滚动越快
     * \endif
     */
    public byte                                 byRoolSpeed;

    /**
     * \if ENGLISH_LANG
     * The font size, applies to the text only
     * \else
     * 字体大小, 只对文本有效
     * \endif
     */
    public byte                                 byFontSize;

    /**
     * \if ENGLISH_LANG
     * Alignment, 0 - left, 1 - centered, 2 - right
     * \else
     * 对齐方式, 0-靠左, 1-居中, 2-靠右
     * \endif
     */
    public byte                                 byTextAlign;

    /**
     * \if ENGLISH_LANG
     * OSD type, 0 - text, 1 - icon,  2 - Time
     * \else
     * OSD类型, 0-文本, 1-图标, 2-时间
     * \endif
     */
    public byte                                 byType;

    /**
     * \if ENGLISH_LANG
     * retain byte
     * \else
     * 保留字节
     * \endif
     */
    public byte[]                               Reserved = new byte[3];

    /**
     * \if ENGLISH_LANG
     * OSD content
     * if the type is icon, the content is the name of the icon
     * if the type is Time, content is the free combination with "Date","Week","Time","\n"
     * For example:Non-peer display,this field must be filled with "Date\nTime",then screem will show 2018年4月23日 16:49:15
     * Peers show,this field must be filled with"DateTime":2018年4月23日16:49:15
     * \else
     * OSD内容
     * 若类型为图标, 内容为图标名称
     * 若类型为Time，内容为”Date”(日期),”Week”(星期),”Time”(时间),”\n”(换行)的自由组合
     * 例如：不同行显示，需要将此字段填为"Date\nTime",在屏幕上就会显示 2018年4月23日 16:49:15
     * 同行显示，需要将此字段填为"DateTime",在屏幕上就会显示 2018年4月23日16:49:15
     * \endif
     */
    public byte[]                               szContent = new byte[FinalVar.MAX_PATH];

    /**
     * \if ENGLISH_LANG
     * field interval, 0.0 ~ 5.0
     * \else
     * 字符间距, 0.0 ~ 5.0
     * \endif
     */
    public float                                fPitch;

    /**
     * \if ENGLISH_LANG
     * font type
     * \else
     * 字体类型
     * \endif
     */
    public byte[]                               szFontType = new byte[FinalVar.SDK_COMMON_STRING_64];
}
