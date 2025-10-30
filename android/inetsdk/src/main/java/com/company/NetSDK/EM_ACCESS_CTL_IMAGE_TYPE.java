package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Image type
 * \else
 * 图片类型
 * \endif
 */
public class EM_ACCESS_CTL_IMAGE_TYPE implements Serializable {
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
    public static final int EM_ACCESS_CTL_IMAGE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * Local face database
     * \else
     * 本地目标图库
     * \endif
     */
    public static final int EM_ACCESS_CTL_IMAGE_LOCAL = 0;

    /**
     * \if ENGLISH_LANG
     * Cutout of scene picture
     * \else
     * 拍摄场景抠图
     * \endif
     */
    public static final int EM_ACCESS_CTL_IMAGE_SCENE = 1;

    /**
     * \if ENGLISH_LANG
     * Cutout of face
     * \else
     * 目标抠图
     * \endif
     */
    public static final int EM_ACCESS_CTL_IMAGE_FACE = 2;
}
