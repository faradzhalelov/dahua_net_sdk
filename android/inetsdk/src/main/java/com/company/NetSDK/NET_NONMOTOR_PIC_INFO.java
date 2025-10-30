package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Non-Motor Image
 * \else
 * 非机动车抠图信息
 * \endif
 */
public class NET_NONMOTOR_PIC_INFO implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Offset
     * \else
     * 在二进制数据块中的偏移
     * \endif
     */
    public int					uOffset;

    /**
     * \if ENGLISH_LANG
     * Image size, Unit : Byte
     * \else
     * 图片大小,单位：字节
     * \endif
     */
    public int					uLength;

    /**
     * \if ENGLISH_LANG
     * Image Width
     * \else
     * 图片宽度
     * \endif
     */
    public int					uWidth;

    /**
     * \if ENGLISH_LANG
     * Image Height
     * \else
     * 图片高度
     * \endif
     */
    public int					uHeight;

    /**
     * \if ENGLISH_LANG
     * FilePath
     * \else
     * 文件路径
     * \endif
     */
    public byte					szFilePath[] = new byte[FinalVar.MAX_PATH_LEN];


}
