package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Depth type
 * \else
 * 画面景深类型
 * \endif
 */
public class EM_DEPTH_TYPE  implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_DEPTH_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Normal
     * \else
     * 正常
     * \endif
     */
    public static final int EM_DEPTH_NORMAL = 1;

    /**
     * \if ENGLISH_LANG
     * Far
     * \else
     * 远景
     * \endif
     */
    public static final int EM_DEPTH_FAR = 2;

    /**
     * \if ENGLISH_LANG
     * Middle
     * \else
     * 中景
     * \endif
     */
    public static final int EM_DEPTH_MIDDLE = 3;

    /**
     * \if ENGLISH_LANG
     * Near
     * \else
     * 近景
     * \endif
     */
    public static final int EM_DEPTH_NEAR = 4;
}
