package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Picture title
 * \else
 * 图片标题
 * \endif
 */
public class NET_OSD_PICTURE_TITLE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * blend type, refer to {@link NET_EM_OSD_BLEND_TYPE}
     * \else
     * 叠加类型, 参考 {@link NET_EM_OSD_BLEND_TYPE}
     * \endif
     */
    public int                    emOsdBlendType;

    /**
     * \if ENGLISH_LANG
     * Enable
     * \else
     * 是否叠加
     * \endif
     */
    public boolean                bEncodeBlend;

    /**
     * \if ENGLISH_LANG
     * front color
     * \else
     * 前景色
     * \endif
     */
    public NET_COLOR_RGBA			stuFrontColor = new NET_COLOR_RGBA();

    /**
     * \if ENGLISH_LANG
     * Back color
     * \else
     * 背景色
     * \endif
     */
    public NET_COLOR_RGBA			stuBackColor = new NET_COLOR_RGBA();

    /**
     * \if ENGLISH_LANG
     * area, coordinate value is (0, 8091)
     * \else
     * 区域, 坐标取值0~8191
     * \endif
     */
    public NET_RECT				stuRect = new NET_RECT();

    /**
     * \if ENGLISH_LANG
     * picture name
     * \else
     * 图片名称
     * \endif
     */
    public byte[]					szName = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * picture width
     * \else
     * 图片宽
     * \endif
     */
    public int						nWidth;

    /**
     * \if ENGLISH_LANG
     * picture height
     * \else
     * 图片高
     * \endif
     */
    public int						nHeight;
}
