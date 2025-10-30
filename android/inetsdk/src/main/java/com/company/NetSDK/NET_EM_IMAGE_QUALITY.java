package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the type of image quality
 * \else
 * 画质
 * \endif
 */
public class NET_EM_IMAGE_QUALITY implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * 10%
     * \else
     * 图像质量10%
     * \endif
     */
    public static final int EM_IMAGE_QUALITY_Q10 = 1;

    /**
     * \if ENGLISH_LANG
     * 30%
     * \else
     * 图像质量30%
     * \endif
     */
    public static final int EM_IMAGE_QUALITY_Q30 = 2;

    /**
     * \if ENGLISH_LANG
     * 50%
     * \else
     * 图像质量50%
     * \endif
     */
    public static final int EM_IMAGE_QUALITY_Q50 = 3;

    /**
     * \if ENGLISH_LANG
     * 60%
     * \else
     * 图像质量60%
     * \endif
     */
    public static final int EM_IMAGE_QUALITY_Q60 = 4;

    /**
     * \if ENGLISH_LANG
     * 80%
     * \else
     * 图像质量80%
     * \endif
     */
    public static final int EM_IMAGE_QUALITY_Q80 = 5;

    /**
     * \if ENGLISH_LANG
     * 100%
     * \else
     * 图像质量100%
     * \endif
     */
    public static final int EM_IMAGE_QUALITY_Q100 = 6;

}
