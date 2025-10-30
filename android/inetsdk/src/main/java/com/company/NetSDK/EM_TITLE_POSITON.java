package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief The OSD display position.
 * \else
 * @brief OSD显示位置
 * \endif
 */
public class EM_TITLE_POSITON implements Serializable {
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
    public static final int					EM_TITLE_POSITON_UNKNOW = 0;

    /**
     * \if ENGLISH_LANG
     *  Upper right corner
     * \else
     *  右上角 
     * \endif
     */
    public static final int					EM_TITLE_POSITON_RIGHTUP = 1;

    /**
     * \if ENGLISH_LANG
     *  Upper left corner
     * \else
     *  左上角
     * \endif
     */
    public static final int					EM_TITLE_POSITON_LEFTUP = 2;

    /**
     * \if ENGLISH_LANG
     *  Lower left corner
     * \else
     *  左下角
     * \endif
     */
    public static final int					EM_TITLE_POSITON_LEFTDOWN = 3;

    /**
     * \if ENGLISH_LANG
     *  Lower right corner
     * \else
     *  右下角
     * \endif
     */
    public static final int					EM_TITLE_POSITON_RIGHTDOWN = 4;

}