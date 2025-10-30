package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Video input/output channel interface type
 * \else
 * @brief 视频输入/输出通道接口类型
 * \endif
 */
public class EM_VIDEO_INTERFACE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_VIDEO_INTERFACE_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  CVBS
     * \else
     *  CVBS
     * \endif
     */
    public static final int					EM_VIDEO_INTERFACE_TYPE_CVBS = 1;

    /**
     * \if ENGLISH_LANG
     *  VGA
     * \else
     *  VGA
     * \endif
     */
    public static final int					EM_VIDEO_INTERFACE_TYPE_VGA = 2;

    /**
     * \if ENGLISH_LANG
     *  DVI
     * \else
     *  DVI
     * \endif
     */
    public static final int					EM_VIDEO_INTERFACE_TYPE_DVI = 3;

    /**
     * \if ENGLISH_LANG
     *  HDMI
     * \else
     *  HDMI
     * \endif
     */
    public static final int					EM_VIDEO_INTERFACE_TYPE_HDMI = 4;

    /**
     * \if ENGLISH_LANG
     *  SDI
     * \else
     *  SDI
     * \endif
     */
    public static final int					EM_VIDEO_INTERFACE_TYPE_SDI = 5;

}