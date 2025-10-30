package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Image parameters
 * \else
 * 图像参数
 * \endif
 */
public class EM_SCENE_MODE  implements Serializable {
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
    public static final int EM_SCENE_MODE_UNKNOWN  		  = -1;

    /**
     * \if ENGLISH_LANG
     * Low
     * \else
     * 低
     * \endif
     */
    public static final int EM_SCENE_MODE_LOW  		  = 0;

    /**
     * \if ENGLISH_LANG
     * High
     * \else
     * 高
     * \endif
     */
    public static final int EM_SCENE_MODE_HIGH  		  = 1;

    /**
     * \if ENGLISH_LANG
     * self adaption
     * \else
     * 自适应
     * \endif
     */
    public static final int EM_SCENE_MODE_SELF_ADAPTION  		  = 2;

}
