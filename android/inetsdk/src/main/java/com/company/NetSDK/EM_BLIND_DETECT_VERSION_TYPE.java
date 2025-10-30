package com.company.NetSDK;

import java.io.Serializable;


public class EM_BLIND_DETECT_VERSION_TYPE implements Serializable {
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
    public static final int EM_BLIND_DETECT_VERSION_UNKNOW = 0;

    /**
     * \if ENGLISH_LANG
     * Full screen detection
     * \else
     * 全屏遮挡检测
     * \endif
     */
    public static final int EM_BLIND_DETECT_VERSION_FULL_SCREEN = 1;

    /**
     * \if ENGLISH_LANG
     * Multi window detection
     * \else
     * 多窗口检测
     * \endif
     */
    public static final int EM_BLIND_DETECT_VERSION_MULTI_WINDOW = 2;
}
