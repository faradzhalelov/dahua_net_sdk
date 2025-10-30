package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Picture encoding format
 * \else
 * 抓图图片编码格式
 * \endif
 */
public class EM_SNAP_ENCODE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_SNAP_ENCODE_TYPE_UNKNOWN=0;
    /**
     * \if ENGLISH_LANG
     * Jpeg
     * \else
     * jpeg图片
     * \endif
     */
    public static final int EM_SNAP_ENCODE_TYPE_JPEG=1;
    /**
     * \if ENGLISH_LANG
     * I frame of MPEG4
     * \else
     * mpeg4的i 帧
     * \endif
     */
    public static final int EM_SNAP_ENCODE_TYPE_MPEG4_I=2;

}
