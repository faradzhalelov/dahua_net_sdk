package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief mode
 * \else
 * @brief 场景模式
 * \endif
 */
public class EM_SCENE_STYLE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  the unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_SCENE_STYLE_UNKOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  The standard mode
     * \else
     *  标准模式
     * \endif
     */
    public static final int					EM_SCENE_STYLE_STANDARD = 0;

    /**
     * \if ENGLISH_LANG
     *  jungle mode
     * \else
     *  丛林模式
     * \endif
     */
    public static final int					EM_SCENE_STYLE_JUNGLE = 1;

}
