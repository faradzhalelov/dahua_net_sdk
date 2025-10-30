package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Image information (currently only for motor vehicles and non-motor vehicles)
 * \else
 * @brief 图片信息(目前仅用于机动车和非机动车)
 * \endif
 */
public class NET_PIC_INFO_EX implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Image size, unit: bytes
     * \else
     *  图片大小,单位:字节
     * \endif
     */
    public int					nLength;

    /**
     * \if ENGLISH_LANG
     *  Image width
     * \else
     *  图片宽度
     * \endif
     */
    public int					nWidth;

    /**
     * \if ENGLISH_LANG
     *  Image height	
     * \else
     *  图片高度	
     * \endif
     */
    public int					nHeight;

    /**
     * \if ENGLISH_LANG
     *  for byte alignment
     * \else
     *  用于字节对齐
     * \endif
     */
    public byte					byReserverd[] = new byte[4];

    /**
     * \if ENGLISH_LANG
     *  image path
     * \else
     *  图片路径
     * \endif
     */
    public byte					szFilePath[] = new byte[256];

}