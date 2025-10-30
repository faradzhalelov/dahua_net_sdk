package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Dimensions
 * \else
 * 尺寸
 * \endif
 */
public class SDK_SIZE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Width
     * \else
     * 宽度
     * \endif
     */
    public int                 nWidth;

    /**
     * \if ENGLISH_LANG
     * Height
     * \else
     * 高度
     * \endif
     */
    public int                 nHeight;
}
