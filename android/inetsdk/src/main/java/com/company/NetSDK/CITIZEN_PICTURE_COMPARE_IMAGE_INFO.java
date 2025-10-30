package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * card picture compare image info
 * \else
 * 人证对比图片信息
 * \endif
 */
public class CITIZEN_PICTURE_COMPARE_IMAGE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * data offset, unit:byte
     * \else
     * 文件在二进制数据块中的偏移位置, 单位:字节
     * \endif
     */
    public int              dwOffSet;

    /**
     * \if ENGLISH_LANG
     * file lenght, unit:byte
     * \else
     * 文件大小, 单位:字节
     * \endif
     */
    public int              dwFileLenth;

    /**
     * \if ENGLISH_LANG
     * width, unit:pixel
     * \else
     * 图片宽度, 单位:像素
     * \endif
     */
    public short            wWidth;

    /**
     * \if ENGLISH_LANG
     * height, unit:pixel
     * \else
     * 图片高度, 单位:像素
     * \endif
     */
    public short            wHeight;

    @Override
    public String toString() {
        return "CITIZEN_PICTURE_COMPARE_IMAGE_INFO{" +
                "dwOffSet=" + dwOffSet +
                ", dwFileLenth=" + dwFileLenth +
                ", wWidth=" + wWidth +
                ", wHeight=" + wHeight +
                '}';
    }
}
