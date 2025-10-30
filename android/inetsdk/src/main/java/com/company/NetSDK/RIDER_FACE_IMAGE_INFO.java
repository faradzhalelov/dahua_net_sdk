package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * face image information
 * \else
 * 骑车目标图片信息
 * \endif
 */
public class RIDER_FACE_IMAGE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     *　image offset in the data
     * \else
     * 在二进制数据块中的偏移
     * \endif
     */
    public int	   nOffSet;

    /**
     * \if ENGLISH_LANG
     * Image size, Unit : Byte
     * \else
     * 图片大小,单位字节
     * \endif
     */
    public int	   nLength;

    /**
     * \if ENGLISH_LANG
     * Image width(pixel)
     * \else
     * 图片宽度(像素)
     * \endif
     */
    public int	   nWidth;

    /**
     * \if ENGLISH_LANG
     * Image height(pixel)
     * \else
     * 图片高度(像素)
     * \endif
     */
    public int	   nHeight;

}
