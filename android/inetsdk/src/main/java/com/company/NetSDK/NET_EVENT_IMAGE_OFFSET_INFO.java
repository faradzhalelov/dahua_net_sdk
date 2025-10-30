package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief image offset info
 * \else
 * @brief 事件图片偏移信息
 * \endif
 */
public class NET_EVENT_IMAGE_OFFSET_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  offset 		
     * \else
     *  偏移 		
     * \endif
     */
    public int					nOffSet;

    /**
     * \if ENGLISH_LANG
     *  image length,unit:byte
     * \else
     *  图片大小,单位字节
     * \endif
     */
    public int					nLength;

    /**
     * \if ENGLISH_LANG
     *  image width
     * \else
     *  图片宽度
     * \endif
     */
    public int					nWidth;

    /**
     * \if ENGLISH_LANG
     *  image height
     * \else
     *  图片高度
     * \endif
     */
    public int					nHeight;

    /**
     * \if ENGLISH_LANG
     *  image path
     * \else
     *  图片路径
     * \endif
     */
    public byte					szPath[] = new byte[260];

    /**
     * \if ENGLISH_LANG
     *  The serial number of the picture in the uploaded picture data
     * \else
     *  在上传图片数据中的图片序号
     * \endif
     */
    public int					nIndexInData;

}