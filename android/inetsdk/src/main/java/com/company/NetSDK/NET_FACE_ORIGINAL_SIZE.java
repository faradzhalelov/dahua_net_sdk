package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Actual Target image size during algorithm Target analysis
 * \else
 * @brief 算法目标分析时的实际目标图片尺寸
 * \endif
 */
public class NET_FACE_ORIGINAL_SIZE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Width
     * \else
     *  目标图片宽度
     * \endif
     */
    public int					nWidth;

    /**
     * \if ENGLISH_LANG
     *  Height
     * \else
     *  目标图片高
     * \endif
     */
    public int					nHeight;

}