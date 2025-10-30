package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Do not alarm when detecting the color of chef's suit that meets the requirements (no this field means that the color of chef's suit will not be detected)
 * \else
 * 检测符合要求的厨师服颜色不报警(无此字段表示不检测厨师服颜色)
 * \endif
 */
public class EM_SUPPORTED_COLOR_LIST_TYPE  implements Serializable {
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
    public static final int EM_SUPPORTED_COLOR_LIST_TYPE_UNKNOWN  		  = 0;

    /**
     * \if ENGLISH_LANG
     * Black
     * \else
     * 黑色
     * \endif
     */
    public static final int EM_SUPPORTED_COLOR_LIST_TYPE_BLACK  		  = 1;

    /**
     * \if ENGLISH_LANG
     * White
     * \else
     * 白色
     * \endif
     */
    public static final int EM_SUPPORTED_COLOR_LIST_TYPE_WHITE  		  = 2;

    /**
     * \if ENGLISH_LANG
     * Red
     * \else
     * 红色
     * \endif
     */
    public static final int EM_SUPPORTED_COLOR_LIST_TYPE_RED  		  = 3;
}
