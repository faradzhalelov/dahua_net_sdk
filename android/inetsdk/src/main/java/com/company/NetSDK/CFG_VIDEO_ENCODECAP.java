package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Video Input Front-end Capability Set
 * \else
 * @brief 视频输入前端能力集
 * \endif
 */
public class CFG_VIDEO_ENCODECAP implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  CIF P Frames Max Unit Kbits, Default 40
     * \else
     *  CIF P帧最大值 单位Kbits, 默认值40
     * \endif
     */
    public int					nMaxCIFFrame;

    /**
     * \if ENGLISH_LANG
     *  CIF P Frames Min  Unit Kbits, Default 7
     * \else
     *  CIF P帧最小值 单位Kbits, 默认值7
     * \endif
     */
    public int					nMinCIFFrame;

    /**
     * \if ENGLISH_LANG
     *  Maximum number of coded audio supported for dual audio, default 1
     * \else
     *  支持的最大编码音频数，用于双音频,默认1
     * \endif
     */
    public int					nMaxEncodeAudios;

}
