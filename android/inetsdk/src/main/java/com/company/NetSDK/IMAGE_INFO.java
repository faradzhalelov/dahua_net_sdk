package com.company.NetSDK;
import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Image info
 * \else
 * 物体截图信息
 * \endif
 */
public class IMAGE_INFO implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Length,Unit:Byte
     * \else
     * 图片大小,单位:字节
     * \endif
     */
    public int					nLength;

    /**
     * \if ENGLISH_LANG
     * Width
     * \else
     * 图片宽度
     * \endif
     */
    public int					nWidth;

    /**
     * \if ENGLISH_LANG
     * Height
     * \else
     * 图片高度
     * \endif
     */
    public int					nHeight;

    /**
     * \if ENGLISH_LANG
     * File path
     * \else
     * 文件路径
     * \endif
     */
    public byte				szFilePath[] = new byte[260];
}
