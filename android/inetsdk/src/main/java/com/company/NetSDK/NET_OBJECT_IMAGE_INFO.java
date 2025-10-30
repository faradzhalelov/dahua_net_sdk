package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Object image info
 * \else
 * @brief 物体截图
 * \endif
 */
public class NET_OBJECT_IMAGE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Offset in binary data
     * \else
     *  在二进制数据块中的偏移   
     * \endif
     */
    public int					nOffSet;

    /**
     * \if ENGLISH_LANG
     *  Image size, unit:bytes
     * \else
     *  图片大小,单位字节
     * \endif
     */
    public int					nLength;

    /**
     * \if ENGLISH_LANG
     *  Image width (pixels)
     * \else
     *  图片宽度(像素)
     * \endif
     */
    public int					nWidth;

    /**
     * \if ENGLISH_LANG
     *  Image height (pixels)
     * \else
     *  图片高度(像素)
     * \endif
     */
    public int					nHeight;

    /**
     * \if ENGLISH_LANG
     *  Scene image path
     * \else
     *  全景图片路径
     * \endif
     */
    public byte					szFilePath[] = new byte[260];

    /**
     * \if ENGLISH_LANG
     * picture index
     * \else
     * 图片序号
     * \endif
     */
    public int					nIndexInData;

}