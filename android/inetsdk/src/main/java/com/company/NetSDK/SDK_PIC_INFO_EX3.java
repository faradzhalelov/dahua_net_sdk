package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * picture info
 * \else
 * 物体对应图片文件信息(包含图片路径)
 * \endif
 */
public class SDK_PIC_INFO_EX3 implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * current picture file's offset in the binary file, byte
     * \else
     * 文件在二进制数据块中的偏移位置, 单位:字节
     * \endif
     */
    public int              dwOffSet;

    /**
     * \if ENGLISH_LANG
     * current picture file's size, byte
     * \else
     * 文件大小, 单位:字节
     * \endif
     */
    public int              dwFileLenth;

    /**
     * \if ENGLISH_LANG
     * picture width, pixel
     * \else
     * 图片宽度, 单位:像素
     * \endif
     */
    public short            wWidth;

    /**
     * \if ENGLISH_LANG
     * picture high, pixel
     * \else
     * 图片高度, 单位:像素
     * \endif
     */
    public short            wHeight;

    /**
     * \if ENGLISH_LANG
     * File path
     * \else
     * 文件路径
     * \endif
     */
    public byte[]           szFilePath = new byte[64];

    /**
     * \if ENGLISH_LANG
     * When submit to the server, the algorithm has checked the image or not
     * \else
     * 图片是否算法检测出来的检测过的提交识别服务器时,则不需要再时检测定位抠图,1:检测过的,0:没有检测过
     * \endif
     */
    public byte             bIsDetected;

    @Override
    public String toString() {
        return "SDK_PIC_INFO_EX3{" +
                "dwOffSet=" + dwOffSet +
                ", dwFileLenth=" + dwFileLenth +
                ", wWidth=" + wWidth +
                ", wHeight=" + wHeight +
                ", szFilePath=" + Arrays.toString(szFilePath) +
                ", bIsDetected=" + bIsDetected +
                '}';
    }
}
