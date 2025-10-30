package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief car body picture information
 * \else
 * @brief 车身图片信息
 * \endif
 */
public class NET_CARBODY_IMAGE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Picture file path
     * \else
     *  图片文件路径
     * \endif
     */
    public byte					szFilePath[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Image file size, bytes
     * \else
     *  图片文件大小，单位:字节
     * \endif
     */
    public int					nLength;

}