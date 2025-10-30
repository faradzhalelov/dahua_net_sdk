package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_SetFaceBoardInkScreenConfig Input param
 * \else
 * @brief CLIENT_SetFaceBoardInkScreenConfig 入参
 * \endif
 */
public class NET_IN_SET_INKSCREEN_CONFIG_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  mode config
     * \else
     *  配置
     * \endif
     */
    public NET_FACE_BOARD_MODES					stuMode = new NET_FACE_BOARD_MODES();

    /**
     * \if ENGLISH_LANG
     * Overlay content (| for newline)
     * \else
     * 叠加内容（| 表示换行符）
     * \endif
     */
    public byte szText[] = new byte[1024];

}