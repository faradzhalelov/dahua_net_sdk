package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mount mode
 * \else
 * 安装模式
 * \endif
 */
public class EM_MOUNT_MODE implements Serializable {

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
    public static final int EM_MOUNT_MODE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Indoor
     * \else
     * 室内
     * \endif
     */
    public static final int EM_MOUNT_MODE_INDOOR = 1;

    /**
     * \if ENGLISH_LANG
     * Outdoor
     * \else
     * 室外
     * \endif
     */
    public static final int EM_MOUNT_MODE_OUTDOOR = 2;

}

