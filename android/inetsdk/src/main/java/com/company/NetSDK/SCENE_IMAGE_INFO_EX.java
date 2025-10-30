package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Scene image
 * \else
 * 全景广角图
 * \endif
 */
public class SCENE_IMAGE_INFO_EX implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * mage offset in the data
     * \else
     * 在二进制数据块中的偏移
     * \endif
     */
    public int	   nOffSet;

    /**
     * \if ENGLISH_LANG
     * image data length
     * \else
     * 图片大小,单位字节
     * \endif
     */
    public int	   nLength;

    /**
     * \if ENGLISH_LANG
     * image width(pixel)
     * \else
     * 图片宽度(像素)
     * \endif
     */
    public int	   nWidth;

    /**
     * \if ENGLISH_LANG
     * image Height(pixel)
     * \else
     * 图片高度(像素)
     * \endif
     */
    public int	   nHeight;

    /**
     * \if ENGLISH_LANG
     * file path
     * \else
     * 全景图片路径
     * \endif
     */
    public byte               szFilePath[] = new byte[260];

    /**
     * \if ENGLISH_LANG
     *  The serial number of the picture in the uploaded picture data
     * \else
     *  在上传图片数据中的图片序号
     * \endif
     */
    public int					nIndexInData;

    /**
     * \if ENGLISH_LANG
     *  Image ID
     * \else
     *  图片ID
     * \endif
     */
    public byte					szImageID[] = new byte[42];

    /**
     * \if ENGLISH_LANG
     *  Snap time, standard UTC time (without time zone daylight saving time deviation), in seconds
     * \else
     *  抓拍时间，标准UTC时间（不带时区夏令时偏差），单位秒
     * \endif
     */
    public NET_TIME_EX					SnapTime = new NET_TIME_EX();
}
