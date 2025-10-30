package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 
 * \else
 * @brief 图片信息
 * \endif
 */
public class NET_IMAGE_INFO_EX2 implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  图片类型
     * \endif
     */
    public int					emType;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  在二进制数据块中的偏移
     * \endif
     */
    public int					nOffset;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  图片大小,单位:字节
     * \endif
     */
    public int					nLength;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  图片存储位置
     * \endif
     */
    public byte					szPath[] = new byte[256];

}
