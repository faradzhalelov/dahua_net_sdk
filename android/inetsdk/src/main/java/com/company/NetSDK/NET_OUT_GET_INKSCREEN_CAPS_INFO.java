package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_GetFaceBoardInkScreenCaps Output param
 * \else
 * @brief CLIENT_GetFaceBoardInkScreenCaps 出参
 * \endif
 */
public class NET_OUT_GET_INKSCREEN_CAPS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Mode specific capability number
     * \else
     *  模式具体能力个数
     * \endif
     */
    public int					nModesNum;

    /**
     * \if ENGLISH_LANG
     *  Mode specific capability
     * \else
     *  模式具体能力
     * \endif
     */
    public NET_FACE_BOARD_MODES					stuModes[] = new NET_FACE_BOARD_MODES[32];

    public NET_OUT_GET_INKSCREEN_CAPS_INFO() {
        for(int i = 0; i < 32; i ++){
            this.stuModes[i] = new NET_FACE_BOARD_MODES();
        }
    }
}