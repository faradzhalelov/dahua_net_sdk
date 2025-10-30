package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Bar Code Image
 * \else
 * @brief 条码可见光图
 * \endif
 */
public class NET_BAR_CODE_IMAGE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  offset in binary data block
     * \else
     * 在二进制数据块中的偏移
     * \endif
     */
    public int					nOffset;

    /**
     * \if ENGLISH_LANG
     *  Image size, unit: bytes
     * \else
     * 图片大小,单位：字节
     * \endif
     */
    public int					nLength;

}