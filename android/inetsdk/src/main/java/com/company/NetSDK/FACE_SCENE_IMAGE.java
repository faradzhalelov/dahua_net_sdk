package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * target scene image
 * \else
 * 目标全景图
 * \endif
 */
public class FACE_SCENE_IMAGE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * image offset in the data
     * \else
     * 在二进制数据块中的偏移
     * \endif
     */
    public int	   nOffSet;

    /**
     * \if ENGLISH_LANG
     * image data length
     * \else
     * 图片大小,单位字节
     * \endif
     */
    public int	   nLength;

    /**
     * \if ENGLISH_LANG
     * image width(pixel)
     * \else
     * 图片宽度(像素)
     * \endif
     */
    public int	   nWidth;

    /**
     * \if ENGLISH_LANG
     * image Height(pixel)
     * \else
     * 图片高度(像素)
     * \endif
     */
    public int	   nHeight;
}
