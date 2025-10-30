package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The plate image of no-motor
 * \else
 * 非机动车车牌图片信息
 * \endif
 */
public class NET_NONMOTOR_PLATE_IMAGE implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * picture size,unit:byte
     * \else
     * 在二进制数据块中的偏移
     * \endif
     */
    public int        nOffset;

    /**
     * \if ENGLISH_LANG
     * Image width(Unit:pixel)
     * \else
     * 图片大小
     * \endif
     */
    public int        nLength;

    /**
     * \if ENGLISH_LANG
     * Image height(Unit:pixel)
     * \else
     * 图片宽度
     * \endif
     */
    public int        nWidth;

    /**
     * \if ENGLISH_LANG
     * Reserved
     * \else
     * 图片高度
     * \endif
     */
    public int        nHeight;
}
