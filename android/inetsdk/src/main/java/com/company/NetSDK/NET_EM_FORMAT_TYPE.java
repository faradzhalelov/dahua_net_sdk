package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the type of stream
 * \else
 * 码流类型
 * \endif
 */
public class NET_EM_FORMAT_TYPE implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_FORMAT_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * main stream--normal
     * \else
     * 主码流普通编码
     * \endif
     */
    public static final int EM_FORMAT_MAIN_NORMAL = 1;

    /**
     * \if ENGLISH_LANG
     * main stream--move examine
     * \else
     * 主码流动检编码
     * \endif
     */
    public static final int EM_FORMAT_MAIN_MOVEEXAMINE = 2;

    /**
     * \if ENGLISH_LANG
     * main stream--alarm
     * \else
     * 主码流报警编码
     * \endif
     */
    public static final int EM_FORMAT_MAIN_ALARM = 3;

    /**
     * \if ENGLISH_LANG
     * extra stream 1
     * \else
     * 辅码流1
     * \endif
     */
    public static final int EM_FORMAT_EXTRA1 = 4;

    /**
     * \if ENGLISH_LANG
     * extra stream 2
     * \else
     * 辅码流2
     * \endif
     */
    public static final int EM_FORMAT_EXTRA2 = 5;

    /**
     * \if ENGLISH_LANG
     * extra stream 3
     * \else
     * 辅码流3
     * \endif
     */
    public static final int EM_FORMAT_EXTRA3 = 6;
}
