package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Size
 * \else
 * @brief 尺寸过滤器
 * \endif
 */
public class NET_CFG_SIZE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Width
     * \else
     *  宽
     * \endif
     */
    public float					nWidth;

    /**
     * \if ENGLISH_LANG
     *  Area
     * \else
     *  面积
     * \endif
     */
    public float					nArea;

    /**
     * \if ENGLISH_LANG
     *  Height
     * \else
     *  高
     * \endif
     */
    public float					nHeight;

}