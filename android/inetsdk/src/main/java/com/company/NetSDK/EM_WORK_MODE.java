package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * work mode
 * \else
 * 工作模式
 * \endif
 */
public class EM_WORK_MODE implements Serializable {
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
    public static final int EM_WORK_MODE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * Energy saving mode
     * \else
     * 节能模式
     * \endif
     */
    public static final int EM_WORK_MODE_ENERGY_CONSERVATION = 0;

    /**
     * \if ENGLISH_LANG
     * Normal mode
     * \else
     * 普通模式
     * \endif
     */
    public static final int EM_WORK_MODE_ORDINARY = 1;

    /**
     * \if ENGLISH_LANG
     * Ultra mode
     * \else
     * Ultra模式
     * \endif
     */
    public static final int EM_WORK_MODE_ULTRA = 2;

    /**
     * \if ENGLISH_LANG
     * Custom mode
     * \else
     * 自定义模式
     * \endif
     */
    public static final int EM_WORK_MODE_CUSTOM = 3;

    /**
     * \if ENGLISH_LANG
     * Continuous recording mode
     * \else
     * 连续录像模式
     * \endif
     */
    public static final int EM_WORK_MODE_CONTINUOUS_RECORDING = 4;

    /**
     * \if ENGLISH_LANG
     * Vlog recording mode
     * \else
     * Vlog录像模式
     * \endif
     */
    public static final int EM_WORK_MODE_VLOG = 5;

}
