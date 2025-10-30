package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Human image info
 * \else
 * @brief 人体图片信息
 * \endif
 */
public class HUMAN_IMAGE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Offset 		
     * \else
     *  偏移 		
     * \endif
     */
    public int					nOffSet;

    /**
     * \if ENGLISH_LANG
     *  image length,Unit:byte
     * \else
     *  图片大小,单位字节
     * \endif
     */
    public int					nLength;

    /**
     * \if ENGLISH_LANG
     *  Width
     * \else
     *  图片宽度
     * \endif
     */
    public int					nWidth;

    /**
     * \if ENGLISH_LANG
     *  Height
     * \else
     *  图片高度
     * \endif
     */
    public int					nHeight;

    /**
     * \if ENGLISH_LANG
     *  The serial number of the picture in the uploaded picture data
     * \else
     *  在上传图片数据中的图片序号
     * \endif
     */
    public int					nIndexInData;

}