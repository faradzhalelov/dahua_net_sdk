package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Media file general Information
 * \else
 * @brief 通用信息
 * \endif
 */
public class NET_MEDIAFILE_GENERAL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  File path
     * \else
     *  图片文件路径
     * \endif
     */
    public byte					szFilePath[] = new byte[FinalVar.MAX_PATH];

    /**
     * \if ENGLISH_LANG
     *  The number of ObjectUrls
     * \else
     *  ObjectUrls的个数
     * \endif
     */
    public int					nObjectUrlNum;

    /**
     * \if ENGLISH_LANG
     *  The list of Object urls
     * \else
     *  小图路径
     * \endif
     */
    public byte					szObjectUrls[][] = new byte[8][FinalVar.MAX_PATH];

}