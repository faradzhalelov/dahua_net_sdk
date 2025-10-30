package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief title text alignment type
 * \else
 * @brief 标题文本对齐方式
 * \endif
 */
public class EM_TITLE_TEXT_ALIGNTYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Invalid alignment mathod
     * \else
     *  无效的对齐方式
     * \endif
     */
    public static final int					EM_TEXT_ALIGNTYPE_INVALID = 0;

    /**
     * \if ENGLISH_LANG
     *  Left alignment 
     * \else
     *  左对齐
     * \endif
     */
    public static final int					EM_TEXT_ALIGNTYPE_LEFT = 1;

    /**
     * \if ENGLISH_LANG
     *  X coordinate alignment 
     * \else
     *  X坐标中对齐
     * \endif
     */
    public static final int					EM_TEXT_ALIGNTYPE_XCENTER = 2;

    /**
     * \if ENGLISH_LANG
     *  Y coordinate alignment 
     * \else
     *  Y坐标中对齐
     * \endif
     */
    public static final int					EM_TEXT_ALIGNTYPE_YCENTER = 3;

    /**
     * \if ENGLISH_LANG
     *  Center
     * \else
     *  居中
     * \endif
     */
    public static final int					EM_TEXT_ALIGNTYPE_CENTER = 4;

    /**
     * \if ENGLISH_LANG
     *  Right alignment 
     * \else
     *  右对齐
     * \endif
     */
    public static final int					EM_TEXT_ALIGNTYPE_RIGHT = 5;

    /**
     * \if ENGLISH_LANG
     *  By top alignment 
     * \else
     *  按照顶部对齐
     * \endif
     */
    public static final int					EM_TEXT_ALIGNTYPE_TOP = 6;

    /**
     * \if ENGLISH_LANG
     *  By bottom alignment 
     * \else
     *  按照底部对齐
     * \endif
     */
    public static final int					EM_TEXT_ALIGNTYPE_BOTTOM = 7;

    /**
     * \if ENGLISH_LANG
     *  By upper left alignment 
     * \else
     *  按照左上角对齐
     * \endif
     */
    public static final int					EM_TEXT_ALIGNTYPE_LEFTTOP = 8;

    /**
     * \if ENGLISH_LANG
     *  Next row alignment 
     * \else
     *  换行对齐
     * \endif
     */
    public static final int					EM_TEXT_ALIGNTYPE_CHANGELINE = 9;

}