package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Image info of human in history data base
 * \else
 * @brief 历史库人体图片信息
 * \endif
 */
public class NET_HISTORY_HUMAN_IMAGE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Image, unit:byte
     * \else
     *  图片大小,单位:字节
     * \endif
     */
    public int					nLength;

    /**
     * \if ENGLISH_LANG
     *  Image width
     * \else
     *  图片宽度
     * \endif
     */
    public int					nWidth;

    /**
     * \if ENGLISH_LANG
     *  Image height
     * \else
     *  图片高度
     * \endif
     */
    public int					nHeight;

    /**
     * \if ENGLISH_LANG
     *  Image path
     * \else
     *  文件路径
     * \endif
     */
    public byte					szFilePath[] = new byte[260];

}