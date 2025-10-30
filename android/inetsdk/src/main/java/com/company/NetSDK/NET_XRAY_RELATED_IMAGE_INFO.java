package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Related image
 * \else
 * @brief 关联图片
 * \endif
 */
public class NET_XRAY_RELATED_IMAGE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Image type,{@link EM_XRAY_RELATED_IMAGE_TYPE}
     * \else
     * 图片类型,{@link EM_XRAY_RELATED_IMAGE_TYPE}
     * \endif
     */
    public int					emImageType;

    /**
     * \if ENGLISH_LANG
     *  Offset in binary data block
     * \else
     * 在二进制数据块中的偏移
     * \endif
     */
    public int					nOffset;

    /**
     * \if ENGLISH_LANG
     *  Picture size,Unit: byte	
     * \else
     * 图片大小,单位:字节	
     * \endif
     */
    public int					nLength;

}