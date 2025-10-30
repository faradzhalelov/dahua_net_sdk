package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Encode widget-User-defined title information
 * \else
 * 编码物件-自定义标题信息
 * \endif
 */
public class NET_CUSTOM_TITLE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Overlay or not
     * \else
     * 是否叠加
     * \endif
     */
    public boolean       bEncodeBlend;

    /**
     * \if ENGLISH_LANG
     * Input parameter
     * \else
     * 前景色
     * \endif
     */
    public NET_COLOR_RGBA stuFrontColor = new NET_COLOR_RGBA();

    /**
     * \if ENGLISH_LANG
     * Output parameter
     * \else
     * 背景色
     * \endif
     */
    public NET_COLOR_RGBA stuBackColor = new NET_COLOR_RGBA();

    /**
     * \if ENGLISH_LANG
     * Zone. The coordinates value ranges from  0 to 8191. Only use left value and top value.The point (left,top) shall be the same as the point(right,bottom).
     * \else
     * 区域, 坐标取值[0~8191], 仅使用left和top值, 点(left,top)应和(right,bottom)设置成同样的点
     * \endif
     */
    public NET_RECT stuRect = new NET_RECT();

    /**
     * \if ENGLISH_LANG
     * Title contents
     * \else
     * 标题内容
     * \endif
     */
    public byte[]  szText = new byte[FinalVar.AV_CFG_Custom_Title_Len];
}
