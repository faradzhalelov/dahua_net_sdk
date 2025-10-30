package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *  wireless device type
 * \else
 *  无限设备类型
 * \endif
 */
public class NET_CAPTURE_FORMATS implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  BMP
     * \else
     *  BMP
     * \endif
     */
    public  final static int NET_CAPTURE_BMP = 0;

    /**
     * \if ENGLISH_LANG
     *  100% quality JPEG
     * \else
     *  100%质量的JPEG
     * \endif
     */
    public  final static int NET_CAPTURE_JPEG = 1;

    /**
     * \if ENGLISH_LANG
     *  70% quality JPEG
     * \else
     *  70%质量的JPEG
     * \endif
     */
    public  final static int NET_CAPTURE_JPEG_70 = 2;

    /**
     * \if ENGLISH_LANG
     *  50% quality JPEG
     * \else
     *  50%质量的JPEG
     * \endif
     */
    public  final static int NET_CAPTURE_JPEG_50 = 3;

    /**
     * \if ENGLISH_LANG
     *  30% quality JPEG
     * \else
     *  30%质量的JPEG
     * \endif
     */
    public  final static int NET_CAPTURE_JPEG_30 = 4;

    /**
     * \if ENGLISH_LANG
     *  10% quality JPEG
     * \else
     *  10%质量的JPEG
     * \endif
     */
    public  final static int NET_CAPTURE_JPEG_10 = 5;


}
