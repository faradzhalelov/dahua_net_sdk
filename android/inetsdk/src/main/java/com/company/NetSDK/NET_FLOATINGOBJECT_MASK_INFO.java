package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mask info of floating object
 * \else
 * 堆积物点阵图信息
 * \endif
 */
public class NET_FLOATINGOBJECT_MASK_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Column number
     * \else
     * 点阵列数
     * \endif
     */
    public int					nColNum;

    /**
     * \if ENGLISH_LANG
     * Offset
     * \else
     * 偏移
     * \endif
     */
    public int					nOffset;

    /**
     * \if ENGLISH_LANG
     * Length
     * \else
     * 长度
     * \endif
     */
    public int					nLength;
}
