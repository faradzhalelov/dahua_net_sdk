package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief XRAY Related image type
 * \else
 * @brief X光机关联图片类型
 * \endif
 */
public class EM_XRAY_RELATED_IMAGE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int					EM_XRAY_RELATED_IMAGE_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  Large picture of Target
     * \else
     * 表示目标大图
     * \endif
     */
    public static final int					EM_XRAY_RELATED_IMAGE_TYPE_LARGE_FACE = 0;

    /**
     * \if ENGLISH_LANG
     *  Small picture of Target
     * \else
     * 表示目标小图
     * \endif
     */
    public static final int					EM_XRAY_RELATED_IMAGE_TYPE_SMALL_FACE = 1;

    /**
     * \if ENGLISH_LANG
     *  Visible light diagram showing package
     * \else
     * 表示包裹可见光图
     * \endif
     */
    public static final int					EM_XRAY_RELATED_IMAGE_TYPE_PACKAGE_VISIBLE_LIGHT = 2;

}