package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Thermal panorama
 * \else
 * 热成像全景图
 * \endif
 */
public class NET_THERMAL_SCENE_IMAGE  implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Offset in binary data block
     * \else
     * 在二进制数据块中的偏移
     * \endif
     */
    public int                 nOffset;

    /**
     * \if ENGLISH_LANG
     * Picture size in bytes
     * \else
     * 图片大小, 单位字节
     * \endif
     */
    public int                 nLength;

    /**
     * \if ENGLISH_LANG
     * Picture width, pixels
     * \else
     * 图片宽度, 像素
     * \endif
     */
    public int                 nWidth;

    /**
     * \if ENGLISH_LANG
     * Picture height, pixels
     * \else
     * 图片高度, 像素
     * \endif
     */
    public int                 nHeight;
}
