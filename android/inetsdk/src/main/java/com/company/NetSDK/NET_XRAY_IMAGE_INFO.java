package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Image info of X Ray machine
 * \else
 * @brief 图片列表
 * \endif
 */
public class NET_XRAY_IMAGE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  view type,{@link EM_XRAY_VIEW_TYPE}
     * \else
     * 视图类型,{@link EM_XRAY_VIEW_TYPE}
     * \endif
     */
    public int					emViewType;

    /**
     * \if ENGLISH_LANG
     *  image type,{@link EM_XRAY_IMAGE_TYPE}
     * \else
     * 图片类型,{@link EM_XRAY_IMAGE_TYPE}
     * \endif
     */
    public int					emImageType;

    /**
     * \if ENGLISH_LANG
     *  picture offset in binary data
     * \else
     * 在二进制数据块中的偏移
     * \endif
     */
    public int					nOffset;

    /**
     * \if ENGLISH_LANG
     *  picture size,unit:byte
     * \else
     * 图片大小,单位:字节	
     * \endif
     */
    public int					nLength;

}