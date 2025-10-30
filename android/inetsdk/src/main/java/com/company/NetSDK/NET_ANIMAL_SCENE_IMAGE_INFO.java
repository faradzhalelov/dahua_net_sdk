package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Scene image information for Animal Detection
 * \else
 * 动物检测的大图信息
 * \endif
 */
public class NET_ANIMAL_SCENE_IMAGE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Offset in binary data blocks
     * \else
     * 在二进制数据块中的偏移
     * \endif
     */
    public int                 nOffSet;

    /**
     * \if ENGLISH_LANG
     * Picture size, unit byte
     * \else
     * 图片大小,单位字节
     * \endif
     */
    public int                 nLength;

    /**
     * \if ENGLISH_LANG
     *  The serial number of the picture in the uploaded picture data
     * \else
     *  在上传图片数据中的图片序号
     * \endif
     */
    public int					nIndexInData;
}
