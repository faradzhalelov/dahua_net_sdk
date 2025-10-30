package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Image type of X Ray machine
 * \else
 * @brief X光机图片类型
 * \endif
 */
public class EM_XRAY_IMAGE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown type
     * \else
     * 未知
     * \endif
     */
    public static final int					EM_XRAY_IMAGE_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  color
     * \else
     * 彩图
     * \endif
     */
    public static final int					EM_XRAY_IMAGE_TYPE_COLOR = 0;

    /**
     * \if ENGLISH_LANG
     *  overlay
     * \else
     * 彩色叠加图
     * \endif
     */
    public static final int					EM_XRAY_IMAGE_COLOR_TYPE_OVERLAY = 1;

}