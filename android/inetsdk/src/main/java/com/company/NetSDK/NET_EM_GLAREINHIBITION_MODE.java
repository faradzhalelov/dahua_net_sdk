package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the mode of hightlight suppression
 * \else
 * 支持强光抑制模式的参数设置方式
 * \endif
 */
public class NET_EM_GLAREINHIBITION_MODE  implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknow
     * \else
     * 未知
     * \endif
     */
    public static final int NET_EM_GLAREINHIBITION_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * default
     * \else
     * 普通模式(默认值)
     * \endif
     */
    public static final int NET_EM_GLAREINHIBITION_DEFAULT = 1;

    /**
     * \if ENGLISH_LANG
     * Fpga
     * \else
     * Fpga强光抑制
     * \endif
     */
    public static final int NET_EM_GLAREINHIBITION_FPGA = 2;
}
