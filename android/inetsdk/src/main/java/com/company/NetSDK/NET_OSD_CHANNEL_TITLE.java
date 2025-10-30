package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Encode widget-channel title
 * \else
 * 编码物件-通道标题
 * \endif
 */
public class NET_OSD_CHANNEL_TITLE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Overlay Type, should set the value whether getting config  or setting config, refer to {@link NET_EM_OSD_BLEND_TYPE}
     * \else
     * 叠加类型，不管是获取还是设置都要设置该字段,参考 {@link NET_EM_OSD_BLEND_TYPE}
     * \endif
     */
    public int                       emOsdBlendType;

    /**
     * \if ENGLISH_LANG
     * Overlay or not
     * \else
     * 是否叠加
     * \endif
     */
    public boolean                  bEncodeBlend;

    /**
     * \if ENGLISH_LANG
     * Foreground color
     * \else
     * 前景色
     * \endif
     */
    public NET_COLOR_RGBA		    stuFrontColor = new NET_COLOR_RGBA();

    /**
     * \if ENGLISH_LANG
     * Background color
     * \else
     * 背景色
     * \endif
     */
    public NET_COLOR_RGBA		    stuBackColor = new NET_COLOR_RGBA();

    /**
     * \if ENGLISH_LANG
     * Zone. The coordinates value ranges from  0 to 8191. Only use left value and top value.The point (left,top) shall be the same as the point(right,bottom).
     * \else
     * 区域, 坐标取值[0~8191], 仅使用left和top值, 点(left,top)应和(right,bottom)设置成同样的点
     * \endif
     */
    public NET_RECT		    	   stuRect = new NET_RECT();

    @Override
    public String toString() {
        return "NET_OSD_CHANNEL_TITLE{" +
                "emOsdBlendType=" + emOsdBlendType +
                ", bEncodeBlend=" + bEncodeBlend +
                ", stuFrontColor=" + stuFrontColor +
                ", stuBackColor=" + stuBackColor +
                ", stuRect=" + stuRect +
                '}';
    }
}
